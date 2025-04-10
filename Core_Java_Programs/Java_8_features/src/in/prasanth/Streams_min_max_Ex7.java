package in.prasanth;

import java.util.ArrayList;

public class Streams_min_max_Ex7 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		System.out.println("Performing Ascending order sorting and printing min and max values");
		Integer min1 = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer max1 = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min1);
		System.out.println(max1);
		System.out.println("Performing Descending order sorting and printing min and max values");
		Integer min2 = l.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		Integer max2 = l.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println(min2);
		System.out.println(max2);
	}

}
