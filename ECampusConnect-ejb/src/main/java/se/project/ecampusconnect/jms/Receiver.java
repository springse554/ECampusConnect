/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.jms;

import javax.jms.*;  
import javax.naming.InitialContext; 

/**
 *
 * @author Advait
 */
public class Receiver 
{
    public static void main(String[] args) {  
        try{  
            InitialContext ctx=new InitialContext();  
            QueueConnectionFactory f=(QueueConnectionFactory)ctx.lookup("DefaultJMSConnectionFactory");  
            QueueConnection con=f.createQueueConnection();  
            con.start();  
            QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);  
            Queue t=(Queue)ctx.lookup("myQueue");  
            QueueReceiver receiver=ses.createReceiver(t);  
              
            JMSListner listener = new JMSListner();  
              
            receiver.setMessageListener(listener);  
              
            System.out.println("Client is waiting for server Response...");  
            System.out.println("If you want to exit, press Ctrl+c...");  
            while(true){                  
                Thread.sleep(1000);  
            }  
        }catch(Exception e){System.out.println(e);}  
    }  
    
}
