package in.prasanth.basiclevel2;

public class GooglePay extends Thread {
	HDFCBank bankact;

	GooglePay(HDFCBank bankact) {
		this.bankact = bankact;
	}

	@Override
	public void run() {
		
		
			try {
				bankact.deposit(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("deposit amount:"+4000);
			System.out.println(bankact.accountBalance);
		
//		System.out.println(Thread.currentThread().getName()+ "   executed");
	}
}
