package in.prasanth.deadlock.copy;

public class MainTest {

	public static void main(String[] args) {
		MainTest mt1 = new MainTest();
		MainTest mt2 = new MainTest();
		Thread1 t1 = new Thread1(mt1, mt2);
		Thread2 t2 = new Thread2(mt1, mt2);
		t1.start();
		t2.start();
	}

}
