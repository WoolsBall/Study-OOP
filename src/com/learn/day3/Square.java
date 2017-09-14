package com.learn.day3;

public class Square extends Shape{

	public Square(double c){
		this.c=c;
	}
	@Override
	public double area() {
		double area=0.0625*c*c;
		return area;
	}

}
