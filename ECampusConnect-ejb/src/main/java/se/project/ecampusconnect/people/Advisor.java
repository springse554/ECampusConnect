/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.people;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Advait
 */
@Entity
@DiscriminatorValue( value = "advisor" )
public class Advisor extends Staff{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String services;
    
    public Advisor(int staff_id, String staff_name, String services)
    {
        super(staff_id, staff_name);
        this.services = services;
    }
    
    public Advisor()
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advisor)) {
            return false;
        }
        Advisor other = (Advisor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.project.ecampusconnect.people.Advisor[ id=" + id + " ]";
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
    
}
