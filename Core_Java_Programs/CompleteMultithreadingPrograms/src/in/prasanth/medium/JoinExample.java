package in.prasanth.medium;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> System.out.println("Thread-1 run method implementation"));
		Thread t2 = new Thread(() -> System.out.println("Thread-2 run method implementation"));
		t1.start();
		t2.start();
		t2.join();
		System.out.println("This is main thread method sysout stmt");
	}

}
