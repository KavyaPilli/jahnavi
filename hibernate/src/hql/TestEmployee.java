package hql;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("/hib.cfg.xml").buildSessionFactory();
	        Session session = sessionFactory.openSession();  
	         Transaction t = session.beginTransaction();  
	         //String hql="FROM Employee";
	         //String hql="FROM Employee as E where E.id>=1";
	         //String hql="select E.firstName from Employee E where E.id=1";
	         String hql="FROM Employee E order by E.firstName";
	         Query query=session.createQuery(hql);
	        List<Employee> items=query.list();
	         for(Employee e:items)
	         {
	        	 System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName());
	         }
	        /* List<String> items=query.list();
	         for(String s:items)
	         {
	        	 System.out.println(s);
	         }*/
	         sessionFactory.close();  
	         session.close();     
	}

}
