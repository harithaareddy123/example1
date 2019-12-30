package bank.ui;

import bank.entity.BankAccount;


public class BankMain {
	public static void main(String[] args) {
	BankAccount store[]=new BankAccount[4];
	store[0]=new BankAccount(1," ram", 2000);
	store[1]=new BankAccount(2,"haritha",4000);
	store[2]=new BankAccount(3," sam", 2000);
	store[3]=new BankAccount(4,"krish",4000);
	BankMain a1=new BankMain();
	a1.print(store);
	System.out.println("after adding the balance");
	store[0].addbalance(300);
	store[1].addbalance(400);
	a1.print(store);
	System.out.println("after transferring from ac1 to ac2");
	store[0].transferamount(store[1], 300);
	a1.print(store);
	
	
	}

	private void print(BankAccount[] stor) {
		// TODO Auto-generated method stub
		
		for(BankAccount b: stor) {
			System.out.println(b.getName()+"   "+b.getBalance());
		
	}
	
		
	}
	
}
