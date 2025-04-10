package in.prasanth.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockEx {
	Lock l = new ReentrantLock();

	void show() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " acquired the lock");
			l.unlock();
			System.out.println(Thread.currentThread().getName() + " released the lock");
		} 
		else
			System.out.println(Thread.currentThread().getName() + " not having the lock");
	}

	public static void main(String[] args) {
		TryLockEx t = new TryLockEx();
		Thread t1 = new Thread(() -> t.show());
		Thread t2 = new Thread(() -> t.show());
		t1.start();
		t2.start();
	}
}