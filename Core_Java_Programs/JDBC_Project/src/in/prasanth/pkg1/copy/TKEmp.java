package in.prasanth.pkg1.copy;

public class TKEmp {
	private Integer empId;
	private String empName;
	private String empSal;
    public TKEmp()
    {
    	
    }
	public TKEmp(Integer empId, String empName, String empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "TKEmp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

}
