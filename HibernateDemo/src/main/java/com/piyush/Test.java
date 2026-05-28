package com.piyush;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        Session session = new Configuration()
                .configure()
                .buildSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.name = "Piyush";

        session.save(s);

        tx.commit();
        session.close();

        System.out.println("Done ✅");
    }
}