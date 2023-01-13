/*三維陣列的練習-Rain
輸入一字串，字串為”all” 表示計算60個月的總平均降雨量，
”year”、”season”和”month”分別表示計算某年、某季或某月的平均降雨量。
若為後三者，再輸入一個正整數表示那一年、那一季或那一月。
說明：5年12個月的降雨量以三維陣列形式事先給好60個浮點數
需做誤錯處理：
輸入除了”all”、”year”、”season”和”month”以外的字串
若輸入”year”，而正整數輸入1至5以外的數字
若輸入”season”，而正整數輸入1至4以外的數字
若輸入”month”，而正整數輸入1至12以外的數字*/


package com.xdaiox.hw3;
import java.util.Scanner;
public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][][] rain={{{114.8,101.7,208.6},{135.4,168.3,33.2}, {108.5,100.1,248.8},{35.5,174.4,124.0}},
						   {{41.1,225.2,107.3}, {26.6,78.7,76.8},   {158.9,74.0,203.1}, {146.2,9.3,229.4}},
						   {{96.0,232.1,236.2}, {200.3,126.4,117.5},{238.6,49.7,212.8}, {93.9,84.0,176.1}},
						   {{184.2,134.3,207.4},{5.5,141.6,73.7},   {120.8,233.9,193.0},{245.1,112.2,137.3}},
						   {{13.1,183.2,10.3},  {151.1,53.2,85.3},  {175.1,83.2,54.3},  {18.1,230.2,129.3}}};
		double raintotal =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入 year or season or month : ");
		String type = sc.next();
		double rainavg = 0;
		int monthtotal = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(i = 0;i<rain.length;i++) {
			for(j = 0;j<rain[i].length;j++) {
				for(k = 0;k<rain[i][j].length;k++) {
					raintotal+=rain[i][j][k];
				}//k = 0;k<rain[i][j].length;k++
			}//j = 0;j<rain[i].length;j++
		}//i = 0;i<rain.length;i++
		monthtotal = i*j*k;
		//monthtotal = rain.length*rain[0].length*rain[0][0].length;
		
		
		switch (type) {
			case "all" : {
				System.out.println(raintotal/monthtotal); break;
			}
			case "year" : {
				
				break;
			}//"year"
			case "season" : {
				break;
			}//"season"
			case "month" : {
				break;
			}
			default : {
				System.out.println("輸入錯誤。");
			}
		}

	sc.close();
	} 	

}
