package in.prasanth.stringhandling;

public class VowelsInUpperCase2 {

	public static void main(String[] args) {
		String s1 = "ashok";
		String s2 = "";
		char[] c1 = { 'a', 'e', 'i', 'o', 'u' };
		char[] c2 = s1.toCharArray();

		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					s2 = s2 + Character.toUpperCase(c2[i]);
				}
			}

		}
		System.out.println(s2);
	}
}
