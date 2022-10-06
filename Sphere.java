package com.jdk;

public class Sphere implements Shape {

	int r=4;
	double pi = 3.14, ar = 0;
	 
	@Override
	public void area() {
		// TODO Auto-generated method stub
		ar=4*pi*(r*r);
		System.out.println("Area of Sphere:"+ar);
	}

}
