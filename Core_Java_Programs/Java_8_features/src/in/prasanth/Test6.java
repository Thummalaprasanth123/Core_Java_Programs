package in.prasanth;

interface Left{
	default void m1() {
		System.out.println("Left Interface m1 method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right Interface m1 method");
	}
}
public class Test6 implements Left,Right {
          public void m1()
          {
        	  System.out.println("This is overridden method");
//        	  Left.super.m1();
//        	  Right.super.m1();
        	  
          }
	public static void main(String[] args) {
		Test6 t=new Test6();
		t.m1();

	}

}
