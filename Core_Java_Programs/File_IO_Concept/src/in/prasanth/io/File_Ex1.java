package in.prasanth.io;

import java.io.File;
import java.io.IOException;

public class File_Ex1 {

	public static void main(String[] args) throws IOException {
//      File f=new File("abc.txt");
//      System.out.println(f.exists());
//      f.createNewFile();
//      System.out.println(f.exists());
		File d=new File("durga123");
//		System.out.println(d.exists());
//		d.mkdir();
//		System.out.println(d.exists());
//		File f1=new File("durga123","def.txt");
//		System.out.println(f1.exists());
//		f1.createNewFile();
//		System.out.println(f1.exists());
		File f2=new File(d,"ghi.txt");
		//System.out.println(f2.exists());
		f2.createNewFile();
//		System.out.println(f2.exists());
//		System.out.println(f2.isFile());
//		System.out.println(f2.isDirectory());
//		System.out.println(d.isFile());
//		System.out.println(d.isDirectory());
		File f3=new File("D:\\Durga_Sir_Java_8_Features\\File and Serialization Videos","demo.txt");
		System.out.println(f3.createNewFile());
		System.out.println("f3 is directory: "+f3.isDirectory()+" , "+"f3 is File: "+f3.isFile());
		System.out.println("f3 exists in D drive "+f3.exists());
		
		
		
	}

}
