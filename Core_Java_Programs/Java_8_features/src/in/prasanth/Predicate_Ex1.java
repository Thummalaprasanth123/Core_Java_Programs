package in.prasanth;

//import java.util.function.*;
//
//public class Predicate_Ex1 {
//
////	interface Predicate<T>{
////		public boolean test(String s);
////	}
//	
//	public static void main(String[] args) {
//		String s="Ravi";
////		Predicate<String> s=(String s1)->{
////			if(s1.length()>5)
////				return true; 
////			else
////				return false;
////		};
//		Predicate<String> p=l->l.length()>3;
//		
//		System.out.println(p.test(s));
////		Predicate<Integer> p1=i->i%2==0;
////		System.out.println(p1.test(1));
////		System.out.println(p1.test(20));
//	}
//
//}
class T123 { 
	static int i = m2(); 
	int j = m1();

	public T123() {
		System.out.println("A"); 
	}

	static {
		System.out.println("C");
	}

	{
		System.out.println("D");
	}

	static int m2() {
		System.out.println("E");
		return 10;
	} 

	int m1() {
		System.out.println("B");
		return 10;
	}
}
class Predicate_Ex1 {
	public static void main(String[] args)
	   {
		T123 a=new T123();
	   }
}
