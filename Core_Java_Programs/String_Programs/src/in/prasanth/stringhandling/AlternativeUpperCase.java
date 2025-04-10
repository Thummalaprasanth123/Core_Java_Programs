package in.prasanth.stringhandling;

public class AlternativeUpperCase {

	public static void main(String[] args) {
		String s1 = "ashok";
		/*
		 * String s2 = ""; char[] c1 = s1.toCharArray(); for (int i = 0; i < c1.length;
		 * i++) { if (i % 2 == 0) { char c = s1.charAt(i); String s = String.valueOf(c);
		 * String str = s.toUpperCase(); s2 = s2 + str; } else { s2 = s2 + c1[i]; } }
		 */
//		char c=s1.charAt(6);
//		System.out.println(c);
		//System.out.println(s2);
		int i = s1.indexOf('s');
		System.out.println(i);

	}

}
