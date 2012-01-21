package com.admintracker.client.mail;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("mail")
public interface MailService extends RemoteService{
	 
	String sendMail(MailServiceData ms)throws LoggedInException;
}
