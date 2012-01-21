package com.admintracker.client;

import com.admintracker.client.login.LoginData;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.registration.Registration;
import com.admintracker.client.registration.RegistrationService;
import com.admintracker.client.registration.RegistrationServiceAsync;
import com.admintracker.shared.FieldVerifier;
import com.admintracker.shared.ServiceInitialization;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Widget;

public class AdminTracker implements EntryPoint {

//	private final RegistrationServiceAsync rs = GWT.create(RegistrationService.class);
	
	public void onModuleLoad() {
		//LoginScreen ls = new LoginScreen();
		/*Registration reg = new Registration();
		RootPanel rootPanel = RootPanel.get("login");
		rootPanel.add(reg);*/
		
		final ServiceInitialization si = new ServiceInitialization();
		LoginScreen ls = new LoginScreen(si);
		RootPanel rootPanel = RootPanel.get("login");
		rootPanel.add(ls);
		
		
		/*si.getLoginServiceAsync().checkLogin("nehru", "sathappan", new AsyncCallback<LoginData>(){

			@Override
			public void onFailure(Throwable caught) {
				System.out.println("on failure"); 
				
			}

			@Override
			public void onSuccess(LoginData result) {
				 LoginData logindata = (LoginData) result;
				 if(logindata != null){
					 System.out.println("***username = "+logindata.getUserName());
					 System.out.println("passowrd = "+logindata.getPassword());
				 }
				 else
				 {
					 System.out.println("invalid username or password");
					 LoginScreen ls = new LoginScreen(si);
					 RootPanel rootPanel = RootPanel.get("login");
					 rootPanel.add(ls);
				 }
			}

			 
			
		 
		});*/
			
			
			
		}

	
		
	 	
	//	Registration reg = new Registration(si);
	//	RootPanel rootPanel = RootPanel.get("login");
	//	rootPanel.add(reg);
	 
	 
}
