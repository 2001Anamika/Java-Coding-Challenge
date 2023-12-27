package entity.model;
import java.util.*;
import java.io.*;
import java.math.*;
import java.sql.*;
import java.sql.Connection;
import util.DBConnUtil;

public class ILoanRepositoryImpl implements ILoanRepository{

	public boolean applyLoan(int customerID, float principalAmount, float interestRate, int loanTerm, String loanType) {
		if (principalAmount <= 0 || loanTerm <= 0) {
            throw new InvalidLoanException("Invalid loan data");
        }
		boolean userConfirmation = getUserConfirmation();
		if (userConfirmation) {
            System.out.println("Loan application stored in the database.");
            return true;
        } else {
            System.out.println("Loan application declined by the user.");
            return false; 
        }}
		private boolean getUserConfirmation() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Do you want to proceed with the loan application? (Yes/No)");
	        String userInput = scanner.nextLine().trim().toLowerCase();

	        return userInput.equals("yes");
	        }
        
	
	public float calculateInterest(int loanId){
		Loan l=new Loan();
		float pa=l.getPrincipalAmount();
		float ir=l.getInterestRate();
		int months=l.getLoanTerm();
		float cinterest=(pa*(ir/12)*months)/100;
		return cinterest;
		
	}
	public void loanStatus(int loanId) {

		Customer c1=new Customer();
		if(c1.getCreditScore()> 650){
			System.out.println("Loan Approved");
		}
		else {
			
			System.out.println("Loan Approved");
		}
	}

	public void calculateEMI(int loanId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanRepayment(int loanId, float amount) {
		Statement stmt =con.createStatement();
		int rs=stmt.executeUpdate("update Loan set principalAmount=amount where loan_Id=loanId");
		System.out.println("Loan Repaid");
	}

	@Override
	public void getAllLoan() {
		
		
	}

	@Override
	public void getLoanById(int loanId) {
		Loan l2=new Loan();
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Loan where loan_id=loanId");
		while(rs.next()) {
			System.out.println(rs.getInt(loan_id));
			System.out.println(rs.getInt(customer_id));
			System.out.println(rs.getFloat(principalAmount));
			System.out.println(rs.getFloat(interestRate));	
			System.out.println(rs.getString(loanTerm));
			System.out.println(rs.getString(loanType));
			System.out.println(rs.getString(loanStatus));
			
		}
		
	}

}
