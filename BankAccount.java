package bank.entity;

public class BankAccount {
	private int id;
	private String name;
	private double balance;

	public BankAccount(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addbalance(double amount) {
		this.balance = this.balance + amount;
	}

	public void transferamount(BankAccount a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}
}