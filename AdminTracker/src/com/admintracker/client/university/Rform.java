package com.admintracker.client.university;

import java.util.Vector;

import com.admintracker.client.Image.ImageData;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.student.StudentData;
import com.admintracker.server.StudentDataEntity;
import com.admintracker.shared.ServiceInitialization;
import com.admintracker.shared.misc;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.ListBox;

public class Rform {
	private VerticalPanel mainForm;
	private TextArea txSummary;
	private ListBox cbApplicationStatus;
	private String[] gid;
	private Button btnSem1;
	private Button btnSem2;
	private Button btnSem3;
	private Button btnSem4;
	private Button btnSem5;
	private Button btnSem6;
	private Button btnSem7;
	private Button btnSem8;
	
	
	@SuppressWarnings("deprecation")
	Rform(final ServiceInitialization si, final LoginScreen lscr,final UniversityForm ufm,final  StudentData  sdata)
	{
		 misc mi = new misc();
		
		 mainForm = new VerticalPanel();
		 mainForm.setWidth("100%");
		 
		 AbsolutePanel absolutePanel = new AbsolutePanel();
		 absolutePanel.setSize("1000px", "162px");
		 mainForm.add(absolutePanel);
		 
		 Button btnCancel = new Button("New button");
		 btnCancel.setStyleName("logout");
		 btnCancel.addClickHandler(new ClickHandler() {
		 	@SuppressWarnings("deprecation")
			public void onClick(ClickEvent event) {
		 		
		 		ufm.getTabPanel().remove(getMainForm());
		 		ufm.getTabPanel().selectTab(0);
		 		
		 		
		 	}
		 });
		 btnCancel.setText("Cancel");
		 absolutePanel.add(btnCancel, 936, 0);
		 
		 txSummary = new TextArea();
		 absolutePanel.add(txSummary, 157, 10);
		 txSummary.setSize("246px", "39px");
		 
		 cbApplicationStatus = new ListBox();
		 absolutePanel.add(cbApplicationStatus, 447, 20);
		 cbApplicationStatus.setSize("166px", "22px");
		 
		 mi.fillListBox(cbApplicationStatus, si, "data/applicationStatus.txt");
			
		 
		// updating department index
			si.getGuiDataServiceAsync().getDepartmentIndex(sdata.getApplicationStatus(), "data/applicationStatus.txt", new AsyncCallback<Integer>() {

				 
								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Integer result) {
									if (result != -1) {
										cbApplicationStatus.setItemSelected(result, true);
										 
									}

								}

							});
		 
			//update summary from the database
			txSummary.setText(mi.isNull(sdata.getSummary())? sdata.getSummary() : "");
		 
		 Button btUpdate = new Button("New button");
		 btUpdate.setStyleName("logout");
		 btUpdate.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		
		 		StudentData sd = new StudentData();
		 		sd.setSummary(txSummary.getText());
		 		sd.setApplicationStatus(cbApplicationStatus.getItemText(cbApplicationStatus.getSelectedIndex()));
		 		
		 		//sdata.getAddress();
		 		
		 		
		 		
		 		sd.setAddress(sdata.getAddress());
				sd.setAppliedSchoolName(sdata.getAppliedSchoolName());
				sd.setCity(sdata.getCity());
				sd.setCountry(sdata.getCountry());
				sd.setDepartment(sdata.getDepartment());
				sd.setEmail(sdata.getEmail());
				sd.setFirstName(sdata.getFirstName());
				sd.setLastName(sdata.getLastName());
				sd.setLemail(sdata.getLemail());
				sd.setMajor(sdata.getMajor());
				sd.setMiddleName(sdata.getMiddleName());
				sd.setState(sdata.getState());
				sd.setStudiedSchoolCity(sdata.getStudiedSchoolCity());
				sd.setStudiedSchoolCountry(sdata.getStudiedSchoolCountry());
				sd.setStudiedSchoolName(sdata.getStudiedSchoolName());
				sd.setZip(sdata.getZip());
				sd.setDate(sdata.getDate());

				sd.setUcode(sdata.getUcode());

				sd.setComboBox_1_1(sdata.getComboBox_1_1());
				sd.setComboBox_1_2(sdata.getComboBox_1_2());
				sd.setComboBox_1_3(sdata.getComboBox_1_3());
				sd.setComboBox_1_4(sdata.getComboBox_1_4());
				sd.setComboBox_1_5(sdata.getComboBox_1_5());
				sd.setComboBox_1_6(sdata.getComboBox_1_6());
				sd.setComboBox_1_7(sdata.getComboBox_1_7());
				sd.setComboBox_1_8(sdata.getComboBox_1_8());
				
				sd.setComboBox_2_1(sdata.getComboBox_2_1());
				sd.setComboBox_2_2(sdata.getComboBox_2_2());
				sd.setComboBox_2_3(sdata.getComboBox_2_3());
				sd.setComboBox_2_4(sdata.getComboBox_2_4());
				sd.setComboBox_2_5(sdata.getComboBox_2_5());
				sd.setComboBox_2_6(sdata.getComboBox_2_6());
				sd.setComboBox_2_7(sdata.getComboBox_2_7());
				sd.setComboBox_2_8(sdata.getComboBox_2_8());
				
				sd.setComboBox_3_1(sdata.getComboBox_3_1());
				sd.setComboBox_3_2(sdata.getComboBox_3_2());
				sd.setComboBox_3_3(sdata.getComboBox_3_3());
				sd.setComboBox_3_4(sdata.getComboBox_3_4());
				sd.setComboBox_3_5(sdata.getComboBox_3_5());
				sd.setComboBox_3_6(sdata.getComboBox_3_6());
				sd.setComboBox_3_7(sdata.getComboBox_3_7());
				sd.setComboBox_3_8(sdata.getComboBox_3_8());
				
				sd.setComboBox_4_1(sdata.getComboBox_4_1());
				sd.setComboBox_4_2(sdata.getComboBox_4_2());
				sd.setComboBox_4_3(sdata.getComboBox_4_3());
				sd.setComboBox_4_4(sdata.getComboBox_4_4());
				sd.setComboBox_4_5(sdata.getComboBox_4_5());
				sd.setComboBox_4_6(sdata.getComboBox_4_6());
				sd.setComboBox_4_7(sdata.getComboBox_4_7());
				sd.setComboBox_4_8(sdata.getComboBox_4_8());
				
				sd.setComboBox_5_1(sdata.getComboBox_5_1());
				sd.setComboBox_5_2(sdata.getComboBox_5_2());
				sd.setComboBox_5_3(sdata.getComboBox_5_3());
				sd.setComboBox_5_4(sdata.getComboBox_5_4());
				sd.setComboBox_5_5(sdata.getComboBox_5_5());
				sd.setComboBox_5_6(sdata.getComboBox_5_6());
				sd.setComboBox_5_7(sdata.getComboBox_5_7());
				sd.setComboBox_5_8(sdata.getComboBox_5_8());
				
				sd.setComboBox_6_1(sdata.getComboBox_6_1());
				sd.setComboBox_6_2(sdata.getComboBox_6_2());
				sd.setComboBox_6_3(sdata.getComboBox_6_3());
				sd.setComboBox_6_4(sdata.getComboBox_6_4());
				sd.setComboBox_6_5(sdata.getComboBox_6_5());
				sd.setComboBox_6_6(sdata.getComboBox_6_6());
				sd.setComboBox_6_7(sdata.getComboBox_6_7());
				sd.setComboBox_6_8(sdata.getComboBox_6_8());
				
				sd.setComboBox_7_1(sdata.getComboBox_7_1());
				sd.setComboBox_7_2(sdata.getComboBox_7_2());
				sd.setComboBox_7_3(sdata.getComboBox_7_3());
				sd.setComboBox_7_4(sdata.getComboBox_7_4());
				sd.setComboBox_7_5(sdata.getComboBox_7_5());
				sd.setComboBox_7_6(sdata.getComboBox_7_6());
				sd.setComboBox_7_7(sdata.getComboBox_7_7());
				sd.setComboBox_7_8(sdata.getComboBox_7_8());
				
				sd.setComboBox_8_1(sdata.getComboBox_8_1());
				sd.setComboBox_8_2(sdata.getComboBox_8_2());
				sd.setComboBox_8_3(sdata.getComboBox_8_3());
				sd.setComboBox_8_4(sdata.getComboBox_8_4());
				sd.setComboBox_8_5(sdata.getComboBox_8_5());
				sd.setComboBox_8_6(sdata.getComboBox_8_6());
				sd.setComboBox_8_7(sdata.getComboBox_8_7());
				sd.setComboBox_8_8(sdata.getComboBox_8_8());
				
				sd.setTextBox_1_1(sdata.getTextBox_1_1());
				sd.setTextBox_1_2(sdata.getTextBox_1_2());
				sd.setTextBox_1_3(sdata.getTextBox_1_3());
				sd.setTextBox_1_4(sdata.getTextBox_1_4());
				sd.setTextBox_1_5(sdata.getTextBox_1_5());
				sd.setTextBox_1_6(sdata.getTextBox_1_6());
				sd.setTextBox_1_7(sdata.getTextBox_1_7());
				sd.setTextBox_1_8(sdata.getTextBox_1_8());
				
				sd.setTextBox_1_1(sdata.getTextBox_1_1());
				sd.setTextBox_1_2(sdata.getTextBox_1_2());
				sd.setTextBox_1_3(sdata.getTextBox_1_3());
				sd.setTextBox_1_4(sdata.getTextBox_1_4());
				sd.setTextBox_1_5(sdata.getTextBox_1_5());
				sd.setTextBox_1_6(sdata.getTextBox_1_6());
				sd.setTextBox_1_7(sdata.getTextBox_1_7());
				sd.setTextBox_1_8(sdata.getTextBox_1_8());
				
				sd.setTextBox_2_1(sdata.getTextBox_2_1());
				sd.setTextBox_2_2(sdata.getTextBox_2_2());
				sd.setTextBox_2_3(sdata.getTextBox_2_3());
				sd.setTextBox_2_4(sdata.getTextBox_2_4());
				sd.setTextBox_2_5(sdata.getTextBox_2_5());
				sd.setTextBox_2_6(sdata.getTextBox_2_6());
				sd.setTextBox_2_7(sdata.getTextBox_2_7());
				sd.setTextBox_2_8(sdata.getTextBox_2_8());
				
				sd.setTextBox_3_1(sdata.getTextBox_3_1());
				sd.setTextBox_3_2(sdata.getTextBox_3_2());
				sd.setTextBox_3_3(sdata.getTextBox_3_3());
				sd.setTextBox_3_4(sdata.getTextBox_3_4());
				sd.setTextBox_3_5(sdata.getTextBox_3_5());
				sd.setTextBox_3_6(sdata.getTextBox_3_6());
				sd.setTextBox_3_7(sdata.getTextBox_3_7());
				sd.setTextBox_3_8(sdata.getTextBox_3_8());
				
				sd.setTextBox_4_1(sdata.getTextBox_4_1());
				sd.setTextBox_4_2(sdata.getTextBox_4_2());
				sd.setTextBox_4_3(sdata.getTextBox_4_3());
				sd.setTextBox_4_4(sdata.getTextBox_4_4());
				sd.setTextBox_4_5(sdata.getTextBox_4_5());
				sd.setTextBox_4_6(sdata.getTextBox_4_6());
				sd.setTextBox_4_7(sdata.getTextBox_4_7());
				sd.setTextBox_4_8(sdata.getTextBox_4_8());
				
				sd.setTextBox_5_1(sdata.getTextBox_5_1());
				sd.setTextBox_5_2(sdata.getTextBox_5_2());
				sd.setTextBox_5_3(sdata.getTextBox_5_3());
				sd.setTextBox_5_4(sdata.getTextBox_5_4());
				sd.setTextBox_5_5(sdata.getTextBox_5_5());
				sd.setTextBox_5_6(sdata.getTextBox_5_6());
				sd.setTextBox_5_7(sdata.getTextBox_5_7());
				sd.setTextBox_5_8(sdata.getTextBox_5_8());
				
				sd.setTextBox_6_1(sdata.getTextBox_6_1());
				sd.setTextBox_6_2(sdata.getTextBox_6_2());
				sd.setTextBox_6_3(sdata.getTextBox_6_3());
				sd.setTextBox_6_4(sdata.getTextBox_6_4());
				sd.setTextBox_6_5(sdata.getTextBox_6_5());
				sd.setTextBox_6_6(sdata.getTextBox_6_6());
				sd.setTextBox_6_7(sdata.getTextBox_6_7());
				sd.setTextBox_6_8(sdata.getTextBox_6_8());
				
				sd.setTextBox_7_1(sdata.getTextBox_7_1());
				sd.setTextBox_7_2(sdata.getTextBox_7_2());
				sd.setTextBox_7_3(sdata.getTextBox_7_3());
				sd.setTextBox_7_4(sdata.getTextBox_7_4());
				sd.setTextBox_7_5(sdata.getTextBox_7_5());
				sd.setTextBox_7_6(sdata.getTextBox_7_6());
				sd.setTextBox_7_7(sdata.getTextBox_7_7());
				sd.setTextBox_7_8(sdata.getTextBox_7_8());
				
				sd.setTextBox_8_1(sdata.getTextBox_8_1());
				sd.setTextBox_8_2(sdata.getTextBox_8_2());
				sd.setTextBox_8_3(sdata.getTextBox_8_3());
				sd.setTextBox_8_4(sdata.getTextBox_8_4());
				sd.setTextBox_8_5(sdata.getTextBox_8_5());
				sd.setTextBox_8_6(sdata.getTextBox_8_6());
				sd.setTextBox_8_7(sdata.getTextBox_8_7());
				sd.setTextBox_8_8(sdata.getTextBox_8_8());
				
				try {
					si.getStudentDataServiceAsync().addRegStudentData(sdata,sd,new AsyncCallback<String>() {

						@Override
						public void onFailure(Throwable caught) {
							 
							Window.alert("error from server");
						}

						@Override
						public void onSuccess(String result) {
							 if(result != null){
								 if (result.equals("ok")) {
										Window.alert("Changed applied ");
								 }
							 }
							
						}
						
					});
				} catch (LoggedInException e) {
					 
					e.printStackTrace();
				}
		 		
		 		
		 		
		 		
		 		
		 	}
		 });
		 btUpdate.setText("Update");
		 absolutePanel.add(btUpdate, 646, 18);
		 
		 //retrieve image from server
		 ImageData id = new ImageData();
		 id.setEmail(sdata.getEmail());
		 id.setFirstName(sdata.getFirstName());
		 id.setLastName(sdata.getLastName());
		 id.setName("sem1");
		 
		 try {
			si.getImageDataServiceAsync().readAllImage(id, new AsyncCallback<String[]>(){

				@Override
				public void onFailure(Throwable caught) {
					 
					
				}

				@Override
				public void onSuccess(String[] result) {
					String[] vid = result;
					 gid = result;
					 
					 if(vid != null){
						 
						 for(int i=0;i<vid.length;i++){
							 
							 if(vid[i] == null){
								 continue;
							 }
							 
							 
							 long img =  Long.parseLong(vid[i]);
							 
							 
							 
								 switch(i){
								 
								 case 0:
								 {
									 if(img != 0L){
										 btnSem1.setEnabled(true);
									 }
									  break;
								 }
								 
								 case 1:
								 {
									 if(img != 0L){
										 btnSem2.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 2:
								 {
									 if(img != 0L){
										 btnSem3.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 3:
								 {
									 if(img != 0L){
										 btnSem4.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 4:
								 {
									 if(img != 0L){
										 btnSem5.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 5:
								 {
									 if(img != 0L){
										 btnSem6.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 6:
								 {
									 if(img != 0L){
										 btnSem7.setEnabled(true);
									 }
									  break;
								 }
									  
								 case 7:
								 {
									 if(img != 0L){
										 btnSem8.setEnabled(true);
									 }
									  break;
								 }
								 
								 }
								 
								 
							 
						 }
						 
						 
					 }
					
				}
				 
			 });
		} catch (LoggedInException e) {
			 
			e.printStackTrace();
		}
		 
		 
		 
		 btnSem1 = new Button("New button");
		 btnSem1.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[0]), "_blank", null);
		 	}
		 });
		 btnSem1.setEnabled(false);
		 btnSem1.setText("Semester 1");
		 absolutePanel.add(btnSem1, 10, 70);
		 
		 btnSem2 = new Button("New button");
		 btnSem2.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[1]), "_blank", null);
		 	}
		 });
		 btnSem2.setEnabled(false);
		 btnSem2.setText("Semester 2");
		 absolutePanel.add(btnSem2, 107, 70);
		 
		 btnSem3 = new Button("New button");
		 btnSem3.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[2]), "_blank", null);
		 	}
		 });
		 btnSem3.setEnabled(false);
		 btnSem3.setText("Semester 3");
		 absolutePanel.add(btnSem3, 202, 70);
		 
		 btnSem4 = new Button("New button");
		 btnSem4.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[3]), "_blank", null);
		 	}
		 });
		 btnSem4.setEnabled(false);
		 btnSem4.setText("Semester 4");
		 absolutePanel.add(btnSem4, 298, 70);
		 
		 btnSem5 = new Button("New button");
		 btnSem5.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[4]), "_blank", null);
		 	}
		 });
		 btnSem5.setEnabled(false);
		 btnSem5.setText("Semester 5");
		 absolutePanel.add(btnSem5, 10, 116);
		 
		 btnSem6 = new Button("New button");
		 btnSem6.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[5]), "_blank", null);
		 	}
		 });
		 btnSem6.setEnabled(false);
		 btnSem6.setText("Semester 6");
		 absolutePanel.add(btnSem6, 107, 116);
		 
		 btnSem7 = new Button("New button");
		 btnSem7.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[6]), "_blank", null);
		 	}
		 });
		 btnSem7.setEnabled(false);
		 btnSem7.setText("Semester 7");
		 absolutePanel.add(btnSem7, 202, 116);
		 
		 btnSem8 = new Button("New button");
		 btnSem8.addClickHandler(new ClickHandler() {
		 	public void onClick(ClickEvent event) {
		 		Window.open(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[7]), "_blank", null);
		 	}
		 });
		 btnSem8.setEnabled(false);
		 btnSem8.setText("Semester 8");
		 absolutePanel.add(btnSem8, 298, 116);
		 
		 ScrollPanel scrollPanel = new ScrollPanel();
		 mainForm.add(scrollPanel);
		 
		 
		 
		 String univ = sdata.getAddress();
		 String dept = sdata.getDepartment();
		 
		 HTML html = new HTML(
				 "<hr/><br/> <b> Application Status : </b>"+"<font size="+3+" color=red>"+sdata.getApplicationStatus()+"</font>"
				 +"<br/> <b> Summary : </b>"+"<font size="+3+" color=red>"+sdata.getSummary()+"</font>"
				 
				 +"<hr/> <b>School Name: </b>"+"<font size="+3+" color=Black>"+sdata.getAppliedSchoolName()+"</font>"
				 +"<br/> <b> Department: </b>"+"<font size="+3+" color=Black>"+sdata.getDepartment()+"</font>"
				 +"<br/>  <b>Major: </b>"+"<font size="+3+" color=Black>"+sdata.getMajor()+"</font>"
				 //+"<br/>  <b>Graduation Date: </b>"+DateTimeFormat.getFormat("MM/dd/yyyy").format(sdata.getDateGraduation())
				
				 +"<br/>  <b>Graduation Date: </b>"+"<font size="+3+" color=Black>"+sdata.getDateGraduation()+"</font>"
					
				 
				 +"<br/>  <b>Comment: </b>"  +"<font size="+3+" color=Black>"  +sdata.getTxtComment()   +"</font>"
				 				 
				 +"<hr/> <br/> <b> FirstName: </b>"+ "<font size="+3+" color=orange>" +sdata.getFirstName()+ "</font>"+"<span style="+"padding-left:50px><b>MiddleName: </b>"+"<font size="+3+" color=orange>"+sdata.getMiddleName()+"</font>"+"<span>"+"<span style="+"padding-left:50px><b>LastName: </b>"+"<font size="+3+" color=orange>"+sdata.getLastName()+"</font>"+"<span>"
				 +"<br/> <b> Address: </b>"+"<font size="+3+" color=orange>"+sdata.getAddress()+"</font>"
				 +"<br/> <b> City: </b>"+"<font size="+3+" color=orange>"+sdata.getCity()+"</font>"
				 +"<br/> <b> State: </b>"+"<font size="+3+" color=orange>"+sdata.getState()+"</font>"
				 +"<br/> <b> Zip: </b>"+"<font size="+3+" color=orange>"+sdata.getZip()+"</font>"
				 +"<br/> <b> Country: </b>"+"<font size="+3+" color=orange>"+sdata.getCountry()+"</font>"
				 +"<br/> <b> Email: </b>"+"<font size="+3+" color=orange>"+sdata.getEmail()+"</font>"
				 +"<br/> <b> School Name: </b>"+"<font size="+3+" color=orange>"+sdata.getStudiedSchoolName()+"</font>"
				 +"<br/> <b> City: </b>"+"<font size="+3+" color=orange>"+sdata.getStudiedSchoolCity()+"</font>"
				 +"<br/> <b> Country: </b>"+"<font size="+3+" color=orange>"+sdata.getStudiedSchoolCountry()+"</font>"
				 
				 +"<hr/><table border="+"1>" +
				 		"<tr>" +
				 		"<td>"+"<b> Semester 1 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 2 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 3 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 4 </b>"+"</td>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_1()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_2()+"</font>"+"</td>" +
				 		"</tr>" +
				 					 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_3()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_4()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_5()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_6()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_7()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_1_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_1_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_2_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_2_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_3_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_3_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_4_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_4_8()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+ ":"+  "</td>" +
				 		"<td>"+ ":"+  "</td>" +
				 		"<td>"+ ":"+  "</td>" +
				 		"<td>"+ ":"+  "</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<b> Semester 5 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 6 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 7 </b>"+"</td>" +
				 		"<td>"+"<b> Semester 8 </b>"+"</td>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_1()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_1()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_1()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_2()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_2()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_2()+"</font>"+"</td>" +
				 		"</tr>" +
				 					 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_3()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_3()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_3()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_4()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_4()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_4()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_5()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_5()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_5()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_6()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_6()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_6()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_7()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_7()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_7()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		"<tr>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_5_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_5_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_6_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_6_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_7_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_7_8()+"</font>"+"</td>" +
				 		"<td>"+"<font size="+3+" color=green>"+sdata.getComboBox_8_8()+"</font>"+":"+"<font size="+3+" color=green>"+ sdata.getTextBox_8_8()+"</font>"+"</td>" +
				 		"</tr>" +
				 		
				 		
				 		"</table>"
			 
				 
				 , true);
		 scrollPanel.setWidget(html);
		 html.setSize("100%", "100%");
	}
	
	
	
	public VerticalPanel getMainForm() {
		return mainForm;
	}

	public void setMainForm(VerticalPanel mainForm) {
		this.mainForm = mainForm;
	}
}
