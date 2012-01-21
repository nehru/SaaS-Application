package com.admintracker.server;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.registration.RegistrationService;
import com.admintracker.client.student.StudentData;
import com.admintracker.client.student.StudentDataService;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class StudentDataServiceImpl extends RemoteServiceServlet implements
		StudentDataService {

	private static final Logger LOG = Logger
			.getLogger(StudentDataServiceImpl.class.getName());
////////////////////////////////////////////////////////////////////////	
	
	public  Vector<String> getStarData(StudentData sd)throws LoggedInException {
		
		String ret = null;
		
		Vector<String> entries = new Vector<String>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			String query = "select from " + StudentDataEntity.class.getName()
			+ " where lemail == '" + sd.getEmail()+"'";
			//+ "' && firstName == '" + sd.getFirstName()
			//+ "' && lastName == '" + sd.getLastName()+"'";
			
			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
			.newQuery(query).execute();
			
			for (StudentDataEntity entity : entities) {

				if(entity.getEmail().equals(sd.getEmail()) && entity.getFirstName().equals(sd.getFirstName()) && entity.getLastName().equals(sd.getLastName())){
					
				//	for(int i=0;i<64;i++){ 
						
					if(entity.getComboBox_1_1() != null){
						 if(entity.getComboBox_1_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_1_1());
						 }
					 }
					  if(entity.getComboBox_1_2() != null){
						 if(entity.getComboBox_1_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_2());
						 }
					}
					  if(entity.getComboBox_1_3() != null){
						 if(entity.getComboBox_1_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_3());
						 }
					}
					  if(entity.getComboBox_1_4() != null){
						 if(entity.getComboBox_1_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_4());
						 }
					}
					  if(entity.getComboBox_1_5() != null){
						 if(entity.getComboBox_1_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_5());
						 }
					}
					  if(entity.getComboBox_1_6() != null){
						 if(entity.getComboBox_1_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_6());
						 }
					}
					  if(entity.getComboBox_1_7() != null){
						 if(entity.getComboBox_1_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_7());
						 }
					}
					  if(entity.getComboBox_1_8() != null){
						 if(entity.getComboBox_1_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_1_8());
						 }
					}
					
					//2-1
					if(entity.getComboBox_2_1() != null){
						 if(entity.getComboBox_2_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_2_1());
						 }
					 }
					  if(entity.getComboBox_2_2() != null){
						 if(entity.getComboBox_2_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_2());
						 }
					}
					  if(entity.getComboBox_2_3() != null){
						 if(entity.getComboBox_2_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_3());
						 }
					}
					  if(entity.getComboBox_2_4() != null){
						 if(entity.getComboBox_2_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_4());
						 }
					}
					  if(entity.getComboBox_2_5() != null){
						 if(entity.getComboBox_2_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_5());
						 }
					}
					  if(entity.getComboBox_2_6() != null){
						 if(entity.getComboBox_2_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_6());
						 }
					}
					  if(entity.getComboBox_2_7() != null){
						 if(entity.getComboBox_2_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_7());
						 }
					}
					  if(entity.getComboBox_2_8() != null){
						 if(entity.getComboBox_2_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_2_8());
						 }
					}
					
					//3-1
					if(entity.getComboBox_3_1() != null){
						 if(entity.getComboBox_3_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_3_1());
						 }
					 }
					  if(entity.getComboBox_3_2() != null){
						 if(entity.getComboBox_3_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_2());
						 }
					}
					  if(entity.getComboBox_3_3() != null){
						 if(entity.getComboBox_3_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_3());
						 }
					}
					  if(entity.getComboBox_3_4() != null){
						 if(entity.getComboBox_3_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_4());
						 }
					}
					  if(entity.getComboBox_3_5() != null){
						 if(entity.getComboBox_3_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_5());
						 }
					}
					  if(entity.getComboBox_3_6() != null){
						 if(entity.getComboBox_3_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_6());
						 }
					}
					  if(entity.getComboBox_3_7() != null){
						 if(entity.getComboBox_3_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_7());
						 }
					}
					  if(entity.getComboBox_3_8() != null){
						 if(entity.getComboBox_3_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_3_8());
						 }
					}
					
					//4-1
					if(entity.getComboBox_4_1() != null){
						 if(entity.getComboBox_4_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_4_1());
						 }
					 }
					  if(entity.getComboBox_4_2() != null){
						 if(entity.getComboBox_4_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_2());
						 }
					}
					  if(entity.getComboBox_4_3() != null){
						 if(entity.getComboBox_4_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_3());
						 }
					}
					  if(entity.getComboBox_4_4() != null){
						 if(entity.getComboBox_4_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_4());
						 }
					}
					  if(entity.getComboBox_4_5() != null){
						 if(entity.getComboBox_4_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_5());
						 }
					}
					  if(entity.getComboBox_4_6() != null){
						 if(entity.getComboBox_4_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_6());
						 }
					}
					  if(entity.getComboBox_4_7() != null){
						 if(entity.getComboBox_4_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_7());
						 }
					}
					  if(entity.getComboBox_4_8() != null){
						 if(entity.getComboBox_4_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_4_8());
						 }
					}
					
					//5-1
					if(entity.getComboBox_5_1() != null){
						 if(entity.getComboBox_5_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_5_1());
						 }
					 }
					  if(entity.getComboBox_5_2() != null){
						 if(entity.getComboBox_5_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_2());
						 }
					}
					  if(entity.getComboBox_5_3() != null){
						 if(entity.getComboBox_5_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_3());
						 }
					}
					  if(entity.getComboBox_5_4() != null){
						 if(entity.getComboBox_5_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_4());
						 }
					}
					  if(entity.getComboBox_5_5() != null){
						 if(entity.getComboBox_5_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_5());
						 }
					}
					  if(entity.getComboBox_5_6() != null){
						 if(entity.getComboBox_5_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_6());
						 }
					}
					  if(entity.getComboBox_5_7() != null){
						 if(entity.getComboBox_5_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_7());
						 }
					}
					  if(entity.getComboBox_5_8() != null){
						 if(entity.getComboBox_5_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_5_8());
						 }
					}
					
					//6-1
					if(entity.getComboBox_6_1() != null){
						 if(entity.getComboBox_6_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_6_1());
						 }
					 }
					  if(entity.getComboBox_6_2() != null){
						 if(entity.getComboBox_6_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_2());
						 }
					}
					  if(entity.getComboBox_6_3() != null){
						 if(entity.getComboBox_6_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_3());
						 }
					}
					  if(entity.getComboBox_6_4() != null){
						 if(entity.getComboBox_6_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_4());
						 }
					}
					  if(entity.getComboBox_6_5() != null){
						 if(entity.getComboBox_6_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_5());
						 }
					}
					  if(entity.getComboBox_6_6() != null){
						 if(entity.getComboBox_6_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_6());
						 }
					}
					  if(entity.getComboBox_6_7() != null){
						 if(entity.getComboBox_6_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_7());
						 }
					}
					  if(entity.getComboBox_6_8() != null){
						 if(entity.getComboBox_6_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_6_8());
						 }
					}
					
					//7-1
					if(entity.getComboBox_7_1() != null){
						 if(entity.getComboBox_7_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_7_1());
						 }
					 }
					  if(entity.getComboBox_7_2() != null){
						 if(entity.getComboBox_7_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_2());
						 }
					}
					  if(entity.getComboBox_7_3() != null){
						 if(entity.getComboBox_7_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_3());
						 }
					}
					  if(entity.getComboBox_7_4() != null){
						 if(entity.getComboBox_7_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_4());
						 }
					}
					  if(entity.getComboBox_7_5() != null){
						 if(entity.getComboBox_7_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_5());
						 }
					}
					  if(entity.getComboBox_7_6() != null){
						 if(entity.getComboBox_7_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_6());
						 }
					}
					  if(entity.getComboBox_7_7() != null){
						 if(entity.getComboBox_7_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_7());
						 }
					}
					  if(entity.getComboBox_7_8() != null){
						 if(entity.getComboBox_7_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_7_8());
						 }
					}
					
					//8-1
					if(entity.getComboBox_8_1() != null){
						 if(entity.getComboBox_8_1().indexOf("*") != -1){
						  entries.add(entity.getComboBox_8_1());
						 }
					 }
					  if(entity.getComboBox_8_2() != null){
						 if(entity.getComboBox_8_2().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_2());
						 }
					}
					  if(entity.getComboBox_8_3() != null){
						 if(entity.getComboBox_8_3().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_3());
						 }
					}
					  if(entity.getComboBox_8_4() != null){
						 if(entity.getComboBox_8_4().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_4());
						 }
					}
					  if(entity.getComboBox_8_5() != null){
						 if(entity.getComboBox_8_5().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_5());
						 }
					}
					  if(entity.getComboBox_8_6() != null){
						 if(entity.getComboBox_8_6().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_6());
						 }
					}
					  if(entity.getComboBox_8_7() != null){
						 if(entity.getComboBox_8_7().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_7());
						 }
					}
					  if(entity.getComboBox_8_8() != null){
						 if(entity.getComboBox_8_8().indexOf("*") != -1){
							 entries.add(entity.getComboBox_8_8());
						 }
					}
					
					
					
					
				//	}
					
					
				}
			}
		
		} finally {
			pm.close();
		}
		
		return entries;
	}
	
	
	
	
	
	
////////////////////////////////////////////////////////////////
	@Override
	public  Vector<StudentData> updateData(StudentData sd)
			throws LoggedInException {
		
		String ret = null;
		
		Vector<StudentData> entries = new Vector<StudentData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {

			String query = "select from " + StudentDataEntity.class.getName()
			+ " where lemail == '" + sd.getLemail()
			+ "' && ucode == '" + sd.getUcode()
			+ "' && department == '" + sd.getDepartment()
			+ "' && major == '" + sd.getMajor()+"'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
			.newQuery(query).execute();
			
			for (StudentDataEntity entity : entities) {

				if(entity.getUcode().equals(sd.getUcode()) && entity.getDepartment().equals(sd.getDepartment()) && entity.getMajor().equals(sd.getMajor())){
					
					StudentData sdd = new StudentData();
					
					sdd.setApplicationStatus(entity.getApplicationStatus());
					sdd.setSummary(entity.getSummary());
					
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

					sdd.setComboBox_1_1(entity.getComboBox_1_1());
					sdd.setComboBox_1_2(entity.getComboBox_1_2());
					sdd.setComboBox_1_3(entity.getComboBox_1_3());
					sdd.setComboBox_1_4(entity.getComboBox_1_4());
					sdd.setComboBox_1_5(entity.getComboBox_1_5());
					sdd.setComboBox_1_6(entity.getComboBox_1_6());
					sdd.setComboBox_1_7(entity.getComboBox_1_7());
					sdd.setComboBox_1_8(entity.getComboBox_1_8());
					
					sdd.setComboBox_2_1(entity.getComboBox_2_1());
					sdd.setComboBox_2_2(entity.getComboBox_2_2());
					sdd.setComboBox_2_3(entity.getComboBox_2_3());
					sdd.setComboBox_2_4(entity.getComboBox_2_4());
					sdd.setComboBox_2_5(entity.getComboBox_2_5());
					sdd.setComboBox_2_6(entity.getComboBox_2_6());
					sdd.setComboBox_2_7(entity.getComboBox_2_7());
					sdd.setComboBox_2_8(entity.getComboBox_2_8());
					
					sdd.setComboBox_3_1(entity.getComboBox_3_1());
					sdd.setComboBox_3_2(entity.getComboBox_3_2());
					sdd.setComboBox_3_3(entity.getComboBox_3_3());
					sdd.setComboBox_3_4(entity.getComboBox_3_4());
					sdd.setComboBox_3_5(entity.getComboBox_3_5());
					sdd.setComboBox_3_6(entity.getComboBox_3_6());
					sdd.setComboBox_3_7(entity.getComboBox_3_7());
					sdd.setComboBox_3_8(entity.getComboBox_3_8());
					
					sdd.setComboBox_4_1(entity.getComboBox_4_1());
					sdd.setComboBox_4_2(entity.getComboBox_4_2());
					sdd.setComboBox_4_3(entity.getComboBox_4_3());
					sdd.setComboBox_4_4(entity.getComboBox_4_4());
					sdd.setComboBox_4_5(entity.getComboBox_4_5());
					sdd.setComboBox_4_6(entity.getComboBox_4_6());
					sdd.setComboBox_4_7(entity.getComboBox_4_7());
					sdd.setComboBox_4_8(entity.getComboBox_4_8());
					
					sdd.setComboBox_5_1(entity.getComboBox_5_1());
					sdd.setComboBox_5_2(entity.getComboBox_5_2());
					sdd.setComboBox_5_3(entity.getComboBox_5_3());
					sdd.setComboBox_5_4(entity.getComboBox_5_4());
					sdd.setComboBox_5_5(entity.getComboBox_5_5());
					sdd.setComboBox_5_6(entity.getComboBox_5_6());
					sdd.setComboBox_5_7(entity.getComboBox_5_7());
					sdd.setComboBox_5_8(entity.getComboBox_5_8());
					
					sdd.setComboBox_6_1(entity.getComboBox_6_1());
					sdd.setComboBox_6_2(entity.getComboBox_6_2());
					sdd.setComboBox_6_3(entity.getComboBox_6_3());
					sdd.setComboBox_6_4(entity.getComboBox_6_4());
					sdd.setComboBox_6_5(entity.getComboBox_6_5());
					sdd.setComboBox_6_6(entity.getComboBox_6_6());
					sdd.setComboBox_6_7(entity.getComboBox_6_7());
					sdd.setComboBox_6_8(entity.getComboBox_6_8());
					
					sdd.setComboBox_7_1(entity.getComboBox_7_1());
					sdd.setComboBox_7_2(entity.getComboBox_7_2());
					sdd.setComboBox_7_3(entity.getComboBox_7_3());
					sdd.setComboBox_7_4(entity.getComboBox_7_4());
					sdd.setComboBox_7_5(entity.getComboBox_7_5());
					sdd.setComboBox_7_6(entity.getComboBox_7_6());
					sdd.setComboBox_7_7(entity.getComboBox_7_7());
					sdd.setComboBox_7_8(entity.getComboBox_7_8());
					
					sdd.setComboBox_8_1(entity.getComboBox_8_1());
					sdd.setComboBox_8_2(entity.getComboBox_8_2());
					sdd.setComboBox_8_3(entity.getComboBox_8_3());
					sdd.setComboBox_8_4(entity.getComboBox_8_4());
					sdd.setComboBox_8_5(entity.getComboBox_8_5());
					sdd.setComboBox_8_6(entity.getComboBox_8_6());
					sdd.setComboBox_8_7(entity.getComboBox_8_7());
					sdd.setComboBox_8_8(entity.getComboBox_8_8());
					
					sdd.setTextBox_1_1(entity.getTextBox_1_1());
					sdd.setTextBox_1_2(entity.getTextBox_1_2());
					sdd.setTextBox_1_3(entity.getTextBox_1_3());
					sdd.setTextBox_1_4(entity.getTextBox_1_4());
					sdd.setTextBox_1_5(entity.getTextBox_1_5());
					sdd.setTextBox_1_6(entity.getTextBox_1_6());
					sdd.setTextBox_1_7(entity.getTextBox_1_7());
					sdd.setTextBox_1_8(entity.getTextBox_1_8());
					
					sdd.setTextBox_1_1(entity.getTextBox_1_1());
					sdd.setTextBox_1_2(entity.getTextBox_1_2());
					sdd.setTextBox_1_3(entity.getTextBox_1_3());
					sdd.setTextBox_1_4(entity.getTextBox_1_4());
					sdd.setTextBox_1_5(entity.getTextBox_1_5());
					sdd.setTextBox_1_6(entity.getTextBox_1_6());
					sdd.setTextBox_1_7(entity.getTextBox_1_7());
					sdd.setTextBox_1_8(entity.getTextBox_1_8());
					
					sdd.setTextBox_2_1(entity.getTextBox_2_1());
					sdd.setTextBox_2_2(entity.getTextBox_2_2());
					sdd.setTextBox_2_3(entity.getTextBox_2_3());
					sdd.setTextBox_2_4(entity.getTextBox_2_4());
					sdd.setTextBox_2_5(entity.getTextBox_2_5());
					sdd.setTextBox_2_6(entity.getTextBox_2_6());
					sdd.setTextBox_2_7(entity.getTextBox_2_7());
					sdd.setTextBox_2_8(entity.getTextBox_2_8());
					
					sdd.setTextBox_3_1(entity.getTextBox_3_1());
					sdd.setTextBox_3_2(entity.getTextBox_3_2());
					sdd.setTextBox_3_3(entity.getTextBox_3_3());
					sdd.setTextBox_3_4(entity.getTextBox_3_4());
					sdd.setTextBox_3_5(entity.getTextBox_3_5());
					sdd.setTextBox_3_6(entity.getTextBox_3_6());
					sdd.setTextBox_3_7(entity.getTextBox_3_7());
					sdd.setTextBox_3_8(entity.getTextBox_3_8());
					
					sdd.setTextBox_4_1(entity.getTextBox_4_1());
					sdd.setTextBox_4_2(entity.getTextBox_4_2());
					sdd.setTextBox_4_3(entity.getTextBox_4_3());
					sdd.setTextBox_4_4(entity.getTextBox_4_4());
					sdd.setTextBox_4_5(entity.getTextBox_4_5());
					sdd.setTextBox_4_6(entity.getTextBox_4_6());
					sdd.setTextBox_4_7(entity.getTextBox_4_7());
					sdd.setTextBox_4_8(entity.getTextBox_4_8());
					
					sdd.setTextBox_5_1(entity.getTextBox_5_1());
					sdd.setTextBox_5_2(entity.getTextBox_5_2());
					sdd.setTextBox_5_3(entity.getTextBox_5_3());
					sdd.setTextBox_5_4(entity.getTextBox_5_4());
					sdd.setTextBox_5_5(entity.getTextBox_5_5());
					sdd.setTextBox_5_6(entity.getTextBox_5_6());
					sdd.setTextBox_5_7(entity.getTextBox_5_7());
					sdd.setTextBox_5_8(entity.getTextBox_5_8());
					
					sdd.setTextBox_6_1(entity.getTextBox_6_1());
					sdd.setTextBox_6_2(entity.getTextBox_6_2());
					sdd.setTextBox_6_3(entity.getTextBox_6_3());
					sdd.setTextBox_6_4(entity.getTextBox_6_4());
					sdd.setTextBox_6_5(entity.getTextBox_6_5());
					sdd.setTextBox_6_6(entity.getTextBox_6_6());
					sdd.setTextBox_6_7(entity.getTextBox_6_7());
					sdd.setTextBox_6_8(entity.getTextBox_6_8());
					
					sdd.setTextBox_7_1(entity.getTextBox_7_1());
					sdd.setTextBox_7_2(entity.getTextBox_7_2());
					sdd.setTextBox_7_3(entity.getTextBox_7_3());
					sdd.setTextBox_7_4(entity.getTextBox_7_4());
					sdd.setTextBox_7_5(entity.getTextBox_7_5());
					sdd.setTextBox_7_6(entity.getTextBox_7_6());
					sdd.setTextBox_7_7(entity.getTextBox_7_7());
					sdd.setTextBox_7_8(entity.getTextBox_7_8());
					
					sdd.setTextBox_8_1(entity.getTextBox_8_1());
					sdd.setTextBox_8_2(entity.getTextBox_8_2());
					sdd.setTextBox_8_3(entity.getTextBox_8_3());
					sdd.setTextBox_8_4(entity.getTextBox_8_4());
					sdd.setTextBox_8_5(entity.getTextBox_8_5());
					sdd.setTextBox_8_6(entity.getTextBox_8_6());
					sdd.setTextBox_8_7(entity.getTextBox_8_7());
					sdd.setTextBox_8_8(entity.getTextBox_8_8());
					
					sdd.setTxtComment(entity.getTxtComment());
					sdd.setDateGraduation(entity.getDateGraduation());
					
					entries.add(sdd);
					
				//	pm.deletePersistent(entity);
					ret = "ok";
				}
			}
			
		} finally {
			pm.close();
		}
		
		
		return entries;
	}
	
	////////////////////////////////////////////////////////
	public String deleteData(StudentData sd) throws LoggedInException {
		String ret = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			// check current student data in the store

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where lemail == '" + sd.getLemail()
					+ "' && ucode == '" + sd.getUcode()
					+ "' && department == '" + sd.getDepartment()
					+ "' && major == '" + sd.getMajor()+"'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
			.newQuery(query).execute();
			
			for (StudentDataEntity entity : entities) {

				if(entity.getUcode().equals(sd.getUcode()) && entity.getDepartment().equals(sd.getDepartment()) && entity.getMajor().equals(sd.getMajor())){
					pm.deletePersistent(entity);
					ret = "ok";
				}
			}
			
		} finally {
			pm.close();
		}
		
		return ret;

	}
	
	
	public String addStudentDataCheck(StudentData sd) throws LoggedInException {
		StudentData newsd = sd;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {
			// check current student data in the store

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where lemail == '" + sd.getLemail()
					+ "' && appliedSchoolName == '" + sd.getAppliedSchoolName()
					+ "' && department == '" + sd.getDepartment()
					+ "' && major == '" + sd.getMajor();

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
					.newQuery(query).execute();

			for (StudentDataEntity entity : entities) {

			}

		} finally {
			pm.close();
		}

		return null;
	}

	///////////////////////////////////////////////////////
	public Vector<StudentData> getAllEntries()
	throws LoggedInException {

		Vector<StudentData> entries = new Vector<StudentData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();

try {

	String query = "select from " + StudentDataEntity.class.getName();
			 

	List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
			.newQuery(query).execute();
	for (StudentDataEntity entity : entities) {
		StudentData sdd = new StudentData();
		
		sdd.setApplicationStatus(entity.getApplicationStatus());
		sdd.setSummary(entity.getSummary());
		
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

		sdd.setComboBox_1_1(entity.getComboBox_1_1());
		sdd.setComboBox_1_2(entity.getComboBox_1_2());
		sdd.setComboBox_1_3(entity.getComboBox_1_3());
		sdd.setComboBox_1_4(entity.getComboBox_1_4());
		sdd.setComboBox_1_5(entity.getComboBox_1_5());
		sdd.setComboBox_1_6(entity.getComboBox_1_6());
		sdd.setComboBox_1_7(entity.getComboBox_1_7());
		sdd.setComboBox_1_8(entity.getComboBox_1_8());
		
		sdd.setComboBox_2_1(entity.getComboBox_2_1());
		sdd.setComboBox_2_2(entity.getComboBox_2_2());
		sdd.setComboBox_2_3(entity.getComboBox_2_3());
		sdd.setComboBox_2_4(entity.getComboBox_2_4());
		sdd.setComboBox_2_5(entity.getComboBox_2_5());
		sdd.setComboBox_2_6(entity.getComboBox_2_6());
		sdd.setComboBox_2_7(entity.getComboBox_2_7());
		sdd.setComboBox_2_8(entity.getComboBox_2_8());
		
		sdd.setComboBox_3_1(entity.getComboBox_3_1());
		sdd.setComboBox_3_2(entity.getComboBox_3_2());
		sdd.setComboBox_3_3(entity.getComboBox_3_3());
		sdd.setComboBox_3_4(entity.getComboBox_3_4());
		sdd.setComboBox_3_5(entity.getComboBox_3_5());
		sdd.setComboBox_3_6(entity.getComboBox_3_6());
		sdd.setComboBox_3_7(entity.getComboBox_3_7());
		sdd.setComboBox_3_8(entity.getComboBox_3_8());
		
		sdd.setComboBox_4_1(entity.getComboBox_4_1());
		sdd.setComboBox_4_2(entity.getComboBox_4_2());
		sdd.setComboBox_4_3(entity.getComboBox_4_3());
		sdd.setComboBox_4_4(entity.getComboBox_4_4());
		sdd.setComboBox_4_5(entity.getComboBox_4_5());
		sdd.setComboBox_4_6(entity.getComboBox_4_6());
		sdd.setComboBox_4_7(entity.getComboBox_4_7());
		sdd.setComboBox_4_8(entity.getComboBox_4_8());
		
		sdd.setComboBox_5_1(entity.getComboBox_5_1());
		sdd.setComboBox_5_2(entity.getComboBox_5_2());
		sdd.setComboBox_5_3(entity.getComboBox_5_3());
		sdd.setComboBox_5_4(entity.getComboBox_5_4());
		sdd.setComboBox_5_5(entity.getComboBox_5_5());
		sdd.setComboBox_5_6(entity.getComboBox_5_6());
		sdd.setComboBox_5_7(entity.getComboBox_5_7());
		sdd.setComboBox_5_8(entity.getComboBox_5_8());
		
		sdd.setComboBox_6_1(entity.getComboBox_6_1());
		sdd.setComboBox_6_2(entity.getComboBox_6_2());
		sdd.setComboBox_6_3(entity.getComboBox_6_3());
		sdd.setComboBox_6_4(entity.getComboBox_6_4());
		sdd.setComboBox_6_5(entity.getComboBox_6_5());
		sdd.setComboBox_6_6(entity.getComboBox_6_6());
		sdd.setComboBox_6_7(entity.getComboBox_6_7());
		sdd.setComboBox_6_8(entity.getComboBox_6_8());
		
		sdd.setComboBox_7_1(entity.getComboBox_7_1());
		sdd.setComboBox_7_2(entity.getComboBox_7_2());
		sdd.setComboBox_7_3(entity.getComboBox_7_3());
		sdd.setComboBox_7_4(entity.getComboBox_7_4());
		sdd.setComboBox_7_5(entity.getComboBox_7_5());
		sdd.setComboBox_7_6(entity.getComboBox_7_6());
		sdd.setComboBox_7_7(entity.getComboBox_7_7());
		sdd.setComboBox_7_8(entity.getComboBox_7_8());
		
		sdd.setComboBox_8_1(entity.getComboBox_8_1());
		sdd.setComboBox_8_2(entity.getComboBox_8_2());
		sdd.setComboBox_8_3(entity.getComboBox_8_3());
		sdd.setComboBox_8_4(entity.getComboBox_8_4());
		sdd.setComboBox_8_5(entity.getComboBox_8_5());
		sdd.setComboBox_8_6(entity.getComboBox_8_6());
		sdd.setComboBox_8_7(entity.getComboBox_8_7());
		sdd.setComboBox_8_8(entity.getComboBox_8_8());
		
		sdd.setTextBox_1_1(entity.getTextBox_1_1());
		sdd.setTextBox_1_2(entity.getTextBox_1_2());
		sdd.setTextBox_1_3(entity.getTextBox_1_3());
		sdd.setTextBox_1_4(entity.getTextBox_1_4());
		sdd.setTextBox_1_5(entity.getTextBox_1_5());
		sdd.setTextBox_1_6(entity.getTextBox_1_6());
		sdd.setTextBox_1_7(entity.getTextBox_1_7());
		sdd.setTextBox_1_8(entity.getTextBox_1_8());
		
		sdd.setTextBox_1_1(entity.getTextBox_1_1());
		sdd.setTextBox_1_2(entity.getTextBox_1_2());
		sdd.setTextBox_1_3(entity.getTextBox_1_3());
		sdd.setTextBox_1_4(entity.getTextBox_1_4());
		sdd.setTextBox_1_5(entity.getTextBox_1_5());
		sdd.setTextBox_1_6(entity.getTextBox_1_6());
		sdd.setTextBox_1_7(entity.getTextBox_1_7());
		sdd.setTextBox_1_8(entity.getTextBox_1_8());
		
		sdd.setTextBox_2_1(entity.getTextBox_2_1());
		sdd.setTextBox_2_2(entity.getTextBox_2_2());
		sdd.setTextBox_2_3(entity.getTextBox_2_3());
		sdd.setTextBox_2_4(entity.getTextBox_2_4());
		sdd.setTextBox_2_5(entity.getTextBox_2_5());
		sdd.setTextBox_2_6(entity.getTextBox_2_6());
		sdd.setTextBox_2_7(entity.getTextBox_2_7());
		sdd.setTextBox_2_8(entity.getTextBox_2_8());
		
		sdd.setTextBox_3_1(entity.getTextBox_3_1());
		sdd.setTextBox_3_2(entity.getTextBox_3_2());
		sdd.setTextBox_3_3(entity.getTextBox_3_3());
		sdd.setTextBox_3_4(entity.getTextBox_3_4());
		sdd.setTextBox_3_5(entity.getTextBox_3_5());
		sdd.setTextBox_3_6(entity.getTextBox_3_6());
		sdd.setTextBox_3_7(entity.getTextBox_3_7());
		sdd.setTextBox_3_8(entity.getTextBox_3_8());
		
		sdd.setTextBox_4_1(entity.getTextBox_4_1());
		sdd.setTextBox_4_2(entity.getTextBox_4_2());
		sdd.setTextBox_4_3(entity.getTextBox_4_3());
		sdd.setTextBox_4_4(entity.getTextBox_4_4());
		sdd.setTextBox_4_5(entity.getTextBox_4_5());
		sdd.setTextBox_4_6(entity.getTextBox_4_6());
		sdd.setTextBox_4_7(entity.getTextBox_4_7());
		sdd.setTextBox_4_8(entity.getTextBox_4_8());
		
		sdd.setTextBox_5_1(entity.getTextBox_5_1());
		sdd.setTextBox_5_2(entity.getTextBox_5_2());
		sdd.setTextBox_5_3(entity.getTextBox_5_3());
		sdd.setTextBox_5_4(entity.getTextBox_5_4());
		sdd.setTextBox_5_5(entity.getTextBox_5_5());
		sdd.setTextBox_5_6(entity.getTextBox_5_6());
		sdd.setTextBox_5_7(entity.getTextBox_5_7());
		sdd.setTextBox_5_8(entity.getTextBox_5_8());
		
		sdd.setTextBox_6_1(entity.getTextBox_6_1());
		sdd.setTextBox_6_2(entity.getTextBox_6_2());
		sdd.setTextBox_6_3(entity.getTextBox_6_3());
		sdd.setTextBox_6_4(entity.getTextBox_6_4());
		sdd.setTextBox_6_5(entity.getTextBox_6_5());
		sdd.setTextBox_6_6(entity.getTextBox_6_6());
		sdd.setTextBox_6_7(entity.getTextBox_6_7());
		sdd.setTextBox_6_8(entity.getTextBox_6_8());
		
		sdd.setTextBox_7_1(entity.getTextBox_7_1());
		sdd.setTextBox_7_2(entity.getTextBox_7_2());
		sdd.setTextBox_7_3(entity.getTextBox_7_3());
		sdd.setTextBox_7_4(entity.getTextBox_7_4());
		sdd.setTextBox_7_5(entity.getTextBox_7_5());
		sdd.setTextBox_7_6(entity.getTextBox_7_6());
		sdd.setTextBox_7_7(entity.getTextBox_7_7());
		sdd.setTextBox_7_8(entity.getTextBox_7_8());
		
		sdd.setTextBox_8_1(entity.getTextBox_8_1());
		sdd.setTextBox_8_2(entity.getTextBox_8_2());
		sdd.setTextBox_8_3(entity.getTextBox_8_3());
		sdd.setTextBox_8_4(entity.getTextBox_8_4());
		sdd.setTextBox_8_5(entity.getTextBox_8_5());
		sdd.setTextBox_8_6(entity.getTextBox_8_6());
		sdd.setTextBox_8_7(entity.getTextBox_8_7());
		sdd.setTextBox_8_8(entity.getTextBox_8_8());
		
		
		
		entries.add(sdd);

	}

} finally {
	pm.close();
}

return entries;
}

	
	
	////////////////////////////////////////////////////
	public Vector<StudentData> getEntries(String lemail)
			throws LoggedInException {

		Vector<StudentData> entries = new Vector<StudentData>();
		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where lemail == '" + lemail + "'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
					.newQuery(query).execute();
			for (StudentDataEntity entity : entities) {
				StudentData sdd = new StudentData();
				
				sdd.setApplicationStatus(entity.getApplicationStatus());
				sdd.setSummary(entity.getSummary());
				
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

				sdd.setComboBox_1_1(entity.getComboBox_1_1());
				sdd.setComboBox_1_2(entity.getComboBox_1_2());
				sdd.setComboBox_1_3(entity.getComboBox_1_3());
				sdd.setComboBox_1_4(entity.getComboBox_1_4());
				sdd.setComboBox_1_5(entity.getComboBox_1_5());
				sdd.setComboBox_1_6(entity.getComboBox_1_6());
				sdd.setComboBox_1_7(entity.getComboBox_1_7());
				sdd.setComboBox_1_8(entity.getComboBox_1_8());
				
				sdd.setComboBox_2_1(entity.getComboBox_2_1());
				sdd.setComboBox_2_2(entity.getComboBox_2_2());
				sdd.setComboBox_2_3(entity.getComboBox_2_3());
				sdd.setComboBox_2_4(entity.getComboBox_2_4());
				sdd.setComboBox_2_5(entity.getComboBox_2_5());
				sdd.setComboBox_2_6(entity.getComboBox_2_6());
				sdd.setComboBox_2_7(entity.getComboBox_2_7());
				sdd.setComboBox_2_8(entity.getComboBox_2_8());
				
				sdd.setComboBox_3_1(entity.getComboBox_3_1());
				sdd.setComboBox_3_2(entity.getComboBox_3_2());
				sdd.setComboBox_3_3(entity.getComboBox_3_3());
				sdd.setComboBox_3_4(entity.getComboBox_3_4());
				sdd.setComboBox_3_5(entity.getComboBox_3_5());
				sdd.setComboBox_3_6(entity.getComboBox_3_6());
				sdd.setComboBox_3_7(entity.getComboBox_3_7());
				sdd.setComboBox_3_8(entity.getComboBox_3_8());
				
				sdd.setComboBox_4_1(entity.getComboBox_4_1());
				sdd.setComboBox_4_2(entity.getComboBox_4_2());
				sdd.setComboBox_4_3(entity.getComboBox_4_3());
				sdd.setComboBox_4_4(entity.getComboBox_4_4());
				sdd.setComboBox_4_5(entity.getComboBox_4_5());
				sdd.setComboBox_4_6(entity.getComboBox_4_6());
				sdd.setComboBox_4_7(entity.getComboBox_4_7());
				sdd.setComboBox_4_8(entity.getComboBox_4_8());
				
				sdd.setComboBox_5_1(entity.getComboBox_5_1());
				sdd.setComboBox_5_2(entity.getComboBox_5_2());
				sdd.setComboBox_5_3(entity.getComboBox_5_3());
				sdd.setComboBox_5_4(entity.getComboBox_5_4());
				sdd.setComboBox_5_5(entity.getComboBox_5_5());
				sdd.setComboBox_5_6(entity.getComboBox_5_6());
				sdd.setComboBox_5_7(entity.getComboBox_5_7());
				sdd.setComboBox_5_8(entity.getComboBox_5_8());
				
				sdd.setComboBox_6_1(entity.getComboBox_6_1());
				sdd.setComboBox_6_2(entity.getComboBox_6_2());
				sdd.setComboBox_6_3(entity.getComboBox_6_3());
				sdd.setComboBox_6_4(entity.getComboBox_6_4());
				sdd.setComboBox_6_5(entity.getComboBox_6_5());
				sdd.setComboBox_6_6(entity.getComboBox_6_6());
				sdd.setComboBox_6_7(entity.getComboBox_6_7());
				sdd.setComboBox_6_8(entity.getComboBox_6_8());
				
				sdd.setComboBox_7_1(entity.getComboBox_7_1());
				sdd.setComboBox_7_2(entity.getComboBox_7_2());
				sdd.setComboBox_7_3(entity.getComboBox_7_3());
				sdd.setComboBox_7_4(entity.getComboBox_7_4());
				sdd.setComboBox_7_5(entity.getComboBox_7_5());
				sdd.setComboBox_7_6(entity.getComboBox_7_6());
				sdd.setComboBox_7_7(entity.getComboBox_7_7());
				sdd.setComboBox_7_8(entity.getComboBox_7_8());
				
				sdd.setComboBox_8_1(entity.getComboBox_8_1());
				sdd.setComboBox_8_2(entity.getComboBox_8_2());
				sdd.setComboBox_8_3(entity.getComboBox_8_3());
				sdd.setComboBox_8_4(entity.getComboBox_8_4());
				sdd.setComboBox_8_5(entity.getComboBox_8_5());
				sdd.setComboBox_8_6(entity.getComboBox_8_6());
				sdd.setComboBox_8_7(entity.getComboBox_8_7());
				sdd.setComboBox_8_8(entity.getComboBox_8_8());
				
				sdd.setTextBox_1_1(entity.getTextBox_1_1());
				sdd.setTextBox_1_2(entity.getTextBox_1_2());
				sdd.setTextBox_1_3(entity.getTextBox_1_3());
				sdd.setTextBox_1_4(entity.getTextBox_1_4());
				sdd.setTextBox_1_5(entity.getTextBox_1_5());
				sdd.setTextBox_1_6(entity.getTextBox_1_6());
				sdd.setTextBox_1_7(entity.getTextBox_1_7());
				sdd.setTextBox_1_8(entity.getTextBox_1_8());
				
				sdd.setTextBox_1_1(entity.getTextBox_1_1());
				sdd.setTextBox_1_2(entity.getTextBox_1_2());
				sdd.setTextBox_1_3(entity.getTextBox_1_3());
				sdd.setTextBox_1_4(entity.getTextBox_1_4());
				sdd.setTextBox_1_5(entity.getTextBox_1_5());
				sdd.setTextBox_1_6(entity.getTextBox_1_6());
				sdd.setTextBox_1_7(entity.getTextBox_1_7());
				sdd.setTextBox_1_8(entity.getTextBox_1_8());
				
				sdd.setTextBox_2_1(entity.getTextBox_2_1());
				sdd.setTextBox_2_2(entity.getTextBox_2_2());
				sdd.setTextBox_2_3(entity.getTextBox_2_3());
				sdd.setTextBox_2_4(entity.getTextBox_2_4());
				sdd.setTextBox_2_5(entity.getTextBox_2_5());
				sdd.setTextBox_2_6(entity.getTextBox_2_6());
				sdd.setTextBox_2_7(entity.getTextBox_2_7());
				sdd.setTextBox_2_8(entity.getTextBox_2_8());
				
				sdd.setTextBox_3_1(entity.getTextBox_3_1());
				sdd.setTextBox_3_2(entity.getTextBox_3_2());
				sdd.setTextBox_3_3(entity.getTextBox_3_3());
				sdd.setTextBox_3_4(entity.getTextBox_3_4());
				sdd.setTextBox_3_5(entity.getTextBox_3_5());
				sdd.setTextBox_3_6(entity.getTextBox_3_6());
				sdd.setTextBox_3_7(entity.getTextBox_3_7());
				sdd.setTextBox_3_8(entity.getTextBox_3_8());
				
				sdd.setTextBox_4_1(entity.getTextBox_4_1());
				sdd.setTextBox_4_2(entity.getTextBox_4_2());
				sdd.setTextBox_4_3(entity.getTextBox_4_3());
				sdd.setTextBox_4_4(entity.getTextBox_4_4());
				sdd.setTextBox_4_5(entity.getTextBox_4_5());
				sdd.setTextBox_4_6(entity.getTextBox_4_6());
				sdd.setTextBox_4_7(entity.getTextBox_4_7());
				sdd.setTextBox_4_8(entity.getTextBox_4_8());
				
				sdd.setTextBox_5_1(entity.getTextBox_5_1());
				sdd.setTextBox_5_2(entity.getTextBox_5_2());
				sdd.setTextBox_5_3(entity.getTextBox_5_3());
				sdd.setTextBox_5_4(entity.getTextBox_5_4());
				sdd.setTextBox_5_5(entity.getTextBox_5_5());
				sdd.setTextBox_5_6(entity.getTextBox_5_6());
				sdd.setTextBox_5_7(entity.getTextBox_5_7());
				sdd.setTextBox_5_8(entity.getTextBox_5_8());
				
				sdd.setTextBox_6_1(entity.getTextBox_6_1());
				sdd.setTextBox_6_2(entity.getTextBox_6_2());
				sdd.setTextBox_6_3(entity.getTextBox_6_3());
				sdd.setTextBox_6_4(entity.getTextBox_6_4());
				sdd.setTextBox_6_5(entity.getTextBox_6_5());
				sdd.setTextBox_6_6(entity.getTextBox_6_6());
				sdd.setTextBox_6_7(entity.getTextBox_6_7());
				sdd.setTextBox_6_8(entity.getTextBox_6_8());
				
				sdd.setTextBox_7_1(entity.getTextBox_7_1());
				sdd.setTextBox_7_2(entity.getTextBox_7_2());
				sdd.setTextBox_7_3(entity.getTextBox_7_3());
				sdd.setTextBox_7_4(entity.getTextBox_7_4());
				sdd.setTextBox_7_5(entity.getTextBox_7_5());
				sdd.setTextBox_7_6(entity.getTextBox_7_6());
				sdd.setTextBox_7_7(entity.getTextBox_7_7());
				sdd.setTextBox_7_8(entity.getTextBox_7_8());
				
				sdd.setTextBox_8_1(entity.getTextBox_8_1());
				sdd.setTextBox_8_2(entity.getTextBox_8_2());
				sdd.setTextBox_8_3(entity.getTextBox_8_3());
				sdd.setTextBox_8_4(entity.getTextBox_8_4());
				sdd.setTextBox_8_5(entity.getTextBox_8_5());
				sdd.setTextBox_8_6(entity.getTextBox_8_6());
				sdd.setTextBox_8_7(entity.getTextBox_8_7());
				sdd.setTextBox_8_8(entity.getTextBox_8_8());
				
				
				
				entries.add(sdd);

			}

		} finally {
			pm.close();
		}

		return entries;
	}

	//////////////////////////////////////////////////////////////////////
	
	@Override
	public String addStudentData(StudentData old,StudentData sd) throws LoggedInException {   //deb
		String ret = null;
		boolean found = false;
		StudentDataEntity ety = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		//remove old student data before change
		if(old != null){
		
			deleteData(old);
		}
		
		try {

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where lemail == '" + sd.getLemail() + "' && ucode == '"
					+ sd.getUcode() + "' && department == '"
					+ sd.getDepartment() + "' && major == '" + sd.getMajor()
					+ "'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
					.newQuery(query).execute();

			for (StudentDataEntity entity : entities) {
				if (entity != null) {
					//found = true;
					ety = entity;
					
					if((entity.getUcode().equals(sd.getUcode()))
						&& (entity.getDepartment().equals(sd.getDepartment()))
						&& (entity.getMajor().equals(sd.getMajor()))
						&& (entity.getFirstName().equals(sd.getFirstName()))
						&& (entity.getMiddleName().equals(sd.getMiddleName()))
						&& (entity.getLastName().equals(sd.getLastName()))
						&& (entity.getAddress().equals(sd.getAddress()))
						&& (entity.getCity().equals(sd.getCity()))
						&& (entity.getState().equals(sd.getState()))
						&& (entity.getZip().equals(sd.getZip()))
						&& (entity.getCountry().equals(sd.getCountry()))
						&& (entity.getEmail().equals(sd.getEmail()))
						&& (entity.getStudiedSchoolName().equals(sd.getStudiedSchoolName()))
						&& (entity.getStudiedSchoolCity().equals(sd.getStudiedSchoolCity()))
						&& (entity.getStudiedSchoolCountry().equals(sd.getStudiedSchoolCountry()))
						
						&& (entity.getComboBox_1_1().equals(sd.getComboBox_1_1()))
						&& (entity.getComboBox_1_2().equals(sd.getComboBox_1_2()))
						&& (entity.getComboBox_1_3().equals(sd.getComboBox_1_3()))
						&& (entity.getComboBox_1_4().equals(sd.getComboBox_1_4()))
						&& (entity.getComboBox_1_5().equals(sd.getComboBox_1_5()))
						&& (entity.getComboBox_1_6().equals(sd.getComboBox_1_6()))
						&& (entity.getComboBox_1_7().equals(sd.getComboBox_1_7()))
						&& (entity.getComboBox_1_8().equals(sd.getComboBox_1_8()))
						
						&& (entity.getComboBox_2_1().equals(sd.getComboBox_2_1()))
						&& (entity.getComboBox_2_2().equals(sd.getComboBox_2_2()))
						&& (entity.getComboBox_2_3().equals(sd.getComboBox_2_3()))
						&& (entity.getComboBox_2_4().equals(sd.getComboBox_2_4()))
						&& (entity.getComboBox_2_5().equals(sd.getComboBox_2_5()))
						&& (entity.getComboBox_2_6().equals(sd.getComboBox_2_6()))
						&& (entity.getComboBox_2_7().equals(sd.getComboBox_2_7()))
						&& (entity.getComboBox_2_8().equals(sd.getComboBox_2_8()))
						
						&& (entity.getComboBox_3_1().equals(sd.getComboBox_3_1()))
						&& (entity.getComboBox_3_2().equals(sd.getComboBox_3_2()))
						&& (entity.getComboBox_3_3().equals(sd.getComboBox_3_3()))
						&& (entity.getComboBox_3_4().equals(sd.getComboBox_3_4()))
						&& (entity.getComboBox_3_5().equals(sd.getComboBox_3_5()))
						&& (entity.getComboBox_3_6().equals(sd.getComboBox_3_6()))
						&& (entity.getComboBox_3_7().equals(sd.getComboBox_3_7()))
						&& (entity.getComboBox_3_8().equals(sd.getComboBox_3_8()))
						
						&& (entity.getComboBox_4_1().equals(sd.getComboBox_4_1()))
						&& (entity.getComboBox_4_2().equals(sd.getComboBox_4_2()))
						&& (entity.getComboBox_4_3().equals(sd.getComboBox_4_3()))
						&& (entity.getComboBox_4_4().equals(sd.getComboBox_4_4()))
						&& (entity.getComboBox_4_5().equals(sd.getComboBox_4_5()))
						&& (entity.getComboBox_4_6().equals(sd.getComboBox_4_6()))
						&& (entity.getComboBox_4_7().equals(sd.getComboBox_4_7()))
						&& (entity.getComboBox_4_8().equals(sd.getComboBox_4_8()))
						
						&& (entity.getComboBox_5_1().equals(sd.getComboBox_5_1()))
						&& (entity.getComboBox_5_2().equals(sd.getComboBox_5_2()))
						&& (entity.getComboBox_5_3().equals(sd.getComboBox_5_3()))
						&& (entity.getComboBox_5_4().equals(sd.getComboBox_5_4()))
						&& (entity.getComboBox_5_5().equals(sd.getComboBox_5_5()))
						&& (entity.getComboBox_5_6().equals(sd.getComboBox_5_6()))
						&& (entity.getComboBox_5_7().equals(sd.getComboBox_5_7()))
						&& (entity.getComboBox_5_8().equals(sd.getComboBox_5_8()))
						
						&& (entity.getComboBox_6_1().equals(sd.getComboBox_6_1()))
						&& (entity.getComboBox_6_2().equals(sd.getComboBox_6_2()))
						&& (entity.getComboBox_6_3().equals(sd.getComboBox_6_3()))
						&& (entity.getComboBox_6_4().equals(sd.getComboBox_6_4()))
						&& (entity.getComboBox_6_5().equals(sd.getComboBox_6_5()))
						&& (entity.getComboBox_6_6().equals(sd.getComboBox_6_6()))
						&& (entity.getComboBox_6_7().equals(sd.getComboBox_6_7()))
						&& (entity.getComboBox_6_8().equals(sd.getComboBox_6_8()))
						
						&& (entity.getComboBox_7_1().equals(sd.getComboBox_7_1()))
						&& (entity.getComboBox_7_2().equals(sd.getComboBox_7_2()))
						&& (entity.getComboBox_7_3().equals(sd.getComboBox_7_3()))
						&& (entity.getComboBox_7_4().equals(sd.getComboBox_7_4()))
						&& (entity.getComboBox_7_5().equals(sd.getComboBox_7_5()))
						&& (entity.getComboBox_7_6().equals(sd.getComboBox_7_6()))
						&& (entity.getComboBox_7_7().equals(sd.getComboBox_7_7()))
						&& (entity.getComboBox_7_8().equals(sd.getComboBox_7_8()))
						
						&& (entity.getComboBox_8_1().equals(sd.getComboBox_8_1()))
						&& (entity.getComboBox_8_2().equals(sd.getComboBox_8_2()))
						&& (entity.getComboBox_8_3().equals(sd.getComboBox_8_3()))
						&& (entity.getComboBox_8_4().equals(sd.getComboBox_8_4()))
						&& (entity.getComboBox_8_5().equals(sd.getComboBox_8_5()))
						&& (entity.getComboBox_8_6().equals(sd.getComboBox_8_6()))
						&& (entity.getComboBox_8_7().equals(sd.getComboBox_8_7()))
						&& (entity.getComboBox_8_8().equals(sd.getComboBox_8_8()))
						
						&& (entity.getTextBox_1_1().equals(sd.getTextBox_1_1()))
						&& (entity.getTextBox_1_2().equals(sd.getTextBox_1_2()))
						&& (entity.getTextBox_1_3().equals(sd.getTextBox_1_3()))
						&& (entity.getTextBox_1_4().equals(sd.getTextBox_1_4()))
						&& (entity.getTextBox_1_5().equals(sd.getTextBox_1_5()))
						&& (entity.getTextBox_1_6().equals(sd.getTextBox_1_6()))
						&& (entity.getTextBox_1_7().equals(sd.getTextBox_1_7()))
						&& (entity.getTextBox_1_8().equals(sd.getTextBox_1_8()))
						
						&& (entity.getTextBox_2_1().equals(sd.getTextBox_2_1()))
						&& (entity.getTextBox_2_2().equals(sd.getTextBox_2_2()))
						&& (entity.getTextBox_2_3().equals(sd.getTextBox_2_3()))
						&& (entity.getTextBox_2_4().equals(sd.getTextBox_2_4()))
						&& (entity.getTextBox_2_5().equals(sd.getTextBox_2_5()))
						&& (entity.getTextBox_2_6().equals(sd.getTextBox_2_6()))
						&& (entity.getTextBox_2_7().equals(sd.getTextBox_2_7()))
						&& (entity.getTextBox_2_8().equals(sd.getTextBox_2_8()))
						
						&& (entity.getTextBox_3_1().equals(sd.getTextBox_3_1()))
						&& (entity.getTextBox_3_2().equals(sd.getTextBox_3_2()))
						&& (entity.getTextBox_3_3().equals(sd.getTextBox_3_3()))
						&& (entity.getTextBox_3_4().equals(sd.getTextBox_3_4()))
						&& (entity.getTextBox_3_5().equals(sd.getTextBox_3_5()))
						&& (entity.getTextBox_3_6().equals(sd.getTextBox_3_6()))
						&& (entity.getTextBox_3_7().equals(sd.getTextBox_3_7()))
						&& (entity.getTextBox_3_8().equals(sd.getTextBox_3_8()))
						
						&& (entity.getTextBox_4_1().equals(sd.getTextBox_4_1()))
						&& (entity.getTextBox_4_2().equals(sd.getTextBox_4_2()))
						&& (entity.getTextBox_4_3().equals(sd.getTextBox_4_3()))
						&& (entity.getTextBox_4_4().equals(sd.getTextBox_4_4()))
						&& (entity.getTextBox_4_5().equals(sd.getTextBox_4_5()))
						&& (entity.getTextBox_4_6().equals(sd.getTextBox_4_6()))
						&& (entity.getTextBox_4_7().equals(sd.getTextBox_4_7()))
						&& (entity.getTextBox_4_8().equals(sd.getTextBox_4_8()))
						
						&& (entity.getTextBox_5_1().equals(sd.getTextBox_5_1()))
						&& (entity.getTextBox_5_2().equals(sd.getTextBox_5_2()))
						&& (entity.getTextBox_5_3().equals(sd.getTextBox_5_3()))
						&& (entity.getTextBox_5_4().equals(sd.getTextBox_5_4()))
						&& (entity.getTextBox_5_5().equals(sd.getTextBox_5_5()))
						&& (entity.getTextBox_5_6().equals(sd.getTextBox_5_6()))
						&& (entity.getTextBox_5_7().equals(sd.getTextBox_5_7()))
						&& (entity.getTextBox_5_8().equals(sd.getTextBox_5_8()))
						
						&& (entity.getTextBox_6_1().equals(sd.getTextBox_6_1()))
						&& (entity.getTextBox_6_2().equals(sd.getTextBox_6_2()))
						&& (entity.getTextBox_6_3().equals(sd.getTextBox_6_3()))
						&& (entity.getTextBox_6_4().equals(sd.getTextBox_6_4()))
						&& (entity.getTextBox_6_5().equals(sd.getTextBox_6_5()))
						&& (entity.getTextBox_6_6().equals(sd.getTextBox_6_6()))
						&& (entity.getTextBox_6_7().equals(sd.getTextBox_6_7()))
						&& (entity.getTextBox_6_8().equals(sd.getTextBox_6_8()))
						
						&& (entity.getTextBox_7_1().equals(sd.getTextBox_7_1()))
						&& (entity.getTextBox_7_2().equals(sd.getTextBox_7_2()))
						&& (entity.getTextBox_7_3().equals(sd.getTextBox_7_3()))
						&& (entity.getTextBox_7_4().equals(sd.getTextBox_7_4()))
						&& (entity.getTextBox_7_5().equals(sd.getTextBox_7_5()))
						&& (entity.getTextBox_7_6().equals(sd.getTextBox_7_6()))
						&& (entity.getTextBox_7_7().equals(sd.getTextBox_7_7()))
						&& (entity.getTextBox_7_8().equals(sd.getTextBox_7_8()))
						
						&& (entity.getTextBox_8_1().equals(sd.getTextBox_8_1()))
						&& (entity.getTextBox_8_2().equals(sd.getTextBox_8_2()))
						&& (entity.getTextBox_8_3().equals(sd.getTextBox_8_3()))
						&& (entity.getTextBox_8_4().equals(sd.getTextBox_8_4()))
						&& (entity.getTextBox_8_5().equals(sd.getTextBox_8_5()))
						&& (entity.getTextBox_8_6().equals(sd.getTextBox_8_6()))
						&& (entity.getTextBox_8_7().equals(sd.getTextBox_8_7()))
						&& (entity.getTextBox_8_8().equals(sd.getTextBox_8_8()))
						&& (entity.getTxtComment().equals(sd.getTxtComment()))
						&& (entity.getDateGraduation().equals(sd.getDateGraduation()))
						
					)
									
					{
						found = true;
						ret = "found";
						break;
					}
					
					
					
					
				} else {
					found = false;
					 
					//pm.deletePersistent(entity);
				}
			}
		} finally {
			if (found == false) {
								
				pm.makePersistent(makeStudentDataEntity(sd));
				ret = "ok";
			}
			pm.close();
		}
		LOG.log(Level.INFO, " student entries added.");

		return ret;

	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////
	@Override
	public String addStudentData(StudentData sd) throws LoggedInException {   //deb
		String ret = null;
		boolean found = false;
		StudentDataEntity ety = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		

		try {

			String query = "select from " + StudentDataEntity.class.getName()
					+ " where lemail == '" + sd.getLemail() + "' && ucode == '"
					+ sd.getUcode() + "' && department == '"
					+ sd.getDepartment() + "' && major == '" + sd.getMajor()
					+ "'";

			List<StudentDataEntity> entities = (List<StudentDataEntity>) pm
					.newQuery(query).execute();

			for (StudentDataEntity entity : entities) {
				if (entity != null) {
					//found = true;
					ety = entity;
					
					if((entity.getUcode().equals(sd.getUcode()))
						&& (entity.getDepartment().equals(sd.getDepartment()))
						&& (entity.getMajor().equals(sd.getMajor()))
						&& (entity.getFirstName().equals(sd.getFirstName()))
						&& (entity.getMiddleName().equals(sd.getMiddleName()))
						&& (entity.getLastName().equals(sd.getLastName()))
						&& (entity.getAddress().equals(sd.getAddress()))
						&& (entity.getCity().equals(sd.getCity()))
						&& (entity.getState().equals(sd.getState()))
						&& (entity.getZip().equals(sd.getZip()))
						&& (entity.getCountry().equals(sd.getCountry()))
						&& (entity.getEmail().equals(sd.getEmail()))
						&& (entity.getStudiedSchoolName().equals(sd.getStudiedSchoolName()))
						&& (entity.getStudiedSchoolCity().equals(sd.getStudiedSchoolCity()))
						&& (entity.getStudiedSchoolCountry().equals(sd.getStudiedSchoolCountry()))
						
						&& (entity.getComboBox_1_1().equals(sd.getComboBox_1_1()))
						&& (entity.getComboBox_1_2().equals(sd.getComboBox_1_2()))
						&& (entity.getComboBox_1_3().equals(sd.getComboBox_1_3()))
						&& (entity.getComboBox_1_4().equals(sd.getComboBox_1_4()))
						&& (entity.getComboBox_1_5().equals(sd.getComboBox_1_5()))
						&& (entity.getComboBox_1_6().equals(sd.getComboBox_1_6()))
						&& (entity.getComboBox_1_7().equals(sd.getComboBox_1_7()))
						&& (entity.getComboBox_1_8().equals(sd.getComboBox_1_8()))
						
						&& (entity.getComboBox_2_1().equals(sd.getComboBox_2_1()))
						&& (entity.getComboBox_2_2().equals(sd.getComboBox_2_2()))
						&& (entity.getComboBox_2_3().equals(sd.getComboBox_2_3()))
						&& (entity.getComboBox_2_4().equals(sd.getComboBox_2_4()))
						&& (entity.getComboBox_2_5().equals(sd.getComboBox_2_5()))
						&& (entity.getComboBox_2_6().equals(sd.getComboBox_2_6()))
						&& (entity.getComboBox_2_7().equals(sd.getComboBox_2_7()))
						&& (entity.getComboBox_2_8().equals(sd.getComboBox_2_8()))
						
						&& (entity.getComboBox_3_1().equals(sd.getComboBox_3_1()))
						&& (entity.getComboBox_3_2().equals(sd.getComboBox_3_2()))
						&& (entity.getComboBox_3_3().equals(sd.getComboBox_3_3()))
						&& (entity.getComboBox_3_4().equals(sd.getComboBox_3_4()))
						&& (entity.getComboBox_3_5().equals(sd.getComboBox_3_5()))
						&& (entity.getComboBox_3_6().equals(sd.getComboBox_3_6()))
						&& (entity.getComboBox_3_7().equals(sd.getComboBox_3_7()))
						&& (entity.getComboBox_3_8().equals(sd.getComboBox_3_8()))
						
						&& (entity.getComboBox_4_1().equals(sd.getComboBox_4_1()))
						&& (entity.getComboBox_4_2().equals(sd.getComboBox_4_2()))
						&& (entity.getComboBox_4_3().equals(sd.getComboBox_4_3()))
						&& (entity.getComboBox_4_4().equals(sd.getComboBox_4_4()))
						&& (entity.getComboBox_4_5().equals(sd.getComboBox_4_5()))
						&& (entity.getComboBox_4_6().equals(sd.getComboBox_4_6()))
						&& (entity.getComboBox_4_7().equals(sd.getComboBox_4_7()))
						&& (entity.getComboBox_4_8().equals(sd.getComboBox_4_8()))
						
						&& (entity.getComboBox_5_1().equals(sd.getComboBox_5_1()))
						&& (entity.getComboBox_5_2().equals(sd.getComboBox_5_2()))
						&& (entity.getComboBox_5_3().equals(sd.getComboBox_5_3()))
						&& (entity.getComboBox_5_4().equals(sd.getComboBox_5_4()))
						&& (entity.getComboBox_5_5().equals(sd.getComboBox_5_5()))
						&& (entity.getComboBox_5_6().equals(sd.getComboBox_5_6()))
						&& (entity.getComboBox_5_7().equals(sd.getComboBox_5_7()))
						&& (entity.getComboBox_5_8().equals(sd.getComboBox_5_8()))
						
						&& (entity.getComboBox_6_1().equals(sd.getComboBox_6_1()))
						&& (entity.getComboBox_6_2().equals(sd.getComboBox_6_2()))
						&& (entity.getComboBox_6_3().equals(sd.getComboBox_6_3()))
						&& (entity.getComboBox_6_4().equals(sd.getComboBox_6_4()))
						&& (entity.getComboBox_6_5().equals(sd.getComboBox_6_5()))
						&& (entity.getComboBox_6_6().equals(sd.getComboBox_6_6()))
						&& (entity.getComboBox_6_7().equals(sd.getComboBox_6_7()))
						&& (entity.getComboBox_6_8().equals(sd.getComboBox_6_8()))
						
						&& (entity.getComboBox_7_1().equals(sd.getComboBox_7_1()))
						&& (entity.getComboBox_7_2().equals(sd.getComboBox_7_2()))
						&& (entity.getComboBox_7_3().equals(sd.getComboBox_7_3()))
						&& (entity.getComboBox_7_4().equals(sd.getComboBox_7_4()))
						&& (entity.getComboBox_7_5().equals(sd.getComboBox_7_5()))
						&& (entity.getComboBox_7_6().equals(sd.getComboBox_7_6()))
						&& (entity.getComboBox_7_7().equals(sd.getComboBox_7_7()))
						&& (entity.getComboBox_7_8().equals(sd.getComboBox_7_8()))
						
						&& (entity.getComboBox_8_1().equals(sd.getComboBox_8_1()))
						&& (entity.getComboBox_8_2().equals(sd.getComboBox_8_2()))
						&& (entity.getComboBox_8_3().equals(sd.getComboBox_8_3()))
						&& (entity.getComboBox_8_4().equals(sd.getComboBox_8_4()))
						&& (entity.getComboBox_8_5().equals(sd.getComboBox_8_5()))
						&& (entity.getComboBox_8_6().equals(sd.getComboBox_8_6()))
						&& (entity.getComboBox_8_7().equals(sd.getComboBox_8_7()))
						&& (entity.getComboBox_8_8().equals(sd.getComboBox_8_8()))
						
						&& (entity.getTextBox_1_1().equals(sd.getTextBox_1_1()))
						&& (entity.getTextBox_1_2().equals(sd.getTextBox_1_2()))
						&& (entity.getTextBox_1_3().equals(sd.getTextBox_1_3()))
						&& (entity.getTextBox_1_4().equals(sd.getTextBox_1_4()))
						&& (entity.getTextBox_1_5().equals(sd.getTextBox_1_5()))
						&& (entity.getTextBox_1_6().equals(sd.getTextBox_1_6()))
						&& (entity.getTextBox_1_7().equals(sd.getTextBox_1_7()))
						&& (entity.getTextBox_1_8().equals(sd.getTextBox_1_8()))
						
						&& (entity.getTextBox_2_1().equals(sd.getTextBox_2_1()))
						&& (entity.getTextBox_2_2().equals(sd.getTextBox_2_2()))
						&& (entity.getTextBox_2_3().equals(sd.getTextBox_2_3()))
						&& (entity.getTextBox_2_4().equals(sd.getTextBox_2_4()))
						&& (entity.getTextBox_2_5().equals(sd.getTextBox_2_5()))
						&& (entity.getTextBox_2_6().equals(sd.getTextBox_2_6()))
						&& (entity.getTextBox_2_7().equals(sd.getTextBox_2_7()))
						&& (entity.getTextBox_2_8().equals(sd.getTextBox_2_8()))
						
						&& (entity.getTextBox_3_1().equals(sd.getTextBox_3_1()))
						&& (entity.getTextBox_3_2().equals(sd.getTextBox_3_2()))
						&& (entity.getTextBox_3_3().equals(sd.getTextBox_3_3()))
						&& (entity.getTextBox_3_4().equals(sd.getTextBox_3_4()))
						&& (entity.getTextBox_3_5().equals(sd.getTextBox_3_5()))
						&& (entity.getTextBox_3_6().equals(sd.getTextBox_3_6()))
						&& (entity.getTextBox_3_7().equals(sd.getTextBox_3_7()))
						&& (entity.getTextBox_3_8().equals(sd.getTextBox_3_8()))
						
						&& (entity.getTextBox_4_1().equals(sd.getTextBox_4_1()))
						&& (entity.getTextBox_4_2().equals(sd.getTextBox_4_2()))
						&& (entity.getTextBox_4_3().equals(sd.getTextBox_4_3()))
						&& (entity.getTextBox_4_4().equals(sd.getTextBox_4_4()))
						&& (entity.getTextBox_4_5().equals(sd.getTextBox_4_5()))
						&& (entity.getTextBox_4_6().equals(sd.getTextBox_4_6()))
						&& (entity.getTextBox_4_7().equals(sd.getTextBox_4_7()))
						&& (entity.getTextBox_4_8().equals(sd.getTextBox_4_8()))
						
						&& (entity.getTextBox_5_1().equals(sd.getTextBox_5_1()))
						&& (entity.getTextBox_5_2().equals(sd.getTextBox_5_2()))
						&& (entity.getTextBox_5_3().equals(sd.getTextBox_5_3()))
						&& (entity.getTextBox_5_4().equals(sd.getTextBox_5_4()))
						&& (entity.getTextBox_5_5().equals(sd.getTextBox_5_5()))
						&& (entity.getTextBox_5_6().equals(sd.getTextBox_5_6()))
						&& (entity.getTextBox_5_7().equals(sd.getTextBox_5_7()))
						&& (entity.getTextBox_5_8().equals(sd.getTextBox_5_8()))
						
						&& (entity.getTextBox_6_1().equals(sd.getTextBox_6_1()))
						&& (entity.getTextBox_6_2().equals(sd.getTextBox_6_2()))
						&& (entity.getTextBox_6_3().equals(sd.getTextBox_6_3()))
						&& (entity.getTextBox_6_4().equals(sd.getTextBox_6_4()))
						&& (entity.getTextBox_6_5().equals(sd.getTextBox_6_5()))
						&& (entity.getTextBox_6_6().equals(sd.getTextBox_6_6()))
						&& (entity.getTextBox_6_7().equals(sd.getTextBox_6_7()))
						&& (entity.getTextBox_6_8().equals(sd.getTextBox_6_8()))
						
						&& (entity.getTextBox_7_1().equals(sd.getTextBox_7_1()))
						&& (entity.getTextBox_7_2().equals(sd.getTextBox_7_2()))
						&& (entity.getTextBox_7_3().equals(sd.getTextBox_7_3()))
						&& (entity.getTextBox_7_4().equals(sd.getTextBox_7_4()))
						&& (entity.getTextBox_7_5().equals(sd.getTextBox_7_5()))
						&& (entity.getTextBox_7_6().equals(sd.getTextBox_7_6()))
						&& (entity.getTextBox_7_7().equals(sd.getTextBox_7_7()))
						&& (entity.getTextBox_7_8().equals(sd.getTextBox_7_8()))
						
						&& (entity.getTextBox_8_1().equals(sd.getTextBox_8_1()))
						&& (entity.getTextBox_8_2().equals(sd.getTextBox_8_2()))
						&& (entity.getTextBox_8_3().equals(sd.getTextBox_8_3()))
						&& (entity.getTextBox_8_4().equals(sd.getTextBox_8_4()))
						&& (entity.getTextBox_8_5().equals(sd.getTextBox_8_5()))
						&& (entity.getTextBox_8_6().equals(sd.getTextBox_8_6()))
						&& (entity.getTextBox_8_7().equals(sd.getTextBox_8_7()))
						&& (entity.getTextBox_8_8().equals(sd.getTextBox_8_8()))
						
					)
									
					{
						found = true;
						ret = "found";
						break;
					}
					
					
					
					
				} else {
					found = false;
					 
					//pm.deletePersistent(entity);
				}
			}
		} finally {
			if (found == false) {
								
				pm.makePersistent(makeStudentDataEntity(sd));
				ret = "ok";
			}
			pm.close();
		}
		LOG.log(Level.INFO, " student entries added.");

		return ret;

	}

	private StudentDataEntity makeStudentDataEntity(StudentData sd) {

		StudentDataEntity sde = new StudentDataEntity();
		
		sde.setApplicationStatus(sd.getApplicationStatus());
		sde.setSummary(sd.getSummary());
		
		sde.setLemail(sd.getLemail());
		sde.setAppliedSchoolName(sd.getAppliedSchoolName());
		sde.setDepartment(sd.getDepartment());
		sde.setMajor(sd.getMajor());
		sde.setFirstName(sd.getFirstName());
		sde.setMiddleName(sd.getMiddleName());
		sde.setLastName(sd.getLastName());
		sde.setAddress(sd.getAddress());
		sde.setCity(sd.getCity());
		sde.setState(sd.getState());
		sde.setZip(sd.getZip());
		sde.setCountry(sd.getCountry());
		sde.setEmail(sd.getEmail());
		
		sde.setStudiedSchoolName(sd.getStudiedSchoolName());
		sde.setStudiedSchoolCity(sd.getStudiedSchoolCity());
		sde.setStudiedSchoolCountry(sd.getStudiedSchoolCountry());
		sde.setUcode(sd.getUcode());

		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		sde.setDate(reportDate);

		sde.setComboBox_1_1(sd.getComboBox_1_1());
		sde.setComboBox_1_2(sd.getComboBox_1_2());
		sde.setComboBox_1_3(sd.getComboBox_1_3());
		sde.setComboBox_1_4(sd.getComboBox_1_4());
		sde.setComboBox_1_5(sd.getComboBox_1_5());
		sde.setComboBox_1_6(sd.getComboBox_1_6());
		sde.setComboBox_1_7(sd.getComboBox_1_7());
		sde.setComboBox_1_8(sd.getComboBox_1_8());
		
		sde.setComboBox_2_1(sd.getComboBox_2_1());
		sde.setComboBox_2_2(sd.getComboBox_2_2());
		sde.setComboBox_2_3(sd.getComboBox_2_3());
		sde.setComboBox_2_4(sd.getComboBox_2_4());
		sde.setComboBox_2_5(sd.getComboBox_2_5());
		sde.setComboBox_2_6(sd.getComboBox_2_6());
		sde.setComboBox_2_7(sd.getComboBox_2_7());
		sde.setComboBox_2_8(sd.getComboBox_2_8());
		
		sde.setComboBox_3_1(sd.getComboBox_3_1());
		sde.setComboBox_3_2(sd.getComboBox_3_2());
		sde.setComboBox_3_3(sd.getComboBox_3_3());
		sde.setComboBox_3_4(sd.getComboBox_3_4());
		sde.setComboBox_3_5(sd.getComboBox_3_5());
		sde.setComboBox_3_6(sd.getComboBox_3_6());
		sde.setComboBox_3_7(sd.getComboBox_3_7());
		sde.setComboBox_3_8(sd.getComboBox_3_8());
		
		sde.setComboBox_4_1(sd.getComboBox_4_1());
		sde.setComboBox_4_2(sd.getComboBox_4_2());
		sde.setComboBox_4_3(sd.getComboBox_4_3());
		sde.setComboBox_4_4(sd.getComboBox_4_4());
		sde.setComboBox_4_5(sd.getComboBox_4_5());
		sde.setComboBox_4_6(sd.getComboBox_4_6());
		sde.setComboBox_4_7(sd.getComboBox_4_7());
		sde.setComboBox_4_8(sd.getComboBox_4_8());
		
		sde.setComboBox_5_1(sd.getComboBox_5_1());
		sde.setComboBox_5_2(sd.getComboBox_5_2());
		sde.setComboBox_5_3(sd.getComboBox_5_3());
		sde.setComboBox_5_4(sd.getComboBox_5_4());
		sde.setComboBox_5_5(sd.getComboBox_5_5());
		sde.setComboBox_5_6(sd.getComboBox_5_6());
		sde.setComboBox_5_7(sd.getComboBox_5_7());
		sde.setComboBox_5_8(sd.getComboBox_5_8());
		
		sde.setComboBox_6_1(sd.getComboBox_6_1());
		sde.setComboBox_6_2(sd.getComboBox_6_2());
		sde.setComboBox_6_3(sd.getComboBox_6_3());
		sde.setComboBox_6_4(sd.getComboBox_6_4());
		sde.setComboBox_6_5(sd.getComboBox_6_5());
		sde.setComboBox_6_6(sd.getComboBox_6_6());
		sde.setComboBox_6_7(sd.getComboBox_6_7());
		sde.setComboBox_6_8(sd.getComboBox_6_8());
		
		sde.setComboBox_7_1(sd.getComboBox_7_1());
		sde.setComboBox_7_2(sd.getComboBox_7_2());
		sde.setComboBox_7_3(sd.getComboBox_7_3());
		sde.setComboBox_7_4(sd.getComboBox_7_4());
		sde.setComboBox_7_5(sd.getComboBox_7_5());
		sde.setComboBox_7_6(sd.getComboBox_7_6());
		sde.setComboBox_7_7(sd.getComboBox_7_7());
		sde.setComboBox_7_8(sd.getComboBox_7_8());
		
		sde.setComboBox_8_1(sd.getComboBox_8_1());
		sde.setComboBox_8_2(sd.getComboBox_8_2());
		sde.setComboBox_8_3(sd.getComboBox_8_3());
		sde.setComboBox_8_4(sd.getComboBox_8_4());
		sde.setComboBox_8_5(sd.getComboBox_8_5());
		sde.setComboBox_8_6(sd.getComboBox_8_6());
		sde.setComboBox_8_7(sd.getComboBox_8_7());
		sde.setComboBox_8_8(sd.getComboBox_8_8());
		
		sde.setTextBox_1_1(sd.getTextBox_1_1());
		sde.setTextBox_1_2(sd.getTextBox_1_2());
		sde.setTextBox_1_3(sd.getTextBox_1_3());
		sde.setTextBox_1_4(sd.getTextBox_1_4());
		sde.setTextBox_1_5(sd.getTextBox_1_5());
		sde.setTextBox_1_6(sd.getTextBox_1_6());
		sde.setTextBox_1_7(sd.getTextBox_1_7());
		sde.setTextBox_1_8(sd.getTextBox_1_8());
		
		sde.setTextBox_2_1(sd.getTextBox_2_1());
		sde.setTextBox_2_2(sd.getTextBox_2_2());
		sde.setTextBox_2_3(sd.getTextBox_2_3());
		sde.setTextBox_2_4(sd.getTextBox_2_4());
		sde.setTextBox_2_5(sd.getTextBox_2_5());
		sde.setTextBox_2_6(sd.getTextBox_2_6());
		sde.setTextBox_2_7(sd.getTextBox_2_7());
		sde.setTextBox_2_8(sd.getTextBox_2_8());
		
		sde.setTextBox_3_1(sd.getTextBox_3_1());
		sde.setTextBox_3_2(sd.getTextBox_3_2());
		sde.setTextBox_3_3(sd.getTextBox_3_3());
		sde.setTextBox_3_4(sd.getTextBox_3_4());
		sde.setTextBox_3_5(sd.getTextBox_3_5());
		sde.setTextBox_3_6(sd.getTextBox_3_6());
		sde.setTextBox_3_7(sd.getTextBox_3_7());
		sde.setTextBox_3_8(sd.getTextBox_3_8());
		
		sde.setTextBox_4_1(sd.getTextBox_4_1());
		sde.setTextBox_4_2(sd.getTextBox_4_2());
		sde.setTextBox_4_3(sd.getTextBox_4_3());
		sde.setTextBox_4_4(sd.getTextBox_4_4());
		sde.setTextBox_4_5(sd.getTextBox_4_5());
		sde.setTextBox_4_6(sd.getTextBox_4_6());
		sde.setTextBox_4_7(sd.getTextBox_4_7());
		sde.setTextBox_4_8(sd.getTextBox_4_8());
		
		sde.setTextBox_5_1(sd.getTextBox_5_1());
		sde.setTextBox_5_2(sd.getTextBox_5_2());
		sde.setTextBox_5_3(sd.getTextBox_5_3());
		sde.setTextBox_5_4(sd.getTextBox_5_4());
		sde.setTextBox_5_5(sd.getTextBox_5_5());
		sde.setTextBox_5_6(sd.getTextBox_5_6());
		sde.setTextBox_5_7(sd.getTextBox_5_7());
		sde.setTextBox_5_8(sd.getTextBox_5_8());
		
		sde.setTextBox_6_1(sd.getTextBox_6_1());
		sde.setTextBox_6_2(sd.getTextBox_6_2());
		sde.setTextBox_6_3(sd.getTextBox_6_3());
		sde.setTextBox_6_4(sd.getTextBox_6_4());
		sde.setTextBox_6_5(sd.getTextBox_6_5());
		sde.setTextBox_6_6(sd.getTextBox_6_6());
		sde.setTextBox_6_7(sd.getTextBox_6_7());
		sde.setTextBox_6_8(sd.getTextBox_6_8());
		
		sde.setTextBox_7_1(sd.getTextBox_7_1());
		sde.setTextBox_7_2(sd.getTextBox_7_2());
		sde.setTextBox_7_3(sd.getTextBox_7_3());
		sde.setTextBox_7_4(sd.getTextBox_7_4());
		sde.setTextBox_7_5(sd.getTextBox_7_5());
		sde.setTextBox_7_6(sd.getTextBox_7_6());
		sde.setTextBox_7_7(sd.getTextBox_7_7());
		sde.setTextBox_7_8(sd.getTextBox_7_8());
		
		sde.setTextBox_8_1(sd.getTextBox_8_1());
		sde.setTextBox_8_2(sd.getTextBox_8_2());
		sde.setTextBox_8_3(sd.getTextBox_8_3());
		sde.setTextBox_8_4(sd.getTextBox_8_4());
		sde.setTextBox_8_5(sd.getTextBox_8_5());
		sde.setTextBox_8_6(sd.getTextBox_8_6());
		sde.setTextBox_8_7(sd.getTextBox_8_7());
		sde.setTextBox_8_8(sd.getTextBox_8_8());
		
		sde.setTxtComment(sd.getTxtComment());
		sde.setDateGraduation(sd.getDateGraduation());
				
		return sde;

	}
	
	private StudentDataEntity makeRegStudentDataEntity(StudentData sd) {

		StudentDataEntity sde = new StudentDataEntity();

		sde.setSummary(sd.getSummary());
		sde.setApplicationStatus(sd.getApplicationStatus());
		
		sde.setLemail(sd.getLemail());
		sde.setAppliedSchoolName(sd.getAppliedSchoolName());
		sde.setDepartment(sd.getDepartment());
		sde.setMajor(sd.getMajor());
		sde.setFirstName(sd.getFirstName());
		sde.setMiddleName(sd.getMiddleName());
		sde.setLastName(sd.getLastName());
		sde.setAddress(sd.getAddress());
		sde.setCity(sd.getCity());
		sde.setState(sd.getState());
		sde.setZip(sd.getZip());
		sde.setCountry(sd.getCountry());
		sde.setEmail(sd.getEmail());
		
		sde.setStudiedSchoolName(sd.getStudiedSchoolName());
		sde.setStudiedSchoolCity(sd.getStudiedSchoolCity());
		sde.setStudiedSchoolCountry(sd.getStudiedSchoolCountry());
		sde.setUcode(sd.getUcode());

		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		sde.setDate(reportDate);

		sde.setComboBox_1_1(sd.getComboBox_1_1());
		sde.setComboBox_1_2(sd.getComboBox_1_2());
		sde.setComboBox_1_3(sd.getComboBox_1_3());
		sde.setComboBox_1_4(sd.getComboBox_1_4());
		sde.setComboBox_1_5(sd.getComboBox_1_5());
		sde.setComboBox_1_6(sd.getComboBox_1_6());
		sde.setComboBox_1_7(sd.getComboBox_1_7());
		sde.setComboBox_1_8(sd.getComboBox_1_8());
		
		sde.setComboBox_2_1(sd.getComboBox_2_1());
		sde.setComboBox_2_2(sd.getComboBox_2_2());
		sde.setComboBox_2_3(sd.getComboBox_2_3());
		sde.setComboBox_2_4(sd.getComboBox_2_4());
		sde.setComboBox_2_5(sd.getComboBox_2_5());
		sde.setComboBox_2_6(sd.getComboBox_2_6());
		sde.setComboBox_2_7(sd.getComboBox_2_7());
		sde.setComboBox_2_8(sd.getComboBox_2_8());
		
		sde.setComboBox_3_1(sd.getComboBox_3_1());
		sde.setComboBox_3_2(sd.getComboBox_3_2());
		sde.setComboBox_3_3(sd.getComboBox_3_3());
		sde.setComboBox_3_4(sd.getComboBox_3_4());
		sde.setComboBox_3_5(sd.getComboBox_3_5());
		sde.setComboBox_3_6(sd.getComboBox_3_6());
		sde.setComboBox_3_7(sd.getComboBox_3_7());
		sde.setComboBox_3_8(sd.getComboBox_3_8());
		
		sde.setComboBox_4_1(sd.getComboBox_4_1());
		sde.setComboBox_4_2(sd.getComboBox_4_2());
		sde.setComboBox_4_3(sd.getComboBox_4_3());
		sde.setComboBox_4_4(sd.getComboBox_4_4());
		sde.setComboBox_4_5(sd.getComboBox_4_5());
		sde.setComboBox_4_6(sd.getComboBox_4_6());
		sde.setComboBox_4_7(sd.getComboBox_4_7());
		sde.setComboBox_4_8(sd.getComboBox_4_8());
		
		sde.setComboBox_5_1(sd.getComboBox_5_1());
		sde.setComboBox_5_2(sd.getComboBox_5_2());
		sde.setComboBox_5_3(sd.getComboBox_5_3());
		sde.setComboBox_5_4(sd.getComboBox_5_4());
		sde.setComboBox_5_5(sd.getComboBox_5_5());
		sde.setComboBox_5_6(sd.getComboBox_5_6());
		sde.setComboBox_5_7(sd.getComboBox_5_7());
		sde.setComboBox_5_8(sd.getComboBox_5_8());
		
		sde.setComboBox_6_1(sd.getComboBox_6_1());
		sde.setComboBox_6_2(sd.getComboBox_6_2());
		sde.setComboBox_6_3(sd.getComboBox_6_3());
		sde.setComboBox_6_4(sd.getComboBox_6_4());
		sde.setComboBox_6_5(sd.getComboBox_6_5());
		sde.setComboBox_6_6(sd.getComboBox_6_6());
		sde.setComboBox_6_7(sd.getComboBox_6_7());
		sde.setComboBox_6_8(sd.getComboBox_6_8());
		
		sde.setComboBox_7_1(sd.getComboBox_7_1());
		sde.setComboBox_7_2(sd.getComboBox_7_2());
		sde.setComboBox_7_3(sd.getComboBox_7_3());
		sde.setComboBox_7_4(sd.getComboBox_7_4());
		sde.setComboBox_7_5(sd.getComboBox_7_5());
		sde.setComboBox_7_6(sd.getComboBox_7_6());
		sde.setComboBox_7_7(sd.getComboBox_7_7());
		sde.setComboBox_7_8(sd.getComboBox_7_8());
		
		sde.setComboBox_8_1(sd.getComboBox_8_1());
		sde.setComboBox_8_2(sd.getComboBox_8_2());
		sde.setComboBox_8_3(sd.getComboBox_8_3());
		sde.setComboBox_8_4(sd.getComboBox_8_4());
		sde.setComboBox_8_5(sd.getComboBox_8_5());
		sde.setComboBox_8_6(sd.getComboBox_8_6());
		sde.setComboBox_8_7(sd.getComboBox_8_7());
		sde.setComboBox_8_8(sd.getComboBox_8_8());
		
		sde.setTextBox_1_1(sd.getTextBox_1_1());
		sde.setTextBox_1_2(sd.getTextBox_1_2());
		sde.setTextBox_1_3(sd.getTextBox_1_3());
		sde.setTextBox_1_4(sd.getTextBox_1_4());
		sde.setTextBox_1_5(sd.getTextBox_1_5());
		sde.setTextBox_1_6(sd.getTextBox_1_6());
		sde.setTextBox_1_7(sd.getTextBox_1_7());
		sde.setTextBox_1_8(sd.getTextBox_1_8());
		
		sde.setTextBox_2_1(sd.getTextBox_2_1());
		sde.setTextBox_2_2(sd.getTextBox_2_2());
		sde.setTextBox_2_3(sd.getTextBox_2_3());
		sde.setTextBox_2_4(sd.getTextBox_2_4());
		sde.setTextBox_2_5(sd.getTextBox_2_5());
		sde.setTextBox_2_6(sd.getTextBox_2_6());
		sde.setTextBox_2_7(sd.getTextBox_2_7());
		sde.setTextBox_2_8(sd.getTextBox_2_8());
		
		sde.setTextBox_3_1(sd.getTextBox_3_1());
		sde.setTextBox_3_2(sd.getTextBox_3_2());
		sde.setTextBox_3_3(sd.getTextBox_3_3());
		sde.setTextBox_3_4(sd.getTextBox_3_4());
		sde.setTextBox_3_5(sd.getTextBox_3_5());
		sde.setTextBox_3_6(sd.getTextBox_3_6());
		sde.setTextBox_3_7(sd.getTextBox_3_7());
		sde.setTextBox_3_8(sd.getTextBox_3_8());
		
		sde.setTextBox_4_1(sd.getTextBox_4_1());
		sde.setTextBox_4_2(sd.getTextBox_4_2());
		sde.setTextBox_4_3(sd.getTextBox_4_3());
		sde.setTextBox_4_4(sd.getTextBox_4_4());
		sde.setTextBox_4_5(sd.getTextBox_4_5());
		sde.setTextBox_4_6(sd.getTextBox_4_6());
		sde.setTextBox_4_7(sd.getTextBox_4_7());
		sde.setTextBox_4_8(sd.getTextBox_4_8());
		
		sde.setTextBox_5_1(sd.getTextBox_5_1());
		sde.setTextBox_5_2(sd.getTextBox_5_2());
		sde.setTextBox_5_3(sd.getTextBox_5_3());
		sde.setTextBox_5_4(sd.getTextBox_5_4());
		sde.setTextBox_5_5(sd.getTextBox_5_5());
		sde.setTextBox_5_6(sd.getTextBox_5_6());
		sde.setTextBox_5_7(sd.getTextBox_5_7());
		sde.setTextBox_5_8(sd.getTextBox_5_8());
		
		sde.setTextBox_6_1(sd.getTextBox_6_1());
		sde.setTextBox_6_2(sd.getTextBox_6_2());
		sde.setTextBox_6_3(sd.getTextBox_6_3());
		sde.setTextBox_6_4(sd.getTextBox_6_4());
		sde.setTextBox_6_5(sd.getTextBox_6_5());
		sde.setTextBox_6_6(sd.getTextBox_6_6());
		sde.setTextBox_6_7(sd.getTextBox_6_7());
		sde.setTextBox_6_8(sd.getTextBox_6_8());
		
		sde.setTextBox_7_1(sd.getTextBox_7_1());
		sde.setTextBox_7_2(sd.getTextBox_7_2());
		sde.setTextBox_7_3(sd.getTextBox_7_3());
		sde.setTextBox_7_4(sd.getTextBox_7_4());
		sde.setTextBox_7_5(sd.getTextBox_7_5());
		sde.setTextBox_7_6(sd.getTextBox_7_6());
		sde.setTextBox_7_7(sd.getTextBox_7_7());
		sde.setTextBox_7_8(sd.getTextBox_7_8());
		
		sde.setTextBox_8_1(sd.getTextBox_8_1());
		sde.setTextBox_8_2(sd.getTextBox_8_2());
		sde.setTextBox_8_3(sd.getTextBox_8_3());
		sde.setTextBox_8_4(sd.getTextBox_8_4());
		sde.setTextBox_8_5(sd.getTextBox_8_5());
		sde.setTextBox_8_6(sd.getTextBox_8_6());
		sde.setTextBox_8_7(sd.getTextBox_8_7());
		sde.setTextBox_8_8(sd.getTextBox_8_8());
		
		return sde;

	}
	
	
	
	

	@Override
	public String addRegStudentData(StudentData old,StudentData sd) throws LoggedInException {   //deb
		String ret = null;
		boolean found = false;
		StudentDataEntity ety = null;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		//remove old student data before change
		if(old != null){
		
			deleteData(old);
		}
		
		 pm.makePersistent(makeRegStudentDataEntity(sd));
		ret = "ok";
			
			pm.close();
		 
		LOG.log(Level.INFO, " student entries added.");

		return ret;

	}
	
	
	
	
	
	
	
}
