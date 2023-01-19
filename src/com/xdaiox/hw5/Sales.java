package com.xdaiox.hw5;

public class Sales extends SalariedEmp{
	private int saleBonus = 3000;
	public Sales() {
		setEmpName("\nJerry the 銷售員");
		setGender("m");
		setDueDate("2005/07/07");
		setTel("0970000777");
		setEmail("Jerry77@gmail.com");
		setHours(176);
		setSalarysH(250);
	}
	
	public void printinfosalary() {
		super.printinfosalary();
		System.out.println("+ 銷售獎金" + saleBonus);
	}
	
	public void printtotalsalary() {
		System.out.println("共: " + (getBasicSalary() + getLunchAllowance()+saleBonus));
	}
	
	
}
