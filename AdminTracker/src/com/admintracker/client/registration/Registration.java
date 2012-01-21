package com.admintracker.client.registration;

import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.shared.ServiceInitialization;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class Registration extends DialogBox {
	private final static String ERROR_DISPLAY_IMAGE = "images/error-txt.gif";

	private VerticalPanel verticalPanel;
	private TextBox txtFirstName;
	private TextBox txtLastName;
	private TextBox txtEmail;
	private TextBox txtUserName;
	private TextBox txtPassword;
	private TextBox txtRetypePassword;

	private Image firstNameError;
	private Image lastNameError;
	private Image emailError;
	private Image userNameError;
	private Image passwordError;
	private Image retypePasswordError;
	private Image roleError;
	final ListBox comboBox;
	
	public Registration(final ServiceInitialization si, final LoginScreen ls) {

		verticalPanel = new VerticalPanel();
		setWidget(verticalPanel);
		// verticalPanel.setSize("155px", "313px");
		verticalPanel.setWidth("100px");

		Label title = new Label();
		title.setSize("200px", "35px");
		title.setTitle("board");
		title.setStyleName("rtitle");
		title.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		title.setText("Registration Form");
	//	vPanel.setWidth("5px");
	//	label_1.setHeight("32px");
		
		verticalPanel.add(title);
		
		
		
		Label lblFirstName = new Label("First Name");
		verticalPanel.add(lblFirstName);
		
		
		txtFirstName = new TextBox();
		// verticalPanel.add(txtFirstName);
				
		firstNameError = getErrorImage();
		firstNameError.setVisible(false);

		HorizontalPanel fieldItem = new HorizontalPanel();
		fieldItem.add(txtFirstName);
		addHGap(fieldItem, "3px");
		fieldItem.add(firstNameError);
		fieldItem.setCellVerticalAlignment(firstNameError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldItem);
		addVGap(verticalPanel, "6px");

		Label lblLastName = new Label("Last Name");
		verticalPanel.add(lblLastName);

		txtLastName = new TextBox();

		lastNameError = getErrorImage();
		lastNameError.setVisible(false);

		HorizontalPanel fieldLastName = new HorizontalPanel();
		fieldLastName.add(txtLastName);
		addHGap(fieldLastName, "3px");
		fieldLastName.add(lastNameError);
		fieldLastName.setCellVerticalAlignment(lastNameError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldLastName);
		addVGap(verticalPanel, "6px");

		Label lblEmail = new Label("Email");
		verticalPanel.add(lblEmail);

		txtEmail = new TextBox();
		// verticalPanel.add(txtEmail);

		emailError = getErrorImage();
		emailError.setVisible(false);

		HorizontalPanel fieldEmail = new HorizontalPanel();
		fieldEmail.add(txtEmail);
		addHGap(fieldEmail, "3px");
		fieldEmail.add(emailError);
		fieldEmail.setCellVerticalAlignment(emailError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldEmail);
		addVGap(verticalPanel, "6px");

		Label lblUsername = new Label("Username");
		verticalPanel.add(lblUsername);

		txtUserName = new TextBox();
		// verticalPanel.add(txtUserName);

		userNameError = getErrorImage();
		userNameError.setVisible(false);

		HorizontalPanel fieldUserName = new HorizontalPanel();
		fieldUserName.add(txtUserName);
		addHGap(fieldUserName, "3px");
		fieldUserName.add(userNameError);
		fieldUserName.setCellVerticalAlignment(userNameError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldUserName);
		addVGap(verticalPanel, "6px");

		Label lblPassword = new Label("Password");
		verticalPanel.add(lblPassword);

		txtPassword = new TextBox();
		// verticalPanel.add(txtPassword);

		passwordError = getErrorImage();
		passwordError.setVisible(false);

		HorizontalPanel fieldPassword = new HorizontalPanel();
		fieldPassword.add(txtPassword);
		addHGap(fieldPassword, "3px");
		fieldPassword.add(passwordError);
		fieldPassword.setCellVerticalAlignment(passwordError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldPassword);
		addVGap(verticalPanel, "6px");

		Label lblRetypePassword = new Label("Retype Password");
		verticalPanel.add(lblRetypePassword);

		txtRetypePassword = new TextBox();
		// verticalPanel.add(txtRetypePassword);

		retypePasswordError = getErrorImage();
		retypePasswordError.setVisible(false);

		HorizontalPanel fieldRetypePassword = new HorizontalPanel();
		fieldRetypePassword.add(txtRetypePassword);
		addHGap(fieldRetypePassword, "3px");
		fieldRetypePassword.add(retypePasswordError);
		fieldRetypePassword.setCellVerticalAlignment(retypePasswordError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldRetypePassword);
		addVGap(verticalPanel, "6px");

		
		
		HorizontalPanel fieldRoll = new HorizontalPanel();
		comboBox = new ListBox();
		comboBox.addItem("Select Role");
		comboBox.addItem("Student");
		comboBox.addItem("Registarar");
		comboBox.addItem("Admin");
		comboBox.setWidth("160px");
		comboBox.setHeight("25px");
		
		fieldRoll.add(comboBox);
		addHGap(fieldRoll, "3px");
		
		roleError = getErrorImage();
		roleError.setVisible(false);
		addVGap(verticalPanel, "6px");
		
		
		fieldRoll.add(roleError);
		fieldRoll.setCellVerticalAlignment(roleError,
				HorizontalPanel.ALIGN_MIDDLE);
		verticalPanel.add(fieldRoll);
		
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setHeight("37px");
		verticalPanel.add(absolutePanel);

		Button btnRegister = new Button("New button");
		btnRegister.setText("Register");
		absolutePanel.add(btnRegister, 10, 10);

		btnRegister.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				DoRegister(si,ls);
				/////////////////////////////////
				
				/*try {
					si.getMailServiceAsync().sendMail(new AsyncCallback<String>(){

						@Override
						public void onFailure(Throwable caught) {
							 Window.alert("Error sending mail");
							
						}

						@Override
						public void onSuccess(String result) {
							 if(result != null){
								 if(result.equals("ok")){
									 Window.alert("Mail sent");
								 }
							 }
							
						}
						
					});
				} catch (LoggedInException e) {
					 
					e.printStackTrace();
				}*/
				///////////////////////////////////
			}

		});

		Button btnCancel = new Button("New button");
		btnCancel.setText("Cancel");
		absolutePanel.add(btnCancel, 79, 10);

		btnCancel.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				DoCancel(si);
			}

		});

	}

	protected void clearImageErrors() {
		firstNameError.setVisible(false);
		lastNameError.setVisible(false);
		emailError.setVisible(false);
		userNameError.setVisible(false);
		passwordError.setVisible(false);
		retypePasswordError.setVisible(false);
		roleError.setVisible(false);
	}

	protected boolean validateFirstName() {
		if (txtFirstName.getText().trim().length() == 0) {
			lastNameError.setTitle("Required");
			lastNameError.setVisible(true);
			return false;
		}
		return true;
	}

	protected boolean validateLastName() {
		if (txtLastName.getText().trim().length() == 0) {
			firstNameError.setTitle("Required");
			firstNameError.setVisible(true);
			return false;
		}
		return true;
	}

	protected boolean validateEmail() {
		if (!txtEmail.getText().trim().matches(".+@.+\\.[a-z]+")) {
			emailError.setTitle("Invalid email");
			emailError.setVisible(true);
			return false;
		}
		return true;
	}

	protected boolean validateUsername() {
		if (txtUserName.getText().trim().length() == 0) {
			userNameError.setTitle("Required");
			userNameError.setVisible(true);
			return false;
		}
		return true;
	}

	protected boolean validatePassword() {
		String pwd = txtPassword.getText().trim();
		boolean pwdValid = pwd.length() >= 4;
		if (!pwdValid) {
			passwordError.setTitle("At least 4 characters are required");
			passwordError.setVisible(true);
		}
		String retyped = txtRetypePassword.getText().trim();
		boolean retypeValid = pwd.equals(retyped);
		if (!retypeValid) {
			retypePasswordError.setTitle("Retype mismatch");
			retypePasswordError.setVisible(true);
		}
		return pwdValid && retypeValid;
	}
	
	protected boolean validateRole(){
		String sel = comboBox.getItemText(comboBox.getSelectedIndex());
		
		boolean val = true;
		if(sel.equalsIgnoreCase("Select Role"))
		{
			val = false;
			roleError.setTitle("Student or Registrar or Admin must be selected");
			roleError.setVisible(true);
		}
		return val;
	}
		

	protected boolean validate() {
		clearImageErrors();
		boolean valid = validateFirstName();
		valid = validateLastName() && valid;
		valid = validateEmail() && valid;
		valid = validateUsername() && valid;
		valid = validatePassword() && valid;
		valid = validateRole() && valid;
		
		return valid;

	}

	protected void DoCancel(ServiceInitialization si) {
		
		RootPanel.get("login").clear();
		LoginScreen ls = new LoginScreen(si);
		RootPanel rootPanel = RootPanel.get("login");
		rootPanel.add(ls);
		
	//	hide();
	}

	 
	
	protected void DoRegister(final ServiceInitialization si, final LoginScreen ls) {
		if (validate()) {
			RegistrationData rda = new RegistrationData();
			rda.setFirstName(txtFirstName.getText());
			rda.setLastName(txtLastName.getText());
			rda.setEmail(txtEmail.getText());
			rda.setUsername(txtUserName.getText());
			rda.setPassoword(txtPassword.getText());
			rda.setRole(comboBox.getItemText(comboBox.getSelectedIndex()));
			
			//final RegistrationServiceAsync rst = GWT.create(RegistrationService.class);
			
			RegistrationServiceAsync rst = si.getRegistrationServiceAsyn();
			if(rst == null){
				Window.alert("rst is null");
			}
			
			try {
				rst.register(rda, new AsyncCallback<String>(){

					@Override
					public void onFailure(Throwable caught) {
						 Window.alert("Error connection to RegistrationServiceAsync");
						
					}

					@Override
					public void onSuccess(String result) {
						 if(result.equals("ok")){
							// ls.setTitle("Successfully registered");
							// Window.alert("nehru received");
							 
							 LoginScreen ls = new LoginScreen(si);
							 ls.getMsgLabel().setText("Successfully registered");
							 RootPanel rootPanel = RootPanel.get("login");
							 rootPanel.clear();
							 rootPanel.add(ls);
							 
							 
						 }
						else
							Window.alert("Username found, Please select different username");
						
						
					}
					
				});
			} catch (LoggedInException e) {
				 
				e.printStackTrace();
			}
			
			hide();
		}
	}

	protected void addHGap(HorizontalPanel pl, String unit) {
		Label lbl = new Label();
		lbl.setWidth(unit);
		pl.add(lbl);
		pl.setCellWidth(lbl, unit);
	}

	protected void addVGap(VerticalPanel pl, String unit) {
		Label lbl = new Label();
		pl.add(lbl);
		pl.setCellHeight(lbl, unit);
	}

	protected Image getErrorImage() {
		return new Image(ERROR_DISPLAY_IMAGE);
	}
}
