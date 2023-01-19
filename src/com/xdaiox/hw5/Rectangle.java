package com.xdaiox.hw5;

public class Rectangle implements Shape{
	
	public double computeArea(double x,double y) {
		double area = x*y;
		return area;
	}
	public double computeCircumference(double x,double y) {
		double cf = 2*x + 2*y;
		return cf;
	}
}
