<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
<style type="text/css">
	body
	{
		background-color: aqua;
	}
	p
	{
		color: white;
		font-size: 30px;
		text-align: right;
	}
</style>
</head>
<body>
	<%@ include file="header.html" %>
	
	<p><a href = "login.jsp">Login</a></p>
	<hr>
	<h1>Welcome to Login Page!</h1>
	
	<%@ include file="footer.html" %>
</body>
</html>