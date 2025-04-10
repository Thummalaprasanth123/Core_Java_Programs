package in.prasanth.basiclevel3.ctp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CTPoolExample {
	public static void main(String[] args) {

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
		ExecutorService exe = Executors.newCachedThreadPool();
		for (int i = 0; i < custlist.size(); i++) {
			ClassForRunMethod o = new ClassForRunMethod(custlist.get(i));
			exe.execute(o);
		}
		exe.shutdown();
	}
}
