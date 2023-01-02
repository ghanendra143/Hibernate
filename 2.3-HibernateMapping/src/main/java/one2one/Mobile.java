package one2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	private String phoneName;
	private int phonePrice;
	
	@OneToOne
	@JoinColumn(name="launchedYear")
	private LaunchYear	year;
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public int getPhonePrice() {
		return phonePrice;
	}
	public void setPhonePrice(int phonePrice) {
		this.phonePrice = phonePrice;
	}
	public LaunchYear getYear() {
		return year;
	}
	public void setYear(LaunchYear year) {
		this.year = year;
	}
	
	public Mobile(int phoneId, String phoneName, int phonePrice, LaunchYear year) {
		super();
		this.phoneId = phoneId;
		this.phoneName = phoneName;
		this.phonePrice = phonePrice;
		this.year = year;
	}
	
	public Mobile() {
		super();
	}
	
	@Override
	public String toString() {
		return "Mobile [phoneId=" + phoneId + ", phoneName=" + phoneName + ", phonePrice=" + phonePrice + ", year="
				+ year + "]";
	}
}
