package SetController;
import java.util.HashSet;
import java.util.Scanner;
import SetEntity.Employee;
import SetServices.EmpSetService;
import SetServicesImpl.EmpSetServiceImpl;
import SetUtility.AddSkills;
import SetUtility.Menu;
public class EmpSetController {
	public static void main(String[] args) {
		EmpSetService empSetService = new EmpSetServiceImpl();
		Scanner input = new Scanner(System.in);
		Menu menuOfOperations = new Menu();
		int choiceOfOperation = 7;
		do {
			menuOfOperations.menu();
			choiceOfOperation = input.nextInt();
			switch (choiceOfOperation) {
			case 1:
				System.out.println("please enter datas of the employee as below ");
				System.out.println("enter Employee ID");
				int empId = input.nextInt();
				System.out.println("enter Employee NAME");
				String empName = input.next();
				System.out.println("enter Employee Skills");
				AddSkills addSkill = new AddSkills();
				HashSet<String> empSkills = addSkill.getSkills();
				System.out.println("enter Employee AGE");
				int empAge = input.nextInt();
				System.out.println("enter Employee SALARY");
				double empSalary = input.nextDouble();
				System.out.println("enter Employee JOINDATE");
				String empJoinDate = input.next();
				Employee employee = new Employee(empId, empName, empSkills, empAge, empSalary, empJoinDate);
				empSetService.addEmployeeToList(employee);
				System.out.println("employee" + employee.getEmpId() + " is added in Set");
				break;
			case 2:
				System.out.println("enter the employee id you want to remove");
				int empIdToRemove = input.nextInt();
				empSetService.removeEmployeData(empIdToRemove);
				break;
			case 3:
				System.out.println("enter the employee id you want to update");
				int empIdToUpdate = input.nextInt();
				empSetService.updateEmployeeData(empIdToUpdate, input);
				break;
			case 4:
				System.out.println("enter the employee id you want to find");
				int empIdToFind = input.nextInt();
				empSetService.getEmployeeData(empIdToFind);
				break;
			case 5:
				empSetService.showAllEmployeesList();
				break;
			case 6:
				int selectSortingOption = 4;
				System.out.println("select the sorting operation as below");
				System.out.println("1 to sort by name");
				System.out.println("2 to sort by age");
				System.out.println("3 to sort by salary");
				Scanner sortingOption = new Scanner(System.in);
				selectSortingOption = sortingOption.nextInt();
				switch (selectSortingOption) {
				case 1:
					empSetService.sortEmployeeByName();
					break;
				case 2:
					empSetService.sortEmployeeByAge();
					break;
				case 3:
					empSetService.sortEmployeeBySalary();
					break;
				default:
					System.out.println("there are no other sorting methods only 1,2,3");
					break;
				}
				break;
			case 7:
				System.out.println("thank you!! for using me.....");
				break;
			default:
				System.out.println(" Please select the operations as given above");
				break;
			}
		} while (choiceOfOperation != 7);
	}
}
