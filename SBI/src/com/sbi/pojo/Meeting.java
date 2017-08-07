package com.sbi.pojo;
import java.sql.Time;
import java.sql.Date ;
public class Meeting {

	private int meetingId;
	private String subject;
	private String purpose;
	private String date;
	private String startTime;
	private String endTime;
	private String organizer;
	
	private String decisionTaken;

	public int getMeetingId() {
		return meetingId;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getDecisionTaken() {
		return decisionTaken;
	}
	public void setDecisionTaken(String decisionTaken) {
		this.decisionTaken = decisionTaken;
	}
	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", subject=" + subject
				+ ", purpose=" + purpose + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + ",  decisionTaken=" + decisionTaken + "]";
	}
	
	

	
	
}
