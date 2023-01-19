package com.xdaiox.hw5;

public class SalariedEmp extends Employee {
	private int lunchAllowance = 2400;
	
	public SalariedEmp() {
		
		setEmpName("\n\nJane the 員工");
		setGender("f");
		setDueDate("2019/05/16");
		setTel("0972133333");
		setEmail("Jame333@gmail.com");
		setHours(176);
		setSalarysH(250);
		
	}
	
	public int getLunchAllowance() {
		return lunchAllowance;
	}

	public void printinfosalary() {
		super.printinfo();
		System.out.print("+ 午餐津貼" + lunchAllowance);
	}
	
	public void printtotalsalary() {
		System.out.println("\n共: " + (getBasicSalary() + lunchAllowance));
	}
}
