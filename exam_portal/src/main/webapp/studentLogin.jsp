<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
</head>
<body>
<center>
<form action="controller/studentLogin" method="post">
Enter User Name:
<input type="text"  name="username" /> <br>
Enter Password:
<input type="password" name="password"/><br>
<input type ="submit" value="Login" />
</form>
</center>
<center>
<a href="/forgetPassword">Forgot Password?</a>
</center>
</body>
</html>