package in.prasanth.basiclevel3.stp;

public class Customer {
  private String name;
  private String plno;
  private Double pamt;
  
public Customer(String name, String plno, Double pamt) {
	super();
	this.name = name;
	this.plno = plno;
	this.pamt = pamt;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlno() {
	return plno;
}
public void setPlno(String plno) {
	this.plno = plno;
}
public Double getPamt() {
	return pamt;
}
public void setPamt(Double pamt) {
	this.pamt = pamt;
}
  
}
