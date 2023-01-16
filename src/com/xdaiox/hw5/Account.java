package com.xdaiox.hw5;

public class Account {

	String accountNO;
	double balance;
	
	public Account() {
		
	}
	
	public Account (String accountNO,double balance) {
		this.accountNO = accountNO;
		this.balance = balance;
	}
	
	public void printAccData() {
		System.out.print("accountNO = " + accountNO);
		System.out.println("，balance = " + balance);

	}
	public static void main(String[] args) {
		
		Account a0 = new Account();
		a0.accountNO = "224654";
		a0.balance = 40000.0;
		
		Account a1 = new Account("124654",50000.0);
		a0.printAccData();
		a1.printAccData();
	}

}
