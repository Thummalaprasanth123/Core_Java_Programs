package in.prasanth.nestedclasses;

abstract class x{
	public abstract void m1();
}
class Outer6 extends x{
	public void m1() {
		System.out.println("y class method");
	}
	public static void main(String[] args) {
		 x yobj=new Outer6();
		 yobj.m1();

		}
}


