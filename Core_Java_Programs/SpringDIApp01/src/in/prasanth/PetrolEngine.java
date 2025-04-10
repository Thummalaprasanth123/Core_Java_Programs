package in.prasanth;

public class PetrolEngine implements Engine {

	@Override
	public int start() {
		System.out.println("PetrolEngine Started");
		return 1;
	}

}
