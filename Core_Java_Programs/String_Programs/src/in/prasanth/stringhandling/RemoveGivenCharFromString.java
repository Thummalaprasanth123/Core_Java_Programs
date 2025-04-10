package in.prasanth.stringhandling;

public class RemoveGivenCharFromString {

	public static void main(String[] args) {
		String s1 = "arjun";
		String s2 = "";
		char c = 'u';
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != c) {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
