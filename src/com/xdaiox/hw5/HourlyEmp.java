package com.xdaiox.hw5;

public class HourlyEmp extends Employee {
	private int salarysH;
	private int hours;

	public HourlyEmp(String empName,String gender,String dueDate, String tel,String email) {
//		setEmpName("Mary the 約聘員工");
//		setGender("f");
//		setDueDate("2020/01/01");
//		setTel("0972165599");
//		setEmail("tmoswj@gmail.com");
		hours=176;
		salarysH=250;
	}
	public void printinfosalary() {
		super.printinfo();
		System.out.println("\n薪資: "+hours*salarysH);
	}
}
