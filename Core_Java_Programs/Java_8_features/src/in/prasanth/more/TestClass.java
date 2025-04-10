package in.prasanth.more;

import java.util.Optional;

public class TestClass {

	public static void main(String[] args) {
      PojoClass gat = OptionalDemo.getdata(2, null);
     /// String name = gat.getName();
		/* String case1 = *///name.toUpperCase();
     // System.out.println(case1);
//		Optional<Object> empty = Optional.empty();
//		System.out.println(empty);
		//Optional<String> opt = Optional.of(gat.getName());
		//System.out.println(opt);
		Optional<String> nullValue = Optional.ofNullable(gat.getName());
		System.out.println(nullValue);
//		if(nullValue.isPresent())
//		{
//			System.out.println(nullValue.get());
//		}
//		System.out.println(nullValue.orElse("Default name"));
		//System.out.println(nullValue.map(String::toUpperCase).orElseGet(()->"Name Not Present"));
	}
}
