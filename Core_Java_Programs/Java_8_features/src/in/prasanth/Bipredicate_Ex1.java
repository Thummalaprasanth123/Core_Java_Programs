package in.prasanth;

import java.util.function.BiPredicate;

public class Bipredicate_Ex1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2==0;
		System.out.println(bp.test(12, 8));
		System.out.println(bp.test(12, 7));

	}

}
