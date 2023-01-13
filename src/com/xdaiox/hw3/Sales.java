/*
 * 二維陣列的練習-Sales
某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；而該公司共有三位銷售員，他們在某月份的銷售數量如下所示
試計算：
每一個銷售員的銷售總金額
有最好業績（銷售總金額最多者）的銷售員
每一項產品的銷售總金額
銷售總金額最多的產品
*/
package com.xdaiox.hw3;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = {{33,32,56,45,33},
						{77,33,68,45,23},
						{43,55,43,67,65}};
		String[] sales = {"Jean","Tom","Tina"} ;
		int[] totalsale = new int[3];
		
		int price = 0;
		int pricesum =0;
		int topsales = 0;
		
		
		for(int i=0;i<3;i++) {
			pricesum = 0;
			for(int j=0;j<5;j++) {
				switch (j){
					case 0:
						price = data[i][j]*12; break;
					case 1:
						price = data[i][j]*16; break;
					case 2:
						price = data[i][j]*10; break;
					case 3:
						price = data[i][j]*14; break;
					case 4:
						price = data[i][j]*15; break;
				}	
				pricesum+=price;
			}//j=0;j<5;j++
			System.out.println(sales[i] + "的銷售額: " + pricesum + " ");
			totalsale[i] = pricesum;
		}//i=0;i<3;i++

		int j = totalsale[0];
		for(int i = 0;i<3;i++) {
			if(j < totalsale[i]) {
				j = totalsale[i];
				topsales = i;
			}//j<sum[i]
		}//i = 0;i<3;i++
		System.out.println("有最好業績（銷售總金額最多者）的銷售員: " + sales[topsales]);
	}

}