package in.prasanth.pkg2;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		char[] a = { 'a','b'};
		String str = Arrays.toString(a);
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}

	}

}
