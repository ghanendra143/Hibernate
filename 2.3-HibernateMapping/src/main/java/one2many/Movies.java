package one2many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movies {
	
	@Id
	private int moiveId;
	private String movie;
	
	@ManyToOne
	private Actors actor;
	
	public Actors getActors() {
		return actor;
	}
	public void setActors(Actors actor) {
		this.actor = actor;
	}
	
	public int getMoiveId() {
		return moiveId;
	}
	public void setMoiveId(int moiveId) {
		this.moiveId = moiveId;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	public Movies(int moiveId, String movie) {
		super();
		this.moiveId = moiveId;
		this.movie = movie;
	}
	
	public Movies() {
		super();
	}
	
	@Override
	public String toString() {
		return "Movies [moiveId=" + moiveId + ", movie=" + movie + ", actor=" + actor + "]";
	}	
}
