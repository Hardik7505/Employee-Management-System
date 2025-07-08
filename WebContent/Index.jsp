<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
  <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: white;
        }
        
        header {
            background-color: yellow;
            color: black;
            padding: 20px;
            text-align: center;
        }
        
        nav {
            background-color: blue;
            padding: 10px;
            text-align: center;
        }
        
        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }
           nav li {
            display: inline-block;
            margin-right: 20px;
        }
        
        nav a {
            color: Red;
            text-decoration: bold;
            transition: color 0.2s ease;
        }
        
        nav a:hover {
            color: #ccc;
        }
        
        h1 {
            margin: 0;
        }
    </style>
</head>
<body>
    <header>
      <h1>Employee Management System</h1>
    </header>
    <nav>
        <ul>
            <li><a href="EmployeeRegistration.jsp">Register Employee</a></li>
            <li><a href="EmployeeList">List Employee</a></li>
        </ul>
    </nav>
</body>
</html>
    
    
        
