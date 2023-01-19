package com.xdaiox.hw5;

public class HourlyEmp extends Employee {
	 

	public HourlyEmp() {
		setEmpName("Mary");
		setGender("f");
		setDueDate("2020/01/01");
		setTel("0972165599");
		setEmail("tmoswj@gmail.com");
		setHours(176);
		setSalarysH(250);
		
	}
	public void printtotalsalary() {
		System.out.print("臨時員工: ");
		super.printtotalsalary();
		System.out.println("當月薪資: " + 	super.totalSalaryF(0)+"\n");
	}
}
