package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
			
		String input="This string contains your Input";

	    String allVowel="a,e,i,o,u,A,E,I,O,U";
	    List<String> vowelList=new ArrayList<>();
	    List<String> constantList=new ArrayList<>();
	    
	    input.chars().mapToObj(c -> String.valueOf((char) c)).forEach(c->{
	     if(allVowel.contains(c)){
	       vowelList.add(c);
	      }
	     else if(!c.equals(" ")){
	       constantList.add(c);
	     }
	    });

	    String[] constantArray=constantList.toArray(new String[0]);
	    String[] vowelArray=vowelList.toArray(new String[0]);
	    int i=constantArray.length;
	    int j=vowelArray.length;
	    int k=i+j;
	    
	    String[] finalArray=new String[k];
	    
	    for(int m=0;m<i;m++)
	    {
	    	finalArray[m]=constantArray[m];
	    }
	    
	    for(int m=0;m<j;m++)
	    {
	    	finalArray[i+m]=vowelArray[m];
	    }
	    System.out.println("Final Array:"+Arrays.toString(finalArray));
	}
}
