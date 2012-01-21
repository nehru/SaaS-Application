package com.admintracker.client.guidata;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("guidata")
public interface GuiDataService extends RemoteService{
	ArrayList<String> read(String path);
	public int getIndex(String name, String path);
	public int getDepartmentIndex(String name, String path);
	public ArrayList<ArrayList<Integer>> readList(String path);
	public ArrayList<String> readSort(String path);
	public String getCode(String name, String path);
}
