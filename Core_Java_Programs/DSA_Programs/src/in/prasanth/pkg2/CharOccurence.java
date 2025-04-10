package in.prasanth.pkg2;

import java.util.Scanner;

public class CharOccurence {

	public static void main(String[] args) {
		System.out.println("Enter the Character to find count of occurence :");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = "Anagraman name that";
		String[] x = str.split(" ");
		for(String y:x)
		{
			System.out.println(y);
		}
		String str1 = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == s.charAt(s.length()-1)) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
