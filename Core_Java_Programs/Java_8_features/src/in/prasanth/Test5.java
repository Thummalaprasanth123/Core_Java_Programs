package in.prasanth;

interface Interf1
{
	default void m1()
	{
		System.out.println("Default Method");
	}
//	default int hashCode() {
//		System.out.println("This is Hashcode");
//	}
	default void m2()
	{
		System.out.println("Default Method");
	}
}

public class Test5 implements Interf1 {

	public static void main(String[] args) {
		
Interf1 i=new Interf1() {
	public void m1() {
		System.out.println("Hello Default method");
	}
};
i.m1();
i.hashCode();
i.m2();
	}

}
