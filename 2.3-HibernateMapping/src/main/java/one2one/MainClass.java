package one2one;

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
		
//		Mobile mob = new Mobile();
//		mob.setPhoneName("poco m4pro 5g");
//		mob.setPhonePrice(17999);
//		
//		LaunchYear ly = new LaunchYear();
//		ly.setlId(201);
//		ly.setyear("24/07/2020");
//		ly.setMobile(mob);
//		mob.setYear(ly);
//		
//		session.save(mob);
//		session.save(ly);
		
		// one to one mapping : 
		
		Query qr = session.createQuery("from Mobile");
		List<Mobile> list = qr.getResultList();
		System.out.println("\nAll Mobile Deatils :");
		for(Mobile e:list){
			System.out.println(e.getPhoneId()+"--"+e.getPhoneName()+"--"+
					e.getPhonePrice()+"--"+e.getYear().getlId()+"--"+e.getYear().getyear());
		}
		
		tx.commit();
		session.close();
		
	}
}
