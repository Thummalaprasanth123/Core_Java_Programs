package in.prasanth.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg2 {

	public static void main(String[] args) {
		//Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
		Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0]) ) {
			//System.out.println("Valid mobile number");
			System.out.println("Valid Mail id");
		} else {
			//System.out.println("invalid mobile number");
			System.out.println("Invalid Mail id");
		}
	}

}
