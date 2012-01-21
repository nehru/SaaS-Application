package com.admintracker.client.registration;

import com.admintracker.client.exception.LoggedInException;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RegistrationServiceAsync {
	void register(RegistrationData rd, AsyncCallback<String> callback)
			throws LoggedInException;
	public void registerDelete(RegistrationData rd, AsyncCallback<String> callback) throws LoggedInException;
	public void getUsernameAndPassword(String email,AsyncCallback<RegistrationData> callback) throws LoggedInException;
}
