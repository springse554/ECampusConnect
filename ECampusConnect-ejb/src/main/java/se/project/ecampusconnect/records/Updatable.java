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

public interface Updatable {
	void setUpdatedAt(final Date date);
}