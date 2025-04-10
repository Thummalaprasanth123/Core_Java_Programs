package in.prasanth;

import java.util.function.Consumer;

class Movie
{
	String name;
	Movie(String name)
	{
		this.name=name;
	}
}
public class Consumer_Ex1 {

	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.println(m.name+"Ready to Release");
		Consumer<Movie> c2=m->System.out.println(m.name+"Released but it is bigger flop");
		Consumer<Movie> cc=c1.andThen(c2);
		Movie m=new Movie("Aagadu");
		cc.accept(m);

	}

}
