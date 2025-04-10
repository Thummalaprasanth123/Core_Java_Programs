package in.prasanth;

public class Common {
	static int a=m1();
	int b=m2();
	Common()
	{
		System.out.println("E");
	}
	static int m1()
	{
		System.out.println("A");
		return 10;
	}
	static
	{
		System.out.println("B");
	}
	int m2()
	{
		System.out.println("C");
		return 20;
	}
	{
		System.out.println("D");
	}

	public static void main(String[] args) {
	    Common c=new Common();

	}

}
