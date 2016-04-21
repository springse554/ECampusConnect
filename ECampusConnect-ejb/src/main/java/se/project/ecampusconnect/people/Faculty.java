/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.people;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Advait
 */
@Entity
@DiscriminatorValue( value="faculty" )
public class Faculty extends Staff{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String degree;
    private String domain;
    
    public Faculty(int staff_id, String staff_name, String degree, String domain)
    {
        super(staff_id,staff_name);
        this.degree = degree;
        this.domain = domain;
    }
    
    public Faculty()
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
        return "se.project.ecampusconnect.people.Faculty[ id=" + id + " ]";
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
}
