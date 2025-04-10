package in.prasanth.basiclevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FTPoolExample {
	public static void main(String[] args) {

		Customer c1 = new Customer("Ajay", "1", 25000.0);
		Customer c2 = new Customer("vijay", "2", 30000.0);
		Customer c3 = new Customer("mukesh", "3", 34000.0);
		Customer c4 = new Customer("aravind", "4", 28000.0);
		Customer c5 = new Customer("vinay", "5", 26000.0);
		Customer c6 = new Customer("prajeeth", "6", 37000.0);
		Customer c7 = new Customer("kalyan", "7", 40000.0);
		Customer c8 = new Customer("sankar", "8", 32000.0);
		List<Customer> custlist = new ArrayList<Customer>();
		custlist.add(c1);
		custlist.add(c2);
		custlist.add(c3);
		custlist.add(c4);
		custlist.add(c5);
		custlist.add(c6);
		custlist.add(c7);
		custlist.add(c8);
		ExecutorService exe = Executors.newFixedThreadPool(2);
		for (int i = 0; i < custlist.size(); i++) {
			ClassForRunMethod o = new ClassForRunMethod(custlist.get(i));
			//Once execute this method thread pool will create
			exe.execute(o);
		}
		exe.shutdown();
	}
}
