package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	
	public void Driverclass(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
				
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	
}
