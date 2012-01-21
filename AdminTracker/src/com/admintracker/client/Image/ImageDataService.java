package com.admintracker.client.Image;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("imagedata")
public interface ImageDataService extends RemoteService{
	public  Long readID(ImageData sd)	throws LoggedInException;
	public  String[]  readAllImage(ImageData sd) throws LoggedInException;
	public  String deleteFile(ImageData sd) throws LoggedInException;
}
