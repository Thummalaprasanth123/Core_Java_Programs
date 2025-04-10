package in.prasanth.pkg2;

public class FloydsProg {

	public static void main(String[] args) {
		int a = 20, b = 20, count = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (j <= i) {
					System.out.print(count);
					count = count + 1;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
