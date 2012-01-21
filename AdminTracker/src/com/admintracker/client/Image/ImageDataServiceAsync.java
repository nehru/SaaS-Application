package com.admintracker.client.Image;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ImageDataServiceAsync {
	public  void readID(ImageData sd, AsyncCallback<Long> callback)	throws LoggedInException;
	public  void  readAllImage(ImageData sd,AsyncCallback<String[]> callback) throws LoggedInException;
	public  void deleteFile(ImageData sd,AsyncCallback<String> callback) throws LoggedInException;

}
