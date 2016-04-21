/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.people;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import se.project.ecampusconnect.people.Staff;
import se.project.ecampusconnect.people.Faculty;
import se.project.ecampusconnect.people.Advisor;

/**
 *
 * @author Advait
 */
public class ShowData 
{
    public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Teaching staff entity 
      Faculty ts1=new Faculty(1,"James Bond","MS Computer Science","Java");
      Faculty ts2=new Faculty(2, "John Doe", "BS Computer Science", "Android");
      
      //Non-Teaching Staff entity
      Advisor nts1=new Advisor(3, "Mathew", "Accounts");
      Advisor nts2=new Advisor(4, "Hardson", "Students");

      //storing all entities
      entitymanager.persist(ts1);
      entitymanager.persist(ts2);
      entitymanager.persist(nts1);
      entitymanager.persist(nts2);
      
      entitymanager.getTransaction().commit();
      
      entitymanager.close();
      emfactory.close();
   }
    
}
