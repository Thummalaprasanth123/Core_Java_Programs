package in.prasanth;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Streams_forEach_Ex8 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		Consumer<Integer> c=i->{
			System.out.println("The sauare of"+i+"is:"+(i*i));
		};
		l.stream().forEach(System.out::println);
		l.stream().forEach(c);
	}

}
