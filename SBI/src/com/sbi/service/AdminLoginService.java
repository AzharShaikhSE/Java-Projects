package com.sbi.service;

import com.sbi.dao.AdminDao;
import com.sbi.pojo.Admin;

public class AdminLoginService {
	



		AdminDao ad=new AdminDao();
		Admin a=new Admin();
		String adminId;
		String password;
		
		String aid;
		String pwd;
		
		public AdminLoginService()
		{
			
		}
		public void getObject(Admin a)
		{
			this.a=a;
			adminId=a.getAdminId();
			password=a.getAdminpassword();
		}
		
		
		public AdminLoginService(String aid, String pwd) {
			super();
			this.aid = aid;
			this.pwd = pwd;
		}


		public boolean validate()
		{	
			if(adminId.length()!=6)
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
		{	if(ad.findAll(adminId,password))
		{
			return true;
		}
		return false;
			
		
			
		
		}
		
		

	}


