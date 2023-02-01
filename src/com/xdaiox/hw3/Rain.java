/*三維陣列的練習-Rain
輸入一字串，字串為”all” 表示計算60個月的總平均降雨量，
”year”、”season”和”chknum”分別表示計算某年、某季或某月的平均降雨量。
若為後三者，再輸入一個正整數表示那一年、那一季或那一月。
說明：5年12個月的降雨量以三維陣列形式事先給好60個浮點數
需做誤錯處理：
輸入除了”all”、”year”、”season”和”chknum”以外的字串
若輸入”year”，而正整數輸入1至5以外的數字
若輸入”season”，而正整數輸入1至4以外的數字
若輸入”chknum”，而正整數輸入1至12以外的數字*/


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
		int chknumtotal = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		String chknum ;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入all or year or season or month : ");
		String type = sc.next();

		

		//chknumtotal = rain.length*rain[0].length*rain[0][0].length;
		
		
		switch (type) {
			case "all" : { //all
				for(i = 0;i<rain.length;i++) {
					for(j = 0;j<rain[i].length;j++) {
						for(k = 0;k<rain[i][j].length;k++) {
							raintotal+=rain[i][j][k];
						}//k = 0;k<rain[i][j].length;k++
					}//j = 0;j<rain[i].length;j++
				}//i = 0;i<rain.length;i++
				chknumtotal = i*j*k;
				System.out.println(chknumtotal+"個月平均降雨量: "+raintotal/chknumtotal); 
				break;
			}
			
			
			case "year" : { //year
				Scanner iy = new Scanner(System.in);
				System.out.print("請輸入第幾年 1~5數字:");
				chknum = iy.next();
				iy.close();
				switch (chknum) {
					case "1": case "2": case "3": case "4": case "5": {
						i=Integer.parseInt(chknum);;
						i--;
						for(j = 0;j<rain[i].length;j++) {
							for(k = 0;k<rain[i][j].length;k++) {
								raintotal+=rain[i][j][k];
							}//k = 0;k<rain[i][j].length;k++
						}//j = 0;j<rain[i].length;j++
						chknumtotal = j*k;
						System.out.print("第"+(i+1)+"年的 年平均降雨量為: "+raintotal/chknumtotal);
						break;
					}

					default :{
						System.out.println("輸入錯誤。");
						break;
					}
				}



				break ;
			}//case2"year"
			
			
			case "season" : { //season
				Scanner is = new Scanner(System.in);
				System.out.print("請輸入第幾季 1~4數字:");
				chknum = is.next();
				is.close();
				switch (chknum) {
					case "1": case "2": case "3": case "4": {
						j=Integer.parseInt(chknum);;
						j--;
						for(i = 0;i<rain.length;i++) {
								for(k = 0;k<rain[i][j].length;k++) {
									raintotal+=rain[i][j][k];
								}//k = 0;k<rain[i][j].length;k++
						}//i = 0;i<rain.length;i++
						chknumtotal = i*k;
						System.out.print("第"+(j+1)+"季的 年平均降雨量為: "+raintotal/chknumtotal);
						break;
					}
					default : {
						System.out.println("輸入錯誤。");
					}
				}


				break;
			}//"season"
			
			
			case "month" : { //month
				Scanner im = new Scanner(System.in);
				System.out.print("請輸入第幾個月 1~12數字:");
				chknum = im.next();
				im.close();
				switch (chknum) {
					case "1": case "2": case "3": case "4":
					case "5": case "6": case "7": case "8":
					case "9": case "10": case "11": case "12":
					
						int num = Integer.parseInt(chknum);
						
						if(num>=1 && num<=3) {
							j=0;
							k=num-1;
							for(i = 0;i<rain.length;i++) {
										raintotal+=rain[i][j][k];
							}//i = 0;i<rain.length;i++
							chknumtotal = i;
							System.out.print("第"+chknum+"月的 年平均降雨量為: "+raintotal/chknumtotal);
						}

						
						if(num>=4 && num<=6) {
							j=1;
							k=num%4;
							for(i = 0;i<rain.length;i++) {
								raintotal+=rain[i][j][k];
							}//i = 0;i<rain.length;i++
							chknumtotal = i;
							System.out.print("第"+chknum+"月的 年平均降雨量為: "+raintotal/chknumtotal);
						}
						
						
						if(num>=7 && num<=9) {
							j=2;
							k=num%7;
							for(i = 0;i<rain.length;i++) {
								raintotal+=rain[i][j][k];
							}//i = 0;i<rain.length;i++
							chknumtotal = i;
							System.out.print("第"+chknum+"月的 年平均降雨量為: "+raintotal/chknumtotal);
						}

						
						if(num>=10 && num<=12) {
							j=3;
							k=num%10;
							for(i = 0;i<rain.length;i++) {
								raintotal+=rain[i][j][k];
							}//i = 0;i<rain.length;i++
							chknumtotal = i;
							System.out.print("第"+chknum+"月的 年平均降雨量為: "+raintotal/chknumtotal);
						}
						
						if(num<=0 || num>=13) {
							System.out.println("輸入錯誤。");
						}
						break;
						
						default:{
							System.out.println("輸入錯誤。");
						}
				}//case 1~12:

				break;
			}//case month
			default : {
				System.out.println("輸入錯誤。");
				break;
			}
		}
	sc.close();
	} 	

}