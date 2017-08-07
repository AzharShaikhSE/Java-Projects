package com.sbi.service;

import java.util.List;

import com.sbi.dao.UpdateDao;
import com.sbi.pojo.ActionItem;

public class UpdateService {

	String empName,actionName,comments,organizer;
	ActionItem action=new ActionItem();
	static UpdateDao ud= new UpdateDao();
	
	
	
	public List<ActionItem> getItemList(ActionItem action,String empId)
	{
		ud.retrieveAction(action,empId);
		return ud.la;
	}
	
	

	public List<ActionItem> getDetailsList(ActionItem ai) {
		// TODO Auto-generated method stub
		ud.retrieveDetails(ai);
		return ud.lb;
	}
	
	public void update(ActionItem ai,String comments)
	{
		ud.insertCommentsUpdate(ai,comments);
		
	
	}

	public void readyForClosure(ActionItem ai,String comments) {
		
		ud.insertCommentsRC(ai,comments);
		
	}
	
}
