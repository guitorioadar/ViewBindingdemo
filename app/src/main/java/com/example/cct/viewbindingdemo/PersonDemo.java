package com.example.cct.viewbindingdemo;

public class PersonDemo {
	String FirstName,LastName;

	public PersonDemo(String firstName, String lastName) {
		FirstName = firstName;
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
