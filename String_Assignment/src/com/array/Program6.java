package com.array;

public class Program6 {

	public static void main(String[] args) {
		
		int arr[] = {4, 10, 15, 5, 6};
        int n = arr.length;
        pairwiseSum(arr, n);
	}

	private static void pairwiseSum(int[] arr, int n) {
		// TODO Auto-generated method stub
		int avg = 0;
        for (int i = 0; i + 1 < n; i++)
        {
            // adding the alternate numbers
            avg = (arr[i] + arr[i + 1])/2;
            System.out.print(avg + " ");
        }
	}
}
