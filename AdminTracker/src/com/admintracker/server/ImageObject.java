package com.admintracker.server;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class ImageObject {
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
	
	
	public ImageObject(String name,
			com.google.appengine.api.datastore.Blob content, Date date,String email, String firstName, String lastName) {
		this.name = name;
		this.content = content;
		this.date = date;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public com.google.appengine.api.datastore.Blob getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(com.google.appengine.api.datastore.Blob content) {
		this.content = content;
	}

	public void setDate(Date date) {
		this.date = date;
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

}
