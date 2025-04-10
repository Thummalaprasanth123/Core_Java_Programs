package in.prasanth.pkg2;

import java.util.Scanner;

public class FindAdditionOrSub {
	private static String operation(int a, int b, int result) {
		int addOp = a + b;
		int subOp1 = a - b;
		int subOp2 = b - a;
		if (result == addOp) {
			return "ADDITION";
		} else if ((result == subOp1) || (result == subOp2)) {
			return "SUBSTRACTION";
		} else {
			return "Enter appropriate result value";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = sc.nextInt();
		String s = operation(x, y, result);
		System.out.println("The performed Arithmetic Operation is:" + s);
	}

}
