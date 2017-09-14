package com.learn.day3;



public class TestShape {

	public static void maxArea(Shape[] shapes){
		double max=shapes[0].area();
		int maxIndex=0;
		for (int i = 1; i < shapes.length; i++) {
			double area=shapes[i].area();
			if(area>max){
				max=area;
				maxIndex=i;
			}
		}
		System.out.println("数组中索引为"+maxIndex+"的图形的面积最大，面积为："+max);
	}
	
	public static void main(String[] args) {
		Shape[] shapes=new Shape[2];
		shapes[0]=new Circle(4);
		shapes[1]=new Square(4);
		maxArea(shapes);
	}
}