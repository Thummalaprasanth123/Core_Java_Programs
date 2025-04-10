package in.prasanth.stringhandling;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 64759, count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
				System.out.println(i);
			}

		}
		if (count > 1) {
			System.out.println("Not a Prime number");
		} else {
			System.out.println("prime number");
		}

	}

}
