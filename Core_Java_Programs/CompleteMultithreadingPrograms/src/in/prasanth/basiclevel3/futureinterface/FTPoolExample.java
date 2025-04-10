package in.prasanth.basiclevel3.futureinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FTPoolExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Customer c1 = new Customer("Ajay", "pl123", 25000.0);
		Customer c2 = new Customer("vijay", "pl213", 30000.0);
		Customer c3 = new Customer("mukesh", "pl047", 34000.0);
		Customer c4 = new Customer("aravind", "pl921", 28000.0);
		Customer c5 = new Customer("vinay", "pl364", 26000.0);
		Customer c6 = new Customer("prajeeth", "pl538", 37000.0);
		Customer c7 = new Customer("kalyan", "pl789", 40000.0);
		Customer c8 = new Customer("sankar", "pl453", 32000.0);
		List<Customer> custlist = new ArrayList<Customer>();
		custlist.add(c1);
		custlist.add(c2);
		custlist.add(c3);
		custlist.add(c4);
		custlist.add(c5);
		custlist.add(c6);
		custlist.add(c7);
		custlist.add(c8);
		List<Future<Object>> l=new ArrayList<>();
		ExecutorService exe = Executors.newFixedThreadPool(2);
		for (int i = 0; i < custlist.size(); i++) {
			ClassForRunMethod o = new ClassForRunMethod(custlist.get(i));
			Future<Object> future = exe.submit(o);
			l.add(future);
		}
		//System.out.println(l.size());
		for(int j=0;j<l.size();j++)
		{
			if(l.get(j).isDone())
			{
				System.out.println(l.get(j).get());
			}
		}
		exe.shutdown();
	}
}
