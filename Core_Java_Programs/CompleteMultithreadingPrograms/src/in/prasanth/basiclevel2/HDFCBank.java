package in.prasanth.basiclevel2;

public class HDFCBank {
	static int accountBalance;

	public HDFCBank(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public /* synchronized */ void withdraw(int wd) throws InterruptedException {
		//wait();
		accountBalance = accountBalance - wd;
       System.out.println("ATM-Thread withdraw method");
	}

	public /* synchronized */ void deposit(int d) throws InterruptedException {
		accountBalance = this.accountBalance + d;
		System.out.println("Before notify");
		//notify();
		//notifyAll();
		System.out.println("After notify");
	}

	public void balance() throws InterruptedException {
		//wait();
		
		System.out.println("PhonePay-Thread balance method");
	}
	// System.out.println("Final Account balance: "+accountBalance);
}