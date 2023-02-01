package com.xdaiox.hw5;

public class test {

	public static void main(String[] args) {
		HourlyEmp mary = new HourlyEmp("Mary the 約聘員工","f","2020/01/01","0972165599","tmoswj@gmail.com");
		mary.printinfosalary();
		
		SalariedEmp jane = new SalariedEmp("\n\nJane the 員工","f","2019/05/16","0972133333","Jame333@gmail.com");
		jane.printinfosalary();
		jane.printtotalsalary();
		
		Manager mcLovin = new Manager("\nMcLovin the 主管","m","2009/06/09","0969666999","Lovin69@gmail.com");
		mcLovin.printinfosalary();
		mcLovin.printtotalsalary();
		
		Sales jerry = new Sales("\nJerry the 銷售員","m","2005/07/07","0970000777","Jerry77@gmail.com");
		jerry.printinfosalary();
		jerry.printtotalsalary();
	}

}
