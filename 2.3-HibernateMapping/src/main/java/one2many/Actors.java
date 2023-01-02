package one2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Actors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actorId;
	private String name;
	
	@OneToMany(mappedBy = "actor")
//	@JoinColumn(name="movieId")
	private List<Movies> movies;
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	
	public Actors(int actorId, String name, List<Movies> movies) {
		super();
		this.actorId = actorId;
		this.name = name;
		this.movies = movies;
	}
	
	public Actors() {
		super();
	}
	
	@Override
	public String toString() {
		return "Actors [actorId=" + actorId + ", name=" + name + ", movies=" + movies + "]";
	}
}
