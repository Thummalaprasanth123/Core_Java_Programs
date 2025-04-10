package in.prasanth.basiclevel3.futureinterface;

import java.util.concurrent.Callable;

public class ClassForRunMethod implements Callable<Object> {
	int a = 0;
	private Customer c;
	public ClassForRunMethod(Customer c) {
		this.c=c;
	}
//	@Override
//	public void run() {
//       customerInfo(c);
//	}

	public String customerInfo(Customer c) {
         StringBuffer s=new StringBuffer("*******"+"Customer name: "+c.getName()+
        		 " Customer policyno: "+c.getPlno()+
        		 " Customer policy amount: "+c.getPamt());
         //System.out.println(a++);
         return s.toString();
	}
	@Override
	public Object call() throws Exception {
		String cInfo = customerInfo(c);
		return cInfo;
	}

}
