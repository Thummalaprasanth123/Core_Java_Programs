package in.prasanth.basiclevel2;

public class ATM extends Thread {
	HDFCBank bankact;

	ATM(HDFCBank bankact) {
		this.bankact = bankact;
	}

	@Override
	public void run() {
		
		try {
			bankact.withdraw(4000);
			
			System.out.println("Withdrawn amount:"+4000);
			System.out.println(bankact.accountBalance);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getName()+ "");
	}
}
