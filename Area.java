package com.jdk;

public class Area {

	void area(float x)
	{
		System.out.println("Area of square:"+Math.pow(x, 2));
	}
	
	void area(float x,float y)
	{
		System.out.println("Area of Rectangle:"+x*y);
	}
	
	void area(double x,double y,double z)
	{
		double p=x+y+z/2;
		double area=Math.sqrt(p*(p-x)*(p-y)*(p-z));
		System.out.println("Area of Triangle:"+area);
		
		double side1=x*x+y*y;
		double side2=z*z;
		
		if(side1==side2)
		{
			System.out.println("It is right angle triangle");
		}
	}	
}
