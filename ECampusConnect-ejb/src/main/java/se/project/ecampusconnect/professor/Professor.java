/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.professor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Advait
 */
@Entity
@Table
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int prof_id;
    
    private String prof_name;
    
    private String prof_dept;
    
    private String prof_email;
    
    public Professor(int prof_id, String prof_name, String prof_dept, String prof_email)
    {
        super();
        this.prof_id = prof_id;
        this.prof_name = prof_name;
        this.prof_dept = prof_dept;
        this.prof_email = prof_email;
    }
    
    public Professor()
    {
        super();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "se.project.ecampusconnect.professor.Professor[ id=" + id + " ]";
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public String getProf_dept() {
        return prof_dept;
    }

    public void setProf_dept(String prof_dept) {
        this.prof_dept = prof_dept;
    }

    public String getProf_email() {
        return prof_email;
    }

    public void setProf_email(String prof_email) {
        this.prof_email = prof_email;
    }
    
}
