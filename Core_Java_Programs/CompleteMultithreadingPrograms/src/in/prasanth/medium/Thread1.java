package in.prasanth.medium;

import java.util.concurrent.BlockingQueue;

public class Thread1 extends Thread {
	BlockingQueue<Integer> q = null;

	public Thread1(BlockingQueue<Integer> q) {
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			try {
				q.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
