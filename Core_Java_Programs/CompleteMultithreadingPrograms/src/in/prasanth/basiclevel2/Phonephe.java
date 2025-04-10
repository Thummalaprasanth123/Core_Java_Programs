package in.prasanth.basiclevel2;

public class Phonephe extends Thread {
	HDFCBank bankact;

	Phonephe(HDFCBank bankact) {
		this.bankact = bankact;
	}
  
	@Override
	public void run() {
		try {
			bankact.balance();
			System.out.println(bankact.accountBalance);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
