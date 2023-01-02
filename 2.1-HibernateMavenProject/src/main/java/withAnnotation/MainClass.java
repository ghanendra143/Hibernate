package withAnnotation;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("/withAnnotation/hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// 1. insert data -------------
		
//		Employee emp = new Employee();
//		emp.setName("vivek");
//		emp.setAge(25);
//		emp.setAddress("bihar");
//		
//		System.out.println("data inserted....\n");
//		session.save(emp);
		
		// 2. update data ----------------
		
//		Query qr = session.createQuery("update Employee set name=:n,age=:a,address=:ad where id=:i");
//		qr.setParameter("n", "aditi");
//		qr.setParameter("a", 24);
//		qr.setParameter("ad", "pune");
//		qr.setParameter("i", 1);
		
//		int row = qr.executeUpdate();
//		System.out.println(row+" row updated \n");
		
		// 3. delete data ----------------
		
//		Query qr = session.createQuery("delete Employee where id=:i");
//		qr.setParameter("i", 5);
//		int row = qr.executeUpdate();
//		System.out.println(row+" row deleted.. \n");
		
		// 4. fetch single value --------------------
//		Query qr = session.createQuery("from Employee where id=:i");
//		qr.setParameter("i", 1);
		
//		List<Employee> list = qr.getResultList();
//		System.out.println("\nEmployee Details :");
//		for(Employee e:list) {
//			System.out.println("id : "+e.getId());
//			System.out.println("name : "+e.getName());
//			System.out.println("age : "+e.getAge());
//			System.out.println("address : "+e.getAddress());
//			System.out.println(e);
//		}
		
		// alternate method of gettng data form the database : 
//		Employee st = session.get(Employee.class, 4);
//		System.out.println("\nEmployee details of ID :  "+st.getId());
//		System.out.println(st);
		
		Employee st = session.load(Employee.class, 1);
		System.out.println(st);
		
		// 5. fetching all details : 
//		Query qr = session.createQuery("from Employee");
//		List<Employee> list = qr.getResultList();
//		System.out.println("\nAll Employees Deatils :");
//		for(Employee e:list){
//			System.out.println(e);
//		}
//		
//		
//		tx.commit();
//		session.close();
	
	}
}
