package in.prasanth.pkg1;

import java.util.Scanner;

public class PrintAllDivisors {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
	     if(num%i==0)
	     {
	    	 System.out.println(i);
	     }
		}
	}
}
