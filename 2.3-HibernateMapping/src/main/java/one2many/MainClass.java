package one2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Movies movies = new Movies();
//		movies.setMoiveId(107);
//		movies.setMovie("Race3");
//		
//		Movies movies1 = new Movies();
//		movies1.setMoiveId(108);
//		movies1.setMovie("Sultan");
//		
//		Movies movies2 = new Movies();
//		movies2.setMoiveId(109);
//		movies2.setMovie("Bharat");
//
//		List<Movies> list = new ArrayList<Movies>();
//		list.add(movies);
//		list.add(movies1);
//		list.add(movies2);
//		
//		Actors actors = new Actors();
//		actors.setName("Salman Khan");
//		actors.setMovies(list);
//		
//		movies.setActors(actors);
//		movies1.setActors(actors);
//		movies2.setActors(actors);
//		
//		session.save(actors);
//		session.save(movies);
//		session.save(movies1);
//		session.save(movies2);

		Actors act = session.get(Actors.class, 3);
		System.out.println(act.getName());
		System.out.println("\n");
		for(Movies m : act.getMovies()) {
			System.out.println(m.getMoiveId()+"--"+m.getMovie()+"--"+m.getActors().getActorId()+"--"+m.getActors().getName());
		}
		
		tx.commit();
		session.close();
	}
}
