package com.sbi.pojo;

public class EmployeewiseMomsCreated {
	String employeeId;
	String employeeName;
	int totalMomCreated;
	int totalMeetingAttended;
	int totalMeetingAbsent;
	double percentageAbsent;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getTotalMomCreated() {
		return totalMomCreated;
	}
	public void setTotalMomCreated(int totalMomCreated) {
		this.totalMomCreated = totalMomCreated;
	}
	public int getTotalMeetingAttended() {
		return totalMeetingAttended;
	}
	public void setTotalMeetingAttended(int totalMeetingAttended) {
		this.totalMeetingAttended = totalMeetingAttended;
	}
	public int getTotalMeetingAbsent() {
		return totalMeetingAbsent;
	}
	public void setTotalMeetingAbsent(int totalMeetingAbsent) {
		this.totalMeetingAbsent = totalMeetingAbsent;
	}
	public double getPercentageAbsent() {
		return percentageAbsent;
	}
	public void setPercentageAbsent(double percentageAbsent) {
		this.percentageAbsent = percentageAbsent;
	}
	@Override
	public String toString() {
		return "EmployeewiseMomsCreated [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", totalMomCreated="
				+ totalMomCreated + ", totalMeetingAttended="
				+ totalMeetingAttended + ", totalMeetingAbsent="
				+ totalMeetingAbsent + ", percentageAbsent=" + percentageAbsent
				+ "]";
	}
	
	
	
}
