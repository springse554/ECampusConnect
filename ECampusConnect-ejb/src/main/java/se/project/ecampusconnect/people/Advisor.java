/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.people;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

/**
 *
 * @author Advait
 */
@Entity
@NamedQuery(name = "findAllAdvisors", query = "select a from Advisor a")
public class Advisor implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ADVISOR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    @Version
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private Integer age;
    
    
    public Long getId() {
        return customerId;

    }

    public void setId(Long id) {
        this.customerId = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender( 
        String genderText) {
        this.gender = genderText;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
