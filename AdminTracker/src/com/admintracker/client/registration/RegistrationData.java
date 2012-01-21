package com.admintracker.client.registration;

import java.io.Serializable;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class RegistrationData implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String passoword;
	private String role;

	
	public RegistrationData(){
		 this(null, null, null, null,null);
	}
	
	public RegistrationData(String fname, String lname, String em, String uname, String passwd){
		this.firstName = fname;
		this.lastName = lname;
		this.email = em;
		this.username = uname;
		this.passoword = passwd;
	}
	
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
