package in.prasanth.more;

public class PojoClass {
  int rollno;
  String name;
  public PojoClass() {
	}
  public PojoClass(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
  
@Override
public String toString() {
	return rollno+" "+name;
}

public int getRollno() {
	return rollno;
}
  public String getName() {
	return name;
}
  public void setRollno(int rollno) {
	this.rollno = rollno;
}
  public void setName(String name) {
	this.name = name;
}
  
}
