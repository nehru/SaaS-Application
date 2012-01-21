package com.admintracker.client.admin;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("admin")
public interface AdminDataService extends RemoteService{
	Vector<RegistrationData> getAllUser()throws LoggedInException;
 
}
