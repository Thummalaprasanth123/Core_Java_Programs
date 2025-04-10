package in.prasanth.basic;

public class ThreadExample extends Thread {
    public ThreadExample() {
		super();
	}
	public ThreadExample(String string) {
		super(string);
	}
	public static void main(String[] args) {
		ThreadExample t1=new ThreadExample("First Thread"); //new
		ThreadExample t2=new ThreadExample();
		t2.setName("Second Thread");
		t1.start(); //Runnable
		//t1.start();  //java.lang.IllegalThreadStateException
	    t2.start();
//	    Thread t = ThreadExample.currentThread();
//	    t.getClass()
	}

	@Override
	public void run() {         //Running
		System.out.println("Hello -" +ThreadExample.currentThread().getName());
	}  //Dead

}
