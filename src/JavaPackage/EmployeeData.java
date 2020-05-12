package JavaPackage;

public class EmployeeData {

	private int ssn;
	private String empName;
	private int empAge;
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setEmpAge(25);
		emp.setEmpName("Tom");
		emp.setSsn(123456);
		
		System.out.println(emp.empName);

	}

}
