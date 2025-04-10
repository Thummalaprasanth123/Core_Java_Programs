package in.prasanth;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_Ex3 {
	
	public static void main(String[] args) {
		ArrayList<Employee1> l=new ArrayList<Employee1>();
		l.add(new Employee1("Durga",1000));
		l.add(new Employee1("Ravi",2000));
		l.add(new Employee1("Shiva",3000));
		l.add(new Employee1("Adarsh",4000));
		l.add(new Employee1("Mahesh",5000));
		l.add(new Employee1("Sagar",6000));
		Predicate<Employee1> p=e->e.salary>3000;
		for(Employee1 e1:l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+" "+e1.salary);
			}
		}

	}

}
