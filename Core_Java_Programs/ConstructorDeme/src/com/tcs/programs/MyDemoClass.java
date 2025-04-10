package com.tcs.programs;

public class MyDemoClass {

	public static void modify(int r2) {
		r2=40;
		System.out.println(r2);
	}
	public static void main(String[] args) {
		
		//call by value
		int r1=10;
		modify(r1);
		System.out.println(r1);

	}

}
