package com.org.onetoone;
import org.hibernate.*;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        
       Configuration cfg= new Configuration();

        cfg.configure("Hibernate.cfg.xml");

        SessionFactory fact = cfg.buildSessionFactory();

        Session sess= fact.openSession();

        Transaction t=sess.beginTransaction();
        
        Employee e11=new Employee(); 

        e11.setName("Pavan Kumar"); 

        e11.setMailid("Pavan@gmail.com"); 

        Address address11=new Address(); 

        address11.setAddressLine1("G-21,LB nagar"); 
        address11.setCity("Hyderabad"); 

       address11.setState("TS"); 

        address11.setCountry("India"); 

       address11.setPincode(20301); 
        e11.setAddress(address11);

       address11.setEmployee(e11);

        sess.persist(e11); 
        sess.persist(address11);
        t.commit(); 

        System.out.println("Save !!!");

        sess.close(); 


    }
}
