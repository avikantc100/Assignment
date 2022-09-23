package com.array;

public class Program1 {

	public static void main(String[] args) {
		
		int [] arrA = new int [] { 6, 8, 1, 9, 2, 10};
        thirdSmallestElement(arrA);
	}

	private static void thirdSmallestElement(int[] arrA) {
		// TODO Auto-generated method stub
		if(arrA.length<3)
		{
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i = 0; i <arrA.length ; i++) 
        {
            int current = arrA[i];
            if(first>current)
            {
                third = second;
                second = first;
                first = current;
            }
            else if(second>current)
            {
                third = second;
                second = current;
            }
            else if(third>current)
            {
                third=current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }
}
