package in.prasanth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPractice {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 28, 13, 16, 17, 17, 11, 16, 28, 12);
		List<Integer> ls = Arrays.asList(25000,10000,8000,5000);
//		double d = li.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//		System.out.println(d);
//		int j = li.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
//		System.out.println(j);
//	long l=li.stream().distinct().count();
//		System.out.println(l);
		//List<String> collect = ls.stream().filter(s -> s.startsWith("K")).collect(Collectors.toList());
		List<Integer> collect = ls.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(collect);
		//ls.stream().map(String::toLowerCase).forEach(s->System.out.println(s));
	}
//25000,20000,10000,8000,5000
	
}


