package com.sbi.service;

import java.util.List;

import com.sbi.dao.UpdateDao;
import com.sbi.dao.UpdateMomDao;
import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Meeting;

public class UpdateMomService {

	
	
	 UpdateMomDao umd= new UpdateMomDao();
	
	
	
	public List<Meeting> getMeetingList(Meeting m)
	{
		umd.retrieveMeeting(m);
		return umd.ml;
	}



	public List<Meeting> getMeetingDetails(Meeting m2) {
		umd.retrieveMeetingDetails(m2);
		return umd.md;
	}



	public List<ActionItem> getActionDetails(ActionItem ai) {
		umd.retrieveActionDetails(ai);
		return umd.ad;
	}
	
	

	/*public List<String> getDetailsList(String actName) {
		// TODO Auto-generated method stub
		ud.retrieveDetails(actName);
		return ud.lb;
	}
	
	public boolean update(String comments,String actionName,int meetingId)
	{
		this.actionName=actionName;
		this.comments=comments;
		System.out.println("hello"+comments+actionName+meetingId);
		ud.insertCommentsUpdate(actionName,comments,meetingId);
		ud.updateStatusU(actionName);
		return true;
	}

	public void readyForClosure(String comments, String actionName,int meetingId) {
		
		// TODO Auto-generated method stub
		ud.insertCommentsRC(actionName,comments,meetingId);
		ud.updateStatusRC(actionName);
	}*/
	
}