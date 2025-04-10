package in.prasanth.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Ex1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
