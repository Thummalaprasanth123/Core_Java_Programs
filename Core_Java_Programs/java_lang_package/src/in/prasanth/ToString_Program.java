package in.prasanth;

import java.util.ArrayList;

class ram{
	String name;
	int rollno;
	public ram(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
//	public String toString()
//	{
//		return name+" "+rollno;	
//	}
	public int hashCode()
	{
		return rollno;
		
	}
}
public class ToString_Program {

	public static void main(String[] args) {
		ram r1=new ram("raju", 100);
		System.out.println(r1);
		String s=new String("Durga");
		System.out.println(s);
		Integer I=new Integer(120);
		System.out.println(I);
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(113);
		System.out.println(l);

	}

}
