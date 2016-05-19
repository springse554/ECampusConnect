/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.advisor;

import javax.ejb.SessionBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.project.ecampusconnect.people.Advisor;
/**
 *
 * @author Advait
 */

@Stateless
public class AdvisorBean implements AdvisorBeanInterface
{

    @PersistenceContext(unitName = "advisorPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    
    @Override
    public void addAdvisor(String firstName, String lastName, String gender, Integer age) 
    {
        Advisor advisor = new Advisor();
        advisor.setFirstName(firstName);
        advisor.setLastName(lastName);
        advisor.setGender(gender);
        advisor.setAge(age);
        em.persist(advisor);
        
    }

    
    
}
