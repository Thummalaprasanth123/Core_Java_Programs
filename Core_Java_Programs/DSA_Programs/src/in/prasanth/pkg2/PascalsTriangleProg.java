package in.prasanth.pkg2;

public class PascalsTriangleProg {

	public static void main(String[] args) {
		int rows = 6, coef = 1;

		for (int i = 0; i < rows; i++) {
			for (int space = 1; space < rows - i; ++space) {
				System.out.print("  ");
			}
             
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					coef = 1;
				else
					coef = coef * (i - j + 1) / j;

				System.out.printf("%4d", coef);
			}

			System.out.println();
		}
	}
}

//----------------
/*
 * public class PascalsTriangleProg {
 * 
 * public static void main(String[] args) { int[][] a=new int[6][11]; for(int
 * i=1;i<=6;i++) { for(int j=6;j<=11;j++) { a[i][j]=1;
 * System.out.println(a[i][j]); } }
 * 
 * } }
 */
