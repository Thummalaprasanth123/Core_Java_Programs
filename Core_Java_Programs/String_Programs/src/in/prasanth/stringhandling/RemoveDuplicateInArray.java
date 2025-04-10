package in.prasanth.stringhandling;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		String s0="malayalam";
		
		char[] c = s0.toCharArray();
		String s2="";
		Set<Character> a2 = new LinkedHashSet<>();
		for (int i = 0; i < c.length; i++) {
			a2.add(c[i]);
		}
		String s1 = a2.toString();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!='['&&s1.charAt(i)!=','&&s1.charAt(i)!=']'&&s1.charAt(i)!=' ')
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
	}

}
