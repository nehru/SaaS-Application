package com.admintracker.server;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class AdvImageObject {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String name;
	@Persistent
	private com.google.appengine.api.datastore.Blob content;
	@Persistent
	private Date date;
	@Persistent
	private String email;
	@Persistent
	private String firstName;
	@Persistent
	private String lastName;
	@Persistent
	private String sno;
	
	public AdvImageObject(String name,
			com.google.appengine.api.datastore.Blob content, Date date,String email, String firstName, String lastName,String sno) {
		this.name = name;
		this.content = content;
		this.date = date;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sno = sno;
	}

	 

	public String getName() {
		return name;
	}

	public com.google.appengine.api.datastore.Blob getContent() {
		return content;
	}

	 

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(com.google.appengine.api.datastore.Blob content) {
		this.content = content;
	}

	 

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getSno() {
		return sno;
	}



	public void setSno(String sno) {
		this.sno = sno;
	}



	 

}
