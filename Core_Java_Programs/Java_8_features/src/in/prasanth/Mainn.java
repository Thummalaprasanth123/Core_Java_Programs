package in.prasanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mainn {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(200);
		l.add(250);
		l.add(5);
		l.add(100);
		l.add(3);
		System.out.println(l);
		Collections.sort(l, new MyComparater());
		System.out.println(l);
	l.stream().forEach(System.out::println);
	List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
	}

}
