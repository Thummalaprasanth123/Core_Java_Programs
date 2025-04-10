package in.prasanth.io;

import java.io.File;

public class File_Ex2 {

	public static void main(String[] args) {
    int count=0;
	File f1=new File("D:\\Durga_Sir_Java_8_Features\\File and Serialization Videos");
	String[] s=f1.list();
	for(String s1:s)
	{
		File f2=new File(f1,s1);
		if(f2.isDirectory())
		{
		count++;
		System.out.println(s1);
		}
	}
	System.out.println(count);

	}

}
