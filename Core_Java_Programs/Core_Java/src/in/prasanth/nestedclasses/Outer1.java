package in.prasanth.nestedclasses;

//Normal Inner class
public class Outer1 {
	int i = 10, j = 20;

	Outer1() {
		System.out.println("Outer1 class constructor method");
	}

	static {
		System.out.println("Outer1 class static block");
	}

	{
		System.out.println("Outer1 class instance block");
	}

	class Inner {
		 final static int i = 100, j = 200;

		Inner() {
			System.out.println("Inner class constructor");
		}
 
		{
			System.out.println("Inner class Instance block");
		}

		void add(int i, int j) {
			System.out.println("inner class add method variables:" + (i + j)); 
			System.out.println("inner class local variables  :" + (this.i + this.j));
			System.out.println("Outer1 class variables :" + (Outer1.this.i + Outer1.this.j));
		}
	}

	public static void main(String[] args) {
//		Outer1 o=new Outer1(); 
//		Outer1.Inner i=o.new Inner();
//		i.add(1000, 2000);
		new Outer1().new Inner().add(1000, 2000);
	}

}









