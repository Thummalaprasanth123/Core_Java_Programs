package in.prasanth.stringhandling;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicateWords2 {

	public static void main(String[] args) {
		String s1 = "How are you dear you are very my dear you dear you dear very";
		String[] s1words = s1.split(" ");
		Set<String> s = new LinkedHashSet<>();
		for (int i = 0; i < s1words.length; i++) {
			s.add(s1words[i]);
		}
		System.out.println(s);
	}

}
