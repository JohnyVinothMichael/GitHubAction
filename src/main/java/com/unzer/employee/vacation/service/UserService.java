package com.unzer.employee.vacation.service;

import java.util.List;

import com.unzer.employee.vacation.database.dao.EmployeeDao;
import com.unzer.employee.vacation.model.EmployeeLeaveModel;


public class UserService {
	
	private EmployeeDao employeedao = new EmployeeDao();

	
	public List<EmployeeLeaveModel> getAllEmployees()
	{
		return employeedao.getAllLeaveRequest();
	}
	

}
