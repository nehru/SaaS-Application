package com.admintracker.client.advertisement;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adverImg")
public interface AdverDataService extends RemoteService{
	Vector<AdvImageData> getImgEntries() throws LoggedInException;
	public String deleteImgData(AdvImageData sd) throws LoggedInException;
	public Vector<AdvImageData> getImgIdEntries() throws LoggedInException; 
	public String getSno() throws LoggedInException;
	
	
}
