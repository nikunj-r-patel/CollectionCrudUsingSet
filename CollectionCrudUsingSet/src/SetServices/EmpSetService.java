package SetServices;
import java.util.Scanner;
import SetEntity.Employee;
public interface EmpSetService {
	public int addEmployeeToList(Employee employee);
	public boolean findEmployee(int empId);
	public int removeEmployeData(int empId);
	public Employee getEmployeeData(int empId);
	public Employee updateEmployeeData(int empId, Scanner input);
	public int showAllEmployeesList();
	public int sortEmployeeByName();
	public int sortEmployeeByAge();
	public int sortEmployeeBySalary();
}
