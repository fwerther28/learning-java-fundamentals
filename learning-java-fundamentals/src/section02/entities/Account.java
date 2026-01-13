package section02.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	// Constructor for account without initial deposit
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	// Overload: Constructor for account with initial deposit
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	// Getters  and setters
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Business Methods 
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		//Withdraw with a tax of $ 5.00
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ number
				+ ", Titular: "
				+ holder
				+ ", Saldo: $ "
				+ String.format("%.2f", balance);
	}
	
}
