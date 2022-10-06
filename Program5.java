package com.jdk;

public class Program5 {

	public int maxElement(int[] arr)
	{
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	public String maxElement(String[] str)
	{
		int maxLength = 0;
	    String longestString = null;
	    
	    for (String s : str) 
	    {
	    	if (s.length() > maxLength)
	    	{
	              maxLength = s.length();
	              longestString = s;
	         }
	     }
	     return longestString;
	}
	
	public static void main(String[] args) {
		
		Program5 p1=new Program5();
		int arr[]= {22,3,550,4,11,100};
		String str[]= {"Ambajogai","Pune","Mumbai","Goa"};
		
		int result=p1.maxElement(arr);
		System.out.println("Maximum length of element:"+result);
		
		String result1=p1.maxElement(str);
		System.out.println("Maximum length of String:"+result1+" length "+result1.length());
	}
}
