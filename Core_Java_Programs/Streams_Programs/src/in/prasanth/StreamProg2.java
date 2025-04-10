package in.prasanth;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamProg2 {
	public static void main(String[] args) {
		String[] str1 = { "ram", "bheem", "arjun" };
		String[] str2 = { "hari", "ram", "krishna" };
		String[] str3 = { "arjun", "hari", "aewton" };
		List<List<String>> lls = Arrays.asList(Arrays.asList(str1), Arrays.asList(str2), Arrays.asList(str3));
//		List<String> ls = lls.stream()
//				.flatMap(List -> List.stream())
//				.distinct()
//				.filter(i->(i.length()%2)==0).map(i -> i.toUpperCase()).skip(2)
//				.collect(Collectors.toList());
		List<String> list2 = lls.stream()
				.flatMap(List -> List.stream())
				.distinct()
				.filter(i->(i.length()%2)==0).
				sorted(Comparator.naturalOrder()).map(i->i.toUpperCase()).collect(Collectors.toList());
//		System.out.println(ls); 
		System.out.println(list2);
	}
}
