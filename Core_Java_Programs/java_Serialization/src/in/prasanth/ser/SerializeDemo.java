package in.prasanth.ser;
import java.io.*;


class Dog implements Serializable
{
	int i=10;
	int j=20;
//	transient static int i=10;
//	transient final int j=20;
//	transient int i=10;
//	transient int j=20;
}
public class SerializeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis=new FileInputStream("xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+"....."+d2.j);
	}

}
