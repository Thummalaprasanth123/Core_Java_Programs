package in.prasanth.medium;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueInternals {

	public static void main(String[] args) {
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);
		Thread1 t1 = new Thread1(q);
		Thread2 t2 = new Thread2(q);
		t1.start();
		t2.start();
	}
}
