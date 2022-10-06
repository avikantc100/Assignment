package com.jdk;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//Calories, Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins 
		String sourfruit[]= {"20%calories","30%carbohydrate","10%fiber" ,"15%sugar", "3%fat" ,"9%protein" ,"12%vit"};
		String sweetfruit[]= {"13%calories","17%carbohydrate","26%fiber" ,"43%sugar", "5%fat" ,"5%protein" ,"10%vit"};
		
		SourFruits sof=new SourFruits("Mango", "yellow", sourfruit, "15%sugar");

		Sweetfruits swf=new Sweetfruits("Apple", "Red", sweetfruit, "40%sugar");
		
		sof.display(sof);
		swf.display(swf);
		
	}
}
