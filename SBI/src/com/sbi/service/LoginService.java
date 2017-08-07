package com.sbi.service;

import com.sbi.dao.EmployeeDao;
import com.sbi.pojo.Employee;

public class LoginService {
	EmployeeDao ed=new EmployeeDao();
	Employee e=new Employee();
	String username;
	String password;
	int role;
	String uid;
	String pwd;
	
	public LoginService()
	{
		
	}
	public void getObject(Employee e)
	{
		this.e=e;
		username=e.getEmployeeId();
		password=e.getPassword();
	}
	
	
	public LoginService(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}


	public boolean validate()
	{	
		if(username.length()!=6)
		{	
			return false;
		}
		
			if(password.length()<6)
			{
				return false;
			}
		return true;
	}
	
	public boolean authorityCheck()
	{	if(ed.findAll(username,password,e))
	{	
		return true;
	}
	return false;
				
	}
	public int getRole()
	{
		role=ed.getRole();
		return role;
	}
	
	

}
