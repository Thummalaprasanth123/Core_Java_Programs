package in.prasanth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AssociateMain {

	public static void main(String[] args) {
		Associate a1 = new Associate(1, "Robert", 26500.00);
		Associate a2 = new Associate(2, "Abraham", 46500.00);
		Associate a3 = new Associate(3, "Cathy", 36500.00);
		Associate a4 = new Associate(4, "Robert", 16500.00);
		Associate a5 = new Associate(5, "Cathy", 25500.00);
		List<Associate> list = Arrays.asList(a1, a2, a3, a4, a5);
		System.out.println(list);
//		Optional<Associate> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getAsalary())));
//
//		System.out.println("Max Salary :: " + max.get().getAsalary());
//
//		Optional<Associate> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.getAsalary())));
//
//		System.out.println("Min Salary :: " + min.get().getAsalary());
//
//		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.getAsalary()));
//		System.out.println(avgSalary);
//		Map<String, List<Associate>> map = list.stream().collect(Collectors.groupingBy(e -> e.getAname()));
//		System.out.println(map);
//		List<Associate> collect = list.stream().filter(i->(i.getAsalary()>30000.00)).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Associate> list2 = list.stream().filter(i->i.getAsalary()>30000.00).distinct().
sorted((e1,e2)->(e1.getAsalary()<e2.getAsalary())?1:(e1.getAsalary()>e2.getAsalary())?-1:0).collect(Collectors.toList());
		System.out.println(list2);
				

	}

}
