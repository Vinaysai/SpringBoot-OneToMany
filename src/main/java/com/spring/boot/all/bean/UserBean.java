package com.spring.boot.all.bean;

public class UserBean {

	private int id;

	private String username;

	private String password;

	private String useraddress;

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public String getUsername() {
		return username;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
