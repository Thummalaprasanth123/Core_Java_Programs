package in.prasanth.stringhandling;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		int n = 29416;
		int coef = 0, rem = 0, rev = 0;
		int sumofdigits = 0;
		/*
		 * int coefficient=n/10; int remainder=n%10; System.out.println(coefficient);
		 * System.out.println(remainder);
		 */
		while (n > 0) {
			coef = n / 10;
			rem = n % 10;
			sumofdigits = sumofdigits + rem;
			if (rem % 2 == 0) {
				System.out.println("even number: " + rem);
			}
			rev = rev * 10 + rem;
			n = coef;
		}
		System.out.println(rev);
		System.out.println(sumofdigits);
	}

}
