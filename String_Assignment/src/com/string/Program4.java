package com.string;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any string: ");
		String strInput = sc.nextLine();
		long result;
		
		result=stringToNumber(strInput);
		System.out.println("Final result:"+result);
	}

	private static long stringToNumber(String s) {
		// TODO Auto-generated method stub
		long result = 0 ;
		int pos=0,pos1=0;
		
	    for (int i = 0; i < s.length(); i++)
	    {
	        final char ch = s.charAt(i);
	        
	        if(ch>= 'A' && ch<= 'Z')
			{
	        	 pos1=ch-'A'+1;
	        	 result+=pos1;
			}
			else
			{
				pos=ch-'a'+1;
				result+=pos;
			}
		 }
	    return result;
	}
}
