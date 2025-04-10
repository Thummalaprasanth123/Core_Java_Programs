package in.prasanth.nestedclasses;

interface y{
	void m1();
}
class Outer7{
	public static void main(String[] args) {
		y yo=new y(){
			public void m1() {
				System.out.println("m1 method using Anonymous Inner class");
			}
		};
		y lo=()->System.out.println("m1 method using Lambda expression");
		 yo.m1();
		 lo.m1();

		}
}


