package main;
import entity.model.ILoanRepositoryImpl;
import exception.InvalidLoanException;
import util.DBPropertyUtil;
import java.util.Scanner;

public class LoanManagement {
	public static void main(String args[]) throws InvalidLoanException {
		Scanner scan=new Scanner(System.in);
	    /*String fileName = "db.properties";
        String connectionString = DBPropertyUtil.getConnectionString(fileName);*/
		System.out.println("1.Apply Loan");
		System.out.println("2.Get all Loan Details");
		System.out.println("3.Get Loan");
		System.out.println("4.Loan Repayment");
		System.out.println("5.Calculate Interest");
		System.out.println("6.Loan Status");
		System.out.println("7.Exit");
		System.out.println("Enter you choice");
		int choice=scan.nextInt();
		ILoanRepositoryImpl l1=new ILoanRepositoryImpl();
		switch(choice){
		case 1:
			System.out.println("Enter CustomerID");
			int id=scan.nextInt();
			System.out.println("Enter Principal Amount");
			float amt=scan.nextFloat();
			System.out.println("Enter Interest Rate");
			float ir=scan.nextFloat();
			System.out.println("Enter Loan Term in months");
			int lt=scan.nextInt();
			System.out.println("Enter Loan Type");
			scan.nextLine();
			String ltype=scan.nextLine();
			boolean result=l1.applyLoan(id, amt,ir,lt,ltype);
			if(result) {
				System.out.println("Loan Applied");
			}
			else {
				System.out.println("Couldn't apply Loan");
			}break;
			
		case 2:
			l1.getAllLoan();
			break;
		case 3:
			System.out.println("Enter LoanID");
			int lid=scan.nextInt();
			l1.getLoanById(lid);
			break;
		case 4:
			System.out.println("Enter LoanID");
			int lnid=scan.nextInt();
			System.out.println("Enter Amount");
			float amount=scan.nextFloat();
			l1.loanRepayment(lnid,amount);
			break;
		case 5:
			System.out.println("Enter LoanID");
			int lonid=scan.nextInt();
			l1.calculateInterest(lonid);
			break;
		case 6:
			System.out.println("Enter LoanID");
			int loanid=scan.nextInt();
			l1.loanStatus(loanid);
			break;
		case 7:
			System.exit(0);
		default:
			System.out.println("Invalid option");
		}
	}
}
