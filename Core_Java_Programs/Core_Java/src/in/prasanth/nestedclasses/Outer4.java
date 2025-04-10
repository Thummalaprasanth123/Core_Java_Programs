package in.prasanth.nestedclasses;

//static Inner class
public class Outer4 {
	int a = 10;
	static int b = 20;

	static class Inner {
		void show() {
			System.out.println(a);
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		new Outer4.Inner().show();
	}

}
