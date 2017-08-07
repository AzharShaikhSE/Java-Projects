package com.sbi.pojo;

public class Employee {

	private String employeeId;
	private int departmentId;
	private String password;
	private String employeeName;
	private String emailId;
	private int contactNo;
	private int role;
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		
		this.employeeId = employeeId;
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", departmentId="
				+ departmentId + ", password=" + password + ", employeeName="
				+ employeeName + ", emailId=" + emailId + ", contactNo="
				+ contactNo + "]";
	}

}
