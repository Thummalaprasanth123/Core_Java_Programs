package in.prasanth.optionalex;
import java.util.Optional;

public class OptDemo {
	public static void main(String[] args)
	{
	 Optional<String> os=Optional.of("optional class");
	 os.ifPresent(val->System.out.println("ifPresent method :"+val));
	 if(os.isPresent())
		 System.out.println("isPresent method");
     String str1 = os.orElse("orElse method");
     System.out.println(str1);
     String str2=os.orElseGet(()->generatedDefaultValue());
     System.out.println(str2);
	}
	public static String generatedDefaultValue() {
		
		return "orElseGet method";
	}
}
