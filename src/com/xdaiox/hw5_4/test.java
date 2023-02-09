package com.xdaiox.hw5_4;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) {


			File file = new File("c:\\Java\\workspace\\homework\\src\\com\\xdaiox\\hw5_4","Empinfo.txt");

			try(FileReader fr = new FileReader(file)) {
				BufferedReader br = new BufferedReader(fr);
				String str;
				while ((str=br.readLine())!=null) {
					if(str.contains("Manager")) {
						
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	
	}

}
