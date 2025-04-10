package in.prasanth.deadlock.copy;

public class Thread2 extends Thread {
	Object obj1 = null;
	Object obj2 = null;

	public Thread2(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		System.out.println("Thread-2 is about to acquire the lock on obj1");
		synchronized (obj1) {
			System.out.println("Thread-2 acquired the lock on obj1");
			System.out.println("Thread-2 is about to acquire the lock on obj1");
			synchronized (obj2) {
				System.out.println("Thread-2 acquired the lock on obj2");
			}
			System.out.println("Thread-2 released the lock on obj2");

		}
		System.out.println("Thread-2 released the lock on obj1");
	}
}
