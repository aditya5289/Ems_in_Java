<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Department Management System</title>
</head>
<body>
    <h2>Hire Employee Form</h2>
    <form action="hireEmployee" method="post">
        <!-- Employee form fields -->
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br>

        <!-- Hire Employee button -->
        <button type="submit">Hire Employee</button>
    </form>
</body>
</html>
