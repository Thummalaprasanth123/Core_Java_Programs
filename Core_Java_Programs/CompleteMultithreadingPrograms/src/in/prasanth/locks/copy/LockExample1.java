package in.prasanth.locks.copy;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockExample1 {
	ReadWriteLock l = new ReentrantReadWriteLock();

	void deposit() {
		/*
		 * Lock wl = l.writeLock();
		 *  wl.lock();
		 */
		l.writeLock().lock();
		System.out.println("Deposit method");
		l.writeLock().unlock();
	}

	void withdraw() {
		l.writeLock().lock();
		System.out.println("Withdraw method");
		l.writeLock().unlock();
	}

	void balanceCheckusingATM() {
		l.readLock().lock();
		System.out.println("Checking balance using ATM");
		l.readLock().unlock();
	}

	void balanceCheckusingNetBanking() {
		l.readLock().lock();
		System.out.println("Checking balance using NetBanking");
		l.readLock().unlock();
	}

	void balanceCheckusingMobileApp() {
		l.readLock().lock();
		System.out.println("Checking balance using MobileApp");
		l.readLock().unlock();
	}

	public static void main(String[] args) {
		LockExample1 le = new LockExample1();
		Thread t0 = new Thread(() -> le.deposit());
		Thread t1 = new Thread(() -> le.withdraw());
		Thread t2 = new Thread(() -> le.balanceCheckusingATM());
		Thread t3 = new Thread(() -> le.balanceCheckusingNetBanking());
		Thread t4 = new Thread(() -> le.balanceCheckusingMobileApp());
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
