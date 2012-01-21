package com.admintracker.server;

import java.util.List;
import java.util.Vector;

import javax.jdo.PersistenceManager;

import com.admintracker.client.admin.AdminDataService;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.student.StudentData;
import com.admintracker.client.university.RegistararDataService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AdminDataServiceImpl extends RemoteServiceServlet implements
AdminDataService{

	@Override
	public Vector<RegistrationData> getAllUser() throws LoggedInException {
		Vector<RegistrationData> entries = new Vector<RegistrationData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {

			String query = "select from " + RegistrationDataEntity.class.getName();
			List<RegistrationDataEntity> entities = (List<RegistrationDataEntity>) pm
			.newQuery(query).execute();	

			for (RegistrationDataEntity entity : entities) {
				RegistrationData sdd = new RegistrationData();
				
				sdd.setEmail(entity.getEmail());
				sdd.setFirstName(entity.getFirstName());
				sdd.setLastName(entity.getLastName());
				sdd.setPassoword(entity.getPassoword());
				sdd.setRole(entity.getRole());
				sdd.setUsername(entity.getUsername());
				
				entries.add(sdd);
			}
		
		} finally {
			pm.close();
		}

		return entries;
	}

}
