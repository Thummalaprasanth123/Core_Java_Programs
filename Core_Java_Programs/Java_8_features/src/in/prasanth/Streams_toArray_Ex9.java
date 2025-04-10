package in.prasanth;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams_toArray_Ex9 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		Integer[] i = l.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		// Above line code and below for loop doing the same thing
		for (Integer i1 : i) {
			System.out.println(i1);
		}
	}

}
