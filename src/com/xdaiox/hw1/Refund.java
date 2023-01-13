package com.xdaiox.hw1;

/*
 * 選擇性敘述的練習-Refund
輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
說明：若買了132元的商品，付1000元，應找回一張500元，
三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。

 * */

public class Refund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 1;
		int pay = 50000;
		int refund;
		refund = pay - price;
		
		if (price > pay) {
			System.out.println("金額不足");
		}//price > pay
		if(price == pay) {
			System.out.println("不必找錢");
		}//price == pay
		
		if(price < pay) {
			System.out.print("若買了"+price+"元的商品，付"+pay+"元，應找回");
			if(refund >= 1000) {
				System.out.print((refund/1000)+"張1000元，");
				refund = refund%1000;
			}//refund >= 1000
			
			if(refund >=500) {
				System.out.print((refund/500)+"張500元，");
				refund = refund%500;
			}//(refund >=500)
			
			if(refund >=100) {
				System.out.print((refund/100)+"張100元，");
				refund = refund%100;
			}//(refund >=100)
			
			if(refund >=50) {
				System.out.print((refund/50)+"個50元硬幣，");
				refund = refund%50;
			}//(refund >=50)
			
			if(refund >=10) {
				System.out.print((refund/10)+"個10元硬幣，");
				refund = refund%10;
			}//(refund >=10)
			
			if(refund >=5) {
				System.out.print((refund/5)+"個5元硬幣，");
				refund = refund%5;
			}//(refund >=5)
			
			if(refund >=1) {
				System.out.println((refund/1)+"個1元硬幣。");
				refund = refund%1;
			}//(refund >=1)
			
		}//price < pay
	}

}
