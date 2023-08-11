package SetServicesImpl;
import java.util.Scanner;
import SetEntity.Employee;
import SetServiceRepository.EmpSetServiceRepo;
import SetServices.EmpSetService;
public class EmpSetServiceImpl implements EmpSetService {
	@Override
	public int addEmployeeToList(Employee employee) {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.addEmployeeToList(employee);
	}
	@Override
	public boolean findEmployee(int empId) {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.findEmployee(empId) ;
	}
	@Override
	public int removeEmployeData(int empId) {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.removeEmployeData(empId);
	}
	@Override
	public Employee getEmployeeData(int empId) {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.getEmployeeData(empId);
	}
	@Override
	public Employee updateEmployeeData(int empId, Scanner input) {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.updateEmployeeData(empId,input);
	}
	@Override
	public int showAllEmployeesList() {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.showAllEmployeesList();
	}
	@Override
	public int sortEmployeeByName() {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.sortEmployeeByName();
	}
	@Override
	public int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.sortEmployeeByAge();
	}
	@Override
	public int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return EmpSetServiceRepo.sortEmployeeBySalary();
	}
}
