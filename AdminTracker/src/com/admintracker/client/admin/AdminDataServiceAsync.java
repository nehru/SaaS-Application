package com.admintracker.client.admin;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AdminDataServiceAsync {
	void getAllUser(AsyncCallback<Vector<RegistrationData>> callback)throws LoggedInException;
}
