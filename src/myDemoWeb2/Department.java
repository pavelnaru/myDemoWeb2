package myDemoWeb2;

import java.util.HashSet;
import java.util.Set;

public class Department {
	private int departmentNo;
	private String departmentName;
	private String location;
	
	private Set<Employee> employees = new HashSet<>();
	
	public Department (int deptNo, String deptName , String location) {
		this.departmentNo = deptNo;
		this.departmentName =deptName;
		this.location = location;
	}
	public Department() {
		this.departmentNo = 0;
		this.departmentName = "";
		this.location = "nowhere";
	}
	@Override
	public int hashCode() {
		double initFloat = Math.random();
		while (initFloat<=1) {
			initFloat *=10;
		}
		final int prime = (int) initFloat; 
		int result = 1;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + departmentNo;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}
	public int getDeptNo() {
		return departmentNo;
	}
	public void setDeptNo(int deptNo) {
		this.departmentNo = deptNo;
	}
	public String getDeptName() {
		return departmentName;
	}
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee newEmployee) {
		this.employees.add(newEmployee);
	}
	
}
