package com.jdk;

public class Program8 {

	static int count=0;
	
	public Program8()
	{
		count++;
	}
	
	@Override
    protected void finalize()
    {
		System.out.println("Total number of objects:"+Program8.count);
		System.out.println("Object is free from memory");
    }
	public static void main(String[] args) {
		
		Program8 p=new Program8();
		Program8 q=new Program8();
		Program8 r=new Program8();
		
		System.out.println("Running Object:"+q.hashCode());
		p=null;
		System.gc();	
	}
}
