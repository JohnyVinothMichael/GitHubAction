package com.unzer.employee.vacation.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 *  Class contains all the values for internal data representation.
 * @author johnyvinoth
 *
 */

public class EmployeeLeaveModel {

	/**
	 *  Entity ID number
	 */
	private int    entityId;
	
	/**
	 * Employee ID number
	 */
	private int    employeeId;
	
	/**
	 * Employee Name
	 */
	private String employeeName;
	
	/**
	 * Leave request approved Manager ID number
	 */
	private int    resolvedByManger;
	
	/**
	 * Status of leave approve/rejected/pending
	 */
	private String leaveStatus;
	
	/**
	 * Employee Leave start Date
	 */
	private String leaveStartDate;
	
	/**
	 * Employee leave end date
	 */
	private String leaveEndDate;
	
	/**
	 * Request created date
	 */
	private String requestedCreated;
	
	/**
	 * Reason for the leave
	 */
	private String reasonForLeave;
	
	/**
	 * Total leave for each employee
	 */
	private int totalLeaves;

	public EmployeeLeaveModel() {

	}

	public EmployeeLeaveModel(int entityId, int employeeId, String employeeName, int resolvedByManger,
			String leaveStatus, String leaveStartDate, String leaveEndDate, String requestedCreated,
			String reasonForLeave, int totalLeaves) {
		super();
		this.entityId = entityId;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.resolvedByManger = resolvedByManger;
		this.leaveStatus = leaveStatus;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.requestedCreated = requestedCreated;
		this.reasonForLeave = reasonForLeave;
		this.totalLeaves = totalLeaves;
	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getResolvedByManger() {
		return resolvedByManger;
	}

	public void setResolvedByManger(int resolvedByManger) {
		this.resolvedByManger = resolvedByManger;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public String getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(String leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public String getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public String getRequestedCreated() {
		return requestedCreated;
	}

	public void setRequestedCreated(String requestedCreated) {
		this.requestedCreated = requestedCreated;
	}

	public String getReasonForLeave() {
		return reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	public int getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(int totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

}