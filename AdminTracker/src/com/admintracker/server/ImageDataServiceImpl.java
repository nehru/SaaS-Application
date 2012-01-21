package com.admintracker.server;

import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import com.admintracker.client.Image.ImageData;
import com.admintracker.client.Image.ImageDataService;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.admintracker.client.student.StudentDataService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ImageDataServiceImpl extends RemoteServiceServlet implements
ImageDataService{

	private static final Logger LOG = Logger
	.getLogger(ImageDataServiceImpl.class.getName());
	
	public  Long readID(ImageData sd)	throws LoggedInException {
		Long id = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + ImageObject.class.getName()
			+ " where email == '" + sd.getEmail()
			+ "' && name == '" + sd.getName()
			+ "' && firstName == '" + sd.getFirstName()
			+ "' && lastName == '" + sd.getLastName()+"'";
			
			List<ImageObject> entities = (List<ImageObject>) pm
			.newQuery(query).execute();
			
			for (ImageObject entity : entities) {
				id = entity.getId();
				
				
			}
			
			
		}
		finally {
			pm.close();
		}
		
		
		
		return id;
	}

	public  String[] readAllImage(ImageData sd) throws LoggedInException {
		 
		 String[] vec = new String[8];
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + ImageObject.class.getName()
			+ " where email == '" + sd.getEmail()
		//	+ "' && name == '" + sd.getName()
			+ "' && firstName == '" + sd.getFirstName()
			+ "' && lastName == '" + sd.getLastName()+"'";
			
			List<ImageObject> entities = (List<ImageObject>) pm
			.newQuery(query).execute();
			
			if(entities == null){
				return null;
			}
			
			
			for (ImageObject entity : entities) {
				String sem = entity.getName();
				String se = sem.substring(3);
				Long val = entity.getId();
				if(val == null){
					
					continue;
				}
				 
				vec[Integer.parseInt(se)-1] = val.toString();
				
				
			}
			
			
			
		}
		finally {
			pm.close();
		}
		
		
		return vec;
	}
	//////////////////////////////////////////////
	public  String deleteFile(ImageData sd) throws LoggedInException {
		 
		 String ret = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + ImageObject.class.getName()
			+ " where email == '" + sd.getEmail()
			+ "' && name == '" + sd.getName()
			+ "' && firstName == '" + sd.getFirstName()
			+ "' && lastName == '" + sd.getLastName()+"'";
			
			List<ImageObject> entities = (List<ImageObject>) pm
			.newQuery(query).execute();
			
			if(entities == null){
				return null;
			}
			
			
			for (ImageObject entity : entities) {
				 pm.deletePersistent(entity);
				 ret = "ok";
				
			}
			
			
			
		}
		finally {
			pm.close();
		}
		
		
		return ret;
	}
	
	
	
}
