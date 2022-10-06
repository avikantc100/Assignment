package com.jdk;

public class SourFruits extends Fruit {

	String[] fruitinfo=	new String[9];
	String sourtest;
	

	public SourFruits(String fruitname, String fruitcolor, String[] fruitinfo,String sourtest) {
		super(fruitname, fruitcolor);
		this.fruitinfo = fruitinfo;
		this.sourtest=sourtest;
	}

	public void display(SourFruits sf)
	{
		System.out.println("***SourFruits info***");
		System.out.println("Fruit Name ="+sf.fruitname);
		System.out.println("Fruit Color ="+sf.fruitcolor);
		System.out.println("**Nutrition summary**");
		for(String s:sf.fruitinfo)
		{
			System.out.print(s +" ");
		}
		System.out.println();
		System.out.println("SourFruit bcz of sugar is =" +sf.sourtest);
		System.out.println("=============****=============");
	}
}
