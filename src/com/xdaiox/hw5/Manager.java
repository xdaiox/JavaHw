package com.xdaiox.hw5;

public class Manager extends Employee{

	public Manager() {

		
		setEmpName("McLovin");
		setGender("m");
		setDueDate("2009/06/09");
		setTel("0969666999");
		setEmail("Lovin69@gmail.com");
		setHours(176);
		setSalarysH(250);
	}
	
	public void printtotalsalary() {
		int performanceBonus = 3000;
		int transportation = 3000;
		int total = performanceBonus + transportation + getLunchAllowance(); 
		
		System.out.print("\n主管: ");
		super.printtotalsalary();
		System.out.println("當月薪資: " + 	super.totalSalaryF(total));

	}
	
	
}
