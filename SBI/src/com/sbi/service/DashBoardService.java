package com.sbi.service;

import com.sbi.dao.DashBoardDao;
import com.sbi.dao.EmployeeDao;
import com.sbi.pojo.ActionItem;
import com.sbi.pojo.DashBoard;
import com.sbi.pojo.Meeting;

public class DashBoardService {

	DashBoardDao dashboard = new DashBoardDao();
	DashBoard d = new DashBoard();
	Meeting meetingId;
	//ActionItem ai=new ActionItem();
	ActionItem open, assigned, workInProgress, readyToClosure, closed;
	EmployeeDao ed=new EmployeeDao();
	public void dashBoardService() {
		int meetingId = dashboard.display();
		int open = dashboard.display1();
		int assigned = dashboard.display2();
	
		int workInProgress = dashboard.display3();
		int readyforClosure = dashboard.display4();
		int closed = dashboard.display5();

		d.setMeetingId(meetingId);
		d.setOpen(open);
		d.setAssigned(assigned);
		d.setReadyforClosure(readyforClosure);
		d.setWorkInProgress(workInProgress);
		d.setClosed(closed);

	}

	
	

	public int getRole() {
		int role = ed.getRole();
		return role;
	}




	public DashBoard getObject() {
		// TODO Auto-generated method stub
		return d;
	}

}
