package SetServiceRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import SetEntity.Employee;
import SetUtility.AddSkills;
import SetUtility.SortEmpsByAge;
import SetUtility.SortEmpsByName;
import SetUtility.SortEmpsBySalary;
public class EmpSetServiceRepo {
	static LinkedHashSet<Employee> empSet = new LinkedHashSet<Employee>();
	Employee employee = new Employee();
	public static int addEmployeeToList(Employee employee) {
		// TODO Auto-generated method stub
		if (empSet.add(employee)) {
			System.out.println("this employee ID is unique");
		} else {
			System.err.println("the employee " + employee.getEmpId() + " is added already");
		}
		return 0;
	}
	public static boolean findEmployee(int empId) {
		// TODO Auto-generated method stub
		Iterator<Employee> iteationToFind = empSet.iterator();
		while (iteationToFind.hasNext()) {
			Employee employeeToCheck = (Employee) iteationToFind.next();
			if (employeeToCheck.getEmpId() == empId) {
				return true;
			}
		}
		return false;
	}
	public static int removeEmployeData(int empId) {
		// TODO Auto-generated method stub
		Employee empDelete = null;
		for (Employee employeetoRemove : empSet) {
			if (employeetoRemove.getEmpId() == empId) {
				empDelete = employeetoRemove;
			}
		}
		if (empDelete == null) {
			System.out.println("the employee " + empDelete.getEmpId() + " is not in Set");
		} else {
			empSet.remove(empDelete);
			System.out.println("the employee " + empDelete.getEmpId() + " is removed from Set");
		}
		return 0;
	}
	public static Employee getEmployeeData(int empId) {
		// TODO Auto-generated method stub
		Iterator<Employee> iterationToGet = empSet.iterator();
		while (iterationToGet.hasNext()) {
			Employee employeeData = (Employee) iterationToGet.next();
			if (employeeData.getEmpId() == empId) {
				System.out.println("the employee " + empId + "'s datas are:");
				System.out.println(employeeData);
				return employeeData;
			}
		}
		return null;
	}
	public static Employee updateEmployeeData(int empId, Scanner input) {
		// TODO Auto-generated method stub
		if (findEmployee(empId)) {
			Employee employeeUpdate = getEmployeeData(empId);
			System.out.println("Please enter all new data to be updated of " + empId);
			System.out.println("enter Employee new ID");
			int empIdNew = input.nextInt();
			System.out.println("enter Employee new NAME");
			String empNameNew = input.next();
			System.out.println("enter new Skills");
			AddSkills addSkills = new AddSkills();
			HashSet<String> empSkills = addSkills.getSkills();
			System.out.println("enter Employee new AGE");
			int empAgeNew = input.nextInt();
			System.out.println("enter Employee new SALARY");
			double empSalaryNew = input.nextDouble();
			System.out.println("enter Employee new JOINDATE");
			String empJoinDateNew = input.next();
			System.out.println("enter new More Skills");
			employeeUpdate.setEmpId(empIdNew);
			employeeUpdate.setEmpName(empNameNew);
			employeeUpdate.setEmpSkills(empSkills);
			employeeUpdate.setEmpAge(empAgeNew);
			employeeUpdate.setEmpSalary(empSalaryNew);
			employeeUpdate.setEmpJoinDate(empJoinDateNew);
			System.out.println("the data of employee " + empId + " is updated in Set");
		} else {
			System.out.println("the  employee " + empId + " is not in Set");
		}
		return null;
	}
	public static int showAllEmployeesList() {
		// TODO Auto-generated method stub
		if (empSet.isEmpty()) {
			System.out.println("the employee Set is not available");
		} else {
			System.out.println("the Set of employee is:");
			Iterator<Employee> iterationToShow = empSet.iterator();
			while (iterationToShow.hasNext()) {
				Employee employeeAll = (Employee) iterationToShow.next();
				System.out.println(employeeAll);
			}
		}
		return 0;
	}
	public static int sortEmployeeByName() {
		// TODO Auto-generated method stub
		SortEmpsByName sortName = new SortEmpsByName();
		ArrayList<Employee> arrEmpSortName = new ArrayList<Employee>(empSet);
		Collections.sort(arrEmpSortName, sortName);
		Iterator<Employee> iterationToSortName = arrEmpSortName.iterator();
		while (iterationToSortName.hasNext()) {
			Employee sortedByName = (Employee) iterationToSortName.next();
			System.out.println(sortedByName);
		}
		return 0;
	}
	public static int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		SortEmpsByAge sortAge = new SortEmpsByAge();
		ArrayList<Employee> arrEmpSortAge = new ArrayList<Employee>(empSet);
		Collections.sort(arrEmpSortAge, sortAge);
		Iterator<Employee> iterationToSortAge = arrEmpSortAge.iterator();
		while (iterationToSortAge.hasNext()) {
			Employee sortedByAge = (Employee) iterationToSortAge.next();
			System.out.println(sortedByAge);
		}
		return 0;
	}
	public static int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		SortEmpsBySalary sortSalary = new SortEmpsBySalary();
		ArrayList<Employee> arrEmpSortSalary = new ArrayList<Employee>(empSet);
		Collections.sort(arrEmpSortSalary, sortSalary);
		Iterator<Employee> iterationToSortSalary = arrEmpSortSalary.iterator();
		while (iterationToSortSalary.hasNext()) {
			Employee sortedBySalary = (Employee) iterationToSortSalary.next();
			System.out.println(sortedBySalary);
		}
		return 0;
	}
}
