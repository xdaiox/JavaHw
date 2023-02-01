package com.xdaiox.hw5_4;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) {
		int i = 0;
		try {
			File file = new File("c:\\Java\\workspace\\homework\\src\\com\\xdaiox\\hw5_4","Empinfo.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] data = new byte[bis.available()];
			bis.read(data);
			String str = new String(data);
			System.out.println(str);
			
			String[] tokens = str.split(",");
			for(String token : tokens)
				System.out.println(token);
			bis.close();
			fis.close();
			
			List<String> emp = new ArrayList<>();
			for(String token : tokens)
				emp.add(token);
			
			System.out.println(emp);
			
			do {}while();
			
			
			
		}catch(FileNotFoundException e) {e.printStackTrace();
		}catch(IOException e) {e.printStackTrace();}


		
	}

}
