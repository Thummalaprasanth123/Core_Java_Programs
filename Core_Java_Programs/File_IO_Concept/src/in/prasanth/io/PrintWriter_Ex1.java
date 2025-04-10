package in.prasanth.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Ex1 {

	public static void main(String[] args) throws IOException {
//		FileWriter fw=new FileWriter("abc.txt");
//		PrintWriter out=new PrintWriter(fw);
		PrintWriter pw = new PrintWriter("thug.txt");
		pw.println(100);
		pw.println("Arjun");
		pw.println("Vasista");
		pw.println(true);
		pw.flush();
		pw.close();

	}

}
