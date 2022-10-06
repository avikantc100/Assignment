package com.jdk;

public class CompareString {

	public static void compare(String x, String y)
	{
		 if(x==null || y==null)
		 {
			 System.out.println("Both strings are null");;
		 }
		 //compare lengths
		 if(x.length()!=y.length())
		 System.out.println("Both string length are not match");;

		 //compare all characters
		 for (int i = 0; i <x.length() ; i++) 
		 {
			 if(x.charAt(i)!=y.charAt(i))
				 System.out.println("Both string are not equal");;
		 }
		 //if here, means both strings are equal
		 System.out.println("Both strings are equal");;
	}
}
