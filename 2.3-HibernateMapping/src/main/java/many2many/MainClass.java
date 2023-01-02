package many2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

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
		
//		Emp emp = new Emp();
//		emp.setId(1);
//		emp.setName("vijay kumar");
//		
//		Emp emp1 = new Emp();
//		emp1.setId(2);
//		emp1.setName("akshay kumar");
//		
//		Projects proj = new Projects();
//		proj.setPid(101);
//		proj.setPname("Banking App");
//		
//		Projects proj1 = new Projects();
//		proj1.setPid(102);
//		proj1.setPname("food App");
//		
//		List<Emp> emplist = new ArrayList<Emp>();
//		emplist.add(emp);
//		emplist.add(emp1);
//		
//		List<Projects> projlist = new ArrayList<Projects>();
//		projlist.add(proj);
//		projlist.add(proj1);
//		
//		emp.setProjects(projlist);
//		proj.setEmployees(emplist);
//		
//		session.save(emp);
//		session.save(emp1);
//		
//		session.save(proj);
//		session.save(proj1);
		
//		Query qr = session.createQuery("from Emp");
//		List<Emp> list = qr.getResultList();
//		System.out.println("\nAll Employees Deatils :");
//		for(Emp e:list){
//			System.out.println(e.getId()+"--"+e.getName());
//		}
		
		Emp emp = session.get(Emp.class, 1);
		System.out.println(emp.getName());
		System.out.println("\n");
		for(Projects p : emp.getProjects()) {
			System.out.println(p.getPid()+"--"+p.getPname()+"--"+emp.getId()+
					"--"+emp.getName());
		}
		
		tx.commit();
		session.close();
	}

}
