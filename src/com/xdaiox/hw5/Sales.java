package com.xdaiox.hw5;

public class Sales extends Employee{

	public Sales() {

		
		setEmpName("Jerry");
		setGender("m");
		setDueDate("2005/07/07");
		setTel("0970000777");
		setEmail("Jerry77@gmail.com");
		setHours(176);
		setSalarysH(250);
	}
	
	public void printtotalsalary() {
		int saleBonus = 3000;
		int total = saleBonus + getLunchAllowance(); 
		
		System.out.print("\n銷售員: ");
		super.printtotalsalary();
		System.out.println("當月薪資: " + 	super.totalSalaryF(total));

	}
	
	
}
