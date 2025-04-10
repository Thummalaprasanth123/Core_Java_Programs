package in.prasanth;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;


 class Stu
 {
	 int no;
	 String name;
	public Stu(int no, String name) {
		this.no = no;
		this.name = name;
	}
	 
 }
 public class Bifunction_Ex1
 {
	public static void main(String[] args) {
		ArrayList<Stu> l=new ArrayList<Stu>();
		Predicate<Stu> p=s->s.no%2==0;
		BiFunction<Integer,String,Stu> f=(sno,name)->new Stu(sno,name);
        l.add(f.apply(100,"anuj"));
        l.add(f.apply(257,"Geethika"));
        l.add(f.apply(300,"Parasuram"));
        l.add(f.apply(437,"pulakith"));
        
	
	for(Stu s:l)
	{
		if(p.test(s))
		{
		System.out.println("Student number:"+s.no);
		System.out.println("Student name:"+s.name);
		System.out.println();
		}
	}
 }
}
