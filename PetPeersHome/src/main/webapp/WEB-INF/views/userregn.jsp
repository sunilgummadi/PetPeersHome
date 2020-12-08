<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<div class="container">
		<form:form action="./user/" method="post" modelAttribute="userReg">
User Name : <form:input path="userName" />
			<br>
			<br>
Password : <form:password path="password" />
			<br>
			<br>
Confirm Password : <form:password path="confirmPassword" />
			<br>
			<br>
			<input type="submit" value="Login">
		</form:form>
	</div>
</body>
</html>