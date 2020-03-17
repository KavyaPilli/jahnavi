package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating configuration object
		SessionFactory sessionFactory = new Configuration().configure("/hib.cfg.xml").buildSessionFactory();
		 
	/*	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/hib.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
      */  //creating transaction obj
        Session session = sessionFactory.openSession();  
         Transaction t = session.beginTransaction();  
           
          Employee e1=new Employee();    
             e1.setId(2);    
             e1.setFirstName("Kavya");    
             e1.setLastName("Pilli");    
          
        session.save(e1);  
        t.commit();  
        System.out.println("successfully saved");    
        sessionFactory.close();  
         session.close();     
	}

}
