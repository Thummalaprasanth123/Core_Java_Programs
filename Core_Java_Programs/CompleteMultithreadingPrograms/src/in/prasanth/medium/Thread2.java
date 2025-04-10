package in.prasanth.medium;

import java.util.concurrent.BlockingQueue;

public class Thread2 extends Thread {
	BlockingQueue<Integer> q = null;

	public Thread2(BlockingQueue<Integer> q) {
		this.q = q;
	}

	@Override
	public void run() {

		try {
			q.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
