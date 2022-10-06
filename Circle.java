package com.jdk;

public class Circle implements Shape {

	int r = 5;
    double pi = 3.14, ar = 0;
    		
	@Override
	public void area() {
		// TODO Auto-generated method stub
		ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
	}
	
}
