package in.prasanth;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp{
	String name;
	double salary;
	Emp(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class Biconsumer_Ex1 {

	public static void main(String[] args) {
	    ArrayList<Emp> l=new ArrayList<Emp>();
//	    populate(l);
	    l.add(new Emp("Durga",100));
	    l.add(new Emp("Anju",200));
	    l.add(new Emp("Bhargav",300));
	    BiConsumer<Emp, Double> c=(e,d)->e.salary=e.salary+d;
	    for(Emp e:l)
	    {
	    	c.accept(e,50.0);
	    }
	    for(Emp e:l)
	    {
	    	System.out.println(e.name);
	    	System.out.println(e.salary);
	    	System.out.println();
	    }
//	    public static void populaate(ArrayList<Emp> l)
//	    {
//	    	l.add(new Emp("Durga",100));
//		    l.add(new Emp("Anju",200));
//		    l.add(new Emp("Bhargav",300));
//	    }

	}

}
