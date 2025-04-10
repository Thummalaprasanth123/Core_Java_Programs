package in.prasanth.medium;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class countDownEx {
	static CountDownLatch c = new CountDownLatch(5);

	public static void main(String[] args) throws InterruptedException {

		ExecutorService ex = Executors.newFixedThreadPool(3);
		for (int i = 1; i <=5; i++) {
			ex.execute(() -> {
				System.out.println("task- " + Thread.currentThread().getName());
				c.countDown();
			});
		}
		c.await();
		System.out.println("Main thread sysout stmt");
	}
}
