package in.prasanth.stringhandling;

public class AlternativeUpperCaseUsingStrBuffer {

	public static void main(String[] args) {
		String s1 = "ashok";
		StringBuffer s2 = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 0) {
				char c = s1.charAt(i);
				char d = Character.toUpperCase(c);
				s2.append(d);
			} else {
				char c = s1.charAt(i);
				s2.append(c);
			}
		}
		System.out.println(s2);
	}

}
