package in.prasanth.regexprograms;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg5 {
	public static void main(String[] args) throws IOException {
		Pattern p = Pattern.compile("[0-9a-zA-z_.$-]+[.]txt");
		File f = new File("D:\\ASHOK_IT");
		String[] sl = f.list();
		for (String s : sl) {
			Matcher m = p.matcher(s);
			while (m.find()) {
				System.out.println(m.group());
			}
		}
	}

}
