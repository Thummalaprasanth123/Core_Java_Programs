package in.prasanth.dummypkg1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class fibonacci {

	public static void main(String[] args) {
		String[] s1= {"Hari","Giri","Ramu"};
		String[] s2= {"Hari","Ramu","Ajay"};
		List<List<String>> lls = Arrays.asList(Arrays.asList(s1),Arrays.asList(s2));
		System.out.println(lls);
		System.out.println(lls.size());
		 long count = lls.stream().flatMap(List->List.stream()).distinct().
				map(s->s.toUpperCase()).count();
		System.out.println(count);
	}

}
