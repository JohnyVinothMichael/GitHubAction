package com.unzer.employee.vacation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.unzer.employee.vacation.model.EmployeeLeaveModel;
import com.unzer.employee.vacation.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService service = new UserService();
	private EmployeeLeaveModel employeeUpdate = new EmployeeLeaveModel();

	private Gson gson = new Gson();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		  JsonObject data = new Gson().fromJson(request.getReader(), JsonObject.class);
		  employeeUpdate = gson.fromJson(data, EmployeeLeaveModel.class);
		  
		  System.out.println(employeeUpdate.getEmployeeName());
		 
		//doGet(request, response);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/leave-status":
			listEmployee(request, response);
			break;
		default:
			break;
		}
	}

	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<EmployeeLeaveModel> employees = new ArrayList<>();

		employees = service.getAllEmployees();

		String userGson = gson.toJson(employees);
		
		//System.out.println("Output Json" +userGson);
		//PrintWriter printwriter = response.getWriter();
		
		response.setContentType("application/json");
		//response.setCharacterEncoding("UFT-8");
		response.getWriter().write(userGson);
		//printwriter.write(userGson);
		//printwriter.close();
	}


}
