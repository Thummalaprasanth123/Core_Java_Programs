package in.prasanth.more;

public class OptionalDemo {
   
	public static PojoClass getdata(int roln,String nam)
	{
		PojoClass p=new PojoClass(roln, nam);
		p.getRollno();
		p.getName();
		return p;
		
	}
}
