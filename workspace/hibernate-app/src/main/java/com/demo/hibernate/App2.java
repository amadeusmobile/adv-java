package com.demo.hibernate;

import java.util.Set;

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
		//Transaction tx = session.beginTransaction();

		try {
			Emp e = session.get(Emp.class, 103);
			System.out.println(e.getEmpName() + " " + e.getCity() + " " + e.getSalary());
			
			
			/*Set<String> object=e.getFamily();
			System.out.println(object.getClass().getName());*/
			Set<String> members= e.getFamily();
			for(String memeber:members){
				System.out.println(memeber);
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
