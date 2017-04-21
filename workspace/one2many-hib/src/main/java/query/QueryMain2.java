package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Emp;

public class QueryMain2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Query query = session.createQuery("select e.name,e.salary from Emp e where e.empId between 110 and 120");
			List<Object[]> empList = query.list();
			System.out.println();
			/*for (Object[] e : empList) {
				String name = (String) e[0];
				double salary = (Double) e[1];
				System.out.println(name + " " + salary);
			}*/
			// tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
}
