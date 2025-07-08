package EmployeeSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
private String jdbcURL="jdbc:mysql://localhost:3306/employee_management";
private String jdbcUsername="root";
private String jdbcPassword="root";

public void addEmployee(Employee employee) throws SQLException {
	try(Connection connection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)){
		PreparedStatement statement=connection.prepareStatement("Insert into employees(name,email,department)values(?,?,?)");
		statement.setString(1, employee.getName());
		statement.setString(2,employee.getEmail());
		statement.setString(3, employee.getDepartment());
		statement.executeUpdate();
	}catch(Exception e) {e.printStackTrace();
}
}
public List<Employee>getAllEmployees(){
	List<Employee>employees=new ArrayList<>();
	try(Connection connection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)){
		PreparedStatement statement=connection.prepareStatement("Select*from employees");
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next()) {
			Employee employee=new Employee();
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("name"));
			employee.setEmail(resultSet.getString("email"));
			employee.setDepartment(resultSet.getString("department"));
		employees.add(employee);
			
			
		}
	}catch(Exception e) {e.printStackTrace();
}
return employees;
}
public Employee getEmployeeById(int id) {
	Employee employee=null;
	try(Connection connection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)){
		PreparedStatement statement=connection.prepareStatement("Select*from employees Where id=?");
		statement.setInt(1, id);
		ResultSet resultSet=statement.executeQuery();
		if(resultSet.next()) {
			employee=new Employee();
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("name"));
			employee.setEmail(resultSet.getString("email"));
            employee.setDepartment(resultSet.getString("department"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return employee;
}
public void updateEmployee(Employee employee) {
	try(Connection connection =DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)){
		PreparedStatement statement=connection.prepareStatement("Update employees Set name=?,email=?,department=?Where id=?");
		statement.setString(1, employee.getName());
		statement.setString(2, employee.getEmail());
		statement.setString(3, employee.getDepartment());
		statement.setInt(4, employee.getId());
		statement.executeUpdate();
	}catch(Exception e) {e.printStackTrace();
	
}
}
public void deleteEmployee(int id) {
	try(Connection connection= DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)){
		PreparedStatement statement=connection.prepareStatement("Delete from employees where id=?");
		statement.setInt(1, id);
		statement.executeUpdate();
		
	}catch(Exception e) {e.printStackTrace();
}
}
}
