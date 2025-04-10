package in.prasanth;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student{String name;int marks;public Student(String name, int marks) {this.name = name;this.marks = marks;}}
public class Function_Ex1 {
	public static void main(String[] args) {
		
	Student[] s= {new Student("Aravind",45),new Student("Bhargav",80),new Student("Charan",60)
			,new Student("Dhiraj",70),new Student("Bala",50)};
	Predicate<Student> p=e->e.marks==60;
	Function<Student,String> f=e->e.name;
	Consumer<Student> c=e->{
		System.out.println("This is Consumer method");
		System.out.println(f.apply(e));
	};
	for(Student s1:s)
	{
		if(p.test(s1))
		{
		c.accept(s1);
		}
	}
//	public static void main(String[] args) {
//		Function<Integer,Integer> f1=i->2*i;
//		Function<Integer,Integer> f2=i->i*i*i;
//		System.out.println("f1 followed by f2:"+f1.andThen(f2).apply(2));
//		System.out.println("f2 followed by f1:"+f1.compose(f2).apply(2));
//	}
	}
}
