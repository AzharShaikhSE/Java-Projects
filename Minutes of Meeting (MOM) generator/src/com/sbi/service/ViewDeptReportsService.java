package com.sbi.service;

import com.sbi.dao.ViewDeptReportsDao;
import com.sbi.pojo.AdminDeptReportsTotalMom;


public class ViewDeptReportsService {

	ViewDeptReportsDao viewDaoObj=new ViewDeptReportsDao();
	AdminDeptReportsTotalMom adminDept=new  AdminDeptReportsTotalMom();
	
	
	public AdminDeptReportsTotalMom getDeptwiseTotalList(int seletedOption) {
		adminDept=viewDaoObj.getDeptwiseMoms(seletedOption);
		try
		{
		adminDept.setPercentageAbsent((adminDept.getTotalMeetingAbsent()*100)/(adminDept.getTotalMeetingAbsent()+adminDept.getTotalMeetingAttended()));
		}
		catch(ArithmeticException ae)
		{
			adminDept.setPercentageAbsent(0.0);
		}
		return adminDept;
	}
		
		

}
