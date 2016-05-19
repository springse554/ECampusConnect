/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.jms;

import javax.jms.*;
/**
 *
 * @author Advait
 */
public class JMSListner implements MessageListener {  
  
    public void onMessage(Message m) {  
        try{  
        TextMessage msg=(TextMessage)m;  
      
        System.out.println("From Server :\t" + msg.getText());  
        }
        catch(JMSException e){
            System.out.println(e);
        }  
    }  
}  