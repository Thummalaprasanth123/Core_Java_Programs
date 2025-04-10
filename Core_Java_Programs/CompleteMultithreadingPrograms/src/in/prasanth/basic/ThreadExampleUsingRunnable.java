package in.prasanth.basic;

public class ThreadExampleUsingRunnable implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadExampleUsingRunnable());
		t1.setName("First Thread");
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Raghu");
	}

}
