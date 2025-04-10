package in.prasanth;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Function_Ex3 {

	public static void main(String[] args) {
	Function<Integer, Integer> f=i->i*i;
	System.out.println(f.apply(8));
	UnaryOperator<Integer> u=n->n*n;
	System.out.println(u.apply(4));
    IntUnaryOperator r=t->t*t;
    System.out.println(r.applyAsInt(6));
	}

}
