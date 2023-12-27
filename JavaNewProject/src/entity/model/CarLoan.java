package entity.model;

public class CarLoan extends Loan {
	public CarLoan(int loanId, int customerID, float principalAmount, float interestRate, int loanTerm, String loanType,
			String loanStatus, String carModel, int carValue) {
		super(loanId, customerID, principalAmount, interestRate, loanTerm, loanType, loanStatus);
		this.carModel = carModel;
		this.carValue = carValue;
	}
	private String carModel;
	private int carValue;
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarValue() {
		return carValue;
	}
	public void setCarValue(int carValue) {
		this.carValue = carValue;
	}
	public void display() {
		System.out.println("Car Model: "+getCarModel());
		System.out.println("Car Value: "+getCarValue());
	}
}
