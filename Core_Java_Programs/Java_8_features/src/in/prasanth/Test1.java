package in.prasanth;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Runnable r=new Runnable() {
		 * 
		 * @Override public void run() { for(int i=0;i<10;i++) {
		 * System.out.println("Anonymous Inner class - Child Thread"); } } };
		 */
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Lambda Expression - Child Thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
