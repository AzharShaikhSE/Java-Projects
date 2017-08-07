package com.sbi.service;

import java.util.Date;
import java.sql.SQLException;
import java.sql.Time;

import com.sbi.dao.MomDao;
import com.sbi.pojo.Employee;
import com.sbi.pojo.Meeting;

public class MomService {
	/*String subject;
  	String purpose;
  	String date;
  	String dtaken;
  	int noOfParticipants;
  	String startTime;
  	String endTime;
  	String organizer;*/

  	Meeting meeting= new Meeting();
	
	
	public void setObject(Meeting meeting)
    {
          this.meeting=meeting;
          /*subject=m.getSubject();
      purpose=m.getPurpose();
      	 date= m.getDate();
      	 dtaken=m.getDecisionTaken();
      	
      	 startTime=m.getStartTime();
       endTime=m.getEndTime();
       organizer=m.getOrganizer();*/
    }

	MomDao md = new MomDao();
	
//	System.out.println(subject,purpose,date,dtaken,noOfParticipants,startTime,endTime);
//	
//	public boolean validate()
//	{	
//		if(startTime.compareTo(endTime)<0)
//		{
//			return true;
//		}
//		return false;
//	}/
	public boolean insert() throws SQLException
	{
		int meetingId;
		System.out.println("this is service insert");
		if(md.insertz(meeting))
		{
			meetingId= md.getMeetingId();
			if(meetingId==0)
			{
				System.out.println("Incorrect Data is Queried");
			}
			meeting.setMeetingId(meetingId);
			 return true;
		}
		return false;
		
	}
	public boolean validate_minutes() {
		// TODO Auto-generated method stub
		if(meeting.getSubject()==null||meeting.getPurpose()==null||meeting.getStartTime()==null||meeting.getEndTime()==null||meeting.getDate()==null)
		{
			return false;
		}
		return true;
		
	}
	
		
}
