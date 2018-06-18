package com.niit.HibeDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App {
	public static void main(String[] args) {
		Student niit = null; /*new Student();*/ //as it returns the object
 
		/*niit.setSid(102);
		niit.setSname("shanth");
		niit.setSaddress("bidar");*/

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		/*session.save(niit);*/
		
		niit = (Student)session.get(Student.class, 102); //need to type-cast, here get method will give you object of Student 
		tx.commit();

		System.out.println(niit);
		
	}
}
