
//Write a program to merge data from two files into a third file

package in.prasanth.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger1 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String line = br1.readLine();
		while (line != null) {
			pw.println(line);
			line = br1.readLine();
		}
		br1 = new BufferedReader(new FileReader("file2.txt"));
		line = br1.readLine();
		while (line != null) {
			pw.println(line);
			line = br1.readLine();
		}
		pw.flush();
		pw.close();
		br1.close();
	}

}
