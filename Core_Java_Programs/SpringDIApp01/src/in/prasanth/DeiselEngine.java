package in.prasanth;

public class DeiselEngine implements Engine {

	@Override
	public int start() {
		System.out.println("DieselEngine started");
		return 1;
	}

}
