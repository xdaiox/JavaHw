package com.xdaiox.hw5;

public class Manager extends SalariedEmp{
	private int performanceBonus = 3000;
	private int transportation = 3000;
	
	public Manager() {
		setEmpName("\nMcLovin the 主管");
		setGender("m");
		setDueDate("2009/06/09");
		setTel("0969666999");
		setEmail("Lovin69@gmail.com");
	}
	
	public void printinfosalary() {
		super.printinfosalary();
		System.out.println("+ 績效獎金" + performanceBonus + "+ 交通津貼" + transportation);
	}
	
	public void printtotalsalary() {
		System.out.println("共: " + (getBasicSalary() + getLunchAllowance()+performanceBonus+transportation));
	}
	
	
}
