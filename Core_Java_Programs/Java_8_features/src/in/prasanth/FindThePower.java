package in.prasanth;

import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class FindThePower {

	public static void main(String[] args) {
		BiFunction<Double, Double, Integer> p=(a,b)->(int)Math.pow(a, b);
		System.out.println(p.apply(2.0,3.0));
//		DoubleBinaryOperator d=(a,b)->Math.pow(a, b);
//		System.out.println(d.applyAsDouble(2.0,3.0));
	}
}
