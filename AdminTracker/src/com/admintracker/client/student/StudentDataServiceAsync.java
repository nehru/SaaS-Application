package com.admintracker.client.student;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.server.StudentDataEntity;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StudentDataServiceAsync {
	void addStudentData(StudentData sd, AsyncCallback<String> callback) throws LoggedInException;
	public void getEntries(String lemail,AsyncCallback<Vector<StudentData>> callback) throws LoggedInException;
	public void addStudentDataCheck(StudentData sd,AsyncCallback<String> callback) throws LoggedInException;
	public void deleteData(StudentData sd,AsyncCallback<String> callback) throws LoggedInException;

	public void updateData(StudentData sd,AsyncCallback<Vector<StudentData>> callback) throws LoggedInException;

	public void addStudentData(StudentData old,StudentData sd, AsyncCallback<String> callback) throws LoggedInException;
	public void addRegStudentData(StudentData old,StudentData sd, AsyncCallback<String> callback) throws LoggedInException;

	public void getAllEntries(AsyncCallback<Vector<StudentData>> callback) throws LoggedInException;
	 
	public   void getStarData(StudentData sd,AsyncCallback<Vector<String>> callback)throws LoggedInException;
}
