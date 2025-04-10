package in.prasanth;

interface Interf2
{
	public static void m1()
	{
		System.out.println("Interface Static Method");
	}
}
public class Test7 implements Interf2{

	public static void main(String[] args) {
		Interf2.m1();
//		Test7.m1();
//		Test7 t7=new Test7();
//		t7.m1();
//		m1();

	}

}
