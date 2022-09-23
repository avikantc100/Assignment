package com.string;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter any string: ");
			String strInput = sc.nextLine();
			char[] ch = strInput.toCharArray();
			
			for(int a = 0; a < ch.length; a++)
			{
				if(ch[a] >= 'A' && ch[a] <= 'Z')
				{
					ch[a] = (char)((int)ch[a] + 32);
				}
				else 
				{
					if(ch[a]>='a' && ch[a]<='z')
					{
						ch[a]=(char)((int)ch[a]-32);
					}
				}
			}
			System.out.println("String is: ");
			for(int a = 0; a < ch.length; a++)
			{
				System.out.print(ch[a]);
			}
			sc.close();
	}
}

