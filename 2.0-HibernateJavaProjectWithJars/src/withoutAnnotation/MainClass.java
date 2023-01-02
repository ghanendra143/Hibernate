package withoutAnnotation;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("/withoutAnnotation/hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// 1. insert data -------------
		
//		Employee emp = new Employee();
//		emp.setName("akanksha");
//		emp.setAge(23);
//		emp.setAddress("delhi");
		
//		System.out.println("data inserted....\n");
//		session.save(emp);
		
		// 2. update data ----------------
		
//		Query qr = session.createQuery("update Employee set name=:n,age=:a,address=:ad where id=:i");
//		qr.setParameter("n", "ghanendra");
//		qr.setParameter("a", 24);
//		qr.setParameter("ad", "uttar_pradesh");
//		qr.setParameter("i", 1);
//		
//		int row = qr.executeUpdate();
//		System.out.println(row+" row updated \n");
		
		// 3. delete data ----------------
		
//		Query qr = session.createQuery("delete Employee where id=:i");
//		qr.setParameter("i", 5);
//		int row = qr.executeUpdate();
//		System.out.println(row+" row deleted.. \n");
		
		// 4. fetch single value --------------------
//		Query qr = session.createQuery("from Employee where id=:i");
//		qr.setParameter("i", 2);
//		
//		List<Employee> list = qr.getResultList();
//		System.out.println("\nEmployee Details :");
//		for(Employee e:list) {
//			System.out.println("id : "+e.getId());
//			System.out.println("name : "+e.getName());
//			System.out.println("age : "+e.getAge());
//			System.out.println("address : "+e.getAddress());
//		}
		
		// 5. fetching all details : 
		Query qr = session.createQuery("from Employee");
		List<Employee> list = qr.getResultList();
		System.out.println("\nAll Employees Deatils :");
		for(Employee e:list){
			System.out.println(e);
		}
		
		
		tx.commit();
		session.close();
	
	}
}
