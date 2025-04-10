package com.tcs.programs;

public class DemoClass {
	
	public static void modify(Rec r2) {
		r2.length=40;
		System.out.println(r2.length);
	}

	public static void main(String[] args) {
		
	Rec r1=new Rec();
	r1.length=10.0f;
     modify(r1);
     System.out.println(r1.length);
	}

}
