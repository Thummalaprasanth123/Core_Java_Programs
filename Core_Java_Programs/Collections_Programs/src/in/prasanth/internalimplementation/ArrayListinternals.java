package in.prasanth.internalimplementation;

public class ArrayListinternals {

	public static void main(String[] args) {

		// CustomArrayList cl=new CustomArrayList();

		CustomArrayList ci = new CustomArrayList(5);
		ci.insert(23);
		ci.insert(111);
		ci.insert(222);
		ci.insert(333);
		ci.insert(444);
		ci.insert(555);
		ci.insert(666);
		ci.insert(777);
		ci.insert(888);
		ci.insert("Hari");
		ci.insert(10101);
		ci.insert(1212);
		ci.insert(1313);
		ci.insert(1414);
		System.out.println(ci.size());
	}

}
