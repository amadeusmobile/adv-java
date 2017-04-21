package com.demo.hibernate;

import java.util.Set;

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
		//Transaction tx = session.beginTransaction();

		try {
			Dept d = session.get(Dept.class, 10);

			Set<Emp> emps=d.getEmps();
			for(Emp e: emps){
				System.out.println(e.getName()+" "+e.getSalary());
			}
			//tx.commit();
		} catch (HibernateException e) {
			//tx.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
}
