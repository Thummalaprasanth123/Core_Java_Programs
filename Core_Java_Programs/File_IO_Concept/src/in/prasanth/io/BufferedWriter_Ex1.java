package in.prasanth.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Ex1 {

	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter("demo.txt");
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write(100);
		bw.newLine();
		char[] ch1= {'a','b','c','d'};
		bw.write(ch1);
		bw.newLine();
		bw.write("Thummala Prasanth");
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
