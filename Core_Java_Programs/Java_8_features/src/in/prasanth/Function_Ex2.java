package in.prasanth;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Function_Ex2 {

	public static void main(String[] args) {
	IntFunction<Integer> f1=i->i*i;
		System.out.println(f1.apply(2));
		ToIntFunction<Integer> f2=i->i+2;
		System.out.println(f2.applyAsInt(10));
		IntToDoubleFunction f3=i->Math.sqrt(i);
		System.out.println(f3.applyAsDouble(4));

	}

}
