package com.sbi.pojo;

import java.util.Date;

public class ActionItem {

	private int actionId;
	private String description;
	private String closureDate;
	private String assignedToName;
	private char assignedToId;
	private int meetingId;
	private int status;
	private String organizer;
	
	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClosureDate() {
		return closureDate;
	}

	public void setClosureDate(String closureDate) {
		this.closureDate = closureDate;
	}

	public String getAssignedToName() {
		return assignedToName;
	}

	public void setAssignedToName(String assignedToName) {
		this.assignedToName = assignedToName;
	}

	public char getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(char assignedToId) {
		this.assignedToId = assignedToId;
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

	

	@Override
	public String toString() {
		return "ActionItem [actionId=" + actionId + ", description="
				+ description + ", closureDate=" + closureDate
				+ ", assignedToName=" + assignedToName + ", assignedToId="
				+ assignedToId + ", meetingId=" + meetingId + ", status="+ status+"]";
	}

	
	
}
