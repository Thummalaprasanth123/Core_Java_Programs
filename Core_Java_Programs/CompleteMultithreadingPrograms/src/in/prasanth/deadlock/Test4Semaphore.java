package in.prasanth.deadlock;

import java.util.concurrent.Semaphore;

public class Test4Semaphore {
	private static final int Num_Threads = 5;
	private static Semaphore sm = new Semaphore(2);

	public static void main(String[] args) {
		for (int i = 1; i <= Num_Threads; i++) {
			Thread t = new Thread(new Worker(i));
			t.start();
		}
	}

	private static class Worker implements Runnable {
		private int i;

		public Worker(int i) {
			this.i = i;
		}

		@Override
		public void run() {
			try {
				System.out.println("Thread-" + i + "is about to acquire the lock");
				sm.acquire();
				System.out.println("Thread-" + i + " acquired the lock");
				sm.release();
				System.out.println("Thread-" + i + " released the lock");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}