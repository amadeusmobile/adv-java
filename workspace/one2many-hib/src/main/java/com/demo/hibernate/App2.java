package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Dept d = session.get(Dept.class, 10);

			Emp e1 = new Emp(116, "Ratan", 40000, "Bhopal");
			e1.setDept(d);

			Emp e2 = new Emp(117, "Ketan", 30000, "Mumbai");
			e2.setDept(d);
			
			session.save(e1);
			session.save(e2);
			session.flush();
			//tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
}
