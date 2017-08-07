package com.sbi.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sbi.dao.ViewMomDao;
import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Meeting;

public class ViewMomService {
	ViewMomDao vd=new ViewMomDao();
	 Meeting m=new Meeting();
	ActionItem ai=new ActionItem(); 
	int meetingId,status;
	String date;
	String empId;
	public void getMeetingObject(Meeting m1,String empId) {
		this.m=m1;
		this.empId=empId;
		System.out.println("Service"+empId);
		 meetingId=m.getMeetingId();
		
	}


	
	public List<Meeting> getMeetingList() throws SQLException
	{
		vd.retrieveMid(meetingId,empId);
		return vd.lm;
		
	}


	public void getStatusObject(ActionItem ai,String empId) {
	
		this.ai=ai;
		this.empId=empId;
		 status=ai.getStatus();
		
	}

	public List<ActionItem> getStatusList() throws SQLException
	{
		System.out.println("Service"+empId);
		vd.retrieveStatus(status,empId);
		return vd.lst;
		
	}



	public void getDateObject(Meeting m,String empId) {
		
		this.m=m;
		this.empId=empId;
		System.out.println("Service"+empId);
		date=m.getDate();
		
	}
	public List<Meeting> getDateList() throws SQLException
	{
		
		vd.retrieveDate(date,empId);
		
		return vd.lm;
		
	}

	

}
