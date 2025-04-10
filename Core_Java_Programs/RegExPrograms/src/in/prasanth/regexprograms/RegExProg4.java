package in.prasanth.regexprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg4 {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("output1.txt");
		Pattern p = Pattern.compile("[0-9a-zA-Z][a-zA-Z0-9_.]*@[a-z0-9A-Z]+([.][a-zA-Z0-9]+)+");
		BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
		String line = br.readLine();
		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
	}

}
