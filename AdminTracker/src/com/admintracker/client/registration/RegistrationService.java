package com.admintracker.client.registration;

import com.admintracker.client.exception.LoggedInException;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("register")
public interface RegistrationService extends RemoteService{
	String register(RegistrationData rd) throws LoggedInException;
	public String registerDelete(RegistrationData rd) throws LoggedInException;
	public RegistrationData getUsernameAndPassword(String email) throws LoggedInException;
}
