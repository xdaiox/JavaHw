package com.xdaiox.hw5_2;

public class Circle implements Shape{
	public void computeArea(double x,double y) {
		x=x/2;
		double area = x*x*Math.PI;
		System.out.println(area);
	}
	public void computeCircumference(double x,double y) {
		double cf = x*Math.PI;
		System.out.println(cf);
	}
}
