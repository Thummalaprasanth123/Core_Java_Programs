package in.prasanth.basiclevel3.stp;

public class ClassForRunMethod implements Runnable {
	int a = 0;
	private Customer c;

	public ClassForRunMethod(Customer c) {
		this.c = c;
	} 

	@Override
	public void run() {
		//System.out.println();
		customerInfo(c);
	}

	public void customerInfo(Customer c) {
         StringBuffer s=new StringBuffer(Thread.currentThread().getName()+" Customer name: "+c.getName()+
        		 " Customer policyno: "+c.getPlno()+
        		 " Customer policy amount: "+c.getPamt());
		 System.out.println(/*"Customer name: "+c.getName()+
        		 " Customer policyno: "+c.getPlno()+
        		 " Customer policy amount: "+c.getPamt()*/s.toString());
//         System.out.println(a++);
//         return s.toString();
	}
//	@Override
//	public Object call() throws Exception {
//		String cInfo = customerInfo(c);
//		return cInfo;
//	}


}
