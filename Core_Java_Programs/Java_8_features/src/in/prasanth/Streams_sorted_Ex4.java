package in.prasanth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_sorted_Ex4 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();

		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> sortedlist = marks.stream().sorted().collect(Collectors.toList());
		List<Integer> reversesortedlist = marks.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		List<Integer> list1 = marks.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> list2 = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedlist);
		System.out.println(reversesortedlist);
		System.out.println(list1);
		System.out.println(list2);
	}

}
