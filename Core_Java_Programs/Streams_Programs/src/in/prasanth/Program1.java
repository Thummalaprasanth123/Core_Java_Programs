package in.prasanth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		List<Employee> lie = new ArrayList<Employee>();
		lie.add(new Employee("ABC", 55, "Male", "IT"));
		lie.add(new Employee("XYZ", 33, "Female", "HR"));
		lie.add(new Employee("LMN", 50, "Male", "IT"));
		lie.add(new Employee("OPQ", 45, "Male", "HR"));
//        lie.stream().map(emp->emp.getAge())
//        .sorted()
//        .forEach(value->System.out.println(value));
//        List<String> lst = lie.stream().map(emp->emp.getDepartment()).distinct().collect(Collectors.toList());
//        System.out.println(lst);
		
		 
//		 lie.stream().filter(e->e.getName().length()%2!=0).map(e->e.getName().toUpperCase()).
//		  limit(2).skip(1) .forEach(s->System.out.println(s));
//		  System.out.println(first); if(first.isPresent()) {
//		  System.out.println(first.get()); }
		 
	OptionalDouble d = lie.stream()
			    .map(emp -> emp.getAge())  // Corrected lambda syntax
			    .mapToInt(Integer::intValue)
			    .average();
		System.out.println(d);
	}

}
