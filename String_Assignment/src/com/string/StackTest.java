package com.string;

import java.util.Scanner;

public class StackTest{

	public static void main(String[] args){     //Main Method
		Stack stck = new Stack();
	    System.out.println("Initial Stack Empty : " + stck.isEmpty());
	    //push elements
	    stck.push("Pune");
	    stck.push("Mumbai");
	    stck.push("Delhi");
	    stck.push("Kolkata");
	    System.out.println("After Push Operation...");
	    //print the elements
	    stck.display();
	    //pop two elements from stack
	    stck.pop();
	    stck.pop();
	    System.out.println("After Pop Operation...");
	    //print the stack again
	    stck.display();
	}
}
