package in.prasanth;

import java.util.function.Predicate;

public class Predicate_Ex2 {

	public static void main(String[] args) {
		String[] s= {"Ravi","Prabha","Ganesh","Nagaraju","Hari","Ajay"};
		Predicate<String> p=l->l.length()<5;
//		Predicate<String> p=l->l.length()%2==0;
		for(String s1:s)
		{
			if(p.test(s1))
				System.out.println(s1);
		}

	}

}
