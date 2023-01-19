package com.xdaiox.hw5;

public class test {

	public static void main(String[] args) {
		HourlyEmp hEmp = new HourlyEmp();
		hEmp.printtotalsalary();
		
		SalariedEmp jane = new SalariedEmp();
		jane.printtotalsalary();
		
		Manager mcLovin = new Manager();
		mcLovin.printtotalsalary();
		
		Sales jerry = new Sales();
		jerry.printtotalsalary();
	}

}
