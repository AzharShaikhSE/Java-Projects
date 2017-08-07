package com.sbi.pojo;

public class AdminDeptReportsTotalMom {
	private int departmentId;
	private String departmentName;
	int totalMomCreated;
	int totalMeetingAttended;
	int totalMeetingAbsent;
	double percentageAbsent;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
		return "AdminDeptReportsTotalMom [departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", totalMomCreated="
				+ totalMomCreated + ", totalMeetingAttended="
				+ totalMeetingAttended + ", totalMeetingAbsent="
				+ totalMeetingAbsent + ", percentageAbsent=" + percentageAbsent
				+ "]";
	}
	
	
	
}
