package in.prasanth.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg1 {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[.]");
		//String[] str = p.split("prasanth software solutions");
		String[] str = p.split("www.durgajobs.com");
		for(String s:str)
		{
			count=count+1;
			System.out.println(s);
		}
		System.out.println("The number of occurences is :" + count);

	}

}
