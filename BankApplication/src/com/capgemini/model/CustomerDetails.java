package com.capgemini.model;

public class CustomerDetails {

	private String firstName, lastName, presentAddress, permanentAddress;
	private int age;
	private AccountDetails acDeatils;

	public AccountDetails getAcDeatils() {
		return acDeatils;
	}

	public void setAcDeatils(AccountDetails acDeatils) {
		this.acDeatils = acDeatils;
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

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
