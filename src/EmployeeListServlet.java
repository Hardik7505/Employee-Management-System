package EmployeeSystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/EmployeeList")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  EmployeeDAO employeeDAO = new EmployeeDAO();
	        List<Employee> employees = employeeDAO.getAllEmployees();
	        request.setAttribute("employees", employees);
	        request.getRequestDispatcher("EmployeeList.jsp").forward(request, response);
	    }
	}
