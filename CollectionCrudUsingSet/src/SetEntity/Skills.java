package SetEntity;
import java.util.HashSet;
public class Skills {
	private HashSet<String> empSkills;
	public Skills(HashSet<String> empSkills) {
		super();
		this.empSkills = empSkills;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HashSet<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(HashSet<String> empSkills) {
		this.empSkills = empSkills;
	}
	@Override
	public String toString() {
		return "Skills [empSkills=" + empSkills + "]";
	}
}
