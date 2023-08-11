package SetUtility;
import java.util.Comparator;
import SetEntity.Employee;
public class SortEmpsByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}
