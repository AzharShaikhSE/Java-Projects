package com.sbi.pojo;

public class Admin {

	private String adminId;
	private String adminpassword;
	private String adminName;
	private String adminEmail;
	private int adminContact;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public int getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(int adminContact) {
		this.adminContact = adminContact;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminpassword=" + adminpassword
				+ ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminContact=" + adminContact + "]";
	}
	
	
}
