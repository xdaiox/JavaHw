package com.xdaiox.hw5;

public class Circle implements Shape{
	public double computeArea(double d) {
		d=d/2;
		double area = d*d*Math.PI;
		return area;
	}
	public double computeCircumference(double d) {
		double cf = d*Math.PI;
		return cf;
	}
}
