package com.xdaiox.hw5_2;

public class Rectangle implements Shape{
	
	public void computeArea(double x,double y) {
		double area = x*y;
		System.out.println(area);
	}
	public void computeCircumference(double x,double y) {
		double cf = 2*x + 2*y;
		System.out.println(cf);
	}
}
