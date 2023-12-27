package entity.model;

public class Loan {
	public Loan(int loanId, int customerID, float principalAmount, float interestRate, int loanTerm, String loanType,
			String loanStatus) {
		super();
		this.loanId = loanId;
		this.customerID = customerID;
		this.principalAmount = principalAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.loanType = loanType;
		this.loanStatus = loanStatus;
	}
	public Loan() {
		// TODO Auto-generated constructor stub
	}
	private int loanId,customerID;
	private float principalAmount,interestRate;
	private int loanTerm;
	private String loanType,loanStatus;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public float getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(float principalAmount) {
		this.principalAmount = principalAmount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public void display() {
		System.out.println("Loan ID: "+getLoanId());
		System.out.println("Customer ID: "+getCustomerID());
		System.out.println("Principal Amount: "+getPrincipalAmount());
		System.out.println("Interest Rate: "+getInterestRate());
		System.out.println("Loan Term: "+getLoanTerm());
		System.out.println("Loan Type: "+getLoanType());
		System.out.println("Loan Status: "+getLoanStatus());
		
	}
}
