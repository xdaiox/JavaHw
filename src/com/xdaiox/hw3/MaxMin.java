package com.xdaiox.hw3;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,1,4,4,15,666,7,8,9,10};
		int x = data[0];
		int y = x;
		
		for(int i = 0;i<9;i++) {
			if(x < data[i+1]) { //找出最大值
				x = data[i+1];
			}
		}//i = 0;i<9;i++
		System.out.println("max: "+ x);
		
		for(int i = 0;i<9;i++) {
			if(y > data[i+1]) { //找出最小值
				y = data[i+1];
			}
		}//i = 0;i<9;i++
		System.out.println("min: "+ y);
	}

}