package com.hb.demo;

import org.apache.poi.openxml4j.opc.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HiberNateTest {

	public static void main(String[] args) {

		UserDeatils user = new UserDeatils();
		user.setId(1);
		user.setName("nikal");

		SessionFactory sf = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
		session.close();

	}
}
