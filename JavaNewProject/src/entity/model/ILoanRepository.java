package entity.model;
public interface ILoanRepository{
	boolean applyLoan(int customerID, float principalAmount, float interestRate, int loanTerm, String loanType);
	float calculateInterest(int loanId);
	void loanStatus(int loanId);
	void calculateEMI(int loanId);
	void loanRepayment(int loanId, float amount);
	void getAllLoan();
	void getLoanById(int loanId);
}
