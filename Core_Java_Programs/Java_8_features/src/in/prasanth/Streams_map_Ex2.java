package in.prasanth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_map_Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
          List<Integer> updatedmarks = marks.stream().map(i->i+5).collect(Collectors.toList());
          System.out.println(updatedmarks);
	}

}
