package com.admintracker.server;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.jdo.PersistenceManager;

import com.admintracker.client.admin.AdminDataService;
import com.admintracker.client.advertisement.AdvImageData;
import com.admintracker.client.advertisement.AdverDataService;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AdvImageServiceImpl extends RemoteServiceServlet implements
AdverDataService{

public String getSno() throws LoggedInException {
		String ret = null;
		boolean found = false;
		
		Vector<AdvImageData> entries = new Vector<AdvImageData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			String query = "select from " + AdvImageObject.class.getName();
			List<AdvImageObject> entities = (List<AdvImageObject>) pm
			.newQuery(query).execute();
			
			ArrayList<Integer> st = new ArrayList<Integer>();
			st.clear();
			
			for (AdvImageObject entity : entities) {
				
				st.add(Integer.parseInt(entity.getSno()));
				found = true;
			}
			Collections.sort(st);
			
			if(found == true){
				int vt = st.get(st.size()-1);
				vt++;
				ret = Integer.toString(vt);
			}
			else
			{
				ret = "10";
			}
			
		} finally {
			pm.close();
		}
		
		return ret;
	}
	
	
	
	
	
	public Vector<AdvImageData> getImgIdEntries() throws LoggedInException {
		
		Vector<AdvImageData> entries = new Vector<AdvImageData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			String query = "select from " + AdvImageObject.class.getName();
			List<AdvImageObject> entities = (List<AdvImageObject>) pm
			.newQuery(query).execute();
			
			for (AdvImageObject entity : entities) {
				AdvImageData sdd = new AdvImageData();
				sdd.setId(entity.getId().toString());
				entries.add(sdd);
				
				
			}
			
		} finally {
			pm.close();
		}
		
		return entries;
	}
	
	
	
	public String deleteImgData(AdvImageData sd) throws LoggedInException {
		String ret = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			// check current student data in the store

			String query = "select from " + AdvImageObject.class.getName()
					+ " where name == '" + sd.getName()+"'";
					

			List<AdvImageObject> entities = (List<AdvImageObject>) pm
			.newQuery(query).execute();
			
			for (AdvImageObject entity : entities) {

				if(entity.getName().equals(sd.getName())){
					pm.deletePersistent(entity);
					ret = "ok";
				}
			}
			
		} finally {
			pm.close();
		}
		
		return ret;

	}
	
	
	
	
	
	@Override
	public Vector<AdvImageData> getImgEntries() throws LoggedInException {
		
		Vector<AdvImageData> entries = new Vector<AdvImageData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + AdvImageObject.class.getName();
			List<AdvImageObject> entities = (List<AdvImageObject>) pm
			.newQuery(query).execute();
			
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
						
			
			for (AdvImageObject entity : entities) {
				AdvImageData sdd = new AdvImageData();
				
				sdd.setEmail(entity.getEmail());
				sdd.setFirstName(entity.getFirstName());
				sdd.setLastName(entity.getLastName());
				sdd.setId(entity.getId().toString());
				sdd.setName(entity.getName());
				sdd.setDate(df.format(entity.getDate()));
				sdd.setSno(entity.getSno());
				
				entries.add(sdd);

			}
		

	} finally {
		pm.close();
	}
		
		return entries;
	}

}
