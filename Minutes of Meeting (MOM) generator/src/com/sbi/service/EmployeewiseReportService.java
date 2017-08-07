package com.sbi.service;


import com.sbi.dao.ViewEmployeeReportsDao;
import com.sbi.pojo.EmployeewiseMomsCreated;

public class EmployeewiseReportService {

	ViewEmployeeReportsDao viewDaoObj=new ViewEmployeeReportsDao();
	EmployeewiseMomsCreated empReport=new EmployeewiseMomsCreated();
	
	public EmployeewiseMomsCreated getDeptwiseTotalList(String selectedEmp) {
			empReport=viewDaoObj.getEmployeewiseMoms(selectedEmp);
			try
			{
			empReport.setPercentageAbsent((empReport.getTotalMeetingAbsent()*100)/((empReport.getTotalMeetingAbsent()+empReport.getTotalMeetingAttended())));
			}
			catch(ArithmeticException ae)
			{
				empReport.setPercentageAbsent(0.0);
			}
		return empReport;
	}

}
