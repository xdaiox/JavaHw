/*迴圏的練習-PerfectNumber
一個數字若等於其所有因數的總和，則此數為perfect number。
找出100以內所有的完美數。
說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。
*/

package com.xdaiox.hw2;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 50;
		
		for(int j=1;j<=100;j++) {
			for(int i=1;i<=num;i++) {
				if(num%i == 0) {
					System.out.println(i);
				}//num%i == 0
			}//i=1;i<=num;i++
		}//int j=1;j<=100;j++
	}
}
