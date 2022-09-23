package com.array;

public class Program3 
{

	private int array[];   
	private int count;   
	private int sizeofarray;   

	public Program3()   
	{   
		array = new int[1];   
		count = 0;   
		sizeofarray = 1;   
	}   
	
	public void addElement(int a)   
	{   
	
		if (count == sizeofarray)   
		{   
			//invoking the growSize() method that creates an array of double size      
			growSize();   
		}   
			array[count] = a;   
			count++;   
		}   
		public void growSize()   
		{   
			int temp[] = null;   
			if (count == sizeofarray)   
			{   
				temp = new int[sizeofarray * 2];   
				{   
					for (int i = 0; i < sizeofarray; i++)   
					{   
						temp[i] = array[i];   
					}   
				}   
			}   
			array = temp;   
			sizeofarray= sizeofarray * 2;   
		}   
		public void shrinkSize()   
		{   
			int temp[] = null;   
			if (count > 0)   
			{   
				temp = new int[count];   
				for (int i = 0; i < count; i++)   
				{   
					  
					temp[i] = array[i];   
				}   
				sizeofarray = count;   
				array = temp;   
			}   
		}   
		public void removeElement()   
		{   
			if (count > 0)   
			{   
				array[count - 1] = 0;   
				count--;   
			}   
		}   
		//creating a function that delets an element from the specified index  
		public void removeElementAt(int index)   
		{   
			if (count > 0)   
			{   
				for (int i = index; i < count - 1; i++)   
				{   
					//shifting all the elements to the left from the specified index  
					array[i] = array[i + 1];   
				}   
				array[count - 1] = 0;   
				count--;   
			}   
		}
		
		public static void main(String[] args)   
		{   
			Program3 da = new Program3();   
			//adding elements to the array  
			da.addElement(12);   
			da.addElement(22);   
			da.addElement(35);   
			da.addElement(47);   
			da.addElement(85);   
			da.addElement(26);   
			da.addElement(70);   
			da.addElement(81);   
			da.addElement(96);   
			da.addElement(54);  
			System.out.println("Elements of the array:");   
			//iterate over the array for accessing the elements  
			for (int i = 0; i < da.sizeofarray; i++)   
			{   
				System.out.print(da.array[i] + " ");   
			}   
			System.out.println();   
			//determines and prints the size and number of elements of the array  
			System.out.println("Size of the array: " + da.sizeofarray);   
			System.out.println("No. of elements in the array: " + da.count);   
			//invoking the method to delete the last element of the array  
			da.removeElement();   
			//prints array after deleting the last element  
			System.out.print("\nElements of the array after deleting the last element: ");   
			for (int i = 0; i < da.sizeofarray; i++)  
			{   
				System.out.print(da.array[i] + " ");   
			}   
			System.out.println();   
			//determines and prints the size and number of elements of the array  
			System.out.println("Size of the array: " + da.sizeofarray);   
			System.out.print("No. of elements in the array: " + da.count+"\n");   
			//invoking the method that deletes an element from the specified index  
			da.removeElementAt(7);   
			System.out.print("\nElements of the array after deleting the element at index 7: ");   
			//prints the array after deleting the element from index 7  
			for (int i = 0; i < da.sizeofarray; i++)   
			{   
				System.out.print(da.array[i] + " ");   
			}   
			System.out.println();   
			//determines and prints the size and number of elements of the array  
			System.out.println("Size of the array: " + da.sizeofarray);   
			System.out.print("No. of elements in the array: " + da.count);   
		}   
}
