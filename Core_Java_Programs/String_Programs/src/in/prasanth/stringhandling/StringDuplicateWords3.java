package in.prasanth.stringhandling;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicateWords3 {

	public static void main(String[] args) {
		String s1 = "malayalam";
		char[] cs = s1.toCharArray();
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < cs.length; i++) {
			s.add(cs[i]);
		}
		for(char c:s) {
			System.out.println(c);
		}
		System.out.println(s);
	}
}
