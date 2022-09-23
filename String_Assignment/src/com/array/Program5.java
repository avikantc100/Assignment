package com.array;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
		
		  System.out.println("Please enter the length of array?");

		  Scanner scnr = new Scanner(System.in);
		  int length = scnr.nextInt();
		  int[] input = new int[length];

		  System.out.println("Please enter elements of array");
		  for (int i = 0; i < length; i++)
		  {
			  input[i] = scnr.nextInt();
		  }

		  int total = sumOfElements(input);
		  System.out.println("\nSum of all elements of array is " + total);
		  
		  evenNumber(input);
		  perfectNumber(input);
		  primeNumber(input);
		  scnr.close();
	}

	private static void primeNumber(int[] input) {
		// TODO Auto-generated method stub
		int result=0;
		
		for(int i=0; i<input.length; i++)
		{
	        boolean isPrime = true;
	        
	        //check to see if the numbers are prime
	        for (int j=2; j<input[i]; j++)
	        {
	            
	            if(input[i]%j==0)
	            {
	                isPrime = false;
	                break;
	            }
	        }
	        //print the number
	        if(isPrime)
	        {
	           result++;
	        }
	    }
		System.out.println("\nTotal Prime Number:"+result);
	}

	private static void perfectNumber(int[] input) {
		// TODO Auto-generated method stub
		int result=0;
		
		for(int i = 0; i < input.length; ++i) 
		{
			// If number is perfect
		     if (isPerfect(input[i])) 
		     {
		    	 result++;
		     }
		 }
		System.out.println("\nTotal Perfect Number is:"+result);
	}

	private static boolean isPerfect(int N) {
		// TODO Auto-generated method stub
		
		int sumOfDivisors = 1;
	    for (int i = 2; i <= N / 2; ++i) 
	    {
	    	if (N % i == 0) 
	    	{
	    		sumOfDivisors += i;
	    	}
	    }
	    // If sum of digits is equal to N,
	    // then it's a perfect number
	    if (sumOfDivisors == N) 
	    {
	      return true;
	    }	 
	    // Otherwise, not a perfect number
	    else
	      return false;
	}

	private static void evenNumber(int[] nums) {
		// TODO Auto-generated method stub
		int ctr_even = 0, ctr_odd = 0;
		
		for(int i = 0; i < nums.length; i++) 
		{
	        if(nums[i] % 2 == 0)
			{         
	          ctr_even++;
			}
	    }
		System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
		
		for(int i = 0; i < nums.length; i++) 
		{
	        if(nums[i] % 2 != 0)
			{         
	          ctr_odd++;
			}
	    }
		System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
	}

	private static int sumOfElements(int[] array) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i : array) 
		{
		  sum = sum + i;
		}
		return sum;
	}
}
