package com.sbi.service;

import java.util.ArrayList;
import java.util.List;

import com.sbi.dao.NotificationDao;
import com.sbi.pojo.ActionItem;

public class NotificationService {
	NotificationDao notify=new NotificationDao();
	List<ActionItem> list=new ArrayList<ActionItem>();
	public  List<ActionItem> getNotification(String empId)
	{
		list=notify.getNotifications(empId);
		return list;
	}
	

}
