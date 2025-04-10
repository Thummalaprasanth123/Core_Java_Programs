package in.prasanth.regexprograms;

import java.util.Arrays;

/*
import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
//		String str="www.arogya.com";
//		String[] split = str.split("[.]");
//		for(String s:split)
//		{
//			System.out.println(s);
//		}
		StringTokenizer st=new StringTokenizer("Arogya P.araaluu","\\.");
		while(st.hasMoreElements())
		{
			String nt = st.nextToken();
			System.out.println(nt);
		}
	}

}
*/


public class StringSplit {
public static void main(String[] args) {
  String s="hhj";
  String t="hjh";
  char[] c1=s.toCharArray();
  char[] c2=t.toCharArray();
  Arrays.sort(c1);
  Arrays.sort(c2);
  System.out.println(Arrays.equals(c1, c2));
}
}













