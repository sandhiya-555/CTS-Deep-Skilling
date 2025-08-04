package com.cognizant.hibernate_example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateJpaApplication {


        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.setName("Yashwanth");
            emp.setDepartment("CSE");

            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = null;

            try {
                tx = session.beginTransaction();
                session.save(emp);
                tx.commit();
                System.out.println("Employee saved");
            } catch (Exception e) {
                if (tx != null) tx.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }
    }


