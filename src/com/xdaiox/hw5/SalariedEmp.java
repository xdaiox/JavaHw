package com.xdaiox.hw5;

public class SalariedEmp extends Employee {
	
	public SalariedEmp() {
		
		setEmpName("Jane");
		setGender("f");
		setDueDate("2019/05/16");
		setTel("0972133333");
		setEmail("Jame333@gmail.com");
		setHours(176);
		setSalarysH(250);
		
	}
	
	
	public void printtotalsalary() {
		int total = getLunchAllowance();
		System.out.print("一般職員: ");
		super.printtotalsalary();
		System.out.println("當月薪資: " + 	super.totalSalaryF(total));

	}
}
