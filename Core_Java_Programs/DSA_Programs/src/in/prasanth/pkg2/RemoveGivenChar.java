package in.prasanth.pkg2;

import java.util.Scanner;

public class RemoveGivenChar {

	public static void main(String[] args) {
		System.out.println("Enter a character :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="Hello";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(!(str1.charAt(i)==str.charAt(str.length()-1)))
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println(str2);
	}

}
