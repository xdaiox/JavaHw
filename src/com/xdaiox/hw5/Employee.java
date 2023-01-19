/*封裝、繼承、多型與修飾子的練習-Employee
有一公司每個員工皆有姓名、性別、到職日、電話和email等基本資料。公司有永久、臨時兩種員工；永久員工又分一般職員、主管和銷售員三種，
永久員工皆有本薪和午餐津貼（固定為2400元）；主管則另外有績效獎金和交通津貼（固定為3000元）；銷售員則另外有銷售獎金；臨時員工則為時薪。
在main()中產生四個實例分別為主管、一般職員、銷售員和臨時員工(資料直接透過建構子hard code在程式中)，並列印其基本資料及當月薪資。
註：一般職員的薪資為本薪加午餐津貼，主管的薪資為本薪加午餐津貼加效獎金和交通津貼，銷售員的薪資為本薪加午餐津貼加銷售獎金，臨時員工的薪資為時薪乘以當月工作時數。
*/
package com.xdaiox.hw5;

public abstract class Employee {
	private String empName;
	private String gender;
	private String dueDate;
	private String tel;
	private String email;
	private int salarysH;
	private int hours;
	private int totalSalary;
	private int lunchAllowance = 2400;
	
	public int getLunchAllowance() {
		return lunchAllowance;
	}
	public void setLunchAllowance(int lunchAllowance) {
		this.lunchAllowance = lunchAllowance;
	}
	public int getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalarysH() {
		return salarysH;
	}
	public void setSalarysH(int salarysH) {
		this.salarysH = salarysH;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	
	public int totalSalaryF(int extra) {
		totalSalary = hours * salarysH + extra;
		return totalSalary;
	}
	
	public void printtotalsalary () {
		System.out.println(empName+"\nGender: "+gender+"\nDueDate: "+dueDate+"\nTel: "+tel+"\nEmail: "+email);
	}
	
}
