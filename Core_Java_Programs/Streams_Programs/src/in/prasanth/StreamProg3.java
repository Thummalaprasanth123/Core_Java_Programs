package in.prasanth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamProg3 {
	public static void main(String[] args) {
		Integer[] i1 = { 10, 20, 8 };
		Integer[] i2 = { 8, 16 };
		List<List<Integer>> lls = Arrays.asList(Arrays.asList(i1), Arrays.asList(i2));
		Optional<Integer> first = Optional.ofNullable(lls.stream().flatMap(List -> List.stream())
				.filter(i -> (i % 2) == 0).distinct().findAny().orElse(null));
		boolean b = !first.isPresent();
		System.out.println(b);
	}

}
