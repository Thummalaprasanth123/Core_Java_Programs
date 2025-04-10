package in.prasanth.pkg2;

/*  R=4, C=8
 1      1
 12    21
 123  321
 12344321
 */
public class FloydsNumbersMirrorProg {

	public static void main(String[] args) {
		int count = 0,r=4, c = 8;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c / 2; j++) {
				if (j <= i) {
					count = count + 1;
					System.out.print(count);
				} else if(j>i) {
					System.out.print(" ");
				}
			}
			for(int k=r;k>=r;k--)
			{
				if(k>i)
				{
					System.out.print(" ");
				}
				else if(count<=i)
				{
					System.out.print(count);
					count=count-1;
				}
			}
			count=0;
			System.out.println();
		}

	}

}
