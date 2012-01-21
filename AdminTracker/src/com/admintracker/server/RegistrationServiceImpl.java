package com.admintracker.server;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.registration.RegistrationService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

 public class RegistrationServiceImpl extends RemoteServiceServlet implements
 		RegistrationService {

 
	private static final Logger LOG = Logger
			.getLogger(RegistrationServiceImpl.class.getName());
	// private static final PersistenceManagerFactory PMF1 = JDOHelper
	 //		.getPersistenceManagerFactory("transactions-optional");

	public RegistrationData getUsernameAndPassword(String email) throws LoggedInException {
		String ret = null;
		
		RegistrationData rd = new RegistrationData ();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + RegistrationDataEntity.class.getName()
			+ " where email == '" + email+"'";
			
			List<RegistrationDataEntity> entities = (List<RegistrationDataEntity>) pm
			.newQuery(query).execute();
			
			for (RegistrationDataEntity entity : entities) {
				rd.setUsername(entity.getUsername());
				rd.setPassoword(entity.getPassoword());
				rd.setEmail(entity.getEmail());
				rd.setFirstName(entity.getFirstName());
				rd.setLastName(entity.getLastName());
				
				
				ret = "ok";
				
			}
			
			
		} finally {
			pm.close();
		}
		
		if(ret == "ok")
			return rd;
		else
			return null;
		
	}
	
	
	
	
	@Override
	public String registerDelete(RegistrationData rd) throws LoggedInException {
		String ret = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + RegistrationDataEntity.class.getName()
			+ " where email == '" + rd.getEmail()
			+ "' && firstName == '" + rd.getFirstName()
			+ "' && lastName == '" + rd.getLastName()
			+ "' && role == '" + rd.getRole()
			+ "' && username == '" + rd.getUsername()
			+ "' && password == '" + rd.getPassoword()
			+"'";
			
			List<RegistrationDataEntity> entities = (List<RegistrationDataEntity>) pm
			.newQuery(query).execute();
			
			for (RegistrationDataEntity entity : entities) {
				
				if(entity.getEmail().equals(rd.getEmail()) && entity.getFirstName().equals(rd.getFirstName()) && entity.getLastName().equals(rd.getLastName()) && entity.getRole().equals(rd.getRole()) ){
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
	public String register(RegistrationData rd) throws LoggedInException {
		String ret = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			String query = "select from " + RegistrationDataEntity.class.getName()
			+ " where email == '" + rd.getEmail()
			+ "' && username == '" + rd.getUsername()
			+"'";
			
			List<RegistrationDataEntity> entities = (List<RegistrationDataEntity>) pm
			.newQuery(query).execute();
			
			for (RegistrationDataEntity entity : entities) {
				
				if(entity.getEmail().equals(rd.getEmail()) && entity.getUsername().equals(rd.getUsername())){
					 
					ret = "found";
					break;
				}
				
			}
			
			if(ret != "found"){
				pm.makePersistent(makeEntity(rd));
				ret = "ok";
			}
			
		} finally {
			pm.close();
		}
		LOG.log(Level.INFO," entries added.");
		
		return ret;
	}

	private RegistrationDataEntity makeEntity(RegistrationData rd) {
		RegistrationDataEntity rde = new RegistrationDataEntity();

		rde.setFirstName(rd.getFirstName());
		rde.setLastName(rd.getLastName());
		rde.setEmail(rd.getEmail());
		rde.setUsername(rd.getUsername());
		rde.setPassoword(rd.getPassoword());
		rde.setRole(rd.getRole());

		return rde;
	}
	
	/*public PersistenceManager getPersistenceManager() {
		return PMF1.getPersistenceManager();
	}*/
	 
}
