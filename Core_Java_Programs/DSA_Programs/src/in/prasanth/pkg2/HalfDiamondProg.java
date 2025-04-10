package in.prasanth.pkg2;

public class HalfDiamondProg {
	public static void main(String[] args) {
		int n = 3, a = 5;
		for (int i = 1; i <= a; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i >= n) {
				for (int j = i; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}
}
