package EmployeeSystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException; 
@WebServlet("/EmployeeRegistration")
public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setDepartment(department);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		try {
			employeeDAO.addEmployee(employee);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("EmployeeList");
		
	}

}
