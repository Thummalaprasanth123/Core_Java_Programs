package in.prasanth;

import java.lang.reflect.Field;

public class Main {
    
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
     Class<?> class1 = Class.forName("in.prasanth.Car");
        Field engfield = class1.getDeclaredField("eng");
   	    engfield.setAccessible(true);
   	    Object object = class1.newInstance();
   	    Car carobj=(Car)object;
   	    engfield.set(carobj, new DeiselEngine());
   	    carobj.drive();
	}

}
