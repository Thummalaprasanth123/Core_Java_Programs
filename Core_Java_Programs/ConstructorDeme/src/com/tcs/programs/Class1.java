package com.tcs.programs;

public class Class1 implements Class3 {
    
	
	public static void main(String[] args) {
	 Class1 c1=new Class1();
	  c1.first();
	  c1.begin();
	  Class3.end();
	}
	@Override
	public void first() {
		System.out.println("Abstract interface method");
	}
	
	@Override
	public void begin()
	{
		System.out.println("Overriden default interface method");
	}

	

}


