package SetEntity;
import java.util.HashSet;
public class Employee {
	private int empId;
	private String empName;
	private HashSet<String> empSkills;
	private int empAge;
	private double empSalary;
	private String empJoinDate;
	public Employee(int empId, String empName, HashSet<String> empSkills, int empAge, double empSalary,
			String empJoinDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSkills = empSkills;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empJoinDate = empJoinDate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public HashSet<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(HashSet<String> empSkills) {
		this.empSkills = empSkills;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSkills=" + empSkills + ", empAge=" + empAge
				+ ", empSalary=" + empSalary + ", empJoinDate=" + empJoinDate + "]";
	}
}
