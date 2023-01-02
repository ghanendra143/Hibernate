package com.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Image img = new Image();
		img.setImgType("cup");
		img.setUploadedBy("ghanendra");
		
		// saving image
		FileInputStream fis = new FileInputStream("src/main/java/cup.jpg");
		byte[] image = new byte[fis.available()];
		fis.read(image);
		img.setImg(image);
		
		session.save(img);
		tx.commit();
		session.close();
		
		System.out.println("\nimg data inserted!!\n");
	}
}
