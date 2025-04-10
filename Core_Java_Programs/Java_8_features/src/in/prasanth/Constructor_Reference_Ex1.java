package in.prasanth;
class Fresher{
	Fresher()
	{
		System.out.println("This is Fresher Constructor method");
	}
}
interface Interf12{
	public abstract Fresher get();
}
public class Constructor_Reference_Ex1 {

	public static void main(String[] args) {
		Interf12 i=Fresher::new;
		Fresher f1=i.get();
	}

}
