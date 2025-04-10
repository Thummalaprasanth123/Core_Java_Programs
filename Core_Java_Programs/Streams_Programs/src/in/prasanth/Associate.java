package in.prasanth;

public class Associate {
private Integer ano;
private String aname;
private Double asalary;

public Associate(Integer ano, String aname, Double asalary) {
	super();
	this.ano = ano;
	this.aname = aname;
	this.asalary = asalary;
}
@Override
public String toString() {
	return "Associate [ano=" + ano + ", aname=" + aname + ", asalary=" + asalary + "]";
}

public Integer getAno() {
	return ano;
}
public void setAno(Integer ano) {
	this.ano = ano;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public Double getAsalary() {
	return asalary;
}
public void setAsalary(Double asalary) {
	this.asalary = asalary;
}

}
