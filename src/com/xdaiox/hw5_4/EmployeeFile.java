/**
4. 檔案和集合的練習-EmployeeFile
改寫Employee作業，將hard code在程式裡的資料，改由檔案輸入。
提示：
每一列資料代表一個員工所有的資料
檔案裡的每一列資料沒有特定順序
在檔案裡可增加一個職位別來表示不同的職位
使用String類別的split()將字串切成tokens
使用ArrayList取代陣列來存放資料
 */
package com.xdaiox.hw5_4;
import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {
	public static void main(String [] args) throws Exception {
		ArrayList<Employee> Result = new ArrayList<Employee>();
		//notice the difference between SLASH and BACK-SLASH, Relative path and absolute path
		try(BufferedReader in=new BufferedReader(new FileReader("src//com//thh//hw5_4//EmployeeData.txt")))
		
		
		//Absolute path: "C:\\Java\\workspace\\homework\\src\\com\\thh\\hw5_4\\EmployeeData.txt"
		{

			String str;
			int cnt=0;
			
			while((str=in.readLine())!=null){
				String[] tokens=str.split(",");
					if(tokens[0].contains("Manager")) {
					
						Manager manager=new Manager(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
						
						manager.setBaseSalary(50000);
						manager.setManagerBonus(40000);
						manager.setLunchSupplement(2400);
						manager.setTravelSupplement(3000);
						
						Result.add(cnt, manager); 
					}
					else if(tokens[0].contains("Sales")) {
						Sales sales=new Sales(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
						sales.setBaseSalary(20000);
						sales.setLunchSupplement(2400);
						sales.setSalesBonus(10000);
						
						Result.add(cnt, sales); 
					}
					else if(tokens[0].contains("GeneralStaff")){
						GeneralStaff generalStaff=new GeneralStaff(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
						generalStaff.setBaseSalary(20000);
						generalStaff.setLunchSupplement(3000);
						
						Result.add(cnt, generalStaff); 
					}
					else if(tokens[0].contains("TemporaryEmployee")) {
						TemporaryEmployee temp=new TemporaryEmployee(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]); 
						temp.setHours(80);
						temp.setWage_per_hour(200);
						
						Result.add(cnt, temp); 
					}
				cnt++;
			  }
		}
		catch(IOException e) {
			System.out.println("This is an IOException.");
			e.printStackTrace();
		}
		//use polymorphism
		for(Employee E:Result) {
			E.printData();
		}
	}
}

			