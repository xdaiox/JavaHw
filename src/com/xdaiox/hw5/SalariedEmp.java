package com.xdaiox.hw5;

public class SalariedEmp extends Employee {
	private int lunchAllowance = 2400;
	private int basicSalary = 40000;
	
	
	public int getBasicSalary() {
		return basicSalary;
	}

	public int getLunchAllowance() {
		return lunchAllowance;
	}
	
	
	public SalariedEmp() {
		
		setEmpName("\n\nJane the 員工");
		setGender("f");
		setDueDate("2019/05/16");
		setTel("0972133333");
		setEmail("Jame333@gmail.com");
		
	}
	

	public void printinfosalary() {
		super.printinfo();
		System.out.print("\n基本薪資: "+ basicSalary+"+ 午餐津貼" + lunchAllowance);
	}
	
	public void printtotalsalary() {
		System.out.println("\n共: " + (basicSalary + lunchAllowance));
	}
}
