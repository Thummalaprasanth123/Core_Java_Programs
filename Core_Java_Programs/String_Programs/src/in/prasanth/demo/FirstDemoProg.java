package in.prasanth.demo;

import java.util.Scanner;

public class FirstDemoProg {

	int x;
	static int y;

	public static void main(String[] args) {
		int c = 0;
		System.out.println("Enter a and b values :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		c = a + b;
		System.out.println("addition :" + c);
	}
	

}
