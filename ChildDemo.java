class ParentDemo{
int a=10;
}
public class ChildDemo extends ParentDemo{

   public static void main(String[] args)
{
int a=20;
ParentDemo PD=new ParentDemo();
System.out.println(PD.a);
System.out.println(a);
}
} 