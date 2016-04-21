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
import se.project.ecampusconnect.course.OnlineCourse;
import se.project.ecampusconnect.professor.Instructor;

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
    
    public void createOnlineCourse(String code, String instructor, double creditHours, String url) {
        Course onlineCourse = new OnlineCourse();
        onlineCourse.setCourseCode(code);
        onlineCourse.setInstructor(instructor);
        onlineCourse.setCreditHours(4.0);
        onlineCourse.setUrl(url);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(onlineCourse);
        tx.commit();
    }
    
    public void createInstructor(String name, String department) {
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setDepartment(department);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(instructor);
        tx.commit();
        
    }
    public static void main(String[] args) {
        Main main = new Main();
        emf = Persistence.createEntityManagerFactory("ecampusconnectPU");
        em = emf.createEntityManager();
        main.createInclassCourse("SE554", "Prof. Ken Yu", 4.0, "LEWIS 01510");
        main.createOnlineCourse("SE554", "Prof. Ken Yu", 4.0, "https://d2l.depaul.edu/");
        main.createInstructor("Prof. Ken Yu", "Software Engineering");
        em.close();
        emf.close();
    }
    
}
