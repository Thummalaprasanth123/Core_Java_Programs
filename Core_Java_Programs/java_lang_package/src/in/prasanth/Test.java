package in.prasanth;

class Cat {
	int j;

	Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	Cat c;
	int i;

	Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		Cat c1=new Cat(c.j);
		Dog g=new Dog(c1, i);
		return g;
	}
}
class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(9);
		Dog g1 = new Dog(c, 10);
		System.out.println(g1.i + "............." + g1.c.j);
		Dog g2 = (Dog) g1.clone();
		g2.i=111;
		g2.c.j=999;
		System.out.println(g1.i + "............." + g1.c.j);
		System.out.println(g2.i + "............." + g2.c.j);
	}
}