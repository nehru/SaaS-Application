package com.admintracker.shared;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class misc {
	public misc(){
		
	}
	
	public boolean isNull(String s) {
		if ((s == null) || (s.length() == 0) || (s.trim().length() == 0)) {
			return false; 
		}
		return true;
	}
	
	public boolean isNullDate(Date s) {
		if (s == null) {
			return false; 
		}
		return true;
	}
	
	
	
	 public void fillListBox(final ListBox lb, ServiceInitialization si,String path){
		si.getGuiDataServiceAsync().read(path, new AsyncCallback<ArrayList<String>>(){

			@Override
			public void onFailure(Throwable caught) {
				 
				Window.alert("Error reading listbox values");
			}

			@Override
			public void onSuccess(ArrayList<String> result) {
				ArrayList<String> val = result;
				 for(int i =0; i< val.size();i++){
						//  System.out.println("val = "+val.get(i));
						
						  Collections.sort(val);
						  lb.insertItem(val.get(i), i);
						  
					  }
			}
			
		});
	} 
	
	public void addHGap(HorizontalPanel pl, String unit) {
		Label lbl = new Label();
		lbl.setWidth(unit);
		pl.add(lbl);
		pl.setCellWidth(lbl, unit);
	}

	public void addVGap(VerticalPanel pl, String unit) {
		Label lbl = new Label();
		pl.add(lbl);
		pl.setCellHeight(lbl, unit);
	}
}
