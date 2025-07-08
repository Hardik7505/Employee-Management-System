<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
  <title>Employee List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: gold;
        }
        
        h1 {
            text-align: center;
            color: #333;
        }
        
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 40px auto;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
          th {
            background-color: #333;
            color: #fff;
        }
        
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        
        a {
            text-decoration: none;
            color: #337ab7;
        }
        
        a:hover {
            color: #23527c;
        }
    </style>
</head>
<body>
         <h1>Employee List</h1>
    <%@page import="java.util.List" %>
    <%@ page import="EmployeeSystem.Employee" %>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Actions</th>
        </tr>
        <% 
        List<Employee> employees = (List<Employee>) request.getAttribute("employees");
        if (employees != null && !employees.isEmpty()) {
            for (Employee employee : employees) {
        %>
        <tr>
            <td><%= employee.getId() %></td>
               <td><%= employee.getName() %></td>
            <td><%= employee.getEmail() %></td>
            <td><%= employee.getDepartment() %></td>
            <td>
                <a href="EmployeeUpdate.jsp?id=<%= employee.getId() %>">Update</a>
                <a href="EmployeeDelete?id=<%= employee.getId() %>" style="margin-left: 10px;">Delete</a>
            </td>
        </tr>
        <% 
            }
        } else {
        %>
        <tr>
            <td colspan="5" style="text-align: center;">No employees found.</td>
        </tr>
        <% 
        }
        %>
    </table>
    </body>
</html>

    
            
        
