package com.learning.hibernate.demoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import testhibernate1.AddressBook;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        AddressBook emp = new AddressBook();
        emp.setId(1);
        emp.setName("Reza");
        emp.setAddress("Kuujk");
        session.save(emp);
        tx.commit();
    }
}

