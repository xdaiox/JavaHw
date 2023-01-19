package com.xdaiox.hw5;

public class HourlyEmp extends Employee {
	 

	public HourlyEmp() {
		setEmpName("Mary the 約聘員工");
		setGender("f");
		setDueDate("2020/01/01");
		setTel("0972165599");
		setEmail("tmoswj@gmail.com");
		setHours(176);
		setSalarysH(250);
		
	}
	public void printinfosalary() {
		super.printinfo();
	}
}
