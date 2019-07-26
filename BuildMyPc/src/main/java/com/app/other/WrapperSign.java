package com.app.other;

import com.app.pojos.Login;
import com.app.pojos.User;

public class WrapperSign {
	private User user;
	private Login login;
	public WrapperSign(User user, Login login) {
		super();
		this.user = user;
		this.login = login;
	}
	public WrapperSign() {
		super();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
}
