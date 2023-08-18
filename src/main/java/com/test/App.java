package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(Login.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Login login = new Login();
		login.setId(126);
		login.setName("Anzar");
		login.setPassword("877");
		login.setCity("UP");
		session.save(login);
		tr.commit();
	}
}