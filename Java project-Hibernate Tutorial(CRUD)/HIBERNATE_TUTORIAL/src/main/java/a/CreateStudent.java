package a;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=sessionFactory.openSession();
	
		try {
			System.out.println("creating a new student");
			Student student=new Student ("vinodha","S","vinodha0698@gmail.com");
			Transaction tr=session.beginTransaction();
			session.save(student);
			tr.commit();
			session.close();
		}catch(HibernateException h)
		{
			System.out.println("The hibernate error is: "+h);
		}catch(Exception e)
		{
			System.out.println("The general error is: "+e);
		}
	
	}

}
