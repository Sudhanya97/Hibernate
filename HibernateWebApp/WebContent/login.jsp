<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="16kb" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%@ include file="header.html" %>

	<form action="checkuser" method="post">
		<p><input type="text" name="username" placeholder="Enter your username"></p>
		<p><input type="password" name="passwd" placeholder="Enter your password"></p>
		<p><input type="submit" id="submitter" value="Sign in"></p>
	</form>
	
	<%@ include file="footer.html" %>
</body>
</html>