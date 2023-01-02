package embeddableAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("/embeddableAnnotation/hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setName("ravi jain");
		teacher.setAge(28);
		
		Address add = new Address();
		add.setCity("agra");
		add.setState("jaipur");
		
		teacher.setAddress(add);
		
		session.save(teacher);
		tx.commit();
		session.close();
		
		System.out.println("\nrecord inserted...");
	}

}
