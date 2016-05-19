/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.jms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.naming.*;
import javax.jms.*;

/**
 *
 * @author Advait
 */
public class Sender {

    public static void main(String[] args) {
        try {   
            InitialContext ctx = new InitialContext();
            QueueConnectionFactory f = (QueueConnectionFactory) ctx.lookup("DefaultJMSConnectionFactory");
            QueueConnection con = f.createQueueConnection();
            con.start();
            QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue t = (Queue) ctx.lookup("myQueue");
            QueueSender sender = ses.createSender(t);
            TextMessage msg = ses.createTextMessage();

            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Hello SE 554 to the world of Java");
                String s = b.readLine();
                if (s.equals("end")) {
                    break;
                }
                msg.setText(s);
                sender.send(msg);
                System.out.println("Message sent successfully.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
