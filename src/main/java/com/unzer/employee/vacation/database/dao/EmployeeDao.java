package com.unzer.employee.vacation.database.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unzer.employee.vacation.model.EmployeeLeaveModel;

public class EmployeeDao {

	private static Map<Integer, EmployeeLeaveModel> employees = new HashMap<>();
	private static int index = 3;

	static {
		LocalDateTime timeNow = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formatDateTime = timeNow.format(formatter);

		EmployeeLeaveModel employee_one = new EmployeeLeaveModel();
		employee_one.setEntityId(1);
		employee_one.setEmployeeId(101);
		employee_one.setEmployeeName("Johny");
		employee_one.setResolvedByManger(1001);
		employee_one.setLeaveStatus("Pending");
		employee_one.setLeaveStartDate(formatDateTime);
		employee_one.setLeaveEndDate(formatDateTime);
		employee_one.setRequestedCreated(formatDateTime);
		employee_one.setReasonForLeave("Family Vacation");
		employee_one.setTotalLeaves(30);
		
		EmployeeLeaveModel employee_two = new EmployeeLeaveModel();
		employee_two.setEntityId(2);
		employee_two.setEmployeeId(102);
		employee_two.setEmployeeName("Vinoth");
		employee_two.setResolvedByManger(1002);
		employee_two.setLeaveStatus("Pending");
		employee_two.setLeaveStartDate(formatDateTime);
		employee_two.setLeaveEndDate(formatDateTime);
		employee_two.setRequestedCreated(formatDateTime);
		employee_two.setReasonForLeave("Sick");
		employee_two.setTotalLeaves(30);

		employees.put(01, employee_one);
		employees.put(02, employee_two);

	}
	
	

	public List<EmployeeLeaveModel> getAllLeaveRequest() {
		return new ArrayList<>(employees.values());
	}

	public List<EmployeeLeaveModel> getEmployeeRequeset() {
		return new ArrayList<>(employees.values());
	}

	private List<EmployeeLeaveModel> getLeaveByStatus()
	{
		//return   employees.stream().filter(t -> t.getId() == id).findFirst().get();
		return null;
	}
	public void postAuthorizeLeaveRequest() {

	}
}
