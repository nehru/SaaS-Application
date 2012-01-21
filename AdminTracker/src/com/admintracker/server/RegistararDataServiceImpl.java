package com.admintracker.server;

import java.util.List;
import java.util.Vector;

import javax.jdo.PersistenceManager;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.student.StudentData;
import com.admintracker.client.student.StudentDataService;
import com.admintracker.client.university.RegistararDataService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RegistararDataServiceImpl extends RemoteServiceServlet implements
RegistararDataService{

	
	public Vector<StudentData> getAdminSchool(String code)
			throws LoggedInException {
		Vector<StudentData> entries = new Vector<StudentData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where ucode == '" + code+"'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
			.newQuery(query).execute();
			for (StudentDataEntity entity : entities) {
				StudentData sdd = new StudentData();
				sdd.setAddress(entity.getAddress());
				sdd.setAppliedSchoolName(entity.getAppliedSchoolName());
				sdd.setCity(entity.getCity());
				sdd.setCountry(entity.getCountry());
				sdd.setDepartment(entity.getDepartment());
				sdd.setEmail(entity.getEmail());
				sdd.setFirstName(entity.getFirstName());
				sdd.setLastName(entity.getLastName());
				sdd.setLemail(entity.getLemail());
				sdd.setMajor(entity.getMajor());
				sdd.setMiddleName(entity.getMiddleName());
				sdd.setState(entity.getState());
				sdd.setStudiedSchoolCity(entity.getStudiedSchoolCity());
				sdd.setStudiedSchoolCountry(entity.getStudiedSchoolCountry());
				sdd.setStudiedSchoolName(entity.getStudiedSchoolName());
				sdd.setZip(entity.getZip());
				sdd.setDate(entity.getDate());
				
				sdd.setUcode(entity.getUcode());
				
				entries.add(sdd);
				
			}
			
		} finally {
			pm.close();
		}
		
		return entries;
		 
	}

 

}
