package com.cmwagner;

public class Login {
	private Admin admin;
	private boolean isValid;
	
	public Login(Admin admin, String inputUserName, String inputPassword) {
		if (admin.checkCredentials(inputUserName, inputPassword)) {
			setValid(true);
		}
		else {
			setValid(false);
		}
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
