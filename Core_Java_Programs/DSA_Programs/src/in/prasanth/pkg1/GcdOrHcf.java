package in.prasanth.pkg1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
public class GcdOrHcf {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		List<Integer> al = new ArrayList<>();
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				al.add(i);
			}
		}
		for (int j = 1; j <= num2; j++) {
			if (num2 % j == 0) {
				al.add(j);
			}
		}
		System.out.println(al);
		Object[] a = al.toArray();
		Set<Integer> si = new HashSet<>();
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i <= (a.length - 1); i++) {
			boolean b = si.add((Integer) a[i]);
			if (b == false) {
				li.add((Integer) a[i]);
			}
		}
		System.out.println(si);
		System.out.println(li);
		Optional<Integer> first = li.stream().sorted((i, j) -> Integer.compare(j, i)).findFirst();
		first.ifPresent(value -> System.out.println(value));
//-----------
		// Optional<Integer> first =
		// al.stream().distinct().sorted((a,b)->Integer.compare(b,a)).findFirst();
		// first.ifPresent(value->System.out.println(value));

	}

}
