package in.prasanth;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Predicate_Ex4 {

	public static void main(String[] args) {
//		Predicate<Integer> p=i->i%2==0;
//		System.out.println(p.test(12));
		int[] x= {0,5,10,15,20,25,30,40};
		IntPredicate p=i->i%2==0;
		for(int x1: x)
		{
			if(p.test(x1))
			{
			System.out.println(x1);
			}
		}

	}

}
