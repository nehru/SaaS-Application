package com.admintracker.client.university;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("univ")
public interface RegistararDataService extends RemoteService{
	   Vector<StudentData> getAdminSchool(String code)throws LoggedInException;
}
