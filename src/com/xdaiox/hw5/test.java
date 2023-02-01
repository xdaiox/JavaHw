package com.xdaiox.hw5;

public class test {

	public static void main(String[] args) {
		HourlyEmp mary = new HourlyEmp("Mary the 約聘員工","f","2020/01/01","0972165599","tmoswj@gmail.com");
		mary.printinfosalary();
		
		SalariedEmp jane = new SalariedEmp();
		jane.printinfosalary();
		jane.printtotalsalary();
		
		Manager mcLovin = new Manager();
		mcLovin.printinfosalary();
		mcLovin.printtotalsalary();
		
		Sales jerry = new Sales();
		jerry.printinfosalary();
		jerry.printtotalsalary();
	}

}
