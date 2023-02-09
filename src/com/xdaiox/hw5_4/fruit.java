package com.xdaiox.hw5_4;
import java.util.ArrayList;
public class fruit {
	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<>();
	    list.add("apple");
	    list.add("banana");
	    list.add("cherry");
	    list.add("date");
	    list.add("elderberry");

	    for (String fruit : list) {
	      switch (fruit) {
	        case "apple":
	        case "banana":
	          System.out.println("This is a fruit: " + fruit);
	          break;
	        case "cherry":
	        case "date":
	          System.out.println("This is also a fruit: " + fruit);
	          break;
	        default:
	          System.out.println("I'm not sure what this is: " + fruit);
	      }
	    }
	  }
}
