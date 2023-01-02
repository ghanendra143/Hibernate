package many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Projects> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
	
	public Emp(int id, String name, List<Projects> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", projects=" + projects + "]";
	}
}
