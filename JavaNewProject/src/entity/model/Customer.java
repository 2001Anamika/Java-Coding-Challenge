package entity.model;

public class Customer {
	public Customer(int customerID, String name, String emailAddress, String phoneNumber, String address,
			int creditScore) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.creditScore = creditScore;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	private int customerID;
	private String name,emailAddress,phoneNumber,address;
	private int creditScore;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public void display() {
		System.out.println("Customer ID: "+getCustomerID());
		System.out.println("Customer Name: "+getName());
		System.out.println("Customer Email: "+getEmailAddress());
		System.out.println("Customer Phone Number: "+getPhoneNumber());
		System.out.println("Customer Address: "+getAddress());
		System.out.println("Credit Score: "+getCreditScore());
		
	}
	
}
