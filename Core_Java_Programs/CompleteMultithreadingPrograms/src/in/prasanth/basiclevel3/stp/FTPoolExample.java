package in.prasanth.basiclevel3.stp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FTPoolExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Customer c1 = new Customer("Ajay", "1", 25000.0);
		Customer c2 = new Customer("vijay", "2", 30000.0);
		Customer c3 = new Customer("mukesh", "3", 34000.0);
		Customer c4 = new Customer("aravind", "4", 28000.0);
		/*Customer c5 = new Customer("vinay", "pl364", 26000.0);
		Customer c6 = new Customer("prajeeth", "pl538", 37000.0);
		Customer c7 = new Customer("kalyan", "pl789", 40000.0);
		Customer c8 = new Customer("sankar", "pl453", 32000.0);*/
		List<Customer> custlist = new ArrayList<Customer>();
		custlist.add(c1);
		custlist.add(c2);
		custlist.add(c3);
		custlist.add(c4);
		/*custlist.add(c5);
		custlist.add(c6);
		custlist.add(c7);
		custlist.add(c8);*/
		//List<Future<Object>> l = new ArrayList<>();
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		for (int i = 0; i < custlist.size(); i++) {
			ClassForRunMethod o = new ClassForRunMethod(custlist.get(i));
			/* ScheduledFuture<Object> schedule = */  //pool.scheduleAtFixedRate(o,1,2, TimeUnit.MINUTES);
			pool.schedule(o,10, TimeUnit.SECONDS);
			//l.add(schedule);                           //(InitialDelay+n*Period) n=0,1,2......
		}
//		System.out.println(l.size());
//		for (int j = 0; j < l.size(); j++) {
	//	ScheduledFuture<Object> obj=l.get(i);
		//obj.get();
//			if (l.get(j).isDone()) {
//				System.out.println(l.get(j).get());
//			}
//		}
		pool.shutdown();
	}
}
