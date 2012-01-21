package com.admintracker.client.login;

import com.admintracker.client.registration.RegistrationData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public LoginData checkLogin(String userName, String password,String role);
	public RegistrationData readInfoBasedOnUsernameAndPasswordAndRole(String userName, String password, String role);
	
	
	public LoginData isSessionAlive();

	public void logout();
}
