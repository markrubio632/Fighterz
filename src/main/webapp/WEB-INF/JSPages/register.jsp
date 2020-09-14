<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form method="post" modelAttribute="fighter">
		<div class="container">
			<!-- label and control for UserName -->
			<form:label for="userName" path="userName">
				<b>User Name</b>
			</form:label>
			<form:input type="text" placeholder="User Name" name="userName"
				path="userName" />

			<!-- label and control for Password -->
			<form:label for="pass" path="pass">
				<b>Password</b>
			</form:label>
			<form:input type="text" placeholder="Enter Password" name="pass"
				path="pass" />

			<!-- label and control for First Name -->
			<form:label for="fName" path="fName">
				<b>First Name</b>
			</form:label>
			<form:input type="text" placeholder="Enter First Name" name="fName"
				path="fName" />

			<!-- label and control for Last Name -->
			<form:label for="lName" path="lName">
				<b>Last Name</b>
			</form:label>
			<form:input type="text" placeholder="Enter Last Name" name="lName"
				path="lName" />

			<!-- label and control for Nick Name -->
			<form:label for="nickName" path="nickName">
				<b>Nickname</b>
			</form:label>
			<form:input type="text" placeholder="Enter Nickname" name="nickName"
				path="nickName" />

			<!-- label and control for Gender -->
			<form:label for="gender" path="gender">
				<b>Gender</b>
			</form:label>
			<form:select name="gender" id="gender" path="gender">
				<form:option value="0">Please choose a Gender</form:option>
				<form:option value="male">Male</form:option>
				<form:option value="female">Female</form:option>
				<form:option value="other">Other</form:option>
				<form:option value="prefer not to say">Prefer not to say</form:option>
			</form:select>
			<form:button type="submit">Login</form:button>
		</div>


	</form:form>

</body>
</html>