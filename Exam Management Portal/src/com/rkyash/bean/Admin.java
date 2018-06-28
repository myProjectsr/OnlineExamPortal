package com.rkyash.bean;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private String adminUserName;
	//private long adminId;
	private String adminName;
	//private String adminUserName;
	private String adminPassword;
	


	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
}
