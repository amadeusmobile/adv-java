package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Emp;

public class QueryMain1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Query query = session.createQuery("from Emp e where e.empId between 110 and 120");
			List<Emp> empList = query.list();
			for (Emp e : empList) {
				System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary());
			}
			// tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
}
