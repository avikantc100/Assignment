package com.jdk;

public class Triangle implements Shape {

	float b=4.2f,h=2.4f,area;
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=(b*h)/2;
		System.out.println("Area of triangle is:"+area);
	}
}
