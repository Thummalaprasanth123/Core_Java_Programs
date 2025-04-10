package in.prasanth.nestedclasses;

public class Demo {
static void m1()
{
	System.out.println("m1 method");
	m2();
}
void m2()
{
	m1();
	System.out.println("m2 method");
}
	public static void main(String[] args) {
		m1();
		Demo d=new Demo();
		d.m2();
		

	}

}
