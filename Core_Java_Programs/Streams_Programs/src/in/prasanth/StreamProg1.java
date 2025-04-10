package in.prasanth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProg1 {

	public static void main(String[] args) {
		String[] str1 = { "ram", "bheem", "arjun" };
		String[] str2 = { "hari", "ram", "krishna" };
		String[] str3 = { "arjun", "hari", "newton" };
		List<List<String>> lls = Arrays.asList(Arrays.asList(str1), Arrays.asList(str2), Arrays.asList(str3));
		//[["ram","bheem","arjun"],["ram","bheem","arjun"]]
		//["ram","bheem","arjun","ram","bheem","arjun"]
	
		List<String> ls = lls.stream()
				.flatMap(j -> j.stream()) //["ram", "bheem", "arjun" ,"hari", "ram", "krishna","arjun", "hari", "newton"]
				.distinct()
				.map(i -> i.toUpperCase()).peek(i->System.out.println(i))
				.collect(Collectors.toList());
		System.out.println(ls);
	}

}

//lls=[["ram","bheem","arjun"],["hari", "ram", "krishna"],["arjun", "hari", "newton"]]