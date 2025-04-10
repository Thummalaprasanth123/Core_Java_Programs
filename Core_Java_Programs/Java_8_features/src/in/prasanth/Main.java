package in.prasanth;

public class Main {
   public static void main(String[] args) {
	Runnable r=()->{
		for(int i=0;i<10;i++)
		System.out.println("child Thread-inside Main method");
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++)
		System.out.println("Main Thread");
}
}
