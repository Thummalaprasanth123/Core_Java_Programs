package in.prasanth.basiclevel3;

public class ClassForRunMethod implements Runnable {
	//int a = 0;
	private Customer c;
	public ClassForRunMethod(Customer c) {
		this.c=c;
	}
	@Override
	public void run() {
       customerInfo(c);
	}

	public void customerInfo(Customer c) {
		
         System.out.println(Thread.currentThread().getName()+"  Customer name: "+c.getName()+
        		 " Customer policyno: "+c.getPlno()+
        		 " Customer policy amount: "+c.getPamt());
	}

}
