package com.admintracker.client.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import com.admintracker.client.dialog.Mdialog;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.mail.MailServiceData;
import com.admintracker.shared.ServiceInitialization;
import com.admintracker.shared.misc;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.Format;
import com.google.gwt.user.client.ui.HTML;

public class Sform {
	int kt = 0;
	int idx = 0;
	ArrayList<String> selectedSchool = new ArrayList<String>();
	misc mi = new misc();
	private ArrayList<String> CourseList;
	private FlexTable flexSubmittedList = new FlexTable();
	private VerticalPanel mainForm;
	
	private  TextArea txtComment;
	private  DateBox dateGraduation;
	
	private ListBox cbUnivSchool;
	private ListBox cbUnivDepartment;
	private ListBox cbUnivMajor;
		
	private TextBox tbFirstName;
	private TextBox tbMiddleName;
	private TextBox tbLastName;
	private TextBox tbAddress;
	private TextBox tbCity;
	private TextBox tbState;
	private TextBox tbZip;
	private TextBox tbCountry;
	private TextBox tbEmail;
	private TextBox tbSchoolName;
	private TextBox tbSchoolCity;
	private TextBox tbSchoolCountry;

	private ListBox comboBox_1_1;
	private ListBox comboBox_1_2;
	private ListBox comboBox_1_3;
	private ListBox comboBox_1_4;
	private ListBox comboBox_1_5;
	private ListBox comboBox_1_6;
	private ListBox comboBox_1_7;
	private ListBox comboBox_1_8;

	private ListBox comboBox_2_1;
	private ListBox comboBox_2_2;
	private ListBox comboBox_2_3;
	private ListBox comboBox_2_4;
	private ListBox comboBox_2_5;
	private ListBox comboBox_2_6;
	private ListBox comboBox_2_7;
	private ListBox comboBox_2_8;

	private ListBox comboBox_3_1;
	private ListBox comboBox_3_2;
	private ListBox comboBox_3_3;
	private ListBox comboBox_3_4;
	private ListBox comboBox_3_5;
	private ListBox comboBox_3_6;
	private ListBox comboBox_3_7;
	private ListBox comboBox_3_8;

	private ListBox comboBox_4_1;
	private ListBox comboBox_4_2;
	private ListBox comboBox_4_3;
	private ListBox comboBox_4_4;
	private ListBox comboBox_4_5;
	private ListBox comboBox_4_6;
	private ListBox comboBox_4_7;
	private ListBox comboBox_4_8;

	private ListBox comboBox_5_1;
	private ListBox comboBox_5_2;
	private ListBox comboBox_5_3;
	private ListBox comboBox_5_4;
	private ListBox comboBox_5_5;
	private ListBox comboBox_5_6;
	private ListBox comboBox_5_7;
	private ListBox comboBox_5_8;

	private ListBox comboBox_6_1;
	private ListBox comboBox_6_2;
	private ListBox comboBox_6_3;
	private ListBox comboBox_6_4;
	private ListBox comboBox_6_5;
	private ListBox comboBox_6_6;
	private ListBox comboBox_6_7;
	private ListBox comboBox_6_8;

	private ListBox comboBox_7_1;
	private ListBox comboBox_7_2;
	private ListBox comboBox_7_3;
	private ListBox comboBox_7_4;
	private ListBox comboBox_7_5;
	private ListBox comboBox_7_6;
	private ListBox comboBox_7_7;
	private ListBox comboBox_7_8;

	private ListBox comboBox_8_1;
	private ListBox comboBox_8_2;
	private ListBox comboBox_8_3;
	private ListBox comboBox_8_4;
	private ListBox comboBox_8_5;
	private ListBox comboBox_8_6;
	private ListBox comboBox_8_7;
	private ListBox comboBox_8_8;
	
	private TextBox textBox_1_1;
	private TextBox textBox_1_2;
	private TextBox textBox_1_3;
	private TextBox textBox_1_4;
	private TextBox textBox_1_5;
	private TextBox textBox_1_6;
	private TextBox textBox_1_7;
	private TextBox textBox_1_8;

	private TextBox textBox_2_1;
	private TextBox textBox_2_2;
	private TextBox textBox_2_3;
	private TextBox textBox_2_4;
	private TextBox textBox_2_5;
	private TextBox textBox_2_6;
	private TextBox textBox_2_7;
	private TextBox textBox_2_8;

	private TextBox textBox_3_1;
	private TextBox textBox_3_2;
	private TextBox textBox_3_3;
	private TextBox textBox_3_4;
	private TextBox textBox_3_5;
	private TextBox textBox_3_6;
	private TextBox textBox_3_7;
	private TextBox textBox_3_8;

	private TextBox textBox_4_1;
	private TextBox textBox_4_2;
	private TextBox textBox_4_3;
	private TextBox textBox_4_4;
	private TextBox textBox_4_5;
	private TextBox textBox_4_6;
	private TextBox textBox_4_7;
	private TextBox textBox_4_8;

	private TextBox textBox_5_1;
	private TextBox textBox_5_2;
	private TextBox textBox_5_3;
	private TextBox textBox_5_4;
	private TextBox textBox_5_5;
	private TextBox textBox_5_6;
	private TextBox textBox_5_7;
	private TextBox textBox_5_8;

	private TextBox textBox_6_1;
	private TextBox textBox_6_2;
	private TextBox textBox_6_3;
	private TextBox textBox_6_4;
	private TextBox textBox_6_5;
	private TextBox textBox_6_6;
	private TextBox textBox_6_7;
	private TextBox textBox_6_8;

	private TextBox textBox_7_1;
	private TextBox textBox_7_2;
	private TextBox textBox_7_3;
	private TextBox textBox_7_4;
	private TextBox textBox_7_5;
	private TextBox textBox_7_6;
	private TextBox textBox_7_7;
	private TextBox textBox_7_8;

	private TextBox textBox_8_1;
	private TextBox textBox_8_2;
	private TextBox textBox_8_3;
	private TextBox textBox_8_4;
	private TextBox textBox_8_5;
	private TextBox textBox_8_6;
	private TextBox textBox_8_7;
	private TextBox textBox_8_8;
	
	  
	
	public Sform(final ServiceInitialization si, final LoginScreen lscr,
			final DecoratedTabPanel tabPanel, final StudentForm sfm) {

		
		
		CourseList = lscr.getCourseList();
				
		final Label lblClickToUpdate = new Label("Click to Update");
		final VerticalPanel tab1Content = new VerticalPanel();
		// Student information
		VerticalPanel vpStudent = new VerticalPanel();
		HorizontalPanel hpStudentName = new HorizontalPanel();

		// Name
		Label lblFirstName = new Label("First Name");
		tbFirstName = new TextBox();
		tbFirstName.setStyleName("gwt-TextBox-1");
		tbFirstName.setText(lscr.getLfirstName());
		
		
		Label lblMiddleName = new Label("Middle Name");
		tbMiddleName = new TextBox();
		tbMiddleName.setStyleName("gwt-TextBox-1");

		Label lblLastName = new Label("Last Name");
		tbLastName = new TextBox();
		tbLastName.setStyleName("gwt-TextBox-1");
		tbLastName.setText(lscr.getLlastName());
		
		hpStudentName.add(lblFirstName);

		Label label = new Label(" ");
		hpStudentName.add(label);
		label.setSize("9px", "2px");
		hpStudentName.add(tbFirstName);
		tbFirstName.setWidth("140px");

		Label label_1 = new Label("");
		hpStudentName.add(label_1);
		label_1.setWidth("9px");
		hpStudentName.add(lblMiddleName);

		Label label_2 = new Label("");
		hpStudentName.add(label_2);
		label_2.setSize("9px", "2px");
		hpStudentName.add(tbMiddleName);
		tbMiddleName.setWidth("51px");

		Label label_3 = new Label("");
		hpStudentName.add(label_3);
		label_3.setSize("9px", "2px");
		hpStudentName.add(lblLastName);

		Label label_4 = new Label("");
		hpStudentName.add(label_4);
		label_4.setSize("9px", "2px");
		hpStudentName.add(tbLastName);
		tbLastName.setWidth("95px");

		Label lblStudentTitle = new Label("Student Information");
		lblStudentTitle
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		lblStudentTitle.setStyleName("gwt-Label1");
		vpStudent.add(lblStudentTitle);

		Label label_5 = new Label("");
		label_5.setHeight("5px");
		vpStudent.add(label_5);
		vpStudent.add(hpStudentName);

		// Student Address
		HorizontalPanel hpAddressCity = new HorizontalPanel();
		Label lblAddress = new Label("Address");
		tbAddress = new TextBox();
		tbAddress.setStyleName("gwt-TextBox-1");
		// city
		Label lblCity = new Label("City");
		tbCity = new TextBox();
		tbCity.setStyleName("gwt-TextBox-1");

		hpAddressCity.add(lblAddress);

		Label label_7 = new Label("");
		hpAddressCity.add(label_7);
		label_7.setWidth("9px");
		hpAddressCity.add(tbAddress);
		tbAddress.setWidth("218px");

		Label label_8 = new Label("");
		hpAddressCity.add(label_8);
		label_8.setWidth("9px");
		hpAddressCity.add(lblCity);

		Label label_9 = new Label("");
		hpAddressCity.add(label_9);
		label_9.setWidth("9px");
		hpAddressCity.add(tbCity);
		tbCity.setWidth("86px");

		vpStudent.add(hpAddressCity);

		// topPanel.setCellHorizontalAlignment(nameLogout,
		// HasHorizontalAlignment.ALIGN_RIGHT);

		vpStudent.setCellHorizontalAlignment(hpAddressCity,
				HasHorizontalAlignment.ALIGN_LEFT);

		Label label_10 = new Label("");
		hpAddressCity.add(label_10);
		label_10.setWidth("9px");

		Label lblState = new Label("State");
		hpAddressCity.add(lblState);

		Label label_11 = new Label("");
		hpAddressCity.add(label_11);
		label_11.setWidth("9px");

		tbState = new TextBox();
		tbState.setStyleName("gwt-TextBox-1");
		hpAddressCity.add(tbState);
		tbState.setWidth("98px");

		// Student zip country,email
		HorizontalPanel hpZipCountryEmail = new HorizontalPanel();
		Label lblZip = new Label("Zip");
		tbZip = new TextBox();
		tbZip.setStyleName("gwt-TextBox-1");

		Label lblCountry = new Label("Country");
		tbCountry = new TextBox();
		tbCountry.setStyleName("gwt-TextBox-1");

		Label lblEmail = new Label("Email");
		tbEmail = new TextBox();
		tbEmail.setStyleName("gwt-TextBox-1");
		tbEmail.setText(lscr.getLemail());
		
		
		hpZipCountryEmail.add(lblZip);

		Label label_12 = new Label("");
		hpZipCountryEmail.add(label_12);
		label_12.setWidth("9px");
		hpZipCountryEmail.add(tbZip);
		tbZip.setWidth("78px");

		Label label_13 = new Label("");
		hpZipCountryEmail.add(label_13);
		label_13.setWidth("9px");
		hpZipCountryEmail.add(lblCountry);

		Label label_14 = new Label("");
		hpZipCountryEmail.add(label_14);
		label_14.setWidth("9px");
		hpZipCountryEmail.add(tbCountry);
		tbCountry.setWidth("95px");

		Label label_15 = new Label("");
		hpZipCountryEmail.add(label_15);
		label_15.setWidth("9px");
		hpZipCountryEmail.add(lblEmail);

		Label label_16 = new Label("");
		hpZipCountryEmail.add(label_16);
		label_16.setWidth("9px");
		hpZipCountryEmail.add(tbEmail);
		tbEmail.setWidth("234px");

		vpStudent.add(hpZipCountryEmail);
		vpStudent.setCellHorizontalAlignment(hpZipCountryEmail,
				HasHorizontalAlignment.ALIGN_LEFT);

		// //////////////////////////////////////////////////
		// University Information

		VerticalPanel vpUniv = new VerticalPanel();

		Label lblUnivTitle = new Label("School Infomation");
		lblUnivTitle.setStyleName("gwt-Label1");

		
		Label lblUnivSchool = new Label("School Applied To");
		cbUnivSchool = new ListBox();
		
		
		
		
					
		cbUnivSchool.setVisibleItemCount(4);
		cbUnivSchool.setMultipleSelect(true);

		Label lblUnivDepartment = new Label("Department Applied To");
		cbUnivDepartment = new ListBox();
		cbUnivDepartment.setEnabled(false);
		cbUnivDepartment.addItem("-- Select Department --");
				
		
		Label lblUnivMajor = new Label("Major");
		cbUnivMajor = new ListBox();

		vpUniv.add(lblUnivTitle);

		Label label_6 = new Label("");
		label_6.setHeight("5px");
		vpUniv.add(label_6);

		vpUniv.add(lblUnivSchool);
		vpUniv.add(cbUnivSchool);
		cbUnivSchool.setSize("313px", "79px");
		
		Label label_82 = new Label("");
		label_82.setHeight("10px");
		vpUniv.add(label_82);
		
		HorizontalPanel horizontalPanel_22 = new HorizontalPanel();
		vpUniv.add(horizontalPanel_22);
		horizontalPanel_22.setWidth("317px");
		
		
		
		final Button btnDeptUpdate = new Button("New button");
		horizontalPanel_22.add(btnDeptUpdate);
		btnDeptUpdate.setEnabled(false);
		btnDeptUpdate.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				//Window.alert("hello");
				cbUnivDepartment.setEnabled(true);
				lblClickToUpdate.setText("");
				
				selectedSchool.clear();
				ArrayList<ArrayList<Integer>> mlist = sfm.getMlist();	
				ArrayList<String> dlist = sfm.getDlist();
				
				int count = 0;
				//selectedSchool.clear();
				for(int i=0,l=cbUnivSchool.getItemCount();i<l;i++){
					if(cbUnivSchool.isItemSelected(i)){
						selectedSchool.add(cbUnivSchool.getItemText(i));
						count++;
					}
					
				}
				
				//add department into the combobox
				if(count == 1){
					String st = selectedSchool.get(0);
					String[] ct = st.split("-");
					int idx = Integer.parseInt(ct[1])%1000;
					
					cbUnivDepartment.clear();
										
					ArrayList<Integer> ml = mlist.get(idx-1);
					ArrayList<String> te = new ArrayList<String>();
					
					for(int i=0;i<ml.size();i++){
						te.add(dlist.get(ml.get(i)));
					}
					Collections.sort(te);
					
					cbUnivDepartment.insertItem("-- Select Department --",0);
					for(int i=1; i< ml.size();i++)
					{
						cbUnivDepartment.insertItem(te.get(i),i);
					}
					
					
				}
				else  
				{
					System.out.println("count="+count);
					
					ArrayList<Integer> it = new ArrayList<Integer>();
					for(int i=0;i<selectedSchool.size();i++){
						System.out.println("school = "+selectedSchool.get(i));
						String st = selectedSchool.get(i);
						String[] ss = st.split("-");
						it.add(Integer.parseInt(ss[1])%1000);
					}
					
					
						ArrayList<Integer> ct = new ArrayList<Integer>();
						for(int k=0;k<it.size();k++){
							
							ct.add(mlist.get(it.get(k)-1).size());
							
							//int val = mlist.get(it.get(k)-1).size();
							//System.out.println("val = "+val);
						}
						Collections.sort(ct);
						
						ArrayList<ArrayList<Integer>> tl = new ArrayList<ArrayList<Integer>>();
					
						for(int j=0;j< ct.size();j++){
							//int x = ct.get(j);
							//ArrayList<Integer> kk = mlist.get(x);
							tl.add(mlist.get(it.get(j)-1));
						}
						
						ArrayList <Integer>  temp0 = new ArrayList <Integer> ();
						ArrayList <Integer>  temp1 = new ArrayList <Integer> ();
												
						temp0.clear();
						temp1.clear();
						
						for(int z=0;z<tl.get(0).size();z++){
							temp0.add(tl.get(0).get(z));
						}
						
						int ix = tl.size();
						System.out.println("ix="+ix);
						
						for(int t=1;t<ix;t++){
						//	for(int x=0;x<tl.get(t).size();x++){
								for(int y=0;y<temp0.size();y++){
									//int z = tl.get(t).get(x);
									//System.out.println(z+"-");
									
								//	int m = tl.get(t+1).get(y);
								//	System.out.println(m+",");
										
									if(tl.get(t).contains(temp0.get(y))){
										 temp1.add(temp0.get(y));
									}
										
									
									//if(tl.get(t).contains(tl.get(t+1).get(y))){
									//	temp0.add(tl.get(t+1).get(y));
									//}
									//System.out.println("val = ");
								}
								temp0.clear();
								temp0.addAll(temp1);
								temp1.clear();
								
								System.out.println("val = ");
							//}
							 
						}
						
						ArrayList<String> te1 = new ArrayList<String>();
						
						for(int i=0;i<temp0.size();i++){
							te1.add(dlist.get(temp0.get(i)));
						}
						Collections.sort(te1);
						cbUnivDepartment.clear();
						
						cbUnivDepartment.insertItem("-- Select Department --",0);
						for(int i=1; i< temp0.size();i++)
						{
							cbUnivDepartment.insertItem(te1.get(i),i);
						}
						
						//System.out.println("val = ");
				}
				
				
				cbUnivDepartment.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						btnDeptUpdate.setEnabled(false);
					}
				});
				
				
				////////////////////////////////
				/*for(int i=0;i<selectedSchool.size();i++){
					System.out.println("school "+selectedSchool.get(i));
				}
				
				
				int total = cbUnivDepartment.getItemCount();
				for(int i=0;i<total;i++){
					cbUnivDepartment.removeItem(i);
				}
				
				cbUnivDepartment.insertItem("nehru",0);*/
				//////////////////////////////////////
				
				
				
			}
		});
		btnDeptUpdate.setText("Department Update");
		btnDeptUpdate.setWidth("167px");
		
		horizontalPanel_22.add(lblClickToUpdate);
		
		
		cbUnivSchool.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnDeptUpdate.setEnabled(true);
				lblClickToUpdate.setText("Click to Update");
			}
		});
		
		
		Label label_83 = new Label("");
		label_83.setHeight("10px");
		vpUniv.add(label_83);
		vpUniv.add(lblUnivDepartment);
		vpUniv.add(cbUnivDepartment);
		vpUniv.add(lblUnivMajor);
		vpUniv.add(cbUnivMajor);

		// tab1Content.add(vpUniv);

		HorizontalPanel hpUnivStudent = new HorizontalPanel();
		hpUnivStudent.add(vpUniv);
		hpUnivStudent.add(vpStudent);

		tab1Content.add(hpUnivStudent);
		hpUnivStudent.setWidth("980px");

		hpUnivStudent.setCellHorizontalAlignment(vpStudent,
				HasHorizontalAlignment.ALIGN_RIGHT);
		
		HorizontalPanel horizontalPanel_20 = new HorizontalPanel();
		horizontalPanel_20.setHeight("10px");
		vpStudent.add(horizontalPanel_20);
		
		HTML html = new HTML("<hr width=100% size=3 color=blue>", true);
		horizontalPanel_20.add(html);
		html.setSize("575px", "20px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		vpStudent.add(horizontalPanel_2);

		Label lblSchoolName = new Label("School Name");
		horizontalPanel_2.add(lblSchoolName);

		Label label_26 = new Label("");
		horizontalPanel_2.add(label_26);
		label_26.setWidth("9px");

		tbSchoolName = new TextBox();
		tbSchoolName.setStyleName("gwt-TextBox-1");
		horizontalPanel_2.add(tbSchoolName);
		tbSchoolName.setWidth("192px");

		Label label_27 = new Label("");
		horizontalPanel_2.add(label_27);
		label_27.setWidth("9px");

		Label lblCity_1 = new Label("City");
		horizontalPanel_2.add(lblCity_1);

		Label label_28 = new Label("");
		horizontalPanel_2.add(label_28);
		label_28.setWidth("9px");

		tbSchoolCity = new TextBox();
		tbSchoolCity.setStyleName("gwt-TextBox-1");
		horizontalPanel_2.add(tbSchoolCity);
		tbSchoolCity.setWidth("62px");

		Label label_29 = new Label("");
		horizontalPanel_2.add(label_29);
		label_29.setWidth("9px");

		Label lblCountry_1 = new Label("Country");
		horizontalPanel_2.add(lblCountry_1);

		Label label_30 = new Label("");
		horizontalPanel_2.add(label_30);
		label_30.setWidth("9px");

		tbSchoolCountry = new TextBox();
		tbSchoolCountry.setStyleName("gwt-TextBox-1");
		horizontalPanel_2.add(tbSchoolCountry);
		tbSchoolCountry.setWidth("102px");
		
		HorizontalPanel horizontalPanel_19 = new HorizontalPanel();
		vpStudent.add(horizontalPanel_19);
		
		Label lblDateOfGraduation = new Label("Date of Graduation");
		horizontalPanel_19.add(lblDateOfGraduation);
		
		Label label_81 = new Label("");
		horizontalPanel_19.add(label_81);
		label_81.setWidth("9px");
		
		dateGraduation = new DateBox();
		dateGraduation.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("M/d/yyyy")));
		
		horizontalPanel_19.add(dateGraduation);
		dateGraduation.setWidth("89px");
		
		HorizontalPanel horizontalPanel_21 = new HorizontalPanel();
		vpStudent.add(horizontalPanel_21);
		
		HTML html_1 = new HTML("<hr width=100% size=3 color=blue>", true);
		horizontalPanel_21.add(html_1);
		html_1.setSize("575px", "10px");

		mi.fillListBox(cbUnivSchool, si, "data/school.txt");

	//	mi.fillListBox(cbUnivDepartment, si, "data/department.txt");

		mi.fillListBox(cbUnivMajor, si, "data/major.txt");

				
		// Credentials and application status
		HorizontalPanel hpApplicationCredential = new HorizontalPanel();
		tab1Content.add(hpApplicationCredential);
		hpApplicationCredential.setWidth("805px");

		VerticalPanel vpApplication = new VerticalPanel();
		VerticalPanel vpCredential = new VerticalPanel();
		hpApplicationCredential.add(vpApplication);
		vpApplication.setWidth("258px");
		hpApplicationCredential.add(vpCredential);
		vpCredential.setWidth("600px");

		hpApplicationCredential.setCellHorizontalAlignment(vpCredential,
				HasHorizontalAlignment.ALIGN_LEFT);
		// lblStudentTitle.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		Label lblApplication = new Label("");
		lblApplication.setStyleName("gwt-Label1");
		vpApplication.add(lblApplication);
		lblApplication.setSize("353px", "20px");
		
		Label lblComment = new Label("Comment");
		lblComment.setHeight("27px");
		vpApplication.add(lblComment);
		
		txtComment = new TextArea();
		vpApplication.add(txtComment);
		txtComment.setSize("310px", "96px");

		Label lblCredential = new Label("Current Credential");
		lblCredential.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		lblCredential.setStyleName("gwt-Label1");
		vpCredential.add(lblCredential);
		lblCredential.setWidth("112px");

		vpCredential.setCellHorizontalAlignment(lblCredential,
				HasHorizontalAlignment.ALIGN_LEFT);

		// ComboBox course setting for semster 1
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		vpCredential.add(horizontalPanel);

		Label lblSem = new Label("Sem 1");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel.add(lblSem);
		lblSem.setWidth("50px");

		comboBox_1_1 = new ListBox();
		horizontalPanel.add(comboBox_1_1);
		comboBox_1_1.setSize("70px", "18px");
		fillComboBox(comboBox_1_1);

		Label label_24 = new Label("");
		horizontalPanel.add(label_24);
		label_24.setWidth("5px");

		comboBox_1_2 = new ListBox();
		horizontalPanel.add(comboBox_1_2);
		comboBox_1_2.setSize("70px", "18px");
		fillComboBox(comboBox_1_2);

		Label label_25 = new Label("");
		horizontalPanel.add(label_25);
		label_25.setWidth("5px");

		comboBox_1_3 = new ListBox();
		horizontalPanel.add(comboBox_1_3);
		comboBox_1_3.setSize("70px", "18px");
		fillComboBox(comboBox_1_3);

		Label label_31 = new Label("");
		horizontalPanel.add(label_31);
		label_31.setWidth("5px");

		comboBox_1_4 = new ListBox();
		horizontalPanel.add(comboBox_1_4);
		comboBox_1_4.setSize("70px", "18px");
		fillComboBox(comboBox_1_4);

		Label label_32 = new Label("");
		horizontalPanel.add(label_32);
		label_32.setWidth("5px");

		comboBox_1_5 = new ListBox();
		horizontalPanel.add(comboBox_1_5);
		comboBox_1_5.setSize("70px", "18px");
		fillComboBox(comboBox_1_5);

		Label label_33 = new Label("");
		horizontalPanel.add(label_33);
		label_33.setWidth("5px");

		comboBox_1_6 = new ListBox();
		horizontalPanel.add(comboBox_1_6);
		comboBox_1_6.setSize("70px", "18px");
		fillComboBox(comboBox_1_6);

		Label label_34 = new Label("");
		horizontalPanel.add(label_34);
		label_34.setWidth("5px");

		comboBox_1_7 = new ListBox();
		horizontalPanel.add(comboBox_1_7);
		comboBox_1_7.setSize("70px", "18px");
		fillComboBox(comboBox_1_7);

		Label label_35 = new Label("");
		horizontalPanel.add(label_35);
		label_35.setWidth("5px");

		comboBox_1_8 = new ListBox();
		horizontalPanel.add(comboBox_1_8);
		comboBox_1_8.setSize("70px", "18px");
		fillComboBox(comboBox_1_8);

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_1);

		Label label_1_1 = new Label("");
		horizontalPanel_1.add(label_1_1);
		label_1_1.setWidth("50px");

		textBox_1_1 = new TextBox();
		horizontalPanel_1.add(textBox_1_1);
		textBox_1_1.setSize("45px", "10px");

		Label label_1_2 = new Label("");
		horizontalPanel_1.add(label_1_2);
		label_1_2.setWidth("22px");

		textBox_1_2 = new TextBox();
		horizontalPanel_1.add(textBox_1_2);
		textBox_1_2.setSize("45px", "10px");

		Label label_1_3 = new Label("");
		horizontalPanel_1.add(label_1_3);
		label_1_3.setWidth("22px");

		textBox_1_3 = new TextBox();
		horizontalPanel_1.add(textBox_1_3);
		textBox_1_3.setSize("45px", "10px");

		Label label_1_4 = new Label("");
		horizontalPanel_1.add(label_1_4);
		label_1_4.setWidth("22px");

		textBox_1_4 = new TextBox();
		horizontalPanel_1.add(textBox_1_4);
		textBox_1_4.setSize("45px", "10px");

		Label label_1_5 = new Label("");
		horizontalPanel_1.add(label_1_5);
		label_1_5.setWidth("22px");

		textBox_1_5 = new TextBox();
		horizontalPanel_1.add(textBox_1_5);
		textBox_1_5.setSize("45px", "10px");

		Label label_1_6 = new Label("");
		horizontalPanel_1.add(label_1_6);
		label_1_6.setWidth("22px");

		Label label_17 = new Label("");
		horizontalPanel_1.add(label_17);
		label_17.setWidth("22px");

		textBox_1_6 = new TextBox();
		horizontalPanel_1.add(textBox_1_6);
		textBox_1_6.setSize("45px", "10px");

		Label label_1_7 = new Label("");
		horizontalPanel_1.add(label_1_6);
		label_1_6.setWidth("22px");

		textBox_1_7 = new TextBox();
		horizontalPanel_1.add(textBox_1_7);
		textBox_1_7.setSize("45px", "10px");

		Label label_1_8 = new Label("");
		horizontalPanel_1.add(label_1_8);
		label_1_8.setWidth("22px");

		textBox_1_8 = new TextBox();
		horizontalPanel_1.add(textBox_1_8);
		textBox_1_8.setSize("45px", "10px");
		// ///////////////////////////////////////////////////////////////
		// Semester 2
		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_3);

		Label lblSem2 = new Label("Sem 2");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_3.add(lblSem2);
		lblSem2.setWidth("50px");

		comboBox_2_1 = new ListBox();
		horizontalPanel_3.add(comboBox_2_1);
		comboBox_2_1.setSize("70px", "18px");
		fillComboBox(comboBox_2_1);

		Label label_2_2 = new Label("");
		horizontalPanel_3.add(label_2_2);
		label_2_2.setWidth("5px");

		comboBox_2_2 = new ListBox();
		horizontalPanel_3.add(comboBox_2_2);
		comboBox_2_2.setSize("70px", "18px");
		fillComboBox(comboBox_2_2);

		Label label_2_3 = new Label("");
		horizontalPanel_3.add(label_2_3);
		label_2_3.setWidth("5px");

		comboBox_2_3 = new ListBox();
		horizontalPanel_3.add(comboBox_2_3);
		comboBox_2_3.setSize("70px", "18px");
		fillComboBox(comboBox_2_3);

		Label label_2_4 = new Label("");
		horizontalPanel_3.add(label_2_4);
		label_2_4.setWidth("5px");

		comboBox_2_4 = new ListBox();
		horizontalPanel_3.add(comboBox_2_4);
		comboBox_2_4.setSize("70px", "18px");
		fillComboBox(comboBox_2_4);

		Label label_2_5 = new Label("");
		horizontalPanel_3.add(label_2_5);
		label_2_5.setWidth("5px");

		comboBox_2_5 = new ListBox();
		horizontalPanel_3.add(comboBox_2_5);
		comboBox_2_5.setSize("70px", "18px");
		mi.fillListBox(comboBox_2_5, si, "data/courses.txt");
		fillComboBox(comboBox_2_5);

		Label label_2_6 = new Label("");
		horizontalPanel_3.add(label_2_6);
		label_2_6.setWidth("5px");

		comboBox_2_6 = new ListBox();
		horizontalPanel_3.add(comboBox_2_6);
		comboBox_2_6.setSize("70px", "18px");
		mi.fillListBox(comboBox_2_6, si, "data/courses.txt");
		fillComboBox(comboBox_2_6);

		Label label_2_7 = new Label("");
		horizontalPanel_3.add(label_2_7);
		label_2_7.setWidth("5px");

		comboBox_2_7 = new ListBox();
		horizontalPanel_3.add(comboBox_2_7);
		comboBox_2_7.setSize("70px", "18px");
		fillComboBox(comboBox_2_7);

		Label label_2_8 = new Label("");
		horizontalPanel_3.add(label_2_8);
		label_2_8.setWidth("5px");

		comboBox_2_8 = new ListBox();
		horizontalPanel_3.add(comboBox_2_8);
		comboBox_2_8.setSize("70px", "18px");
		fillComboBox(comboBox_2_8);

		HorizontalPanel horizontalPanel_4 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_4);

		Label label_3_1 = new Label("");
		horizontalPanel_4.add(label_3_1);
		label_3_1.setWidth("50px");

		textBox_2_1 = new TextBox();
		horizontalPanel_4.add(textBox_2_1);
		textBox_2_1.setSize("45px", "10px");

		Label label_18 = new Label(" ");
		horizontalPanel_4.add(label_18);
		label_18.setWidth("22px");

		textBox_2_2 = new TextBox();
		horizontalPanel_4.add(textBox_2_2);
		textBox_2_2.setSize("45px", "10px");

		Label label_19 = new Label("");
		horizontalPanel_4.add(label_19);
		label_19.setWidth("22px");

		textBox_2_3 = new TextBox();
		horizontalPanel_4.add(textBox_2_3);
		textBox_2_3.setSize("45px", "10px");

		Label label_20 = new Label("");
		horizontalPanel_4.add(label_20);
		label_20.setWidth("22px");

		textBox_2_4 = new TextBox();
		horizontalPanel_4.add(textBox_2_4);
		textBox_2_4.setSize("45px", "10px");

		Label label_21 = new Label("");
		horizontalPanel_4.add(label_21);
		label_21.setWidth("22px");

		textBox_2_5 = new TextBox();
		horizontalPanel_4.add(textBox_2_5);
		textBox_2_5.setSize("45px", "10px");

		Label label_22 = new Label("");
		horizontalPanel_4.add(label_22);
		label_22.setWidth("22px");

		textBox_2_6 = new TextBox();
		horizontalPanel_4.add(textBox_2_6);
		textBox_2_6.setSize("45px", "10px");

		Label label_23 = new Label("");
		horizontalPanel_4.add(label_23);
		label_23.setWidth("22px");

		textBox_2_7 = new TextBox();
		horizontalPanel_4.add(textBox_2_7);
		textBox_2_7.setSize("45px", "10px");

		Label label_36 = new Label("");
		horizontalPanel_4.add(label_36);
		label_36.setWidth("22px");

		textBox_2_8 = new TextBox();
		horizontalPanel_4.add(textBox_2_8);
		textBox_2_8.setSize("45px", "10px");

		// ///////////////////////////////////////////////////////////////////
		// Semester 3
		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_5);

		Label lblSem3 = new Label("Sem 3");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_5.add(lblSem3);
		lblSem3.setWidth("50px");

		comboBox_3_1 = new ListBox();
		horizontalPanel_5.add(comboBox_3_1);
		comboBox_3_1.setSize("70px", "18px");
		fillComboBox(comboBox_3_1);

		Label label_4_2 = new Label("");
		horizontalPanel_5.add(label_4_2);
		label_4_2.setWidth("5px");

		comboBox_3_2 = new ListBox();
		horizontalPanel_5.add(comboBox_3_2);
		comboBox_3_2.setSize("70px", "18px");
		fillComboBox(comboBox_3_2);

		Label label_4_3 = new Label("");
		horizontalPanel_5.add(label_4_3);
		label_4_3.setWidth("5px");

		comboBox_3_3 = new ListBox();
		horizontalPanel_5.add(comboBox_3_3);
		comboBox_3_3.setSize("70px", "18px");
		fillComboBox(comboBox_3_3);

		Label label_4_4 = new Label("");
		horizontalPanel_5.add(label_4_4);
		label_4_4.setWidth("5px");

		comboBox_3_4 = new ListBox();
		horizontalPanel_5.add(comboBox_3_4);
		comboBox_3_4.setSize("70px", "18px");
		fillComboBox(comboBox_3_4);

		Label label_4_5 = new Label("");
		horizontalPanel_5.add(label_4_5);
		label_4_5.setWidth("5px");

		comboBox_3_5 = new ListBox();
		horizontalPanel_5.add(comboBox_3_5);
		comboBox_3_5.setSize("70px", "18px");
		fillComboBox(comboBox_3_5);

		Label label_4_6 = new Label("");
		horizontalPanel_5.add(label_4_6);
		label_4_6.setWidth("5px");

		comboBox_3_6 = new ListBox();
		horizontalPanel_5.add(comboBox_3_6);
		comboBox_3_6.setSize("70px", "18px");
		fillComboBox(comboBox_3_6);

		Label label_4_7 = new Label("");
		horizontalPanel_5.add(label_4_7);
		label_4_7.setWidth("5px");

		comboBox_3_7 = new ListBox();
		horizontalPanel_5.add(comboBox_3_7);
		comboBox_3_7.setSize("70px", "18px");
		fillComboBox(comboBox_3_7);

		Label label_4_8 = new Label("");
		horizontalPanel_5.add(label_4_8);
		label_4_8.setWidth("5px");

		comboBox_3_8 = new ListBox();
		horizontalPanel_5.add(comboBox_3_8);
		comboBox_3_8.setSize("70px", "18px");
		fillComboBox(comboBox_3_8);

		HorizontalPanel horizontalPanel_6 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_6);

		Label label_5_1 = new Label("");
		horizontalPanel_6.add(label_5_1);
		label_5_1.setWidth("50px");

		textBox_3_1 = new TextBox();
		horizontalPanel_6.add(textBox_3_1);
		textBox_3_1.setSize("45px", "10px");

		Label label_37 = new Label("");
		horizontalPanel_6.add(label_37);
		label_37.setWidth("22px");

		textBox_3_2 = new TextBox();
		horizontalPanel_6.add(textBox_3_2);
		textBox_3_2.setSize("45px", "10px");

		Label label_38 = new Label("");
		horizontalPanel_6.add(label_38);
		label_38.setWidth("22px");

		textBox_3_3 = new TextBox();
		horizontalPanel_6.add(textBox_3_3);
		textBox_3_3.setSize("45px", "10px");

		Label label_39 = new Label("");
		horizontalPanel_6.add(label_39);
		label_39.setWidth("22px");

		textBox_3_4 = new TextBox();
		horizontalPanel_6.add(textBox_3_4);
		textBox_3_4.setSize("45px", "10px");

		Label label_40 = new Label("");
		horizontalPanel_6.add(label_40);
		label_40.setWidth("22px");

		textBox_3_5 = new TextBox();
		horizontalPanel_6.add(textBox_3_5);
		textBox_3_5.setSize("45px", "10px");

		Label label_41 = new Label("");
		horizontalPanel_6.add(label_41);
		label_41.setWidth("22px");

		textBox_3_6 = new TextBox();
		horizontalPanel_6.add(textBox_3_6);
		textBox_3_6.setSize("45px", "10px");

		Label label_42 = new Label("");
		horizontalPanel_6.add(label_42);
		label_42.setWidth("22px");

		textBox_3_7 = new TextBox();
		horizontalPanel_6.add(textBox_3_7);
		textBox_3_7.setSize("45px", "10px");

		Label label_43 = new Label("");
		horizontalPanel_6.add(label_43);
		label_43.setWidth("22px");

		textBox_3_8 = new TextBox();
		horizontalPanel_6.add(textBox_3_8);
		textBox_3_8.setSize("45px", "10px");

		// ////////////////////////////////////////////////////////////////
		// Semester 4
		HorizontalPanel horizontalPanel_7 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_7);

		Label lblSem4 = new Label("Sem 4");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_7.add(lblSem4);
		lblSem4.setWidth("50px");

		comboBox_4_1 = new ListBox();
		horizontalPanel_7.add(comboBox_4_1);
		comboBox_4_1.setSize("70px", "18px");
		fillComboBox(comboBox_4_1);

		Label label_44_2 = new Label("");
		horizontalPanel_7.add(label_44_2);
		label_44_2.setWidth("5px");

		comboBox_4_2 = new ListBox();
		horizontalPanel_7.add(comboBox_4_2);
		comboBox_4_2.setSize("70px", "18px");
		fillComboBox(comboBox_4_2);

		Label label_44_3 = new Label("");
		horizontalPanel_7.add(label_44_3);
		label_44_3.setWidth("5px");

		comboBox_4_3 = new ListBox();
		horizontalPanel_7.add(comboBox_4_3);
		comboBox_4_3.setSize("70px", "18px");
		fillComboBox(comboBox_4_3);

		Label label_44_4 = new Label("");
		horizontalPanel_7.add(label_44_4);
		label_44_4.setWidth("5px");

		comboBox_4_4 = new ListBox();
		horizontalPanel_7.add(comboBox_4_4);
		comboBox_4_4.setSize("70px", "18px");
		fillComboBox(comboBox_4_4);

		Label label_44_5 = new Label("");
		horizontalPanel_7.add(label_44_5);
		label_44_5.setWidth("5px");

		comboBox_4_5 = new ListBox();
		horizontalPanel_7.add(comboBox_4_5);
		comboBox_4_5.setSize("70px", "18px");
		fillComboBox(comboBox_4_5);

		Label label_44_6 = new Label("");
		horizontalPanel_7.add(label_44_6);
		label_44_6.setWidth("5px");

		comboBox_4_6 = new ListBox();
		horizontalPanel_7.add(comboBox_4_6);
		comboBox_4_6.setSize("70px", "18px");
		fillComboBox(comboBox_4_6);

		Label label_44_7 = new Label("");
		horizontalPanel_7.add(label_44_7);
		label_44_7.setWidth("5px");

		comboBox_4_7 = new ListBox();
		horizontalPanel_7.add(comboBox_4_7);
		comboBox_4_7.setSize("70px", "18px");
		fillComboBox(comboBox_4_7);

		Label label_44_8 = new Label("");
		horizontalPanel_7.add(label_44_8);
		label_44_8.setWidth("5px");

		comboBox_4_8 = new ListBox();
		horizontalPanel_7.add(comboBox_4_8);
		comboBox_4_8.setSize("70px", "18px");
		fillComboBox(comboBox_4_8);

		HorizontalPanel horizontalPanel_8 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_8);

		Label label_8_1 = new Label("");
		horizontalPanel_8.add(label_8_1);
		label_8_1.setWidth("50px");

		textBox_4_1 = new TextBox();
		horizontalPanel_8.add(textBox_4_1);
		textBox_4_1.setSize("45px", "10px");

		Label label_44 = new Label("");
		horizontalPanel_8.add(label_44);
		label_44.setWidth("22px");

		textBox_4_2 = new TextBox();
		horizontalPanel_8.add(textBox_4_2);
		textBox_4_2.setSize("45px", "10px");

		Label label_45 = new Label("");
		horizontalPanel_8.add(label_45);
		label_45.setWidth("22px");

		textBox_4_3 = new TextBox();
		horizontalPanel_8.add(textBox_4_3);
		textBox_4_3.setSize("45px", "10px");

		Label label_46 = new Label("");
		horizontalPanel_8.add(label_46);
		label_46.setWidth("22px");

		textBox_4_4 = new TextBox();
		horizontalPanel_8.add(textBox_4_4);
		textBox_4_4.setSize("45px", "10px");

		Label label_47 = new Label("");
		horizontalPanel_8.add(label_47);
		label_47.setWidth("22px");

		textBox_4_5 = new TextBox();
		horizontalPanel_8.add(textBox_4_5);
		textBox_4_5.setSize("45px", "10px");

		Label label_48 = new Label("");
		horizontalPanel_8.add(label_48);
		label_48.setWidth("22px");

		textBox_4_6 = new TextBox();
		horizontalPanel_8.add(textBox_4_6);
		textBox_4_6.setSize("45px", "10px");

		Label label_49 = new Label("");
		horizontalPanel_8.add(label_49);
		label_49.setWidth("22px");

		textBox_4_7 = new TextBox();
		horizontalPanel_8.add(textBox_4_7);
		textBox_4_7.setSize("45px", "10px");

		Label label_50 = new Label("");
		horizontalPanel_8.add(label_50);
		label_50.setWidth("22px");

		textBox_4_8 = new TextBox();
		horizontalPanel_8.add(textBox_4_8);
		textBox_4_8.setSize("45px", "10px");

		// ////////////////////////////////////////////////////////////////
		// Semester 5
		HorizontalPanel horizontalPanel_9 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_9);

		Label lblSem5 = new Label("Sem 5");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_9.add(lblSem5);
		lblSem5.setWidth("50px");

		comboBox_5_1 = new ListBox();
		horizontalPanel_9.add(comboBox_5_1);
		comboBox_5_1.setSize("70px", "18px");
		fillComboBox(comboBox_5_1);

		Label label_5_2 = new Label("");
		horizontalPanel_9.add(label_5_2);
		label_5_2.setWidth("5px");

		comboBox_5_2 = new ListBox();
		horizontalPanel_9.add(comboBox_5_2);
		comboBox_5_2.setSize("70px", "18px");
		fillComboBox(comboBox_5_2);

		Label label_5_3 = new Label("");
		horizontalPanel_9.add(label_5_3);
		label_5_3.setWidth("5px");

		comboBox_5_3 = new ListBox();
		horizontalPanel_9.add(comboBox_5_3);
		comboBox_5_3.setSize("70px", "18px");
		fillComboBox(comboBox_5_3);

		Label label_5_4 = new Label("");
		horizontalPanel_9.add(label_5_4);
		label_5_4.setWidth("5px");

		comboBox_5_4 = new ListBox();
		horizontalPanel_9.add(comboBox_5_4);
		comboBox_5_4.setSize("70px", "18px");
		fillComboBox(comboBox_5_4);

		Label label_5_5 = new Label("");
		horizontalPanel_9.add(label_5_5);
		label_5_5.setWidth("5px");

		comboBox_5_5 = new ListBox();
		horizontalPanel_9.add(comboBox_5_5);
		comboBox_5_5.setSize("70px", "18px");
		fillComboBox(comboBox_5_5);

		Label label_5_6 = new Label("");
		horizontalPanel_9.add(label_5_6);
		label_5_6.setWidth("5px");

		comboBox_5_6 = new ListBox();
		horizontalPanel_9.add(comboBox_5_6);
		comboBox_5_6.setSize("70px", "18px");
		fillComboBox(comboBox_5_6);

		Label label_5_7 = new Label("");
		horizontalPanel_9.add(label_5_7);
		label_5_7.setWidth("5px");

		comboBox_5_7 = new ListBox();
		horizontalPanel_9.add(comboBox_5_7);
		comboBox_5_7.setSize("70px", "18px");
		fillComboBox(comboBox_5_7);

		Label label_5_8 = new Label("");
		horizontalPanel_9.add(label_5_8);
		label_5_8.setWidth("5px");

		comboBox_5_8 = new ListBox();
		horizontalPanel_9.add(comboBox_5_8);
		comboBox_5_8.setSize("70px", "18px");
		fillComboBox(comboBox_5_8);

		HorizontalPanel horizontalPanel_10 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_10);

		Label label_10_1 = new Label("");
		horizontalPanel_10.add(label_10_1);
		label_10_1.setWidth("50px");

		textBox_5_1 = new TextBox();
		horizontalPanel_10.add(textBox_5_1);
		textBox_5_1.setSize("45px", "10px");

		Label label_51 = new Label("");
		horizontalPanel_10.add(label_51);
		label_51.setWidth("22px");

		textBox_5_2 = new TextBox();
		horizontalPanel_10.add(textBox_5_2);
		textBox_5_2.setSize("45px", "10px");

		Label label_52 = new Label("");
		horizontalPanel_10.add(label_52);
		label_52.setWidth("22px");

		textBox_5_3 = new TextBox();
		horizontalPanel_10.add(textBox_5_3);
		textBox_5_3.setSize("45px", "10px");

		Label label_53 = new Label("");
		horizontalPanel_10.add(label_53);
		label_53.setWidth("22px");

		textBox_5_4 = new TextBox();
		horizontalPanel_10.add(textBox_5_4);
		textBox_5_4.setSize("45px", "10px");

		Label label_54 = new Label("");
		horizontalPanel_10.add(label_54);
		label_54.setWidth("22px");

		textBox_5_5 = new TextBox();
		horizontalPanel_10.add(textBox_5_5);
		textBox_5_5.setSize("45px", "10px");

		Label label_55 = new Label("");
		horizontalPanel_10.add(label_55);
		label_55.setWidth("22px");

		textBox_5_6 = new TextBox();
		horizontalPanel_10.add(textBox_5_6);
		textBox_5_6.setSize("45px", "10px");

		Label label_56 = new Label("");
		horizontalPanel_10.add(label_56);
		label_56.setWidth("22px");

		textBox_5_7 = new TextBox();
		horizontalPanel_10.add(textBox_5_7);
		textBox_5_7.setSize("45px", "10px");

		Label label_57 = new Label("");
		horizontalPanel_10.add(label_57);
		label_57.setWidth("22px");

		textBox_5_8 = new TextBox();
		horizontalPanel_10.add(textBox_5_8);
		textBox_5_8.setSize("45px", "10px");

		// ////////////////////////////////////////////////////////////////
		// Semester 6
		HorizontalPanel horizontalPanel_11 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_11);

		Label lblSem6 = new Label("Sem 6");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_11.add(lblSem6);
		lblSem6.setWidth("50px");

		comboBox_6_1 = new ListBox();
		horizontalPanel_11.add(comboBox_6_1);
		comboBox_6_1.setSize("70px", "18px");
		fillComboBox(comboBox_6_1);

		Label label_6_2 = new Label("");
		horizontalPanel_11.add(label_6_2);
		label_6_2.setWidth("5px");

		comboBox_6_2 = new ListBox();
		horizontalPanel_11.add(comboBox_6_2);
		comboBox_6_2.setSize("70px", "18px");
		fillComboBox(comboBox_6_2);

		Label label_6_3 = new Label("");
		horizontalPanel_11.add(label_6_3);
		label_6_3.setWidth("5px");

		comboBox_6_3 = new ListBox();
		horizontalPanel_11.add(comboBox_6_3);
		comboBox_6_3.setSize("70px", "18px");
		fillComboBox(comboBox_6_3);

		Label label_6_4 = new Label("");
		horizontalPanel_11.add(label_6_4);
		label_6_4.setWidth("5px");

		comboBox_6_4 = new ListBox();
		horizontalPanel_11.add(comboBox_6_4);
		comboBox_6_4.setSize("70px", "18px");
		fillComboBox(comboBox_6_4);

		Label label_6_5 = new Label("");
		horizontalPanel_11.add(label_6_5);
		label_6_5.setWidth("5px");

		comboBox_6_5 = new ListBox();
		horizontalPanel_11.add(comboBox_6_5);
		comboBox_6_5.setSize("70px", "18px");
		fillComboBox(comboBox_6_5);

		Label label_6_6 = new Label("");
		horizontalPanel_11.add(label_6_6);
		label_6_6.setWidth("5px");

		comboBox_6_6 = new ListBox();
		horizontalPanel_11.add(comboBox_6_6);
		comboBox_6_6.setSize("70px", "18px");
		fillComboBox(comboBox_6_6);

		Label label_6_7 = new Label("");
		horizontalPanel_11.add(label_6_7);
		label_6_7.setWidth("5px");

		comboBox_6_7 = new ListBox();
		horizontalPanel_11.add(comboBox_6_7);
		comboBox_6_7.setSize("70px", "18px");
		fillComboBox(comboBox_6_7);

		Label label_6_8 = new Label("");
		horizontalPanel_11.add(label_6_8);
		label_6_8.setWidth("5px");

		comboBox_6_8 = new ListBox();
		horizontalPanel_11.add(comboBox_6_8);
		comboBox_6_8.setSize("70px", "18px");
		fillComboBox(comboBox_6_8);

		HorizontalPanel horizontalPanel_12 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_12);

		Label label_12_1 = new Label("");
		horizontalPanel_12.add(label_12_1);
		label_12_1.setWidth("50px");

		textBox_6_1 = new TextBox();
		horizontalPanel_12.add(textBox_6_1);
		textBox_6_1.setSize("45px", "10px");

		Label label_58 = new Label("");
		horizontalPanel_12.add(label_58);
		label_58.setWidth("22px");

		textBox_6_2 = new TextBox();
		horizontalPanel_12.add(textBox_6_2);
		textBox_6_2.setSize("45px", "10px");

		Label label_59 = new Label("");
		horizontalPanel_12.add(label_59);
		label_59.setWidth("22px");

		textBox_6_3 = new TextBox();
		horizontalPanel_12.add(textBox_6_3);
		textBox_6_3.setSize("45px", "10px");

		Label label_60 = new Label("");
		horizontalPanel_12.add(label_60);
		label_60.setWidth("22px");

		textBox_6_4 = new TextBox();
		horizontalPanel_12.add(textBox_6_4);
		textBox_6_4.setSize("45px", "10px");

		Label label_61 = new Label("");
		horizontalPanel_12.add(label_61);
		label_61.setWidth("22px");

		textBox_6_5 = new TextBox();
		horizontalPanel_12.add(textBox_6_5);
		textBox_6_5.setSize("45px", "10px");

		Label label_62 = new Label("");
		horizontalPanel_12.add(label_62);
		label_62.setWidth("22px");

		textBox_6_6 = new TextBox();
		horizontalPanel_12.add(textBox_6_6);
		textBox_6_6.setSize("45px", "10px");

		Label label_63 = new Label("");
		horizontalPanel_12.add(label_63);
		label_63.setWidth("22px");

		textBox_6_7 = new TextBox();
		horizontalPanel_12.add(textBox_6_7);
		textBox_6_7.setSize("45px", "10px");

		Label label_64 = new Label("");
		horizontalPanel_12.add(label_64);
		label_64.setWidth("22px");

		textBox_6_8 = new TextBox();
		horizontalPanel_12.add(textBox_6_8);
		textBox_6_8.setSize("45px", "10px");

		// ///////////////////////////////////////////////////////////////
		// Semester 7
		HorizontalPanel horizontalPanel_13 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_13);

		Label lblSem7 = new Label("Sem 7");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_13.add(lblSem7);
		lblSem7.setWidth("50px");

		comboBox_7_1 = new ListBox();
		horizontalPanel_13.add(comboBox_7_1);
		comboBox_7_1.setSize("70px", "18px");
		fillComboBox(comboBox_7_1);

		Label label_7_2 = new Label("");
		horizontalPanel_13.add(label_7_2);
		label_7_2.setWidth("5px");

		comboBox_7_2 = new ListBox();
		horizontalPanel_13.add(comboBox_7_2);
		comboBox_7_2.setSize("70px", "18px");
		fillComboBox(comboBox_7_2);

		Label label_7_3 = new Label("");
		horizontalPanel_13.add(label_7_3);
		label_7_3.setWidth("5px");

		comboBox_7_3 = new ListBox();
		horizontalPanel_13.add(comboBox_7_3);
		comboBox_7_3.setSize("70px", "18px");
		fillComboBox(comboBox_7_3);

		Label label_7_4 = new Label("");
		horizontalPanel_13.add(label_7_4);
		label_7_4.setWidth("5px");

		comboBox_7_4 = new ListBox();
		horizontalPanel_13.add(comboBox_7_4);
		comboBox_7_4.setSize("70px", "18px");
		fillComboBox(comboBox_7_4);

		Label label_7_5 = new Label("");
		horizontalPanel_13.add(label_7_5);
		label_7_5.setWidth("5px");

		comboBox_7_5 = new ListBox();
		horizontalPanel_13.add(comboBox_7_5);
		comboBox_7_5.setSize("70px", "18px");
		fillComboBox(comboBox_7_5);

		Label label_7_6 = new Label("");
		horizontalPanel_13.add(label_7_6);
		label_7_6.setWidth("5px");

		comboBox_7_6 = new ListBox();
		horizontalPanel_13.add(comboBox_7_6);
		comboBox_7_6.setSize("70px", "18px");
		fillComboBox(comboBox_7_6);

		Label label_7_7 = new Label("");
		horizontalPanel_13.add(label_7_7);
		label_7_7.setWidth("5px");

		comboBox_7_7 = new ListBox();
		horizontalPanel_13.add(comboBox_7_7);
		comboBox_7_7.setSize("70px", "18px");
		fillComboBox(comboBox_7_7);

		Label label_7_8 = new Label("");
		horizontalPanel_13.add(label_7_8);
		label_7_8.setWidth("5px");

		comboBox_7_8 = new ListBox();
		horizontalPanel_13.add(comboBox_7_8);
		comboBox_7_8.setSize("70px", "18px");
		fillComboBox(comboBox_7_8);

		HorizontalPanel horizontalPanel_14 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_14);

		Label label_14_1 = new Label("");
		horizontalPanel_14.add(label_14_1);
		label_14_1.setWidth("50px");

		textBox_7_1 = new TextBox();
		horizontalPanel_14.add(textBox_7_1);
		textBox_7_1.setSize("45px", "10px");

		Label label_65 = new Label("");
		horizontalPanel_14.add(label_65);
		label_65.setWidth("22px");

		textBox_7_2 = new TextBox();
		horizontalPanel_14.add(textBox_7_2);
		textBox_7_2.setSize("45px", "10px");

		Label label_66 = new Label("");
		horizontalPanel_14.add(label_66);
		label_66.setWidth("22px");

		textBox_7_3 = new TextBox();
		horizontalPanel_14.add(textBox_7_3);
		textBox_7_3.setSize("45px", "10px");

		Label label_67 = new Label("");
		horizontalPanel_14.add(label_67);
		label_67.setWidth("22px");

		textBox_7_4 = new TextBox();
		horizontalPanel_14.add(textBox_7_4);
		textBox_7_4.setSize("45px", "10px");

		Label label_68 = new Label("");
		horizontalPanel_14.add(label_68);
		label_68.setWidth("22px");

		textBox_7_5 = new TextBox();
		horizontalPanel_14.add(textBox_7_5);
		textBox_7_5.setSize("45px", "10px");

		Label label_69 = new Label("");
		horizontalPanel_14.add(label_69);
		label_69.setWidth("22px");

		textBox_7_6 = new TextBox();
		horizontalPanel_14.add(textBox_7_6);
		textBox_7_6.setSize("45px", "10px");

		Label label_70 = new Label("");
		horizontalPanel_14.add(label_70);
		label_70.setWidth("22px");

		textBox_7_7 = new TextBox();
		horizontalPanel_14.add(textBox_7_7);
		textBox_7_7.setSize("45px", "10px");

		Label label_71 = new Label("");
		horizontalPanel_14.add(label_71);
		label_71.setWidth("22px");

		textBox_7_8 = new TextBox();
		horizontalPanel_14.add(textBox_7_8);
		textBox_7_8.setSize("45px", "10px");

		// /////////////////////////////////////////////////////////////
		// Semester 8
		HorizontalPanel horizontalPanel_15 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_15);

		Label lblSem8 = new Label("Sem 8");
		lblSem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		horizontalPanel_15.add(lblSem8);
		lblSem8.setWidth("50px");

		comboBox_8_1 = new ListBox();
		horizontalPanel_15.add(comboBox_8_1);
		comboBox_8_1.setSize("70px", "18px");
		fillComboBox(comboBox_8_1);

		Label label_8_2 = new Label("");
		horizontalPanel_15.add(label_8_2);
		label_8_2.setWidth("5px");

		comboBox_8_2 = new ListBox();
		horizontalPanel_15.add(comboBox_8_2);
		comboBox_8_2.setSize("70px", "18px");
		fillComboBox(comboBox_8_2);

		Label label_8_3 = new Label("");
		horizontalPanel_15.add(label_8_3);
		label_8_3.setWidth("5px");

		comboBox_8_3 = new ListBox();
		horizontalPanel_15.add(comboBox_8_3);
		comboBox_8_3.setSize("70px", "18px");
		fillComboBox(comboBox_8_3);

		Label label_8_4 = new Label("");
		horizontalPanel_15.add(label_8_4);
		label_8_4.setWidth("5px");

		comboBox_8_4 = new ListBox();
		horizontalPanel_15.add(comboBox_8_4);
		comboBox_8_4.setSize("70px", "18px");
		fillComboBox(comboBox_8_4);

		Label label_8_5 = new Label("");
		horizontalPanel_15.add(label_8_5);
		label_8_5.setWidth("5px");

		comboBox_8_5 = new ListBox();
		horizontalPanel_15.add(comboBox_8_5);
		comboBox_8_5.setSize("70px", "18px");
		fillComboBox(comboBox_8_5);

		Label label_8_6 = new Label("");
		horizontalPanel_15.add(label_8_6);
		label_8_6.setWidth("5px");

		comboBox_8_6 = new ListBox();
		horizontalPanel_15.add(comboBox_8_6);
		comboBox_8_6.setSize("70px", "18px");
		fillComboBox(comboBox_8_6);

		Label label_8_7 = new Label("");
		horizontalPanel_15.add(label_8_7);
		label_8_7.setWidth("5px");

		comboBox_8_7 = new ListBox();
		horizontalPanel_15.add(comboBox_8_7);
		comboBox_8_7.setSize("70px", "18px");
		fillComboBox(comboBox_8_7);

		Label label_8_8 = new Label("");
		horizontalPanel_15.add(label_8_8);
		label_8_8.setWidth("5px");

		comboBox_8_8 = new ListBox();
		horizontalPanel_15.add(comboBox_8_8);
		comboBox_8_8.setSize("70px", "18px");
		fillComboBox(comboBox_8_8);

		HorizontalPanel horizontalPanel_16 = new HorizontalPanel();
		vpCredential.add(horizontalPanel_16);

		Label label_16_1 = new Label("");
		horizontalPanel_16.add(label_16_1);
		label_16_1.setWidth("50px");

		textBox_8_1 = new TextBox();
		horizontalPanel_16.add(textBox_8_1);
		textBox_8_1.setSize("45px", "10px");

		Label label_72 = new Label("");
		horizontalPanel_16.add(label_72);
		label_72.setWidth("22px");

		textBox_8_2 = new TextBox();
		horizontalPanel_16.add(textBox_8_2);
		textBox_8_2.setSize("45px", "10px");

		Label label_73 = new Label("");
		horizontalPanel_16.add(label_73);
		label_73.setWidth("22px");

		textBox_8_3 = new TextBox();
		horizontalPanel_16.add(textBox_8_3);
		textBox_8_3.setSize("45px", "10px");

		Label label_74 = new Label("");
		horizontalPanel_16.add(label_74);
		label_74.setWidth("22px");

		textBox_8_4 = new TextBox();
		horizontalPanel_16.add(textBox_8_4);
		textBox_8_4.setSize("45px", "10px");

		Label label_75 = new Label("");
		horizontalPanel_16.add(label_75);
		label_75.setWidth("22px");

		textBox_8_5 = new TextBox();
		horizontalPanel_16.add(textBox_8_5);
		textBox_8_5.setSize("45px", "10px");

		Label label_76 = new Label("");
		horizontalPanel_16.add(label_76);
		label_76.setWidth("22px");

		textBox_8_6 = new TextBox();
		horizontalPanel_16.add(textBox_8_6);
		textBox_8_6.setSize("45px", "10px");

		Label label_77 = new Label("");
		horizontalPanel_16.add(label_77);
		label_77.setWidth("22px");

		textBox_8_7 = new TextBox();
		horizontalPanel_16.add(textBox_8_7);
		textBox_8_7.setSize("45px", "10px");

		Label label_78 = new Label("");
		horizontalPanel_16.add(label_78);
		label_78.setWidth("22px");

		textBox_8_8 = new TextBox();
		horizontalPanel_16.add(textBox_8_8);
		textBox_8_8.setSize("45px", "10px");

		Label label_79 = new Label("");
		label_79.setStyleName("gwt-Label-line");
		label_79.setHeight("15px");
		vpCredential.add(label_79);

		HorizontalPanel horizontalPanel_17 = new HorizontalPanel();
		horizontalPanel_17
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		vpCredential.add(horizontalPanel_17);
		horizontalPanel_17.setWidth("645px");

		HorizontalPanel horizontalPanel_18 = new HorizontalPanel();
		horizontalPanel_17.add(horizontalPanel_18);

		
		
		
		
		
		Button btnCancel = new Button("New button");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				if(!sfm.isEditClicked()){   
					//Window.alert("cancel clicked");
					tbFirstName.setText("");
					tbFirstName.setText("");
					tbMiddleName.setText("");
					tbLastName.setText("");
					tbAddress.setText("");
					tbCity.setText("");
					tbState.setText("");
					tbZip.setText("");
					tbCountry.setText("");
					tbEmail.setText("");
					tbSchoolName.setText("");
					tbSchoolCity.setText("");
					tbSchoolCountry.setText("");
					cbUnivSchool.setItemSelected(0, true);
					cbUnivDepartment.setItemSelected(0, true);
					cbUnivMajor.setItemSelected(0, true);
					
				}
				
				if(sfm.isEditClicked()){
				tabPanel.remove(getMainForm());
				tabPanel.selectTab(0);
				sfm.setEditClicked(false);
				}
				
			}
		});
		btnCancel.setStyleName("logout");
		btnCancel.setText("Cancel");
		horizontalPanel_18.add(btnCancel);

		Label label_80 = new Label("");
		horizontalPanel_18.add(label_80);
		label_80.setWidth("22px");
		
		
		//Submit button
		Button btnSubmit = new Button("New button");
		btnSubmit.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				//Get selected school from the comboBox
				selectedSchool.clear();
				for(int i=0,l=cbUnivSchool.getItemCount();i<l;i++){
					if(cbUnivSchool.isItemSelected(i)){
						selectedSchool.add(cbUnivSchool.getItemText(i));
					}
					
				}
				
				/*for(String s : selectedSchool){
					Window.alert(s);
				}*/
		
			 
				
		//final Mdialog md = new Mdialog();
		kt = 0;		
						
		 String allSchool = "\n";
			
		for(idx=0;idx<selectedSchool.size();idx++){		
			
		 final String schoolName = selectedSchool.get(idx);
			 
		 allSchool += schoolName +",";
		 
			//Window.alert("id="+id);
			 
			
			//md.setHTML("Do you want to Apply to the university "+selectedSchool.get(idx));
			 
			//md.setPopupPosition(400, 200);
			
			
			 
			/*md.getBtnOk().addClickHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
					 Window.alert("ok pressed");
					
				}
				
			});*/
			
			/*md.getBtnCancel().addClickHandler(new ClickHandler(){
				 
				@Override
				public void onClick(ClickEvent event) {
					//Window.alert("cancel pressede");
					 md.hide();
					 
					return;
				}
				
			});*/
			
			 
			
		//	md.getBtnOk().addClickHandler(new ClickHandler(){

		//		@Override
		//		public void onClick(ClickEvent event) {
					 //Window.alert("ok pressed");
		//			md.show();
					
		//			 md.hide();
				//validate textbox data
				if(!mi.isNull(tbFirstName.getText())){
					Window.alert("Enter First name");
					 
					return;
				}
				else if(!mi.isNull(tbLastName.getText())){
					Window.alert("Enter Last name");
					 
					return;
				}
				else if(!mi.isNull(tbAddress.getText()))
				{
					Window.alert("Enter Address");
					 
					return;
				}
				else if(!mi.isNull(tbState.getText()))
				{
					Window.alert("Enter State");
					 
					return;
					
				}
				else if(!mi.isNull(tbZip.getText()))
				{
					Window.alert("Enter zip");
					 
					return;
				}
				else if(!mi.isNull(tbCountry.getText()))
				{
					Window.alert("Enter country");
					 
					return;
				}
				else if(!mi.isNull(tbSchoolName.getText()))
				{
					Window.alert("Enter school name");
					
					return;
				}
				else if(!mi.isNull(tbSchoolCity.getText()))
				{
					Window.alert("Enter school city");
					 
					return;
				}
				else if(cbUnivSchool.getItemText(cbUnivSchool.getSelectedIndex()).equals("-- Select School --"))
				{
					Window.alert("Select name of school");
					 
					return;
				}
				else if(cbUnivDepartment.getItemText(cbUnivDepartment.getSelectedIndex()).equals("-- Select Department --"))
				{
					Window.alert("Select department");
					 
					return;
				}
				else if(cbUnivMajor.getItemText(cbUnivMajor.getSelectedIndex()).equals("-- Select Major --"))
				{
					Window.alert("Select major");
					 
					return;
				}
				else if(dateGraduation.getValue()== null){
					Window.alert("Select graduation date");
					 
					return;
				}
				
				
			 	
				StudentData sd = new StudentData();

				sd.setLemail(lscr.getLemail());

				
				String schoolCode = selectedSchool.get(kt);
				//Window.alert("kt= "+kt);
				
				kt++;
				
				
				
				String[] cval = schoolCode.split("-");

				sd.setAppliedSchoolName(cval[0]);
				sd.setUcode(cval[1]);

				// sd.setAppliedSchoolName(cbUnivSchool.getItemText(cbUnivSchool.getSelectedIndex()));

				sd.setDepartment(cbUnivDepartment.getItemText(cbUnivDepartment
						.getSelectedIndex()));
				sd.setMajor(cbUnivMajor.getItemText(cbUnivMajor
						.getSelectedIndex()));
				
				sd.setFirstName(mi.isNull(tbFirstName.getText())? tbFirstName.getText() : "");
				sd.setMiddleName(mi.isNull(tbMiddleName.getText())? tbMiddleName.getText() : "");
				sd.setLastName(mi.isNull(tbLastName.getText())? tbLastName.getText() : "");
				sd.setAddress(mi.isNull(tbAddress.getText())? tbAddress.getText() : "");
				sd.setState(mi.isNull(tbState.getText())? tbState.getText() : "");
				sd.setCity(mi.isNull(tbCity.getText())? tbCity.getText() : "");
				sd.setZip(mi.isNull(tbZip.getText())? tbZip.getText() : "");
				sd.setCountry(mi.isNull(tbCountry.getText())? tbCountry.getText() : "");
				
				sd.setEmail(mi.isNull(tbEmail.getText())? tbEmail.getText() : "");
				
				sd.setStudiedSchoolName(mi.isNull(tbSchoolName.getText())? tbSchoolName.getText() : "");
				sd.setStudiedSchoolCity(mi.isNull(tbSchoolCity.getText())? tbSchoolCity.getText() : "");
				sd.setStudiedSchoolCountry(mi.isNull(tbSchoolCountry.getText())? tbSchoolCountry.getText() : "");
				
				sd.setComboBox_1_1(comboBox_1_1.getItemText(comboBox_1_1.getSelectedIndex()));
				sd.setComboBox_1_2(comboBox_1_2.getItemText(comboBox_1_2.getSelectedIndex()));
				sd.setComboBox_1_3(comboBox_1_3.getItemText(comboBox_1_3.getSelectedIndex()));
				sd.setComboBox_1_4(comboBox_1_4.getItemText(comboBox_1_4.getSelectedIndex()));
				sd.setComboBox_1_5(comboBox_1_5.getItemText(comboBox_1_5.getSelectedIndex()));
				sd.setComboBox_1_6(comboBox_1_6.getItemText(comboBox_1_6.getSelectedIndex()));
				sd.setComboBox_1_7(comboBox_1_7.getItemText(comboBox_1_7.getSelectedIndex()));
				sd.setComboBox_1_8(comboBox_1_8.getItemText(comboBox_1_8.getSelectedIndex()));
				
				sd.setComboBox_2_1(comboBox_2_1.getItemText(comboBox_2_1.getSelectedIndex()));
				sd.setComboBox_2_2(comboBox_2_2.getItemText(comboBox_2_2.getSelectedIndex()));
				sd.setComboBox_2_3(comboBox_2_3.getItemText(comboBox_2_3.getSelectedIndex()));
				sd.setComboBox_2_4(comboBox_2_4.getItemText(comboBox_2_4.getSelectedIndex()));
				sd.setComboBox_2_5(comboBox_2_5.getItemText(comboBox_2_5.getSelectedIndex()));
				sd.setComboBox_2_6(comboBox_2_6.getItemText(comboBox_2_6.getSelectedIndex()));
				sd.setComboBox_2_7(comboBox_2_7.getItemText(comboBox_2_7.getSelectedIndex()));
				sd.setComboBox_2_8(comboBox_2_8.getItemText(comboBox_2_8.getSelectedIndex()));
				
				sd.setComboBox_3_1(comboBox_3_1.getItemText(comboBox_3_1.getSelectedIndex()));
				sd.setComboBox_3_2(comboBox_3_2.getItemText(comboBox_3_2.getSelectedIndex()));
				sd.setComboBox_3_3(comboBox_3_3.getItemText(comboBox_3_3.getSelectedIndex()));
				sd.setComboBox_3_4(comboBox_3_4.getItemText(comboBox_3_4.getSelectedIndex()));
				sd.setComboBox_3_5(comboBox_3_5.getItemText(comboBox_3_5.getSelectedIndex()));
				sd.setComboBox_3_6(comboBox_3_6.getItemText(comboBox_3_6.getSelectedIndex()));
				sd.setComboBox_3_7(comboBox_3_7.getItemText(comboBox_3_7.getSelectedIndex()));
				sd.setComboBox_3_8(comboBox_3_8.getItemText(comboBox_3_8.getSelectedIndex()));
				
				sd.setComboBox_4_1(comboBox_4_1.getItemText(comboBox_4_1.getSelectedIndex()));
				sd.setComboBox_4_2(comboBox_4_2.getItemText(comboBox_4_2.getSelectedIndex()));
				sd.setComboBox_4_3(comboBox_4_3.getItemText(comboBox_4_3.getSelectedIndex()));
				sd.setComboBox_4_4(comboBox_4_4.getItemText(comboBox_4_4.getSelectedIndex()));
				sd.setComboBox_4_5(comboBox_4_5.getItemText(comboBox_4_5.getSelectedIndex()));
				sd.setComboBox_4_6(comboBox_4_6.getItemText(comboBox_4_6.getSelectedIndex()));
				sd.setComboBox_4_7(comboBox_4_7.getItemText(comboBox_4_7.getSelectedIndex()));
				sd.setComboBox_4_8(comboBox_4_8.getItemText(comboBox_4_8.getSelectedIndex()));
				
				sd.setComboBox_5_1(comboBox_5_1.getItemText(comboBox_5_1.getSelectedIndex()));
				sd.setComboBox_5_2(comboBox_5_2.getItemText(comboBox_5_2.getSelectedIndex()));
				sd.setComboBox_5_3(comboBox_5_3.getItemText(comboBox_5_3.getSelectedIndex()));
				sd.setComboBox_5_4(comboBox_5_4.getItemText(comboBox_5_4.getSelectedIndex()));
				sd.setComboBox_5_5(comboBox_5_5.getItemText(comboBox_5_5.getSelectedIndex()));
				sd.setComboBox_5_6(comboBox_5_6.getItemText(comboBox_5_6.getSelectedIndex()));
				sd.setComboBox_5_7(comboBox_5_7.getItemText(comboBox_5_7.getSelectedIndex()));
				sd.setComboBox_5_8(comboBox_5_8.getItemText(comboBox_5_8.getSelectedIndex()));
				
				sd.setComboBox_6_1(comboBox_6_1.getItemText(comboBox_6_1.getSelectedIndex()));
				sd.setComboBox_6_2(comboBox_6_2.getItemText(comboBox_6_2.getSelectedIndex()));
				sd.setComboBox_6_3(comboBox_6_3.getItemText(comboBox_6_3.getSelectedIndex()));
				sd.setComboBox_6_4(comboBox_6_4.getItemText(comboBox_6_4.getSelectedIndex()));
				sd.setComboBox_6_5(comboBox_6_5.getItemText(comboBox_6_5.getSelectedIndex()));
				sd.setComboBox_6_6(comboBox_6_6.getItemText(comboBox_6_6.getSelectedIndex()));
				sd.setComboBox_6_7(comboBox_6_7.getItemText(comboBox_6_7.getSelectedIndex()));
				sd.setComboBox_6_8(comboBox_6_8.getItemText(comboBox_6_8.getSelectedIndex()));
				
				sd.setComboBox_7_1(comboBox_7_1.getItemText(comboBox_7_1.getSelectedIndex()));
				sd.setComboBox_7_2(comboBox_7_2.getItemText(comboBox_7_2.getSelectedIndex()));
				sd.setComboBox_7_3(comboBox_7_3.getItemText(comboBox_7_3.getSelectedIndex()));
				sd.setComboBox_7_4(comboBox_7_4.getItemText(comboBox_7_4.getSelectedIndex()));
				sd.setComboBox_7_5(comboBox_7_5.getItemText(comboBox_7_5.getSelectedIndex()));
				sd.setComboBox_7_6(comboBox_7_6.getItemText(comboBox_7_6.getSelectedIndex()));
				sd.setComboBox_7_7(comboBox_7_7.getItemText(comboBox_7_7.getSelectedIndex()));
				sd.setComboBox_7_8(comboBox_7_8.getItemText(comboBox_7_8.getSelectedIndex()));
				
				sd.setComboBox_8_1(comboBox_8_1.getItemText(comboBox_8_1.getSelectedIndex()));
				sd.setComboBox_8_2(comboBox_8_2.getItemText(comboBox_8_2.getSelectedIndex()));
				sd.setComboBox_8_3(comboBox_8_3.getItemText(comboBox_8_3.getSelectedIndex()));
				sd.setComboBox_8_4(comboBox_8_4.getItemText(comboBox_8_4.getSelectedIndex()));
				sd.setComboBox_8_5(comboBox_8_5.getItemText(comboBox_8_5.getSelectedIndex()));
				sd.setComboBox_8_6(comboBox_8_6.getItemText(comboBox_8_6.getSelectedIndex()));
				sd.setComboBox_8_7(comboBox_8_7.getItemText(comboBox_8_7.getSelectedIndex()));
				sd.setComboBox_8_8(comboBox_8_8.getItemText(comboBox_8_8.getSelectedIndex()));
				
				sd.setTextBox_1_1(textBox_1_1.getText());
				sd.setTextBox_1_2(textBox_1_2.getText());
				sd.setTextBox_1_3(textBox_1_3.getText());
				sd.setTextBox_1_4(textBox_1_4.getText());
				sd.setTextBox_1_5(textBox_1_5.getText());
				sd.setTextBox_1_6(textBox_1_6.getText());
				sd.setTextBox_1_7(textBox_1_7.getText());
				sd.setTextBox_1_8(textBox_1_8.getText());
				
				sd.setTextBox_2_1(textBox_2_1.getText());
				sd.setTextBox_2_2(textBox_2_2.getText());
				sd.setTextBox_2_3(textBox_2_3.getText());
				sd.setTextBox_2_4(textBox_2_4.getText());
				sd.setTextBox_2_5(textBox_2_5.getText());
				sd.setTextBox_2_6(textBox_2_6.getText());
				sd.setTextBox_2_7(textBox_2_7.getText());
				sd.setTextBox_2_8(textBox_2_8.getText());
				
				sd.setTextBox_3_1(textBox_3_1.getText());
				sd.setTextBox_3_2(textBox_3_2.getText());
				sd.setTextBox_3_3(textBox_3_3.getText());
				sd.setTextBox_3_4(textBox_3_4.getText());
				sd.setTextBox_3_5(textBox_3_5.getText());
				sd.setTextBox_3_6(textBox_3_6.getText());
				sd.setTextBox_3_7(textBox_3_7.getText());
				sd.setTextBox_3_8(textBox_3_8.getText());
				
				sd.setTextBox_4_1(textBox_4_1.getText());
				sd.setTextBox_4_2(textBox_4_2.getText());
				sd.setTextBox_4_3(textBox_4_3.getText());
				sd.setTextBox_4_4(textBox_4_4.getText());
				sd.setTextBox_4_5(textBox_4_5.getText());
				sd.setTextBox_4_6(textBox_4_6.getText());
				sd.setTextBox_4_7(textBox_4_7.getText());
				sd.setTextBox_4_8(textBox_4_8.getText());
				
				sd.setTextBox_5_1(textBox_5_1.getText());
				sd.setTextBox_5_2(textBox_5_2.getText());
				sd.setTextBox_5_3(textBox_5_3.getText());
				sd.setTextBox_5_4(textBox_5_4.getText());
				sd.setTextBox_5_5(textBox_5_5.getText());
				sd.setTextBox_5_6(textBox_5_6.getText());
				sd.setTextBox_5_7(textBox_5_7.getText());
				sd.setTextBox_5_8(textBox_5_8.getText());
				
				sd.setTextBox_6_1(textBox_6_1.getText());
				sd.setTextBox_6_2(textBox_6_2.getText());
				sd.setTextBox_6_3(textBox_6_3.getText());
				sd.setTextBox_6_4(textBox_6_4.getText());
				sd.setTextBox_6_5(textBox_6_5.getText());
				sd.setTextBox_6_6(textBox_6_6.getText());
				sd.setTextBox_6_7(textBox_6_7.getText());
				sd.setTextBox_6_8(textBox_6_8.getText());
				
				sd.setTextBox_7_1(textBox_7_1.getText());
				sd.setTextBox_7_2(textBox_7_2.getText());
				sd.setTextBox_7_3(textBox_7_3.getText());
				sd.setTextBox_7_4(textBox_7_4.getText());
				sd.setTextBox_7_5(textBox_7_5.getText());
				sd.setTextBox_7_6(textBox_7_6.getText());
				sd.setTextBox_7_7(textBox_7_7.getText());
				sd.setTextBox_7_8(textBox_7_8.getText());
				
				sd.setTextBox_8_1(textBox_8_1.getText());
				sd.setTextBox_8_2(textBox_8_2.getText());
				sd.setTextBox_8_3(textBox_8_3.getText());
				sd.setTextBox_8_4(textBox_8_4.getText());
				sd.setTextBox_8_5(textBox_8_5.getText());
				sd.setTextBox_8_6(textBox_8_6.getText());
				sd.setTextBox_8_7(textBox_8_7.getText());
				sd.setTextBox_8_8(textBox_8_8.getText());
				
				sd.setTxtComment(txtComment.getText());
				String val = txtComment.getText();
				System.out.println("val ="+val);
				
				final Format dateboxFormat=new DateBox.DefaultFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
				dateGraduation.setFormat(dateboxFormat);
				 
				
				sd.setDateGraduation(dateGraduation.getValue());
				
				Date tt = dateGraduation.getValue();
				System.out.println("tt="+tt);
				
				//if edit clicked then pass old student data to delete and new student data to persist
				if(sfm.isEditClicked()){
					
					try {
						si.getStudentDataServiceAsync().addStudentData(sfm.getOldData(),sd,new AsyncCallback<String>() {

									@Override
									public void onFailure(Throwable caught) {
										Window.alert("server failure");
									}

									@Override
									public void onSuccess(String result) {
										String val = result;
										if (val != null) {
											if (val.equals("ok")) {
												 
												
												Window.alert("Applied to school "+schoolName);
												sfm.getEntries();
												
												//if edit button clicked after submit remove edit item tab and go to previous tab
												if(sfm.isEditClicked()){
													 
													sfm.setEditClicked(false);
													tabPanel.remove(getMainForm());
													tabPanel.selectTab(2);
												}
												
												
												
												
												// getCurrentEntries(si,
												// lscr.getLemail(), tabPanel);
												// sfm.getCurrentEntries(si, lscr,
												// tabPanel)
											} else if (val.equals("found")) {
												 
												Window.alert("Copy of data found in the database");
												
											} else
												 
												Window.alert("Error in applying");
												
										}

									}

								});
					} catch (LoggedInException e) {

						e.printStackTrace();
					}
					
					
					
				}
				else
				{
				try {
					si.getStudentDataServiceAsync().addStudentData(sd,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server failure");
								}

								@Override
								public void onSuccess(String result) {
									String val = result;
									if (val != null) {
										if (val.equals("ok")) {
											 
											
											Window.alert("Applied to school "+schoolName);
											sfm.getEntries();
											
											//if edit button clicked after submit remove edit item tab and go to previous tab
											if(sfm.isEditClicked()){
												 
												tabPanel.remove(getMainForm());
												tabPanel.selectTab(2);
												sfm.setEditClicked(false);
											}
											
											
											
											
											// getCurrentEntries(si,
											// lscr.getLemail(), tabPanel);
											// sfm.getCurrentEntries(si, lscr,
											// tabPanel)
										} else if (val.equals("found")) {
											 
											Window.alert("Copy of data found in the database");
											 
											 
										} else{
											 
											Window.alert("Error in applying");
											 
										}
										
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
				
		////////////for btnOK button segment
		//		}
				
		//	});
			//////////////////////////////////////	
				
						
			}	//Add end for loop
		 //send email  
		
		if(!sfm.isEditClicked()){
			
			MailServiceData ms = new MailServiceData();
			ms.setBody("Hello "+lscr.getLfirstName()+ " "+lscr.getLlastName() +"\n\nYou have applied to the following universities "+allSchool+"\n\nRegards,\n\nUniversity Admission Team");
			ms.setToEmail(lscr.getLemail());
			ms.setToName(lscr.getLfirstName()+ " "+lscr.getLlastName());
			ms.setFromEmail("nesath@gmail.com");
			ms.setFromName("Admission Tracker");
			ms.setSubject("Admission");
		
			try {
				si.getMailServiceAsync().sendMail(ms, new AsyncCallback<String>(){

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Error sending mail");
				
					}

					@Override
					public void onSuccess(String result) {
						if(result != null){
							if(result.equals("ok")){
						 //Window.alert("Mail sent");
							}
						}
				
					}
			
				});
			} catch (LoggedInException e) {
		 
				e.printStackTrace();
			}
		}
	//////////////////////////////////////////	
			}
			
			
		}); //btnSubmit

		btnSubmit.setStyleName("logout");
		btnSubmit.setText("Submit");
		horizontalPanel_18.add(btnSubmit);

		setMainForm(tab1Content);

	}// sform

	public void fillComboBox(final ListBox lb) {

		ArrayList<String> val = CourseList;
		for (int i = 0; i < val.size(); i++) {
			// System.out.println("val = "+val.get(i));

			Collections.sort(val);
			lb.insertItem(val.get(i), i);

		}
	}

	private void getCurrentEntries(final ServiceInitialization si,
			String lemail, final DecoratedTabPanel tabPanel) {

		try {
			si.getStudentDataServiceAsync().getEntries(lemail,
					new AsyncCallback<Vector<StudentData>>() {

						@Override
						public void onFailure(Throwable caught) {
							Window.alert("Error from server***");

						}

						public void onSuccess(Vector<StudentData> result) {
							int row = flexSubmittedList.getRowCount();
							for (StudentData ted : result) {
								row++;
								flexSubmittedList
										.setText(row, 0, ted.getDate());
								flexSubmittedList.setText(row, 1, ted
										.getAppliedSchoolName());
								flexSubmittedList.setText(row, 2, ted
										.getDepartment());

								flexSubmittedList.setText(row, 3, ted
										.getMajor());
								flexSubmittedList.setText(row, 4, ted
										.getLemail());
								flexSubmittedList.setText(row, 5, ted
										.getUcode());

								Button delButton = new Button("x");
								delButton.addClickHandler(new ClickHandler() {

									@Override
									public void onClick(ClickEvent event) {
										com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexSubmittedList
												.getCellForEvent(event);
										int rw = cell.getRowIndex();
										int cl = cell.getCellIndex();
										flexSubmittedList.removeRow(rw);
									}

								});
								flexSubmittedList.setWidget(row, 6, delButton);

								Anchor achor = new Anchor("Edit");

								achor.addClickHandler(new ClickHandler() {

									@Override
									public void onClick(ClickEvent event) {

										/*
										 * StudentForm sf = new StudentForm(si,
										 * ls); VerticalPanel vpp = sf.sform(si,
										 * ls);
										 * 
										 * 
										 * System.out.println("debug");
										 * tabPanel.add(vpp, "Edit Item");
										 * tabPanel.selectTab(2);
										 * 
										 * ListBox lb = sf.getNameOfSchool(); //
										 * String val =
										 * lb.getValue(lb.getSelectedIndex());
										 * lb.setItemSelected(4, true);
										 */

									}

								});

								flexSubmittedList.setWidget(row, 7, achor);
							}
						}

					});
		} catch (LoggedInException e) {

			e.printStackTrace();
		}

	}

	
	 
	
	
	
	
	public VerticalPanel getMainForm() {
		return mainForm;
	}

	public void setMainForm(VerticalPanel mainForm) {
		this.mainForm = mainForm;
	}

	public ListBox getCbUnivSchool() {
		return cbUnivSchool;
	}

	public void setCbUnivSchool(ListBox cbUnivSchool) {
		this.cbUnivSchool = cbUnivSchool;
	}

	public ListBox getCbUnivDepartment() {
		return cbUnivDepartment;
	}

	public void setCbUnivDepartment(ListBox cbUnivDepartment) {
		this.cbUnivDepartment = cbUnivDepartment;
	}

	public ListBox getCbUnivMajor() {
		return cbUnivMajor;
	}

	public void setCbUnivMajor(ListBox cbUnivMajor) {
		this.cbUnivMajor = cbUnivMajor;
	}

	public TextBox getTbFirstName() {
		return tbFirstName;
	}

	public void setTbFirstName(TextBox tbFirstName) {
		this.tbFirstName = tbFirstName;
	}

	public TextBox getTbMiddleName() {
		return tbMiddleName;
	}

	public void setTbMiddleName(TextBox tbMiddleName) {
		this.tbMiddleName = tbMiddleName;
	}

	public TextBox getTbLastName() {
		return tbLastName;
	}

	public void setTbLastName(TextBox tbLastName) {
		this.tbLastName = tbLastName;
	}

	public TextBox getTbAddress() {
		return tbAddress;
	}

	public void setTbAddress(TextBox tbAddress) {
		this.tbAddress = tbAddress;
	}

	public TextBox getTbCity() {
		return tbCity;
	}

	public void setTbCity(TextBox tbCity) {
		this.tbCity = tbCity;
	}

	public TextBox getTbState() {
		return tbState;
	}

	public void setTbState(TextBox tbState) {
		this.tbState = tbState;
	}

	public TextBox getTbZip() {
		return tbZip;
	}

	public void setTbZip(TextBox tbZip) {
		this.tbZip = tbZip;
	}

	public TextBox getTbCountry() {
		return tbCountry;
	}

	public void setTbCountry(TextBox tbCountry) {
		this.tbCountry = tbCountry;
	}

	public TextBox getTbEmail() {
		return tbEmail;
	}

	public void setTbEmail(TextBox tbEmail) {
		this.tbEmail = tbEmail;
	}

	public TextBox getTbSchoolName() {
		return tbSchoolName;
	}

	public void setTbSchoolName(TextBox tbSchoolName) {
		this.tbSchoolName = tbSchoolName;
	}

	public TextBox getTbSchoolCity() {
		return tbSchoolCity;
	}

	public void setTbSchoolCity(TextBox tbSchoolCity) {
		this.tbSchoolCity = tbSchoolCity;
	}

	public TextBox getTbSchoolCountry() {
		return tbSchoolCountry;
	}

	public void setTbSchoolCountry(TextBox tbSchoolCountry) {
		this.tbSchoolCountry = tbSchoolCountry;
	}

	public ListBox getComboBox_1_1() {
		return comboBox_1_1;
	}

	public void setComboBox_1_1(ListBox comboBox_1_1) {
		this.comboBox_1_1 = comboBox_1_1;
	}

	public ListBox getComboBox_1_2() {
		return comboBox_1_2;
	}

	public void setComboBox_1_2(ListBox comboBox_1_2) {
		this.comboBox_1_2 = comboBox_1_2;
	}

	public ListBox getComboBox_1_3() {
		return comboBox_1_3;
	}

	public void setComboBox_1_3(ListBox comboBox_1_3) {
		this.comboBox_1_3 = comboBox_1_3;
	}

	public ListBox getComboBox_1_4() {
		return comboBox_1_4;
	}

	public void setComboBox_1_4(ListBox comboBox_1_4) {
		this.comboBox_1_4 = comboBox_1_4;
	}

	public ListBox getComboBox_1_5() {
		return comboBox_1_5;
	}

	public void setComboBox_1_5(ListBox comboBox_1_5) {
		this.comboBox_1_5 = comboBox_1_5;
	}

	public ListBox getComboBox_1_6() {
		return comboBox_1_6;
	}

	public void setComboBox_1_6(ListBox comboBox_1_6) {
		this.comboBox_1_6 = comboBox_1_6;
	}

	public ListBox getComboBox_1_7() {
		return comboBox_1_7;
	}

	public void setComboBox_1_7(ListBox comboBox_1_7) {
		this.comboBox_1_7 = comboBox_1_7;
	}

	public ListBox getComboBox_1_8() {
		return comboBox_1_8;
	}

	public void setComboBox_1_8(ListBox comboBox_1_8) {
		this.comboBox_1_8 = comboBox_1_8;
	}

	public ListBox getComboBox_2_1() {
		return comboBox_2_1;
	}

	public void setComboBox_2_1(ListBox comboBox_2_1) {
		this.comboBox_2_1 = comboBox_2_1;
	}

	public ListBox getComboBox_2_2() {
		return comboBox_2_2;
	}

	public void setComboBox_2_2(ListBox comboBox_2_2) {
		this.comboBox_2_2 = comboBox_2_2;
	}

	public ListBox getComboBox_2_3() {
		return comboBox_2_3;
	}

	public void setComboBox_2_3(ListBox comboBox_2_3) {
		this.comboBox_2_3 = comboBox_2_3;
	}

	public ListBox getComboBox_2_4() {
		return comboBox_2_4;
	}

	public void setComboBox_2_4(ListBox comboBox_2_4) {
		this.comboBox_2_4 = comboBox_2_4;
	}

	public ListBox getComboBox_2_5() {
		return comboBox_2_5;
	}

	public void setComboBox_2_5(ListBox comboBox_2_5) {
		this.comboBox_2_5 = comboBox_2_5;
	}

	public ListBox getComboBox_2_6() {
		return comboBox_2_6;
	}

	public void setComboBox_2_6(ListBox comboBox_2_6) {
		this.comboBox_2_6 = comboBox_2_6;
	}

	public ListBox getComboBox_2_7() {
		return comboBox_2_7;
	}

	public void setComboBox_2_7(ListBox comboBox_2_7) {
		this.comboBox_2_7 = comboBox_2_7;
	}

	public ListBox getComboBox_2_8() {
		return comboBox_2_8;
	}

	public void setComboBox_2_8(ListBox comboBox_2_8) {
		this.comboBox_2_8 = comboBox_2_8;
	}

	public ListBox getComboBox_3_1() {
		return comboBox_3_1;
	}

	public void setComboBox_3_1(ListBox comboBox_3_1) {
		this.comboBox_3_1 = comboBox_3_1;
	}

	public ListBox getComboBox_3_2() {
		return comboBox_3_2;
	}

	public void setComboBox_3_2(ListBox comboBox_3_2) {
		this.comboBox_3_2 = comboBox_3_2;
	}

	public ListBox getComboBox_3_3() {
		return comboBox_3_3;
	}

	public void setComboBox_3_3(ListBox comboBox_3_3) {
		this.comboBox_3_3 = comboBox_3_3;
	}

	public ListBox getComboBox_3_4() {
		return comboBox_3_4;
	}

	public void setComboBox_3_4(ListBox comboBox_3_4) {
		this.comboBox_3_4 = comboBox_3_4;
	}

	public ListBox getComboBox_3_5() {
		return comboBox_3_5;
	}

	public void setComboBox_3_5(ListBox comboBox_3_5) {
		this.comboBox_3_5 = comboBox_3_5;
	}

	public ListBox getComboBox_3_6() {
		return comboBox_3_6;
	}

	public void setComboBox_3_6(ListBox comboBox_3_6) {
		this.comboBox_3_6 = comboBox_3_6;
	}

	public ListBox getComboBox_3_7() {
		return comboBox_3_7;
	}

	public void setComboBox_3_7(ListBox comboBox_3_7) {
		this.comboBox_3_7 = comboBox_3_7;
	}

	public ListBox getComboBox_3_8() {
		return comboBox_3_8;
	}

	public void setComboBox_3_8(ListBox comboBox_3_8) {
		this.comboBox_3_8 = comboBox_3_8;
	}

	public ListBox getComboBox_4_1() {
		return comboBox_4_1;
	}

	public void setComboBox_4_1(ListBox comboBox_4_1) {
		this.comboBox_4_1 = comboBox_4_1;
	}

	public ListBox getComboBox_4_2() {
		return comboBox_4_2;
	}

	public void setComboBox_4_2(ListBox comboBox_4_2) {
		this.comboBox_4_2 = comboBox_4_2;
	}

	public ListBox getComboBox_4_3() {
		return comboBox_4_3;
	}

	public void setComboBox_4_3(ListBox comboBox_4_3) {
		this.comboBox_4_3 = comboBox_4_3;
	}

	public ListBox getComboBox_4_4() {
		return comboBox_4_4;
	}

	public void setComboBox_4_4(ListBox comboBox_4_4) {
		this.comboBox_4_4 = comboBox_4_4;
	}

	public ListBox getComboBox_4_5() {
		return comboBox_4_5;
	}

	public void setComboBox_4_5(ListBox comboBox_4_5) {
		this.comboBox_4_5 = comboBox_4_5;
	}

	public ListBox getComboBox_4_6() {
		return comboBox_4_6;
	}

	public void setComboBox_4_6(ListBox comboBox_4_6) {
		this.comboBox_4_6 = comboBox_4_6;
	}

	public ListBox getComboBox_4_7() {
		return comboBox_4_7;
	}

	public void setComboBox_4_7(ListBox comboBox_4_7) {
		this.comboBox_4_7 = comboBox_4_7;
	}

	public ListBox getComboBox_4_8() {
		return comboBox_4_8;
	}

	public void setComboBox_4_8(ListBox comboBox_4_8) {
		this.comboBox_4_8 = comboBox_4_8;
	}

	public ListBox getComboBox_5_1() {
		return comboBox_5_1;
	}

	public void setComboBox_5_1(ListBox comboBox_5_1) {
		this.comboBox_5_1 = comboBox_5_1;
	}

	public ListBox getComboBox_5_2() {
		return comboBox_5_2;
	}

	public void setComboBox_5_2(ListBox comboBox_5_2) {
		this.comboBox_5_2 = comboBox_5_2;
	}

	public ListBox getComboBox_5_3() {
		return comboBox_5_3;
	}

	public void setComboBox_5_3(ListBox comboBox_5_3) {
		this.comboBox_5_3 = comboBox_5_3;
	}

	public ListBox getComboBox_5_4() {
		return comboBox_5_4;
	}

	public void setComboBox_5_4(ListBox comboBox_5_4) {
		this.comboBox_5_4 = comboBox_5_4;
	}

	public ListBox getComboBox_5_5() {
		return comboBox_5_5;
	}

	public void setComboBox_5_5(ListBox comboBox_5_5) {
		this.comboBox_5_5 = comboBox_5_5;
	}

	public ListBox getComboBox_5_6() {
		return comboBox_5_6;
	}

	public void setComboBox_5_6(ListBox comboBox_5_6) {
		this.comboBox_5_6 = comboBox_5_6;
	}

	public ListBox getComboBox_5_7() {
		return comboBox_5_7;
	}

	public void setComboBox_5_7(ListBox comboBox_5_7) {
		this.comboBox_5_7 = comboBox_5_7;
	}

	public ListBox getComboBox_5_8() {
		return comboBox_5_8;
	}

	public void setComboBox_5_8(ListBox comboBox_5_8) {
		this.comboBox_5_8 = comboBox_5_8;
	}

	public ListBox getComboBox_6_1() {
		return comboBox_6_1;
	}

	public void setComboBox_6_1(ListBox comboBox_6_1) {
		this.comboBox_6_1 = comboBox_6_1;
	}

	public ListBox getComboBox_6_2() {
		return comboBox_6_2;
	}

	public void setComboBox_6_2(ListBox comboBox_6_2) {
		this.comboBox_6_2 = comboBox_6_2;
	}

	public ListBox getComboBox_6_3() {
		return comboBox_6_3;
	}

	public void setComboBox_6_3(ListBox comboBox_6_3) {
		this.comboBox_6_3 = comboBox_6_3;
	}

	public ListBox getComboBox_6_4() {
		return comboBox_6_4;
	}

	public void setComboBox_6_4(ListBox comboBox_6_4) {
		this.comboBox_6_4 = comboBox_6_4;
	}

	public ListBox getComboBox_6_5() {
		return comboBox_6_5;
	}

	public void setComboBox_6_5(ListBox comboBox_6_5) {
		this.comboBox_6_5 = comboBox_6_5;
	}

	public ListBox getComboBox_6_6() {
		return comboBox_6_6;
	}

	public void setComboBox_6_6(ListBox comboBox_6_6) {
		this.comboBox_6_6 = comboBox_6_6;
	}

	public ListBox getComboBox_6_7() {
		return comboBox_6_7;
	}

	public void setComboBox_6_7(ListBox comboBox_6_7) {
		this.comboBox_6_7 = comboBox_6_7;
	}

	public ListBox getComboBox_6_8() {
		return comboBox_6_8;
	}

	public void setComboBox_6_8(ListBox comboBox_6_8) {
		this.comboBox_6_8 = comboBox_6_8;
	}

	public ListBox getComboBox_7_1() {
		return comboBox_7_1;
	}

	public void setComboBox_7_1(ListBox comboBox_7_1) {
		this.comboBox_7_1 = comboBox_7_1;
	}

	public ListBox getComboBox_7_2() {
		return comboBox_7_2;
	}

	public void setComboBox_7_2(ListBox comboBox_7_2) {
		this.comboBox_7_2 = comboBox_7_2;
	}

	public ListBox getComboBox_7_3() {
		return comboBox_7_3;
	}

	public void setComboBox_7_3(ListBox comboBox_7_3) {
		this.comboBox_7_3 = comboBox_7_3;
	}

	public ListBox getComboBox_7_4() {
		return comboBox_7_4;
	}

	public void setComboBox_7_4(ListBox comboBox_7_4) {
		this.comboBox_7_4 = comboBox_7_4;
	}

	public ListBox getComboBox_7_5() {
		return comboBox_7_5;
	}

	public void setComboBox_7_5(ListBox comboBox_7_5) {
		this.comboBox_7_5 = comboBox_7_5;
	}

	public ListBox getComboBox_7_6() {
		return comboBox_7_6;
	}

	public void setComboBox_7_6(ListBox comboBox_7_6) {
		this.comboBox_7_6 = comboBox_7_6;
	}

	public ListBox getComboBox_7_7() {
		return comboBox_7_7;
	}

	public void setComboBox_7_7(ListBox comboBox_7_7) {
		this.comboBox_7_7 = comboBox_7_7;
	}

	public ListBox getComboBox_7_8() {
		return comboBox_7_8;
	}

	public void setComboBox_7_8(ListBox comboBox_7_8) {
		this.comboBox_7_8 = comboBox_7_8;
	}

	public ListBox getComboBox_8_1() {
		return comboBox_8_1;
	}

	public void setComboBox_8_1(ListBox comboBox_8_1) {
		this.comboBox_8_1 = comboBox_8_1;
	}

	public ListBox getComboBox_8_2() {
		return comboBox_8_2;
	}

	public void setComboBox_8_2(ListBox comboBox_8_2) {
		this.comboBox_8_2 = comboBox_8_2;
	}

	public ListBox getComboBox_8_3() {
		return comboBox_8_3;
	}

	public void setComboBox_8_3(ListBox comboBox_8_3) {
		this.comboBox_8_3 = comboBox_8_3;
	}

	public ListBox getComboBox_8_4() {
		return comboBox_8_4;
	}

	public void setComboBox_8_4(ListBox comboBox_8_4) {
		this.comboBox_8_4 = comboBox_8_4;
	}

	public ListBox getComboBox_8_5() {
		return comboBox_8_5;
	}

	public void setComboBox_8_5(ListBox comboBox_8_5) {
		this.comboBox_8_5 = comboBox_8_5;
	}

	public ListBox getComboBox_8_6() {
		return comboBox_8_6;
	}

	public void setComboBox_8_6(ListBox comboBox_8_6) {
		this.comboBox_8_6 = comboBox_8_6;
	}

	public ListBox getComboBox_8_7() {
		return comboBox_8_7;
	}

	public void setComboBox_8_7(ListBox comboBox_8_7) {
		this.comboBox_8_7 = comboBox_8_7;
	}

	public ListBox getComboBox_8_8() {
		return comboBox_8_8;
	}

	public void setComboBox_8_8(ListBox comboBox_8_8) {
		this.comboBox_8_8 = comboBox_8_8;
	}

	public TextBox getTextBox_1_1() {
		return textBox_1_1;
	}

	public void setTextBox_1_1(TextBox textBox_1_1) {
		this.textBox_1_1 = textBox_1_1;
	}

	public TextBox getTextBox_1_2() {
		return textBox_1_2;
	}

	public void setTextBox_1_2(TextBox textBox_1_2) {
		this.textBox_1_2 = textBox_1_2;
	}

	public TextBox getTextBox_1_3() {
		return textBox_1_3;
	}

	public void setTextBox_1_3(TextBox textBox_1_3) {
		this.textBox_1_3 = textBox_1_3;
	}

	public TextBox getTextBox_1_4() {
		return textBox_1_4;
	}

	public void setTextBox_1_4(TextBox textBox_1_4) {
		this.textBox_1_4 = textBox_1_4;
	}

	public TextBox getTextBox_1_5() {
		return textBox_1_5;
	}

	public void setTextBox_1_5(TextBox textBox_1_5) {
		this.textBox_1_5 = textBox_1_5;
	}

	public TextBox getTextBox_1_6() {
		return textBox_1_6;
	}

	public void setTextBox_1_6(TextBox textBox_1_6) {
		this.textBox_1_6 = textBox_1_6;
	}

	public TextBox getTextBox_1_7() {
		return textBox_1_7;
	}

	public void setTextBox_1_7(TextBox textBox_1_7) {
		this.textBox_1_7 = textBox_1_7;
	}

	public TextBox getTextBox_1_8() {
		return textBox_1_8;
	}

	public void setTextBox_1_8(TextBox textBox_1_8) {
		this.textBox_1_8 = textBox_1_8;
	}

	public TextBox getTextBox_2_1() {
		return textBox_2_1;
	}

	public void setTextBox_2_1(TextBox textBox_2_1) {
		this.textBox_2_1 = textBox_2_1;
	}

	public TextBox getTextBox_2_2() {
		return textBox_2_2;
	}

	public void setTextBox_2_2(TextBox textBox_2_2) {
		this.textBox_2_2 = textBox_2_2;
	}

	public TextBox getTextBox_2_3() {
		return textBox_2_3;
	}

	public void setTextBox_2_3(TextBox textBox_2_3) {
		this.textBox_2_3 = textBox_2_3;
	}

	public TextBox getTextBox_2_4() {
		return textBox_2_4;
	}

	public void setTextBox_2_4(TextBox textBox_2_4) {
		this.textBox_2_4 = textBox_2_4;
	}

	public TextBox getTextBox_2_5() {
		return textBox_2_5;
	}

	public void setTextBox_2_5(TextBox textBox_2_5) {
		this.textBox_2_5 = textBox_2_5;
	}

	public TextBox getTextBox_2_6() {
		return textBox_2_6;
	}

	public void setTextBox_2_6(TextBox textBox_2_6) {
		this.textBox_2_6 = textBox_2_6;
	}

	public TextBox getTextBox_2_7() {
		return textBox_2_7;
	}

	public void setTextBox_2_7(TextBox textBox_2_7) {
		this.textBox_2_7 = textBox_2_7;
	}

	public TextBox getTextBox_2_8() {
		return textBox_2_8;
	}

	public void setTextBox_2_8(TextBox textBox_2_8) {
		this.textBox_2_8 = textBox_2_8;
	}

	public TextBox getTextBox_3_1() {
		return textBox_3_1;
	}

	public void setTextBox_3_1(TextBox textBox_3_1) {
		this.textBox_3_1 = textBox_3_1;
	}

	public TextBox getTextBox_3_2() {
		return textBox_3_2;
	}

	public void setTextBox_3_2(TextBox textBox_3_2) {
		this.textBox_3_2 = textBox_3_2;
	}

	public TextBox getTextBox_3_3() {
		return textBox_3_3;
	}

	public void setTextBox_3_3(TextBox textBox_3_3) {
		this.textBox_3_3 = textBox_3_3;
	}

	public TextBox getTextBox_3_4() {
		return textBox_3_4;
	}

	public void setTextBox_3_4(TextBox textBox_3_4) {
		this.textBox_3_4 = textBox_3_4;
	}

	public TextBox getTextBox_3_5() {
		return textBox_3_5;
	}

	public void setTextBox_3_5(TextBox textBox_3_5) {
		this.textBox_3_5 = textBox_3_5;
	}

	public TextBox getTextBox_3_6() {
		return textBox_3_6;
	}

	public void setTextBox_3_6(TextBox textBox_3_6) {
		this.textBox_3_6 = textBox_3_6;
	}

	public TextBox getTextBox_3_7() {
		return textBox_3_7;
	}

	public void setTextBox_3_7(TextBox textBox_3_7) {
		this.textBox_3_7 = textBox_3_7;
	}

	public TextBox getTextBox_3_8() {
		return textBox_3_8;
	}

	public void setTextBox_3_8(TextBox textBox_3_8) {
		this.textBox_3_8 = textBox_3_8;
	}

	public TextBox getTextBox_4_1() {
		return textBox_4_1;
	}

	public void setTextBox_4_1(TextBox textBox_4_1) {
		this.textBox_4_1 = textBox_4_1;
	}

	public TextBox getTextBox_4_2() {
		return textBox_4_2;
	}

	public void setTextBox_4_2(TextBox textBox_4_2) {
		this.textBox_4_2 = textBox_4_2;
	}

	public TextBox getTextBox_4_3() {
		return textBox_4_3;
	}

	public void setTextBox_4_3(TextBox textBox_4_3) {
		this.textBox_4_3 = textBox_4_3;
	}

	public TextBox getTextBox_4_4() {
		return textBox_4_4;
	}

	public void setTextBox_4_4(TextBox textBox_4_4) {
		this.textBox_4_4 = textBox_4_4;
	}

	public TextBox getTextBox_4_5() {
		return textBox_4_5;
	}

	public void setTextBox_4_5(TextBox textBox_4_5) {
		this.textBox_4_5 = textBox_4_5;
	}

	public TextBox getTextBox_4_6() {
		return textBox_4_6;
	}

	public void setTextBox_4_6(TextBox textBox_4_6) {
		this.textBox_4_6 = textBox_4_6;
	}

	public TextBox getTextBox_4_7() {
		return textBox_4_7;
	}

	public void setTextBox_4_7(TextBox textBox_4_7) {
		this.textBox_4_7 = textBox_4_7;
	}

	public TextBox getTextBox_4_8() {
		return textBox_4_8;
	}

	public void setTextBox_4_8(TextBox textBox_4_8) {
		this.textBox_4_8 = textBox_4_8;
	}

	public TextBox getTextBox_5_1() {
		return textBox_5_1;
	}

	public void setTextBox_5_1(TextBox textBox_5_1) {
		this.textBox_5_1 = textBox_5_1;
	}

	public TextBox getTextBox_5_2() {
		return textBox_5_2;
	}

	public void setTextBox_5_2(TextBox textBox_5_2) {
		this.textBox_5_2 = textBox_5_2;
	}

	public TextBox getTextBox_5_3() {
		return textBox_5_3;
	}

	public void setTextBox_5_3(TextBox textBox_5_3) {
		this.textBox_5_3 = textBox_5_3;
	}

	public TextBox getTextBox_5_4() {
		return textBox_5_4;
	}

	public void setTextBox_5_4(TextBox textBox_5_4) {
		this.textBox_5_4 = textBox_5_4;
	}

	public TextBox getTextBox_5_5() {
		return textBox_5_5;
	}

	public void setTextBox_5_5(TextBox textBox_5_5) {
		this.textBox_5_5 = textBox_5_5;
	}

	public TextBox getTextBox_5_6() {
		return textBox_5_6;
	}

	public void setTextBox_5_6(TextBox textBox_5_6) {
		this.textBox_5_6 = textBox_5_6;
	}

	public TextBox getTextBox_5_7() {
		return textBox_5_7;
	}

	public void setTextBox_5_7(TextBox textBox_5_7) {
		this.textBox_5_7 = textBox_5_7;
	}

	public TextBox getTextBox_5_8() {
		return textBox_5_8;
	}

	public void setTextBox_5_8(TextBox textBox_5_8) {
		this.textBox_5_8 = textBox_5_8;
	}

	public TextBox getTextBox_6_1() {
		return textBox_6_1;
	}

	public void setTextBox_6_1(TextBox textBox_6_1) {
		this.textBox_6_1 = textBox_6_1;
	}

	public TextBox getTextBox_6_2() {
		return textBox_6_2;
	}

	public void setTextBox_6_2(TextBox textBox_6_2) {
		this.textBox_6_2 = textBox_6_2;
	}

	public TextBox getTextBox_6_3() {
		return textBox_6_3;
	}

	public void setTextBox_6_3(TextBox textBox_6_3) {
		this.textBox_6_3 = textBox_6_3;
	}

	public TextBox getTextBox_6_4() {
		return textBox_6_4;
	}

	public void setTextBox_6_4(TextBox textBox_6_4) {
		this.textBox_6_4 = textBox_6_4;
	}

	public TextBox getTextBox_6_5() {
		return textBox_6_5;
	}

	public void setTextBox_6_5(TextBox textBox_6_5) {
		this.textBox_6_5 = textBox_6_5;
	}

	public TextBox getTextBox_6_6() {
		return textBox_6_6;
	}

	public void setTextBox_6_6(TextBox textBox_6_6) {
		this.textBox_6_6 = textBox_6_6;
	}

	public TextBox getTextBox_6_7() {
		return textBox_6_7;
	}

	public void setTextBox_6_7(TextBox textBox_6_7) {
		this.textBox_6_7 = textBox_6_7;
	}

	public TextBox getTextBox_6_8() {
		return textBox_6_8;
	}

	public void setTextBox_6_8(TextBox textBox_6_8) {
		this.textBox_6_8 = textBox_6_8;
	}

	public TextBox getTextBox_7_1() {
		return textBox_7_1;
	}

	public void setTextBox_7_1(TextBox textBox_7_1) {
		this.textBox_7_1 = textBox_7_1;
	}

	public TextBox getTextBox_7_2() {
		return textBox_7_2;
	}

	public void setTextBox_7_2(TextBox textBox_7_2) {
		this.textBox_7_2 = textBox_7_2;
	}

	public TextBox getTextBox_7_3() {
		return textBox_7_3;
	}

	public void setTextBox_7_3(TextBox textBox_7_3) {
		this.textBox_7_3 = textBox_7_3;
	}

	public TextBox getTextBox_7_4() {
		return textBox_7_4;
	}

	public void setTextBox_7_4(TextBox textBox_7_4) {
		this.textBox_7_4 = textBox_7_4;
	}

	public TextBox getTextBox_7_5() {
		return textBox_7_5;
	}

	public void setTextBox_7_5(TextBox textBox_7_5) {
		this.textBox_7_5 = textBox_7_5;
	}

	public TextBox getTextBox_7_6() {
		return textBox_7_6;
	}

	public void setTextBox_7_6(TextBox textBox_7_6) {
		this.textBox_7_6 = textBox_7_6;
	}

	public TextBox getTextBox_7_7() {
		return textBox_7_7;
	}

	public void setTextBox_7_7(TextBox textBox_7_7) {
		this.textBox_7_7 = textBox_7_7;
	}

	public TextBox getTextBox_7_8() {
		return textBox_7_8;
	}

	public void setTextBox_7_8(TextBox textBox_7_8) {
		this.textBox_7_8 = textBox_7_8;
	}

	public TextBox getTextBox_8_1() {
		return textBox_8_1;
	}

	public void setTextBox_8_1(TextBox textBox_8_1) {
		this.textBox_8_1 = textBox_8_1;
	}

	public TextBox getTextBox_8_2() {
		return textBox_8_2;
	}

	public void setTextBox_8_2(TextBox textBox_8_2) {
		this.textBox_8_2 = textBox_8_2;
	}

	public TextBox getTextBox_8_3() {
		return textBox_8_3;
	}

	public void setTextBox_8_3(TextBox textBox_8_3) {
		this.textBox_8_3 = textBox_8_3;
	}

	public TextBox getTextBox_8_4() {
		return textBox_8_4;
	}

	public void setTextBox_8_4(TextBox textBox_8_4) {
		this.textBox_8_4 = textBox_8_4;
	}

	public TextBox getTextBox_8_5() {
		return textBox_8_5;
	}

	public void setTextBox_8_5(TextBox textBox_8_5) {
		this.textBox_8_5 = textBox_8_5;
	}

	public TextBox getTextBox_8_6() {
		return textBox_8_6;
	}

	public void setTextBox_8_6(TextBox textBox_8_6) {
		this.textBox_8_6 = textBox_8_6;
	}

	public TextBox getTextBox_8_7() {
		return textBox_8_7;
	}

	public void setTextBox_8_7(TextBox textBox_8_7) {
		this.textBox_8_7 = textBox_8_7;
	}

	public TextBox getTextBox_8_8() {
		return textBox_8_8;
	}

	public void setTextBox_8_8(TextBox textBox_8_8) {
		this.textBox_8_8 = textBox_8_8;
	}

	public TextArea getTxtComment() {
		return txtComment;
	}

	public void setTxtComment(TextArea txtComment) {
		this.txtComment = txtComment;
	}

	public DateBox getDateGraduation() {
		return dateGraduation;
	}

	public void setDateGraduation(DateBox dateGraduation) {
		this.dateGraduation = dateGraduation;
	}
	
	
	
	
	
}
