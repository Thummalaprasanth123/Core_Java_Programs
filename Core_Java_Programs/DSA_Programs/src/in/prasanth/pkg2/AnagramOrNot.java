package in.prasanth.pkg2;

import java.util.Arrays;

public class AnagramOrNot {
	public static void main(String[] args) {
		String str1 = "brag";
		String str2 = "Grab";
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (str1.length()==str2.length() && (Arrays.equals(c1, c2)))
		{
			System.out.println("Given strings are anagram");
		}
		else
		{
			System.out.println("********Not a Anagram**********");
		}
	}
}
