package EmployeeSystem;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeUpdate")
public class EmployeeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String department=request.getParameter("department");
	
	Employee employee=new Employee();
	employee.setId(id);
	employee.setName(name);
	employee.setEmail(email);
	employee.setDepartment(department);
	
	EmployeeDAO employeeDAO=new EmployeeDAO();
	employeeDAO.updateEmployee(employee);
	response.sendRedirect("EmployeeList");
	
}
}

