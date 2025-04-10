package in.prasanth.basic;

public class ThreadDemo extends Thread {

	public ThreadDemo(String string) {
		super(string);
	}
	public ThreadDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();  //new
		ThreadDemo t2=new ThreadDemo("2nd thread");
		t1.start(); //runnable
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"Hi");
		System.out.println(Thread.currentThread().getName()+"Hello");
	}

}

//Thread:
//	Independent path of execution
