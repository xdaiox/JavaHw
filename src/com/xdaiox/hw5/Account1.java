package com.xdaiox.hw5;

public class Account1 {
	String accountNO;
	double balance;
	
	public Account1(String accountNO,double balance) {
		this.accountNO = accountNO;
		this.balance = balance;
	}
	
	public void printAccData() {
		System.out.print("accountNO = " + accountNO);
		System.out.println("，balance = " + balance);

	}
	
	public static void main(String[] args) {
		Account acc = new Account("3435566" , 78990.0);
		acc.printAccData();
	}
}
