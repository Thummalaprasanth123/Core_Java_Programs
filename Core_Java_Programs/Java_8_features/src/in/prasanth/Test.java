package in.prasanth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

class Employee
{
	String name;
	int eno;
	Employee(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return eno+":"+name;
	}
}
public class Test {

	public static void main(String[] args) {
//		Employee e=new Employee("Ravi", 1128);
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Barath", 76));
		l.add(new Employee("Ajay", 45));
		l.add(new Employee("Dinesh", 32));
		l.add(new Employee("Charan", 12));
//         System.out.println(e);
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
	}

}
