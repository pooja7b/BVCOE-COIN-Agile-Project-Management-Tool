<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
form {
    text-align: center;
    line-height: 200%
}
body {
	background-image: url("loginpage.jpe");
    background-size: cover;
}
fieldset {
	border-color: maroon;
	border-style: groove;
	color: red;
}

</style>
</head>
<body>
<h1 align="center" style="color:blue;">Welcome To Agile Tools</h1>
<form action="LoginPage" method="post">
 <fieldset>
   <legend>Login Form</legend>
    Username: <input type="text" name="username" value=" "> 
    Password: <input type="password" name="password">
    <input type="submit" value="Submit"> 
    <input type="reset" value="Reset"> <br>
    <a href="regPage.jsp">Not Registered Yet!!</a>
  </fieldset>
</form>
</body>
</html>