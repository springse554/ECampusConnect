/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import se.project.ecampusconnect.course.Course;
import se.project.ecampusconnect.course.InclassCourse;

/**
 *
 * @author Dhaval
 */
public class Main {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public void createInclassCourse(String code, String instructor, double creditHours, String location) {
        Course inclassCourse = new InclassCourse();
        inclassCourse.setCourseCode(code);
        inclassCourse.setInstructor(instructor);
        inclassCourse.setCreditHours(creditHours);
        inclassCourse.setLocation(location);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(inclassCourse);
        tx.commit();
    }
    public static void main(String[] args) {
        Main main = new Main();
        emf = Persistence.createEntityManagerFactory("coursePU");
        em = emf.createEntityManager();
        main.createInclassCourse("SE554", "Ken Yu", 4.0, "LEWIS 01510");
        em.close();
        emf.close();
    }
    
}
