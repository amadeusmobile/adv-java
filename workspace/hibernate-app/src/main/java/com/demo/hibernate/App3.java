package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Address address= new Address("1-2-203","Ambal Nagar","600032");
			Emp e= new Emp(103, "Raman", "Chennai", 60000);
			e.setAddress(address);
			
			e.getFamily().add("Mother");
			e.getFamily().add("Father");
			e.getFamily().add("Wife");
			e.getFamily().add("Son");
			e.getFamily().add("Daughter");
			
			session.save(e);
			
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
}
