package com.project.cab.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	private String adminId;
	private String adminName;

	public Admin(String adminId, String adminName) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;

	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + "]";
	}

}