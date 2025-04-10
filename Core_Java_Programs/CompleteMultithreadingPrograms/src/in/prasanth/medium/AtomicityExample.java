package in.prasanth.medium;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityExample {
	//static AtomicInteger count = new AtomicInteger(0);
static volatile int count=0;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				count++;
				//count.incrementAndGet();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				count++;
				//count.incrementAndGet();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count : " + count);

	}

}
