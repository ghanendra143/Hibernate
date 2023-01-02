package many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	private int pid;
	private String pname;
	
	@ManyToMany
	private List<Emp> employees;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}

	public Projects(int pid, String pname, List<Emp> employees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employees = employees;
	}

	public Projects() {
		super();
	}

	@Override
	public String toString() {
		return "Projects [pid=" + pid + ", pname=" + pname + ", employees=" + employees + "]";
	}
}
