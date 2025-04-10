package in.prasanth.stringhandling;

import java.lang.reflect.Constructor;

public class ObjectCreation extends CloneNotSupportedException {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CloneNotSupportedException {
		//Using new keyword
		ObjectCreation obj=new ObjectCreation();
		//Using Clone method
		Object clon= (ObjectCreation)obj.clone();
		//Using De-Serialization
		ois.readObject();
		
		//Using newInstance() in classs Class
		Class<?> name = Class.forName("ObjectCreation");
		ObjectCreation s=(ObjectCreation)name.newInstance();
		//Using newInstance() in Constructor class
		Constructor<ObjectCreation> constr = ObjectCreation.class.getConstructors();
ObjectCreation instance = constr.newInstance();
	}

}
