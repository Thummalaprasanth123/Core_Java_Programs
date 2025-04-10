package in.prasanth.nestedclasses;
//Method local inner class example

class Outer3 {
	void m1() {
		System.out.println("M1 method");
		class Inner1 {
			void mi() {
				System.out.println("method local inner class mi method");
			}
		}
		new Inner1().mi();
	}

	public static void main(String[] args) {
		/*
		 * Outer o=new Outer(); o.m1();
		 */
		new Outer3().m1();
	}
}
