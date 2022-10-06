package collection;

public class Employee {
	private String empName;
	private int empAge;
	private int empId;
	private int empSalary;
	private boolean empIsMale;
	private String empRole;
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpAge() {
		return empAge;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpIsMale(boolean empIsMale) {
		this.empIsMale = empIsMale;
	}
	public boolean isEmpIsMale() {
		return empIsMale;
	}
	
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getEmpRole() {
		return empRole;
	}
	
	
	
	public Employee(String empName, int empAge, int empId, int empSalary, boolean empIsMale, String empRole) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empIsMale = empIsMale;
		this.empRole = empRole;
	}
	
	
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empId=" + empId + ", empSalary=" + empSalary
				+ ", empIsMale=" + empIsMale + ", empRole=" + empRole + "]";
	}

}
