package in.prasanth;
interface Inter{
	public void add(int a,int b);
}
public class Method_Reference_Ex2 {
  public static void add(int x,int y)
  {
	  System.out.println("The sum:"+(x+y));
  }
	public static void main(String[] args) {
		Inter t=(a,b)->System.out.println("The sum:"+(a+b));
        t.add(12,23);
        Inter r=Method_Reference_Ex2::add;
        r.add(12, 79);
	}

}
