package com.admintracker.client.university;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RegistararDataServiceAsync {
	   void getAdminSchool(String code,AsyncCallback<Vector<StudentData>> callback)throws LoggedInException;
}
