package com.xdaiox.hw5_3;

public class Stake {
	int[] x = new int[3];
	int top = 0;
	public void push(int y) {
		try{
			if(top>=3)
				throw new StackFullException();
			x[top] = y;
			top++;
			System.out.println(y);
					
		}catch(StackFullException e) {
			System.out.println("資料 "+y+" 溢出.");
		}
	}
	
	public int pop() {
		try{
			if(top>0) {
				top--;
				int y = (int) x[top];
				System.out.println("取出"+y);
				
			}
			else {
				throw new StackEmptyException();
				
			}
		}catch(StackEmptyException e) {
			System.out.println("資料已取完");
		}
		return x[top];
	}
}
