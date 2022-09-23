package com.array;

import java.util.ArrayList;

public class Program11 {

	public static void main(String[] args) {
		
		String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
        String[] result=new String[names.length];
        
		for(String name : names) 
		{
			  System.out.print(name);
			  
			  boolean isPalindrome = true;
			  for(int x=0, y=name.length()-1; x<y && isPalindrome; x++, y--) 
			  {
			    isPalindrome=(name.substring(x,x+1).equalsIgnoreCase(name.substring(y,y+1)));
			  }
			  
			  if (isPalindrome)
			  {
			      System.out.println("");
			  }	
		}
		
	}
}