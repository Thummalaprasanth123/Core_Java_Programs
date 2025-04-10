package in.prasanth.basic;

public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		Runnable r=new ThreadRunnable();
		Thread t1=new Thread(r);
		t1.start();
	}

	@Override
	public void run() { 
		System.out.println("Thread using runnable interface");
	}
}
