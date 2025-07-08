<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Employee</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: gold;
        }
        
        h1 {
            text-align: center;
            color: #333;
        }
        
        form {
            width: 50%;
            margin: 40px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        label {
            display: block;
            margin-bottom: 10px;
        }
        
        input[type="text"], input[type="email"] {
  width: 100%;
            height: 40px;
            margin-bottom: 20px;
            padding: 10px;
            border: 1px solid #ccc;
        }
        
        input[type="submit"] {
            width: 100%;
            height: 40px;
            background-color: #337ab7;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        
        input[type="submit"]:hover {
            background-color: #23527c;
        }
    </style>
</head>
<body>
    <h1>Register Employee</h1>
    <form action="EmployeeRegistration"method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <label for="department">Department:</label>
        <input type="text" id="department" name="department">
        <input type="submit" value="Register">
    </form>
</body>
</html>

    
    
        