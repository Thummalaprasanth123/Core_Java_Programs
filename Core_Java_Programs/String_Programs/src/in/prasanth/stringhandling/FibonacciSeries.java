package in.prasanth.stringhandling;

// 0 1 1 2 3 5 8 13 21 34 

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 10; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum+" ");

		}
	}

}
