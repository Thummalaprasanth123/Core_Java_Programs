package in.prasanth;

import java.util.ArrayList;

public class Streams_count_Ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
          long evenmarkscount = marks.stream().filter(i->i%2==0).count();
          long markslt10count = marks.stream().filter(i->i<40).count();
          System.out.println(evenmarkscount);
          System.out.println(markslt10count);
	}

}
