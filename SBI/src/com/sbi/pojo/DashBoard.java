package com.sbi.pojo;

public class DashBoard {

	private int meetingId;
	private int open;
	private int assigned;
	private int workInProgress;
	private int readyforClosure;
	private int closed;
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getAssigned() {
		return assigned;
	}
	public void setAssigned(int assigned) {
		this.assigned = assigned;
	}
	public int getWorkInProgress() {
		return workInProgress;
	}
	public void setWorkInProgress(int workInProgress) {
		this.workInProgress = workInProgress;
	}
	public int getReadyforClosure() {
		return readyforClosure;
	}
	public void setReadyforClosure(int readyforClosure) {
		this.readyforClosure = readyforClosure;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int closed) {
		this.closed = closed;
	}
	@Override
	public String toString() {
		return "DashBoard [meetingId=" + meetingId + ", open=" + open
				+ ", assigned=" + assigned + ", workInProgress="
				+ workInProgress + ", readyforClosure=" + readyforClosure
				+ ", closed=" + closed + "]";
	}
	
	
	
	
}
