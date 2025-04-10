package in.prasanth;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Bifunction_Ex2 {
       
	public static void main(String[] args) {
		BiFunction<String, String, String> f=(a,b)->a+b;
		System.out.println(f.apply("Ram", "Gopal"));
		BinaryOperator<String> s=(c,d)->c+d;
		System.out.println(s.apply("jaya", "Surya"));
		BiFunction<Integer, Integer, Integer> g=(a,b)->a+b;
		System.out.println(g.apply(8, 23));
		BinaryOperator<Integer> h=(c,d)->c+d;
		System.out.println(h.apply(21, 56));
		IntBinaryOperator ib=(e,j)->e*j;
		System.out.println(ib.applyAsInt(10,23));

	}

}
