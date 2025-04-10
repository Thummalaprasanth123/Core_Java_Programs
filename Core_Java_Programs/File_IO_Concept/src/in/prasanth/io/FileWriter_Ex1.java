package in.prasanth.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex1 {

	public static void main(String[] args) throws IOException {
//		FileWriter fw=new FileWriter("abc.txt",true);
		File f=new File("demo.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f,true);
		fw.write(100);
		fw.write("urga\nSoftwareSolutions");
		fw.write('\n');
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
fw.flush();
fw.close();
	}

}
