package com.admintracker.client.login;

import com.admintracker.client.registration.RegistrationData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	public void checkLogin(String userName, String password,String role,
			AsyncCallback callback);

	public void readInfoBasedOnUsernameAndPasswordAndRole(String userName, String password, String role,AsyncCallback callback);
	
	public void isSessionAlive(AsyncCallback callback);

	public void logout(AsyncCallback callback);
}
