package com.admintracker.shared;

import com.admintracker.client.Image.ImageDataService;
import com.admintracker.client.Image.ImageDataServiceAsync;
import com.admintracker.client.admin.AdminDataService;
import com.admintracker.client.admin.AdminDataServiceAsync;
import com.admintracker.client.advertisement.AdverDataService;
import com.admintracker.client.advertisement.AdverDataServiceAsync;
import com.admintracker.client.guidata.GuiDataService;
import com.admintracker.client.guidata.GuiDataServiceAsync;
import com.admintracker.client.login.LoginService;
import com.admintracker.client.login.LoginServiceAsync;
import com.admintracker.client.mail.MailService;
import com.admintracker.client.mail.MailServiceAsync;
import com.admintracker.client.registration.RegistrationService;
import com.admintracker.client.registration.RegistrationServiceAsync;
import com.admintracker.client.student.StudentDataService;
import com.admintracker.client.student.StudentDataServiceAsync;
import com.admintracker.client.university.RegistararDataService;
import com.admintracker.client.university.RegistararDataServiceAsync;
import com.admintracker.server.AdvImageServiceImpl;
import com.google.gwt.core.client.GWT;

public class ServiceInitialization {
	private RegistrationServiceAsync rsa;
	private LoginServiceAsync lsa;
	private GuiDataServiceAsync gsa;
	private StudentDataServiceAsync sds;
	private RegistararDataServiceAsync rds;
	private AdminDataServiceAsync ads;
	private ImageDataServiceAsync ids;
	private AdverDataServiceAsync aii;
	private MailServiceAsync msa;
	
	public ServiceInitialization(){
		 rsa = GWT.create(RegistrationService.class);	
		 lsa = GWT.create(LoginService.class);
		 gsa = GWT.create(GuiDataService.class);
		 sds = GWT.create(StudentDataService.class);
		 rds = GWT.create(RegistararDataService.class);
		 ads = GWT.create(AdminDataService.class);
		 ids = GWT.create(ImageDataService.class);
		 aii = GWT.create(AdverDataService.class);
		 msa = GWT.create(MailService.class);
	}
	
	public RegistrationServiceAsync getRegistrationServiceAsyn(){
		return rsa;
	}
	
	public LoginServiceAsync getLoginServiceAsync(){
		return lsa;
	}
	
	public GuiDataServiceAsync getGuiDataServiceAsync(){
		return gsa;
	}
	
	public StudentDataServiceAsync getStudentDataServiceAsync(){
		return sds;
	}
	
	public RegistararDataServiceAsync getRegistararDataServiceAsync(){
		return rds;
	}
	
	public AdminDataServiceAsync getAdminDataServiceAsync(){
		return ads;
	}
	
	public ImageDataServiceAsync getImageDataServiceAsync(){
		return ids;
	}
	
	public AdverDataServiceAsync getAdverDataServiceAsync(){
		return aii;
	}

	public MailServiceAsync getMailServiceAsync(){
		return msa;
	}
	
}
