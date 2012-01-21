package com.admintracker.client.login;

import java.util.ArrayList;
import java.util.Collections;

import com.admintracker.client.admin.AdminForm;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.mail.MailServiceData;
import com.admintracker.client.registration.Registration;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.registration.RegistrationServiceAsync;
import com.admintracker.client.student.StudentForm;
import com.admintracker.client.university.UniversityForm;
import com.admintracker.shared.ServiceInitialization;
import com.admintracker.shared.misc;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;

public class LoginScreen extends Composite {

	private final static String ERROR_DISPLAY_IMAGE = "images/error-txt.gif";
	
	private final VerticalPanel vPanel = new VerticalPanel();
	private final HorizontalPanel hzPanel = new HorizontalPanel();
	private final Label lblUserName = new Label("Username: ");
	private final TextBox txtUserName = new TextBox();
	private final Label lblError = new Label("");
	private final HorizontalPanel hzPasswordPanel = new HorizontalPanel();
	private final Label lblPassword = new Label("Password: ");
	private final AbsolutePanel absolutePanel = new AbsolutePanel();
	private final Button btnLogin = new Button("New button");
	private final Button btnRegistration = new Button("New button");
	private final Label label = new Label("");
	private final Label label_1 = new Label("");
	private Image userNameError;
	private Image passwordError;
	private Image roleError;
	
	private final PasswordTextBox txtPassword;
	private final Label msgLabel;
	private static LoginScreen main;
	final ListBox comboBox;
	final ListBox comboBox_univ;
	enum role {Student,Registarar,Admin};
	private String lusername;
	private String lpassword;
	private String lrole;
	private String lemail;
	private String lfirstName;
	private String llastName;
	private String lschool;
	
	
	public String getLschool() {
		return lschool;
	}

	public void setLschool(String lschool) {
		this.lschool = lschool;
	}

	misc mi = new misc();
	private ArrayList<String> courseList;
	private final Label label_2 = new Label(" ");
	private final Image image = new Image("images/Untitled-1.gif");
	
	
	/*LoginScreen(){
		
	}*/

	public LoginScreen(final ServiceInitialization si) {

		main = this;
		
		vPanel.setStyleName("login-center");

		 
		
		userNameError = getErrorImage();
		userNameError.setVisible(false);
		
		hzPanel.add(lblUserName);
		lblUserName.setSize("70px", "18px");
		hzPanel.add(txtUserName);
		txtUserName.setSize("162px", "15px");
		
		txtUserName.setStyleName("gwt-TestBox-1");
		
		addHGap(hzPanel, "3px");
		hzPanel.add(userNameError);
		
		txtUserName.addKeyDownHandler(new KeyDownHandler(){

			@Override
			public void onKeyDown(KeyDownEvent event) {
				msgLabel.setText("");
				
			}
			
		});
		
		
		
		hzPanel.add(lblError);
  
		passwordError = getErrorImage();
		passwordError.setVisible(false);
		hzPasswordPanel.add(lblPassword);
		lblPassword.setSize("70px", "18");
		
		assembleCourseList(si, "data/courses.txt");
		vPanel.setSize("451px", "362px");
		label_1.setHeight("75px");
		
		vPanel.add(label_1);
		
		vPanel.add(image);
		label.setSize("200", "12px");
		
		vPanel.add(label);
		
		vPanel.add(hzPanel);
		hzPanel.setWidth("213px");
		label_2.setHeight("4px");
		
		vPanel.add(label_2);
		vPanel.add(hzPasswordPanel);
		
		txtPassword = new PasswordTextBox();
		hzPasswordPanel.add(txtPassword);
		txtPassword.setSize("155px", "15px");
		addHGap(hzPasswordPanel, "3px");
		hzPasswordPanel.add(passwordError);   //deb
		
		txtPassword.addKeyDownHandler(new KeyDownHandler(){

			@Override
			public void onKeyDown(KeyDownEvent event) {
				msgLabel.setText("");
				
			}
			
		});
		
		comboBox = new ListBox();
		comboBox.addItem("Select Role");
		comboBox.addItem("Student");
		comboBox.addItem("Registarar");
		comboBox.addItem("Admin");
		comboBox.setSize("166px", "22px");
		
		comboBox.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				msgLabel.setText(""); 
				 
			}
			
		});
		
		comboBox.addChangeHandler(new ChangeHandler(){

			@Override
			public void onChange(ChangeEvent event) {
				 
				String mrole = comboBox.getItemText(comboBox.getSelectedIndex());
				if(mrole.equals("Registarar")){
					comboBox_univ.setVisible(true);
					//Window.alert("register selected");
				}
				else
				{
					comboBox_univ.setVisible(false);
				}
				
				//Window.alert("change");
				
			}
			
		});
		
		
		AbsolutePanel abPanel = new AbsolutePanel();
		abPanel.setSize("400", "35px");
		abPanel.add(comboBox,68, 10);
				
		roleError = getErrorImage();
		roleError.setVisible(false);
		abPanel.add(roleError,230,10);  //deb
		
		
		 
		comboBox_univ = new ListBox();
		mi.fillListBox(comboBox_univ, si, "data/school.txt");
		
		comboBox_univ.setWidth("160px");
		comboBox_univ.setHeight("25px");
			
		comboBox_univ.setVisible(false);
		
		abPanel.add(comboBox_univ,260,10);
		
		vPanel.add(abPanel);
		absolutePanel.setHeight("81px");
		vPanel.add(absolutePanel);

		btnLogin.setText("Login");
		btnLogin.setStyleName("logout");
		
		absolutePanel.add(btnLogin, 64, 10);
		btnLogin.setSize("49px", "28px");
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		absolutePanel_1.setHeight("107px");
		vPanel.add(absolutePanel_1);
		
		final Label lblForgetPassword = new Label("");
		lblForgetPassword.setVisible(false);
		lblForgetPassword.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		absolutePanel_1.add(lblForgetPassword, 0, 10);
		
		final TextBox txtEmail = new TextBox();
		txtEmail.setVisible(false);
		txtEmail.setEnabled(false);
		absolutePanel_1.add(txtEmail, 66, 42);
		txtEmail.setSize("135px", "16px");
		
		final Button btnCancel = new Button("New button");
		final Label lblEmail = new Label("");
		
		final Button btnSubmit = new Button("New button");
		btnSubmit.setVisible(false);
		btnSubmit.setEnabled(false);
		btnSubmit.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {  //deb
				try {
					si.getRegistrationServiceAsyn().getUsernameAndPassword(txtEmail.getText(), new AsyncCallback<RegistrationData>(){

						@Override
						public void onFailure(Throwable caught) {
							Window.alert("Error from server username and password getting");
							
						}

						public void onSuccess(RegistrationData result) {
							if(result != null){
								String username = result.getUsername();
								String password = result.getPassoword();
								String email = result.getEmail();
								String firstName = result.getFirstName();
								String lastName = result.getLastName();
								
								
								 //send email for username and password forget  
								MailServiceData ms = new MailServiceData();
								ms.setBody("Hello "+firstName+ " "+lastName +"\n\nYour Username = "+username +" " + "Password = "+password+"\n\nRegards,\n\nUniversity Admission Team");
								ms.setToEmail(email);
								ms.setToName(firstName+ " "+lastName);
								ms.setFromEmail("nesath@gmail.com");
								ms.setFromName("University Admission");
								ms.setSubject("Username and Password Request");
								
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
												 
												lblForgetPassword.setVisible(false);
												txtEmail.setVisible(false);
												btnSubmit.setVisible(false);
												btnCancel.setVisible(false);
												txtEmail.setText("");
												
												lblEmail.setVisible(true);
												lblEmail.setText("Emailed your username and password");
											 }
										 }
										
									}
									
								});
							} catch (LoggedInException e) {
								 
								e.printStackTrace();
							}
								
							}
							
						}

						
						
					});
				} catch (LoggedInException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		btnSubmit.setText("Submit");
		absolutePanel_1.add(btnSubmit, 231, 42);
		
		
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				lblForgetPassword.setVisible(false);
				txtEmail.setVisible(false);
				btnSubmit.setVisible(false);
				btnCancel.setVisible(false);
				lblForgetPassword.setText("");
				txtEmail.setText("");
				
			}
		});
		btnCancel.setEnabled(false);
		btnCancel.setText("Cancel");
		btnCancel.setVisible(false);
		absolutePanel_1.add(btnCancel, 231, 73);
		
		msgLabel = new Label();
		vPanel.add(msgLabel);
		//msgLabel.setText("Enter username and loging");
		
		
		
		
		btnLogin.addClickHandler(new ClickHandler() {
			
			
			@Override
			public void onClick(ClickEvent event) {
				if (validate()) {
				LoginServiceAsync rst = si.getLoginServiceAsync();
				
			//	Window.alert("loginin ***");
			
				System.out.println("username " + txtUserName.getText());
				System.out.println("username " + txtPassword.getText());

				 lusername = txtUserName.getText();
				 lpassword = txtPassword.getText();
				 lrole = comboBox.getItemText(comboBox.getSelectedIndex());
				 lschool = comboBox_univ.getItemText(comboBox_univ.getSelectedIndex());
				
				rst.checkLogin(txtUserName.getText(), txtPassword.getText(),comboBox.getItemText(comboBox.getSelectedIndex()),
						new AsyncCallback<LoginData>() {

							@Override
							public void onFailure(Throwable caught) {
								Window.alert("Error returned from server");

							}

							@Override
							public void onSuccess(LoginData result) {
									
								LoginData ldata = result;
																
								if (ldata != null) {
								//	Window.alert("name " + ldata.getUserName()
								//			+ " " + ldata.getPassword());
									
									lemail = ldata.getEmail();
									lfirstName = ldata.getFirstName();
									llastName = ldata.getLastName();
									
									
									
									switch(role.valueOf(comboBox.getItemText(comboBox.getSelectedIndex())))
									{
									
										case Student:
											StudentForm sf = new StudentForm(si, main);
											RootPanel.get("login").clear();
											RootPanel.get("login").add(sf);
											break;
											
										case Registarar:
											 										
											UniversityForm uf = new UniversityForm(si, main);
											RootPanel.get("login").clear();
											RootPanel.get("login").add(uf);
											break;
											
										case Admin:
											AdminForm af = new AdminForm(si, main);
											RootPanel.get("login").clear();
											RootPanel.get("login").add(af);
											break;
											
									}
								} else {
									msgLabel.setText("Invalid Username or Password");
									//System.out.println("Not logged in yet");
								}

							}

						});
			}//dd
			}
		

		});

		btnRegistration.setText("Registration");
		btnRegistration.setStyleName("logout");
		absolutePanel.add(btnRegistration, 119, 10);
		btnRegistration.setSize("88px", "28px");
		
		btnRegistration.setWidth("105px");
		
		Button button_1 = new Button("New button");
		button_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				lblForgetPassword.setVisible(true);
				txtEmail.setVisible(true);
				btnSubmit.setVisible(true);
				btnCancel.setVisible(true);
				
				lblForgetPassword.setText("Forget password enter email address and submit");
				txtEmail.setEnabled(true);
				btnSubmit.setEnabled(true);
				btnCancel.setEnabled(true);
			}
		});
		button_1.setStyleName("logout");
		button_1.setText("Forget Password");
		absolutePanel.add(button_1, 230, 10);
		button_1.setSize("118px", "26px");
		
	//	Label lblEmail = new Label("");
		absolutePanel.add(lblEmail, 10, 44);
		lblEmail.setVisible(false);
		lblEmail.setSize("431px", "25px");
		
		btnRegistration.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Registration reg = new Registration(si,main);
				RootPanel rootPanel = RootPanel.get("login");
				rootPanel.clear();
				rootPanel.add(reg);

			}

		});
		
		initWidget(vPanel);
	}

	private void chkLogin(String uname, String pass) {
		AsyncCallback call = new AsyncCallback() {

			@Override
			public void onFailure(Throwable caught) {

			}

			@Override
			public void onSuccess(Object result) {

			}

		};

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
		 
		return pwdValid;
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
	
	
	
	protected Image getErrorImage() {
		return new Image(ERROR_DISPLAY_IMAGE);
	}
	
	protected void clearImageErrors() {
		userNameError.setVisible(false);
		passwordError.setVisible(false);
		roleError.setVisible(false);
	}
	
	protected boolean validate() {
		clearImageErrors();
		boolean valid = validateUsername();
		valid = validatePassword() && valid;
		valid = validateRole() && valid;
				
		return valid;
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
	 
	
	public Label getMsgLabel(){
		return msgLabel;
	}

	public String getLusername() {
		return lusername;
	}

	public void setLusername(String lusername) {
		this.lusername = lusername;
	}

	public String getLpassword() {
		return lpassword;
	}

	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}

	public String getLrole() {
		return lrole;
	}

	public void setLrole(String lrole) {
		this.lrole = lrole;
	}
	
	public static LoginScreen get(){
		return main;
	}
	
	private void assembleCourseList(ServiceInitialization si, String path){
		si.getGuiDataServiceAsync().read(path, new AsyncCallback<ArrayList<String>>(){

			@Override
			public void onFailure(Throwable caught) {
				 
				Window.alert("Error reading listbox values");
			}

			@Override
			public void onSuccess(ArrayList<String> result) {
				ArrayList<String> val = result;
				if(val != null){
				courseList = val;
				}
				else
				courseList = null;
			}
			
		});
		 
	}
	
	public ArrayList<String> getCourseList(){
		return courseList;
	}

	public String getLemail() {
		return lemail;
	}

	public void setLemail(String lemail) {
		this.lemail = lemail;
	}

	public String getLfirstName() {
		return lfirstName;
	}

	public void setLfirstName(String lfirstName) {
		this.lfirstName = lfirstName;
	}

	public String getLlastName() {
		return llastName;
	}

	public void setLlastName(String llastName) {
		this.llastName = llastName;
	}
}
