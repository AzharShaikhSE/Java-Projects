package com.sbi.pojo;

public class EmployeeComments {

	private String description;
	private String comments;
	private int meetingId;
	private int status;
	private String DateTime;
	private int actionItemId;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public int getActionItemId() {
		return actionItemId;
	}
	public void setActionItemId(int actionItemId) {
		this.actionItemId = actionItemId;
	}
	@Override
	public String toString() {
		return "EmployeeComments [description=" + description + ", comments="
				+ comments + ", meetingId=" + meetingId + ", status=" + status
				+ ", DateTime=" + DateTime + ", actionItemId=" + actionItemId
				+ "]";
	}
	
	
}
