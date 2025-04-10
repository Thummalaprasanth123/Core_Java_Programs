package in.prasanth.stringhandling;

public class VowelsInUpperCase {

	public static void main(String[] args) {
		String s1 = "ashok";
		String s2 = "";
//		char[] c1 = { 'a', 'e', 'i', 'o', 'u' };
//		char[] c2 = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				char c = s1.charAt(i);
				c = Character.toUpperCase(c);
				s2 = s2 + c;

			}
			// else {
//				char c = s1.charAt(i);
//				s2 = s2 + c;
//			}
		}
		System.out.println(s2);

	}

}


/*
 *c1 = A s h o k
 *c2= a e i o u
 * 
 * 
 * 
 * 
 * 
 * 
 */







