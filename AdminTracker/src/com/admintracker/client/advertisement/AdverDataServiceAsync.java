package com.admintracker.client.advertisement;

import java.util.Vector;

import com.admintracker.client.exception.LoggedInException;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AdverDataServiceAsync {

	void getImgEntries(AsyncCallback<Vector<AdvImageData>> callback);
	public void deleteImgData(AdvImageData sd,AsyncCallback<String> callback) throws LoggedInException;
	void getImgIdEntries(AsyncCallback<Vector<AdvImageData>> callback);
	public void getSno(AsyncCallback<String> callback) throws LoggedInException;
	
}
