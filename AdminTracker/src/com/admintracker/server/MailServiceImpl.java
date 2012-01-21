package com.admintracker.server;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.admintracker.client.admin.AdminDataService;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.mail.MailService;
import com.admintracker.client.mail.MailServiceData;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MailServiceImpl extends RemoteServiceServlet implements
MailService{
	
	
	
	
	
	
	public String sendMail(MailServiceData ms){
		
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		
		//String messageBody = ms.getBody(); 
					
		Message emailMessage = new MimeMessage(session);
		try {
			emailMessage.setFrom(new InternetAddress(ms.getFromEmail(),
			ms.getFromName()));
			emailMessage.addRecipient(Message.RecipientType.TO,
			new InternetAddress(ms.getToEmail(), ms.getToName()));
			emailMessage.setSubject(ms.getSubject());
			emailMessage.setText(ms.getBody());
			Transport.send(emailMessage);
			
		} catch (UnsupportedEncodingException e) {
			 
			e.printStackTrace();
		} catch (MessagingException e) {
			 
			e.printStackTrace();
		}
		
		
		
		return "ok";
	
	}

	 
}
