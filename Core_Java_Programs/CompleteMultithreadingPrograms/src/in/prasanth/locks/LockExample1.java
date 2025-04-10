package in.prasanth.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {
	Lock l = new ReentrantLock();

	void display() {
		l.lock();
		display1();
		System.out.println("line - 1");
		System.out.println("line - 2");
		System.out.println("line - 3");
		System.out.println("line - 4");
		
	}
	void display1() {
		System.out.println("line - 5");
		l.unlock();
		System.out.println("line - 6");
		
		
	}
	
	

	public static void main(String[] args) {
		LockExample1 le = new LockExample1();
		/*
		 * Runnable r=new Runnable(){ public void run(){ le.display(); }
		 */
		// Runnable r=() -> le.display();
		Thread t0 = new Thread(() -> {
			le.display();
			le.display1();
		});
		Thread t1 = new Thread(() -> le.display1());
		t0.start();
		t1.start();
	}

}
