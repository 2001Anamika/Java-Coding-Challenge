package entity.model;

public class HomeLoan extends Loan {
	public HomeLoan(int loanId, int customerID, float principalAmount, float interestRate, int loanTerm,
			String loanType, String loanStatus, String propertyAddress, int propertyValue) {
		super(loanId, customerID, principalAmount, interestRate, loanTerm, loanType, loanStatus);
		this.propertyAddress = propertyAddress;
		this.propertyValue = propertyValue;
	}
	private String propertyAddress;
	private int propertyValue;
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public int getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(int propertyValue) {
		this.propertyValue = propertyValue;
	}
	public void display() {
		System.out.println("Property Address: "+getPropertyAddress());
		System.out.println("Property Value: "+getPropertyValue());
	}
}
