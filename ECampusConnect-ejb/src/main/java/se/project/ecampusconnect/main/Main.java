/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.main;

import java.util.Date;
import static java.util.concurrent.TimeUnit.SECONDS;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import se.project.ecampusconnect.admin.Admin;
import se.project.ecampusconnect.course.Course;
import se.project.ecampusconnect.course.InclassCourse;
import se.project.ecampusconnect.course.OnlineCourse;
import se.project.ecampusconnect.events.Event;
import se.project.ecampusconnect.professor.Instructor;
import se.project.ecampusconnect.records.Record;
import se.project.ecampusconnect.student.Student;

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

    public void createInstructor(String name, String email, String department, String username, String password) {
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setEmail(email);
        instructor.setDepartment(department);
        instructor.setUsername(username);
        instructor.setPassword(password);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(instructor);
        tx.commit();

    }

    public void createStudentRecord(String email, String name, String password, String level, String username) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setSlevel(level);
        student.setUsername(username);
        student.setPassowrd(password);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(student);
        tx.commit();
    }

    public void createAdmin(String name, String email, String username, String password) {
        Admin admin = new Admin();
        admin.setName(name);
        admin.setEmail(email);
        admin.setUsername(username);
        admin.setPassowrd(password);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(admin);
        tx.commit();
    }
    
    public void createEvent(String name, String place, String date) {
        Event event = new Event();
        event.setName(name);
        event.setPlace(place);
        event.setDate(date);
        

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(event);
        tx.commit();
    }

    
    public static void main(String[] args) {
        Main main = new Main();
        emf = Persistence.createEntityManagerFactory("ecampusconnectPU");
        em = emf.createEntityManager();
        main.createInclassCourse("SE554", "Prof. Ken Yu", 4.0, "LEWIS 01510");
        main.createOnlineCourse("SE554", "Prof. Ken Yu", 4.0, "https://d2l.depaul.edu/");

// creating professor        
        main.createInstructor("Prof. Ken Yu", "Yu@depaul.edu", "Software Engineering", "ken", "yu");

// creating Student records        
        main.createStudentRecord("AdvaitPatel@DePaul.edu", "Advait Patel", "patel", "Graduate", "advait");
        main.createStudentRecord("Dhaval Joshi", "DhavalJoshi@DePaul.edu", "Graduate","dhaval","joshi");

// creating Admin records
        main.createAdmin("Alex Brown", "alexB@depaul.edu", "Alex200", "imbrown");
        main.createAdmin("Jack Bader", "jackbader@depaul.edu", "jbader", "imbader");

// creating Event records
        main.createEvent("Graduation Ceremony", "DePaul University, Loop Campus", "06-12-2016");
        main.createEvent("Double Deamon", "DePaul University, Lincoln Park", "06-17-2016");
        main.createEvent("Cyber Coders", "Jack Blvd, Chicago", "06-30-2016");
        
        em.close();
        emf.close();
    }

}
