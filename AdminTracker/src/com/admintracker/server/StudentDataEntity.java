package com.admintracker.server;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdentityType;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class StudentDataEntity {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String lemail;

	@Persistent
	private String ucode;
	
	@Persistent
	private String date;
	
	@Persistent
	private String appliedSchoolName;
	@Persistent
	private String department;
	@Persistent
	private String major;
	@Persistent
	private String firstName;
	@Persistent
	private String middleName;
	@Persistent
	private String lastName;
	@Persistent
	private String address;
	@Persistent
	private String city;
	@Persistent
	private String state;
	@Persistent
	private String zip;
	@Persistent
	private String country;
	@Persistent
	private String email;
	@Persistent
	private String studiedSchoolName;
	@Persistent
	private String studiedSchoolCity;
	@Persistent
	private String studiedSchoolCountry;
	@Persistent
	private String applicationStatus;
	@Persistent
	private String summary;
	
	
	
	///////////////////////////////////////////////
	@Persistent
	private String comboBox_1_1;
	@Persistent
	private String comboBox_1_2;
	@Persistent
	private String comboBox_1_3;
	@Persistent
	private String comboBox_1_4;
	@Persistent
	private String comboBox_1_5;
	@Persistent
	private String comboBox_1_6;
	@Persistent
	private String comboBox_1_7;
	@Persistent
	private String comboBox_1_8;
	@Persistent
	private String comboBox_2_1;
	@Persistent
	private String comboBox_2_2;
	@Persistent
	private String comboBox_2_3;
	@Persistent
	private String comboBox_2_4;
	@Persistent
	private String comboBox_2_5;
	@Persistent
	private String comboBox_2_6;
	@Persistent
	private String comboBox_2_7;
	@Persistent
	private String comboBox_2_8;
	@Persistent
	private String comboBox_3_1;
	@Persistent
	private String comboBox_3_2;
	@Persistent
	private String comboBox_3_3;
	@Persistent
	private String comboBox_3_4;
	@Persistent
	private String comboBox_3_5;
	@Persistent
	private String comboBox_3_6;
	@Persistent
	private String comboBox_3_7;
	@Persistent
	private String comboBox_3_8;
	@Persistent
	private String comboBox_4_1;
	@Persistent
	private String comboBox_4_2;
	@Persistent
	private String comboBox_4_3;
	@Persistent
	private String comboBox_4_4;
	@Persistent
	private String comboBox_4_5;
	@Persistent
	private String comboBox_4_6;
	@Persistent
	private String comboBox_4_7;
	@Persistent
	private String comboBox_4_8;
	@Persistent
	private String comboBox_5_1;
	@Persistent
	private String comboBox_5_2;
	@Persistent
	private String comboBox_5_3;
	@Persistent
	private String comboBox_5_4;
	@Persistent
	private String comboBox_5_5;
	@Persistent
	private String comboBox_5_6;
	@Persistent
	private String comboBox_5_7;
	@Persistent
	private String comboBox_5_8;
	@Persistent
	private String comboBox_6_1;
	@Persistent
	private String comboBox_6_2;
	@Persistent
	private String comboBox_6_3;
	@Persistent
	private String comboBox_6_4;
	@Persistent
	private String comboBox_6_5;
	@Persistent
	private String comboBox_6_6;
	@Persistent
	private String comboBox_6_7;
	@Persistent
	private String comboBox_6_8;
	@Persistent
	private String comboBox_7_1;
	@Persistent
	private String comboBox_7_2;
	@Persistent
	private String comboBox_7_3;
	@Persistent
	private String comboBox_7_4;
	@Persistent
	private String comboBox_7_5;
	@Persistent
	private String comboBox_7_6;
	@Persistent
	private String comboBox_7_7;
	@Persistent
	private String comboBox_7_8;
	@Persistent
	private String comboBox_8_1;
	@Persistent
	private String comboBox_8_2;
	@Persistent
	private String comboBox_8_3;
	@Persistent
	private String comboBox_8_4;
	@Persistent
	private String comboBox_8_5;
	@Persistent
	private String comboBox_8_6;
	@Persistent
	private String comboBox_8_7;
	@Persistent
	private String comboBox_8_8;
	@Persistent
	private String textBox_1_1;
	@Persistent
	private String textBox_1_2;
	@Persistent
	private String textBox_1_3;
	@Persistent
	private String textBox_1_4;
	@Persistent
	private String textBox_1_5;
	@Persistent
	private String textBox_1_6;
	@Persistent
	private String textBox_1_7;
	@Persistent
	private String textBox_1_8;
	@Persistent
	private String textBox_2_1;
	@Persistent
	private String textBox_2_2;
	@Persistent
	private String textBox_2_3;
	@Persistent
	private String textBox_2_4;
	@Persistent
	private String textBox_2_5;
	@Persistent
	private String textBox_2_6;
	@Persistent
	private String textBox_2_7;
	@Persistent
	private String textBox_2_8;
	@Persistent
	private String textBox_3_1;
	@Persistent
	private String textBox_3_2;
	@Persistent
	private String textBox_3_3;
	@Persistent
	private String textBox_3_4;
	@Persistent
	private String textBox_3_5;
	@Persistent
	private String textBox_3_6;
	@Persistent
	private String textBox_3_7;
	@Persistent
	private String textBox_3_8;
	@Persistent
	private String textBox_4_1;
	@Persistent
	private String textBox_4_2;
	@Persistent
	private String textBox_4_3;
	@Persistent
	private String textBox_4_4;
	@Persistent
	private String textBox_4_5;
	@Persistent
	private String textBox_4_6;
	@Persistent
	private String textBox_4_7;
	@Persistent
	private String textBox_4_8;
	@Persistent
	private String textBox_5_1;
	@Persistent
	private String textBox_5_2;
	@Persistent
	private String textBox_5_3;
	@Persistent
	private String textBox_5_4;
	@Persistent
	private String textBox_5_5;
	@Persistent
	private String textBox_5_6;
	@Persistent
	private String textBox_5_7;
	@Persistent
	private String textBox_5_8;
	@Persistent
	private String textBox_6_1;
	@Persistent
	private String textBox_6_2;
	@Persistent
	private String textBox_6_3;
	@Persistent
	private String textBox_6_4;
	@Persistent
	private String textBox_6_5;
	@Persistent
	private String textBox_6_6;
	@Persistent
	private String textBox_6_7;
	@Persistent
	private String textBox_6_8;
	@Persistent
	private String textBox_7_1;
	@Persistent
	private String textBox_7_2;
	@Persistent
	private String textBox_7_3;
	@Persistent
	private String textBox_7_4;
	@Persistent
	private String textBox_7_5;
	@Persistent
	private String textBox_7_6;
	@Persistent
	private String textBox_7_7;
	@Persistent
	private String textBox_7_8;
	@Persistent
	private String textBox_8_1;
	@Persistent
	private String textBox_8_2;
	@Persistent
	private String textBox_8_3;
	@Persistent
	private String textBox_8_4;
	@Persistent
	private String textBox_8_5;
	@Persistent
	private String textBox_8_6;
	@Persistent
	private String textBox_8_7;
	@Persistent
	private String textBox_8_8;
	@Persistent
	private String txtComment;
	@Persistent
	private Date dateGraduation;
	
	
/////////////////////////////////////////////////////////////////////	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLemail() {
		return lemail;
	}
	public void setLemail(String lemail) {
		this.lemail = lemail;
	}
	public String getAppliedSchoolName() {
		return appliedSchoolName;
	}
	public void setAppliedSchoolName(String appliedSchoolName) {
		this.appliedSchoolName = appliedSchoolName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudiedSchoolName() {
		return studiedSchoolName;
	}
	public void setStudiedSchoolName(String studiedSchoolName) {
		this.studiedSchoolName = studiedSchoolName;
	}
	public String getStudiedSchoolCity() {
		return studiedSchoolCity;
	}
	public void setStudiedSchoolCity(String studiedSchoolCity) {
		this.studiedSchoolCity = studiedSchoolCity;
	}
	public String getStudiedSchoolCountry() {
		return studiedSchoolCountry;
	}
	public void setStudiedSchoolCountry(String studiedSchoolCountry) {
		this.studiedSchoolCountry = studiedSchoolCountry;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUcode() {
		return ucode;
	}
	public void setUcode(String ucode) {
		this.ucode = ucode;
	}
	public String getComboBox_1_1() {
		return comboBox_1_1;
	}
	public void setComboBox_1_1(String comboBox_1_1) {
		this.comboBox_1_1 = comboBox_1_1;
	}
	public String getComboBox_1_2() {
		return comboBox_1_2;
	}
	public void setComboBox_1_2(String comboBox_1_2) {
		this.comboBox_1_2 = comboBox_1_2;
	}
	public String getComboBox_1_3() {
		return comboBox_1_3;
	}
	public void setComboBox_1_3(String comboBox_1_3) {
		this.comboBox_1_3 = comboBox_1_3;
	}
	public String getComboBox_1_4() {
		return comboBox_1_4;
	}
	public void setComboBox_1_4(String comboBox_1_4) {
		this.comboBox_1_4 = comboBox_1_4;
	}
	public String getComboBox_1_5() {
		return comboBox_1_5;
	}
	public void setComboBox_1_5(String comboBox_1_5) {
		this.comboBox_1_5 = comboBox_1_5;
	}
	public String getComboBox_1_6() {
		return comboBox_1_6;
	}
	public void setComboBox_1_6(String comboBox_1_6) {
		this.comboBox_1_6 = comboBox_1_6;
	}
	public String getComboBox_1_7() {
		return comboBox_1_7;
	}
	public void setComboBox_1_7(String comboBox_1_7) {
		this.comboBox_1_7 = comboBox_1_7;
	}
	public String getComboBox_1_8() {
		return comboBox_1_8;
	}
	public void setComboBox_1_8(String comboBox_1_8) {
		this.comboBox_1_8 = comboBox_1_8;
	}
	public String getComboBox_2_1() {
		return comboBox_2_1;
	}
	public void setComboBox_2_1(String comboBox_2_1) {
		this.comboBox_2_1 = comboBox_2_1;
	}
	public String getComboBox_2_2() {
		return comboBox_2_2;
	}
	public void setComboBox_2_2(String comboBox_2_2) {
		this.comboBox_2_2 = comboBox_2_2;
	}
	public String getComboBox_2_3() {
		return comboBox_2_3;
	}
	public void setComboBox_2_3(String comboBox_2_3) {
		this.comboBox_2_3 = comboBox_2_3;
	}
	public String getComboBox_2_4() {
		return comboBox_2_4;
	}
	public void setComboBox_2_4(String comboBox_2_4) {
		this.comboBox_2_4 = comboBox_2_4;
	}
	public String getComboBox_2_5() {
		return comboBox_2_5;
	}
	public void setComboBox_2_5(String comboBox_2_5) {
		this.comboBox_2_5 = comboBox_2_5;
	}
	public String getComboBox_2_6() {
		return comboBox_2_6;
	}
	public void setComboBox_2_6(String comboBox_2_6) {
		this.comboBox_2_6 = comboBox_2_6;
	}
	public String getComboBox_2_7() {
		return comboBox_2_7;
	}
	public void setComboBox_2_7(String comboBox_2_7) {
		this.comboBox_2_7 = comboBox_2_7;
	}
	public String getComboBox_2_8() {
		return comboBox_2_8;
	}
	public void setComboBox_2_8(String comboBox_2_8) {
		this.comboBox_2_8 = comboBox_2_8;
	}
	public String getComboBox_3_1() {
		return comboBox_3_1;
	}
	public void setComboBox_3_1(String comboBox_3_1) {
		this.comboBox_3_1 = comboBox_3_1;
	}
	public String getComboBox_3_2() {
		return comboBox_3_2;
	}
	public void setComboBox_3_2(String comboBox_3_2) {
		this.comboBox_3_2 = comboBox_3_2;
	}
	public String getComboBox_3_3() {
		return comboBox_3_3;
	}
	public void setComboBox_3_3(String comboBox_3_3) {
		this.comboBox_3_3 = comboBox_3_3;
	}
	public String getComboBox_3_4() {
		return comboBox_3_4;
	}
	public void setComboBox_3_4(String comboBox_3_4) {
		this.comboBox_3_4 = comboBox_3_4;
	}
	public String getComboBox_3_5() {
		return comboBox_3_5;
	}
	public void setComboBox_3_5(String comboBox_3_5) {
		this.comboBox_3_5 = comboBox_3_5;
	}
	public String getComboBox_3_6() {
		return comboBox_3_6;
	}
	public void setComboBox_3_6(String comboBox_3_6) {
		this.comboBox_3_6 = comboBox_3_6;
	}
	public String getComboBox_3_7() {
		return comboBox_3_7;
	}
	public void setComboBox_3_7(String comboBox_3_7) {
		this.comboBox_3_7 = comboBox_3_7;
	}
	public String getComboBox_3_8() {
		return comboBox_3_8;
	}
	public void setComboBox_3_8(String comboBox_3_8) {
		this.comboBox_3_8 = comboBox_3_8;
	}
	public String getComboBox_4_1() {
		return comboBox_4_1;
	}
	public void setComboBox_4_1(String comboBox_4_1) {
		this.comboBox_4_1 = comboBox_4_1;
	}
	public String getComboBox_4_2() {
		return comboBox_4_2;
	}
	public void setComboBox_4_2(String comboBox_4_2) {
		this.comboBox_4_2 = comboBox_4_2;
	}
	public String getComboBox_4_3() {
		return comboBox_4_3;
	}
	public void setComboBox_4_3(String comboBox_4_3) {
		this.comboBox_4_3 = comboBox_4_3;
	}
	public String getComboBox_4_4() {
		return comboBox_4_4;
	}
	public void setComboBox_4_4(String comboBox_4_4) {
		this.comboBox_4_4 = comboBox_4_4;
	}
	public String getComboBox_4_5() {
		return comboBox_4_5;
	}
	public void setComboBox_4_5(String comboBox_4_5) {
		this.comboBox_4_5 = comboBox_4_5;
	}
	public String getComboBox_4_6() {
		return comboBox_4_6;
	}
	public void setComboBox_4_6(String comboBox_4_6) {
		this.comboBox_4_6 = comboBox_4_6;
	}
	public String getComboBox_4_7() {
		return comboBox_4_7;
	}
	public void setComboBox_4_7(String comboBox_4_7) {
		this.comboBox_4_7 = comboBox_4_7;
	}
	public String getComboBox_4_8() {
		return comboBox_4_8;
	}
	public void setComboBox_4_8(String comboBox_4_8) {
		this.comboBox_4_8 = comboBox_4_8;
	}
	public String getComboBox_5_1() {
		return comboBox_5_1;
	}
	public void setComboBox_5_1(String comboBox_5_1) {
		this.comboBox_5_1 = comboBox_5_1;
	}
	public String getComboBox_5_2() {
		return comboBox_5_2;
	}
	public void setComboBox_5_2(String comboBox_5_2) {
		this.comboBox_5_2 = comboBox_5_2;
	}
	public String getComboBox_5_3() {
		return comboBox_5_3;
	}
	public void setComboBox_5_3(String comboBox_5_3) {
		this.comboBox_5_3 = comboBox_5_3;
	}
	public String getComboBox_5_4() {
		return comboBox_5_4;
	}
	public void setComboBox_5_4(String comboBox_5_4) {
		this.comboBox_5_4 = comboBox_5_4;
	}
	public String getComboBox_5_5() {
		return comboBox_5_5;
	}
	public void setComboBox_5_5(String comboBox_5_5) {
		this.comboBox_5_5 = comboBox_5_5;
	}
	public String getComboBox_5_6() {
		return comboBox_5_6;
	}
	public void setComboBox_5_6(String comboBox_5_6) {
		this.comboBox_5_6 = comboBox_5_6;
	}
	public String getComboBox_5_7() {
		return comboBox_5_7;
	}
	public void setComboBox_5_7(String comboBox_5_7) {
		this.comboBox_5_7 = comboBox_5_7;
	}
	public String getComboBox_5_8() {
		return comboBox_5_8;
	}
	public void setComboBox_5_8(String comboBox_5_8) {
		this.comboBox_5_8 = comboBox_5_8;
	}
	public String getComboBox_6_1() {
		return comboBox_6_1;
	}
	public void setComboBox_6_1(String comboBox_6_1) {
		this.comboBox_6_1 = comboBox_6_1;
	}
	public String getComboBox_6_2() {
		return comboBox_6_2;
	}
	public void setComboBox_6_2(String comboBox_6_2) {
		this.comboBox_6_2 = comboBox_6_2;
	}
	public String getComboBox_6_3() {
		return comboBox_6_3;
	}
	public void setComboBox_6_3(String comboBox_6_3) {
		this.comboBox_6_3 = comboBox_6_3;
	}
	public String getComboBox_6_4() {
		return comboBox_6_4;
	}
	public void setComboBox_6_4(String comboBox_6_4) {
		this.comboBox_6_4 = comboBox_6_4;
	}
	public String getComboBox_6_5() {
		return comboBox_6_5;
	}
	public void setComboBox_6_5(String comboBox_6_5) {
		this.comboBox_6_5 = comboBox_6_5;
	}
	public String getComboBox_6_6() {
		return comboBox_6_6;
	}
	public void setComboBox_6_6(String comboBox_6_6) {
		this.comboBox_6_6 = comboBox_6_6;
	}
	public String getComboBox_6_7() {
		return comboBox_6_7;
	}
	public void setComboBox_6_7(String comboBox_6_7) {
		this.comboBox_6_7 = comboBox_6_7;
	}
	public String getComboBox_6_8() {
		return comboBox_6_8;
	}
	public void setComboBox_6_8(String comboBox_6_8) {
		this.comboBox_6_8 = comboBox_6_8;
	}
	public String getComboBox_7_1() {
		return comboBox_7_1;
	}
	public void setComboBox_7_1(String comboBox_7_1) {
		this.comboBox_7_1 = comboBox_7_1;
	}
	public String getComboBox_7_2() {
		return comboBox_7_2;
	}
	public void setComboBox_7_2(String comboBox_7_2) {
		this.comboBox_7_2 = comboBox_7_2;
	}
	public String getComboBox_7_3() {
		return comboBox_7_3;
	}
	public void setComboBox_7_3(String comboBox_7_3) {
		this.comboBox_7_3 = comboBox_7_3;
	}
	public String getComboBox_7_4() {
		return comboBox_7_4;
	}
	public void setComboBox_7_4(String comboBox_7_4) {
		this.comboBox_7_4 = comboBox_7_4;
	}
	public String getComboBox_7_5() {
		return comboBox_7_5;
	}
	public void setComboBox_7_5(String comboBox_7_5) {
		this.comboBox_7_5 = comboBox_7_5;
	}
	public String getComboBox_7_6() {
		return comboBox_7_6;
	}
	public void setComboBox_7_6(String comboBox_7_6) {
		this.comboBox_7_6 = comboBox_7_6;
	}
	public String getComboBox_7_7() {
		return comboBox_7_7;
	}
	public void setComboBox_7_7(String comboBox_7_7) {
		this.comboBox_7_7 = comboBox_7_7;
	}
	public String getComboBox_7_8() {
		return comboBox_7_8;
	}
	public void setComboBox_7_8(String comboBox_7_8) {
		this.comboBox_7_8 = comboBox_7_8;
	}
	public String getComboBox_8_1() {
		return comboBox_8_1;
	}
	public void setComboBox_8_1(String comboBox_8_1) {
		this.comboBox_8_1 = comboBox_8_1;
	}
	public String getComboBox_8_2() {
		return comboBox_8_2;
	}
	public void setComboBox_8_2(String comboBox_8_2) {
		this.comboBox_8_2 = comboBox_8_2;
	}
	public String getComboBox_8_3() {
		return comboBox_8_3;
	}
	public void setComboBox_8_3(String comboBox_8_3) {
		this.comboBox_8_3 = comboBox_8_3;
	}
	public String getComboBox_8_4() {
		return comboBox_8_4;
	}
	public void setComboBox_8_4(String comboBox_8_4) {
		this.comboBox_8_4 = comboBox_8_4;
	}
	public String getComboBox_8_5() {
		return comboBox_8_5;
	}
	public void setComboBox_8_5(String comboBox_8_5) {
		this.comboBox_8_5 = comboBox_8_5;
	}
	public String getComboBox_8_6() {
		return comboBox_8_6;
	}
	public void setComboBox_8_6(String comboBox_8_6) {
		this.comboBox_8_6 = comboBox_8_6;
	}
	public String getComboBox_8_7() {
		return comboBox_8_7;
	}
	public void setComboBox_8_7(String comboBox_8_7) {
		this.comboBox_8_7 = comboBox_8_7;
	}
	public String getComboBox_8_8() {
		return comboBox_8_8;
	}
	public void setComboBox_8_8(String comboBox_8_8) {
		this.comboBox_8_8 = comboBox_8_8;
	}
	public String getTextBox_1_1() {
		return textBox_1_1;
	}
	public void setTextBox_1_1(String textBox_1_1) {
		this.textBox_1_1 = textBox_1_1;
	}
	public String getTextBox_1_2() {
		return textBox_1_2;
	}
	public void setTextBox_1_2(String textBox_1_2) {
		this.textBox_1_2 = textBox_1_2;
	}
	public String getTextBox_1_3() {
		return textBox_1_3;
	}
	public void setTextBox_1_3(String textBox_1_3) {
		this.textBox_1_3 = textBox_1_3;
	}
	public String getTextBox_1_4() {
		return textBox_1_4;
	}
	public void setTextBox_1_4(String textBox_1_4) {
		this.textBox_1_4 = textBox_1_4;
	}
	public String getTextBox_1_5() {
		return textBox_1_5;
	}
	public void setTextBox_1_5(String textBox_1_5) {
		this.textBox_1_5 = textBox_1_5;
	}
	public String getTextBox_1_6() {
		return textBox_1_6;
	}
	public void setTextBox_1_6(String textBox_1_6) {
		this.textBox_1_6 = textBox_1_6;
	}
	public String getTextBox_1_7() {
		return textBox_1_7;
	}
	public void setTextBox_1_7(String textBox_1_7) {
		this.textBox_1_7 = textBox_1_7;
	}
	public String getTextBox_1_8() {
		return textBox_1_8;
	}
	public void setTextBox_1_8(String textBox_1_8) {
		this.textBox_1_8 = textBox_1_8;
	}
	public String getTextBox_2_1() {
		return textBox_2_1;
	}
	public void setTextBox_2_1(String textBox_2_1) {
		this.textBox_2_1 = textBox_2_1;
	}
	public String getTextBox_2_2() {
		return textBox_2_2;
	}
	public void setTextBox_2_2(String textBox_2_2) {
		this.textBox_2_2 = textBox_2_2;
	}
	public String getTextBox_2_3() {
		return textBox_2_3;
	}
	public void setTextBox_2_3(String textBox_2_3) {
		this.textBox_2_3 = textBox_2_3;
	}
	public String getTextBox_2_4() {
		return textBox_2_4;
	}
	public void setTextBox_2_4(String textBox_2_4) {
		this.textBox_2_4 = textBox_2_4;
	}
	public String getTextBox_2_5() {
		return textBox_2_5;
	}
	public void setTextBox_2_5(String textBox_2_5) {
		this.textBox_2_5 = textBox_2_5;
	}
	public String getTextBox_2_6() {
		return textBox_2_6;
	}
	public void setTextBox_2_6(String textBox_2_6) {
		this.textBox_2_6 = textBox_2_6;
	}
	public String getTextBox_2_7() {
		return textBox_2_7;
	}
	public void setTextBox_2_7(String textBox_2_7) {
		this.textBox_2_7 = textBox_2_7;
	}
	public String getTextBox_2_8() {
		return textBox_2_8;
	}
	public void setTextBox_2_8(String textBox_2_8) {
		this.textBox_2_8 = textBox_2_8;
	}
	public String getTextBox_3_1() {
		return textBox_3_1;
	}
	public void setTextBox_3_1(String textBox_3_1) {
		this.textBox_3_1 = textBox_3_1;
	}
	public String getTextBox_3_2() {
		return textBox_3_2;
	}
	public void setTextBox_3_2(String textBox_3_2) {
		this.textBox_3_2 = textBox_3_2;
	}
	public String getTextBox_3_3() {
		return textBox_3_3;
	}
	public void setTextBox_3_3(String textBox_3_3) {
		this.textBox_3_3 = textBox_3_3;
	}
	public String getTextBox_3_4() {
		return textBox_3_4;
	}
	public void setTextBox_3_4(String textBox_3_4) {
		this.textBox_3_4 = textBox_3_4;
	}
	public String getTextBox_3_5() {
		return textBox_3_5;
	}
	public void setTextBox_3_5(String textBox_3_5) {
		this.textBox_3_5 = textBox_3_5;
	}
	public String getTextBox_3_6() {
		return textBox_3_6;
	}
	public void setTextBox_3_6(String textBox_3_6) {
		this.textBox_3_6 = textBox_3_6;
	}
	public String getTextBox_3_7() {
		return textBox_3_7;
	}
	public void setTextBox_3_7(String textBox_3_7) {
		this.textBox_3_7 = textBox_3_7;
	}
	public String getTextBox_3_8() {
		return textBox_3_8;
	}
	public void setTextBox_3_8(String textBox_3_8) {
		this.textBox_3_8 = textBox_3_8;
	}
	public String getTextBox_4_1() {
		return textBox_4_1;
	}
	public void setTextBox_4_1(String textBox_4_1) {
		this.textBox_4_1 = textBox_4_1;
	}
	public String getTextBox_4_2() {
		return textBox_4_2;
	}
	public void setTextBox_4_2(String textBox_4_2) {
		this.textBox_4_2 = textBox_4_2;
	}
	public String getTextBox_4_3() {
		return textBox_4_3;
	}
	public void setTextBox_4_3(String textBox_4_3) {
		this.textBox_4_3 = textBox_4_3;
	}
	public String getTextBox_4_4() {
		return textBox_4_4;
	}
	public void setTextBox_4_4(String textBox_4_4) {
		this.textBox_4_4 = textBox_4_4;
	}
	public String getTextBox_4_5() {
		return textBox_4_5;
	}
	public void setTextBox_4_5(String textBox_4_5) {
		this.textBox_4_5 = textBox_4_5;
	}
	public String getTextBox_4_6() {
		return textBox_4_6;
	}
	public void setTextBox_4_6(String textBox_4_6) {
		this.textBox_4_6 = textBox_4_6;
	}
	public String getTextBox_4_7() {
		return textBox_4_7;
	}
	public void setTextBox_4_7(String textBox_4_7) {
		this.textBox_4_7 = textBox_4_7;
	}
	public String getTextBox_4_8() {
		return textBox_4_8;
	}
	public void setTextBox_4_8(String textBox_4_8) {
		this.textBox_4_8 = textBox_4_8;
	}
	public String getTextBox_5_1() {
		return textBox_5_1;
	}
	public void setTextBox_5_1(String textBox_5_1) {
		this.textBox_5_1 = textBox_5_1;
	}
	public String getTextBox_5_2() {
		return textBox_5_2;
	}
	public void setTextBox_5_2(String textBox_5_2) {
		this.textBox_5_2 = textBox_5_2;
	}
	public String getTextBox_5_3() {
		return textBox_5_3;
	}
	public void setTextBox_5_3(String textBox_5_3) {
		this.textBox_5_3 = textBox_5_3;
	}
	public String getTextBox_5_4() {
		return textBox_5_4;
	}
	public void setTextBox_5_4(String textBox_5_4) {
		this.textBox_5_4 = textBox_5_4;
	}
	public String getTextBox_5_5() {
		return textBox_5_5;
	}
	public void setTextBox_5_5(String textBox_5_5) {
		this.textBox_5_5 = textBox_5_5;
	}
	public String getTextBox_5_6() {
		return textBox_5_6;
	}
	public void setTextBox_5_6(String textBox_5_6) {
		this.textBox_5_6 = textBox_5_6;
	}
	public String getTextBox_5_7() {
		return textBox_5_7;
	}
	public void setTextBox_5_7(String textBox_5_7) {
		this.textBox_5_7 = textBox_5_7;
	}
	public String getTextBox_5_8() {
		return textBox_5_8;
	}
	public void setTextBox_5_8(String textBox_5_8) {
		this.textBox_5_8 = textBox_5_8;
	}
	public String getTextBox_6_1() {
		return textBox_6_1;
	}
	public void setTextBox_6_1(String textBox_6_1) {
		this.textBox_6_1 = textBox_6_1;
	}
	public String getTextBox_6_2() {
		return textBox_6_2;
	}
	public void setTextBox_6_2(String textBox_6_2) {
		this.textBox_6_2 = textBox_6_2;
	}
	public String getTextBox_6_3() {
		return textBox_6_3;
	}
	public void setTextBox_6_3(String textBox_6_3) {
		this.textBox_6_3 = textBox_6_3;
	}
	public String getTextBox_6_4() {
		return textBox_6_4;
	}
	public void setTextBox_6_4(String textBox_6_4) {
		this.textBox_6_4 = textBox_6_4;
	}
	public String getTextBox_6_5() {
		return textBox_6_5;
	}
	public void setTextBox_6_5(String textBox_6_5) {
		this.textBox_6_5 = textBox_6_5;
	}
	public String getTextBox_6_6() {
		return textBox_6_6;
	}
	public void setTextBox_6_6(String textBox_6_6) {
		this.textBox_6_6 = textBox_6_6;
	}
	public String getTextBox_6_7() {
		return textBox_6_7;
	}
	public void setTextBox_6_7(String textBox_6_7) {
		this.textBox_6_7 = textBox_6_7;
	}
	public String getTextBox_6_8() {
		return textBox_6_8;
	}
	public void setTextBox_6_8(String textBox_6_8) {
		this.textBox_6_8 = textBox_6_8;
	}
	public String getTextBox_7_1() {
		return textBox_7_1;
	}
	public void setTextBox_7_1(String textBox_7_1) {
		this.textBox_7_1 = textBox_7_1;
	}
	public String getTextBox_7_2() {
		return textBox_7_2;
	}
	public void setTextBox_7_2(String textBox_7_2) {
		this.textBox_7_2 = textBox_7_2;
	}
	public String getTextBox_7_3() {
		return textBox_7_3;
	}
	public void setTextBox_7_3(String textBox_7_3) {
		this.textBox_7_3 = textBox_7_3;
	}
	public String getTextBox_7_4() {
		return textBox_7_4;
	}
	public void setTextBox_7_4(String textBox_7_4) {
		this.textBox_7_4 = textBox_7_4;
	}
	public String getTextBox_7_5() {
		return textBox_7_5;
	}
	public void setTextBox_7_5(String textBox_7_5) {
		this.textBox_7_5 = textBox_7_5;
	}
	public String getTextBox_7_6() {
		return textBox_7_6;
	}
	public void setTextBox_7_6(String textBox_7_6) {
		this.textBox_7_6 = textBox_7_6;
	}
	public String getTextBox_7_7() {
		return textBox_7_7;
	}
	public void setTextBox_7_7(String textBox_7_7) {
		this.textBox_7_7 = textBox_7_7;
	}
	public String getTextBox_7_8() {
		return textBox_7_8;
	}
	public void setTextBox_7_8(String textBox_7_8) {
		this.textBox_7_8 = textBox_7_8;
	}
	public String getTextBox_8_1() {
		return textBox_8_1;
	}
	public void setTextBox_8_1(String textBox_8_1) {
		this.textBox_8_1 = textBox_8_1;
	}
	public String getTextBox_8_2() {
		return textBox_8_2;
	}
	public void setTextBox_8_2(String textBox_8_2) {
		this.textBox_8_2 = textBox_8_2;
	}
	public String getTextBox_8_3() {
		return textBox_8_3;
	}
	public void setTextBox_8_3(String textBox_8_3) {
		this.textBox_8_3 = textBox_8_3;
	}
	public String getTextBox_8_4() {
		return textBox_8_4;
	}
	public void setTextBox_8_4(String textBox_8_4) {
		this.textBox_8_4 = textBox_8_4;
	}
	public String getTextBox_8_5() {
		return textBox_8_5;
	}
	public void setTextBox_8_5(String textBox_8_5) {
		this.textBox_8_5 = textBox_8_5;
	}
	public String getTextBox_8_6() {
		return textBox_8_6;
	}
	public void setTextBox_8_6(String textBox_8_6) {
		this.textBox_8_6 = textBox_8_6;
	}
	public String getTextBox_8_7() {
		return textBox_8_7;
	}
	public void setTextBox_8_7(String textBox_8_7) {
		this.textBox_8_7 = textBox_8_7;
	}
	public String getTextBox_8_8() {
		return textBox_8_8;
	}
	public void setTextBox_8_8(String textBox_8_8) {
		this.textBox_8_8 = textBox_8_8;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTxtComment() {
		return txtComment;
	}
	public void setTxtComment(String txtComment) {
		this.txtComment = txtComment;
	}
	public Date getDateGraduation() {
		return dateGraduation;
	}
	public void setDateGraduation(Date dateGraduation) {
		this.dateGraduation = dateGraduation;
	}

}
