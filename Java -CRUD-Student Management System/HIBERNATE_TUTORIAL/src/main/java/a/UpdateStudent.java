package a;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {



	public static void main(String[] args) {
	
		String x=args[0];
		int id=Integer.parseInt(x);
		System.out.println(id);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
				
		try {
			Student st=(Student)session.load(Student.class, id);
			System.out.println("Befor update"+st);
			st.setEmail(JOptionPane.showInputDialog("enter new mail id","type here"));
			Transaction tr=session.beginTransaction();
			session.saveOrUpdate(st);
			tr.commit();
			System.out.println("After update"+st);
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