/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.professor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import se.project.ecampusconnect.professor.Professor;

/**
 *
 * @author Advait
 */
public class CreateProfessor 
{
    public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      Professor professor = new Professor( ); 
      
      professor.setProf_id(007);
      professor.setProf_name("Prof. Yu");
      professor.setProf_dept("Software Engineering");
      professor.setProf_email("profyu@gmail.com");
      
      
      
      entitymanager.persist( professor );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
    
}
