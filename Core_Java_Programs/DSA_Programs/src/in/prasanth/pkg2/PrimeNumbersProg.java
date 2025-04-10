package in.prasanth.pkg2;

public class PrimeNumbersProg {

	public static void main(String[] args) {
		int count = 0;
		int primenocount=0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.print(i);
				primenocount=primenocount+1;
			}
			count = 0;
		}
		System.out.println();
		System.out.println("primenocount:"+primenocount);
	}

}
