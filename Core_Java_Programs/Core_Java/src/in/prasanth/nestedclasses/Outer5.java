package in.prasanth.nestedclasses;

public class Outer5 {
	int a = 10;
	static int b = 20;

	static class Inner {
		void show() {
			// System.out.println(a); not possible
			System.out.println(b);
		}

		static {
			System.out.println("Inner class static block");
		}
	}

	public static void main(String[] args) {
		new Outer5.Inner().show();
	}

}
