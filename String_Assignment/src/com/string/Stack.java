package com.string;

import java.util.Scanner;

public class Stack {
		
		int top;            
		int maxsize = 5;     
		String[] stack_arry = new String[maxsize];  
		
		Stack()
		{            
			top = -1;  
		}    
		boolean isEmpty()
		{          
			return (top < 0);  
		}  
		boolean push(String val)
		{     
			if(top == maxsize-1) 
			{  
				System.out.println("Stack Overflow !!");  
				return false;  
			}  
			else  
			{  
				top++;  
				stack_arry[top]=val;  
				return true;  
			}  
		}  
		boolean pop() 
		{            
			if (top == -1)
			{  
				System.out.println("Stack Underflow !!");  
				return false;  
			}  
			else 
			{  
             
				System.out.println("\nItem popped: " + stack_arry[top--]);  
				return true;  
			}  
		}  
    
		void display() 
		{           
			System.out.println("Printing stack elements .....");  
			for(int i = top; i>=0;i--) 
			{  
				System.out.print(stack_arry[i] + " ");  
			}  
		}  
}  
