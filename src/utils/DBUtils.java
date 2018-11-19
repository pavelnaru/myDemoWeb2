package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import myDemoWeb2.Department;
import myDemoWeb2.Employee;

public class DBUtils {

	private static final List<Department> DEPARTMENT = new ArrayList<Department>();
	static {
		initData();
	}
	private static void initData() {
		Department accountingDept = new Department(10, "Accounting", "New York");
		accountingDept.addEmployee(new Employee(
				7782, "Clark", "Manager","6/9/1981", 2450.00f));
		accountingDept.addEmployee(new Employee(
				7839, "King", "President", "11/17/1981", 5000.00f));
		accountingDept.addEmployee(new Employee(
				7934, "Miller", "Clerk", "6/9/1981", 1300.00f));
		
		Department salesDept = new Department (30, "Sales", "Chicago");
		salesDept.addEmployee(new Employee(
				7654, "Martin", "Salesman", "9/28/1981", 1250.00f));
		salesDept.addEmployee(new Employee(
				7499, "Allen", "Salesman", "2/20/1981", 1600.00f));
		salesDept.addEmployee(new Employee(
				7521, "Ward", "Salesman", "2/22/1981", 1250.00f));
		salesDept.addEmployee(new Employee(
				7844, "Turner", "Salesman", "9/8/1981", 1500.00f));
		salesDept.addEmployee(new Employee(
				7900, "James", "Clerk", "12/3/1981", 950.00f));
		
		Department operationsDept = new Department(40 , "Operation" , "Boston");
		
		DEPARTMENT.add(accountingDept);
		DEPARTMENT.add(salesDept);
		DEPARTMENT.add(operationsDept);
	}
	public static List<Department> queryDepartments(){
		return DEPARTMENT;
	}
	public static Set<Employee> queryEmployee(int departmentNo){
		return DEPARTMENT.get(departmentNo).getEmployees();
	}
}
