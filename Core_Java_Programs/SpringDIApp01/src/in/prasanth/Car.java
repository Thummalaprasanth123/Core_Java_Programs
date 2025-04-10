package in.prasanth;

public class Car {
private Engine eng;
//	public Car(Engine eng)
//	{
//		this.eng=eng;
//	}
// public void setEngine(Engine eng) {
//	 this.eng=eng;
// }
 public void drive() {
	 int start=eng.start();
	 if(start>=1)
		 System.out.println("Journey started");
	 else
		 System.out.println("Engine trouble");
 }
}
