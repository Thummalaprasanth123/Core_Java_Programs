package in.prasanth.stringhandling;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1 = "malayala+";
		String s2 = "malayalam";
		if (s1.length() != s2.length()) {
			System.out.println("not a palidrome");
		}
		boolean b = s1.equalsIgnoreCase(s2);
		if (b) {
			System.out.println("palindrome");
		} else
			System.out.println("Not a palindrome");

	}

}
