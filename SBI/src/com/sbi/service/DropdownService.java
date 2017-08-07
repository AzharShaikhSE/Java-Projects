package com.sbi.service;

import java.sql.SQLException;
import java.util.List;

import com.sbi.dao.DropdownList;
import com.sbi.pojo.Employee;

public class DropdownService {

	public List<Employee> getList() throws SQLException
	{
		DropdownList d=new DropdownList();
		d.getValues();
		return d.ls;
		
	}
}
