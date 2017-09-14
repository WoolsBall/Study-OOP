package com.learn.day3;

public class Circle extends Shape{

	public Circle(double c){
		this.c=c;
	}
	@Override
	public double area() {
		double area=0.0796*c*c;
		return area;
	}

}
