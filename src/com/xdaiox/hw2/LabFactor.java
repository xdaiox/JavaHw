package com.xdaiox.hw2;

public class LabFactor {

	public static int Factor(int x) {
		int sum = 1;
		for(int i = 1;i<=x;i++) {
			sum*=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factor(6));
		System.out.println(Factor(9));
		System.out.println(Factor(10));
	}

}
