package com.cognizant.cde.action;

public class WelcomeUserAction{

	private String username;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// all struts logic here
	public String execute() {
		System.out.println("Inside execute method");
		return "SUCCESS";

	}
}
