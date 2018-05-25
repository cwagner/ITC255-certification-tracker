package com.cmwagner;

public class Admin {
	private String userName;
	private String password;
	
	public Admin(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkCredentials(String inputUserName, String inputPassword) {
		if (inputUserName.equals(userName) && inputPassword.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addRequiredCourse(Certification c, String courseName) {
		c.addRequiredCourse(courseName);
	}
}
