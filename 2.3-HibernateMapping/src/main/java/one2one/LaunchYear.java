package one2one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LaunchYear {
	
	@Id
	private int lId;
	private String year;
	
	@OneToOne
	private Mobile mobile;
	
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getyear() {
		return year;
	}
	public void setyear(String year) {
		this.year = year;
	}
	public LaunchYear(int lId, String year) {
		super();
		this.lId = lId;
		this.year = year;
	}
	
	public LaunchYear() {
		super();
	}
	
	@Override
	public String toString() {
		return "LaunchYear [lId=" + lId + ", year=" + year + "]";
	}
}
