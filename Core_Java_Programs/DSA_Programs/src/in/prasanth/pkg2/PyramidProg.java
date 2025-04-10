package in.prasanth.pkg2;

public class PyramidProg {

	public static void main(String[] args) {
		int a = 6, b = 11, ar = 0, count = 0;
		for (int i = 1; i <= a; i++) {
			// System.out.println("output");
			for (int j = 1; j <= b;) {
				ar = (a - i);
				for (int k = 1; k <= ar; k++) {
					System.out.print(" ");
					count = count + 1;
				}
//		   j=count;
				for (int l = 0; l <= (i - 1); l++) {
					if ((l % 2 == 0) || !(l % 2 == 0)) {
						if ((i == a) && (l == (a - 1))) {
							System.out.print("*");
						} else {
							System.out.print("*");
							System.out.print(" ");
						}
					}
					count = count + 2;
				}
				for (int m = count; m < b; m++) {
					System.out.print(" ");
				}
				count = 0;
				ar = 0;
//		   System.out.println();
				break;
			}
			System.out.println();
		}

	}

}
