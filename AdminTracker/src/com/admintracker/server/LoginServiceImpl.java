package com.admintracker.server;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.HttpSession;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginData;
import com.admintracker.client.login.LoginService;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.registration.RegistrationService;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	private static final String USER_SESSION = "AdminTrakerUser";

	private String lemail;
	  
	
	
	private static final Logger LOG = Logger
			.getLogger(RegistrationServiceImpl.class.getName());
//	private static final PersistenceManagerFactory PMF = JDOHelper
	//		.getPersistenceManagerFactory("transactions-optional");

	  
	
	
	private void setUserInSession(LoginData logindata) {
		HttpSession session = getThreadLocalRequest().getSession();
		session.setAttribute(USER_SESSION, logindata);
	}

	private LoginData getUserFromSession() {
		HttpSession session = getThreadLocalRequest().getSession();
		return (LoginData) session.getAttribute(USER_SESSION);
	}

	@Override
	public LoginData checkLogin(String userName, String password, String role) {
		List<RegistrationDataEntity>  entities;
		LoginData ld;
		
		System.out.println("loginserviceIMPL "+userName+ " *** "+ password);
		
		
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Vector<RegistrationDataEntity> entries = new Vector<RegistrationDataEntity>();
		try {
			
			String query = "select from " + RegistrationDataEntity.class.getName()
			+" where username == '"+userName+"' && password == '"+password+"' && role == '"+role+"'" ;
			
			
			/*String query = "select from "
					+ RegistrationDataEntity.class.getName()
					+ " where username == '" + userName + "' && "
					+ "passoword == '" + password +"'";*/
			
			
		//	String query = "select from " + RegistrationDataEntity.class.getName();
			
			/*String query = "select from " + RegistrationDataEntity.class.getName()
			+" where username == 'mohan' && passoword == 'hello'";*/
				
			entities = (List<RegistrationDataEntity>) pm.newQuery(query).execute();
						
			  if(entities.isEmpty()){
				  LOG.log(Level.INFO," entities is empty");
				  return null;
			  }
			  else
			  {
				  ld = new LoginData();
				  for (RegistrationDataEntity entity : entities) {
						 
					  this.lemail = entity.getEmail();
					  
					  ld.setUserName(entity.getUsername());
					  ld.setPassword(entity.getPassoword());
					  ld.setEmail(entity.getEmail());
					  ld.setFirstName(entity.getFirstName());
					  ld.setLastName(entity.getLastName());
					  
						 LOG.log(Level.INFO,entity.getEmail() );
					}
				  
				  return ld;
			  }
			  
			  
		 	/*Window.alert("email " +entities.get(0).getEmail());
			
			 ld = new LoginData();
			ld.setUserName(entities.get(0).getUsername());
			ld.setPassword(entities.get(0).getPassoword()); */
			
			
		} finally {
			pm.close();
		}

			}
///////////////////////////////////////////////////////////////////////////////////////	
	public RegistrationData readInfoBasedOnUsernameAndPasswordAndRole(String userName, String password, String role) {
		List<RegistrationDataEntity>  entities;
		RegistrationData rd;
		
		System.out.println("loginserviceIMPL "+userName+ " *** "+ password);
		
		
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Vector<RegistrationDataEntity> entries = new Vector<RegistrationDataEntity>();
		try {
			
			String query = "select from " + RegistrationDataEntity.class.getName()
			+" where username == '"+userName+"' && password == '"+password+"' && role == '"+role+"'" ;
							
			entities = (List<RegistrationDataEntity>) pm.newQuery(query).execute();
						
			  if(entities.isEmpty()){
				  LOG.log(Level.INFO," entities is empty");
				  return null;
			  }
			  else
			  {
				  rd = new RegistrationData();
				  for (RegistrationDataEntity entity : entities) {
						 
					  rd.setEmail(entity.getEmail());
					  rd.setFirstName(entity.getFirstName());
					  rd.setLastName(entity.getLastName());
					  rd.setPassoword(entity.getPassoword());
					  rd.setRole(entity.getRole());
					  rd.setUsername(entity.getUsername());
					 	  
					 LOG.log(Level.INFO,entity.getEmail() );
					}
				  
				  return rd;
			  }
			
		} finally {
			pm.close();
		}
	}
	
	
	
	
	
////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public LoginData isSessionAlive() {
		LoginData bean = getUserFromSession();
		if ((bean != null) && (bean.getUserName().length() != 0)) {
			System.out.println("User " + bean.getUserName()
					+ " is already logged in");
			return bean;
		}
				
		return null;
	}

	@Override
	public void logout() {
		HttpSession session = getThreadLocalRequest().getSession();
		if (session != null)
			session.invalidate();
	}

	public String getLemail() {
		return lemail;
	}

	public void setLemail(String lemail) {
		this.lemail = lemail;
	}

	 
	
	 
}
