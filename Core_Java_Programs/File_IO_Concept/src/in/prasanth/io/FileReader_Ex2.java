package in.prasanth.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Ex2 {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileReader fr = new FileReader("abc.txt");
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
		{
			System.out.print(c);
		}
		
	}

}
