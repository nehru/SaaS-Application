package com.admintracker.client.student;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.server.StudentDataEntity;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("studentdata")
public interface StudentDataService extends RemoteService{
String addStudentData(StudentData sd) throws LoggedInException;
 Vector<StudentData> getEntries(String lemail) throws LoggedInException;
 public String addStudentDataCheck(StudentData sd) throws LoggedInException;
 public String deleteData(StudentData sd) throws LoggedInException;

 public  Vector<StudentData>  updateData(StudentData sd) throws LoggedInException;
 String addStudentData(StudentData old,StudentData sd) throws LoggedInException;
 String addRegStudentData(StudentData old,StudentData sd) throws LoggedInException;
 
 Vector<StudentData> getAllEntries() throws LoggedInException;
 public  Vector<String> getStarData(StudentData sd)throws LoggedInException;
}
