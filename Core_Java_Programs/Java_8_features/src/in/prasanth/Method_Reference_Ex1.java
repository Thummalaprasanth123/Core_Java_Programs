package in.prasanth;

class Test11{
	public static void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	public void m2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Instance method Child Thread");
		}
	}
}
public class Method_Reference_Ex1 {

	public static void main(String[] args) {
//		Runnable r=()->{
//			for(int i=0;i<10;i++)
//			{
//				System.out.println("Child Thread-1");
//			}
//		};
		Test11 t11=new Test11();
		Runnable r=Test11::m1;
		Runnable e=t11::m2;
		Thread t=new Thread(r);
		Thread f=new Thread(e);
		t.start();
		f.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread-1");
		}

	}

}
