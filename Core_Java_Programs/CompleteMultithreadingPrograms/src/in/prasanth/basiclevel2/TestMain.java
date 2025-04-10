package in.prasanth.basiclevel2;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		HDFCBank acct1 = new HDFCBank(7000);
		System.out.println("initial Balance " + acct1.accountBalance);
		// HDFCBank acct2=new HDFCBank(9000);
		ATM t1 = new ATM(acct1); // new
		GooglePay t2 = new GooglePay(acct1); // new
		Phonephe t3 = new Phonephe(acct1);
		t1.setName("ATM-Thread");
		t2.setName("GooglePay-Thread");
		t3.setName("Phonepay-Thread");
		t1.start(); // runnable
		t2.start(); // runnable
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Final Account balance: " + acct1.accountBalance);
	}

}
