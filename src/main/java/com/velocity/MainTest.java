package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question ques=new Question();
		ques.setQues("what is your name?");
		
		Answer a1=new Answer();
		a1.setAns("my name is shweta.");
		a1.setQuestion(ques);
		
		
		Answer a2=new Answer();
		a2.setAns("my name is sneha.");
		a2.setQuestion(ques);
		
		Answer a3=new Answer();
		a3.setAns("my name is vaishali.");
		a3.setQuestion(ques);
		
		session.save(ques);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		
		

	}

}
