package com.xdaiox.hw3;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,15,666,7,8,9,10};
		int x = data[0];
		for(int i = 0;i<9;i++) {
			if(x < data[i+1]) {
				x = data[i+1];
			}
		}//i = 0;i<9;i++
		System.out.println(x);
	}

}