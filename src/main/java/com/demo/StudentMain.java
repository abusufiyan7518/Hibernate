package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(Student.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student student = new Student();
		student.setId(104);
		student.setAge(20);
		student.setFirstName("Ehtisham");
		student.setLastName("Khan");
		student.setCity("Saki Naka");
		student.setAddress("Wajid Ali Comp");
		student.setPassword("8840");
		session.save(student);
		tr.commit();

	}
}
