package com.string;

public class Program5 {

	public static void main(String[] args) {
		
		int n = args.length;
 
	    sort(args,n);
	    printArraystring(args, n);
	}

	private static void printArraystring(String[] str, int n) {
		// TODO Auto-generated method stub
		for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}

	private static void sort(String[] s, int n) {
		// TODO Auto-generated method stub
		for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}	
}
