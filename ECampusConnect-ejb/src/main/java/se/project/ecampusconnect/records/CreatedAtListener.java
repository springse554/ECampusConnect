/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.records;

/**
 *
 * @author Advait
 */
import java.util.Date;

import javax.persistence.PrePersist;

public class CreatedAtListener {
	
	@PrePersist
	public void setCreatedAt(final Creatable entity) {
		entity.setCreatedAt(new Date());
	}
	
}