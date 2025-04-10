package com.tcs.programs;

public class Test {
    
	/*
	 * void m1(int a, float b)//local variable {
	 * System.out.println("This is m1 method");
	 * System.out.println("int value : "+a+" & "+"Float value : "+b); } static void
	 * m2(char c, String d) { System.out.println("This is m2 method");
	 * System.out.println("char value : "+c+" & "+"String value : "+d); }
	 */
	/*
	 * int a=10; float b=2.4f; void m1(Exam e,Student s) {
	 * System.out.println("This is m1 method..."); Test.m2(s, e); } static void
	 * m2(Student s1, Exam e1) { System.out.println("This is m2 method...");
	 */
	int m1() {
		return 10;
		
	}
	public static void main(String[] args) {
		int c=new Test().m1();
   System.out.println(c);
	}

}
