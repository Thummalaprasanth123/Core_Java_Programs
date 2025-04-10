package in.prasanth.test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import in.prasanth.entity.Student;
public class TestClass {
	public static void main(String[] args) {
    List<Student> ls=new CopyOnWriteArrayList<>();
    Student s1=new Student();
    s1.setSid(1128);
    s1.setSname("Yodha");
    s1.setSage("24")g;
    System.out.println(ls);
    ls.add(s1);
    System.out.println(ls);
    ls.forEach(row->{
    	Student s2=new Student();
    	s2.setSid(row.getSid()+1130);
    	s2.setSname(row.getSname());
    	s2.setSage(row.getSage());
    	ls.add(s2);
    	System.out.println(ls);
    });
    System.out.println(ls);
	}

}
