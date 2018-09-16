package com.maven3.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Employee e1 = new Employee();
        e1.setEid(5);
        e1.setName("Praful");
        e1.setTech("Salesforce");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
        EntityManager eman = factory.createEntityManager();
        
      //  Employee emp1 = man.find(Employee.class, 1);
        eman.getTransaction().begin();
     //   System.out.println(emp1);
        eman.persist(e1);
        eman.getTransaction().commit();
    }
}
