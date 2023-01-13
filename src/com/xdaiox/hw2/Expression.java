package com.xdaiox.hw2;
/*
 * 迴圏的練習-Expression
利用for迴圏計算12-22+32-42+…+492-502的值。*/
public class Expression {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i=1;i<=50;i++) {
			if(i%2 == 0) {
				sum-=(i*i);
			}//i%2 == 0
			else {
				sum+=(i*i);
			}
		}
		System.out.println(sum);
		
		int max = 50;
		int sum1 = 0;
		for (int j = 0; j < max; j++) {
			if (j % 2 == 0) {
				sum1 += (j + 1) * (j + 1);
				continue;
			}
			sum1 -= (j + 1) * (j + 1);
		}
		System.out.println(sum1);
	}
}