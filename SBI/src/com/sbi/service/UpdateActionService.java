package com.sbi.service;

import com.sbi.dao.UpdateActionDao;
import com.sbi.pojo.ActionItem;

public class UpdateActionService {

	UpdateActionDao uad = new UpdateActionDao();
	
	public void ActionStatusWidraw(ActionItem ai)
	{
		uad.widrawStatusUpdate(ai);	
	
	}

	public void ActionStatusClosure(ActionItem ai) {
		
		uad.closureStatusUpdate(ai);	
	}

	public void ActionStatusRedo(ActionItem ai) {
		
		uad.redoStatusUpdate(ai);
	}

}
