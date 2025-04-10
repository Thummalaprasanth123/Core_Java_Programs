package in.prasanth.nestedclasses;

public class Outer {
	private int a = 11, b = 12;

	void mouter() {
		System.out.println("Outer class method");

	}


	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(i.x);
		System.out.println(i.y);
		o.mouter();
		i.minner();
	}

	public class Inner {
		int x = 100, y = 200;

		public void minner() {
			System.out.println("Inner class method");
			System.out.println(a+"  "+b);
			mouter();
		}

	}
}
