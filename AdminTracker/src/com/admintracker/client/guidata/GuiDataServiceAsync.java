package com.admintracker.client.guidata;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GuiDataServiceAsync {
	void read(String path, AsyncCallback<ArrayList<String>> callback);
	public void getIndex(String name, String path,AsyncCallback<Integer> callback);
	public void getDepartmentIndex(String name, String path,AsyncCallback<Integer> callback);
	public void readList(String path,AsyncCallback<ArrayList<ArrayList<Integer>>> callback);
	public void readSort(String path, AsyncCallback<ArrayList<String>> callback);
	public void getCode(String name, String path,AsyncCallback<String> callback);
}
