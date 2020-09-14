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
<title>Registration Specs</title>
</head>
<body>
	<form:form method="post" modelAttribute="fighter">
		<div class="container">
			<!-- label and control for record -->
			<form:label for="record" path="record">
				<b>Record</b>
			</form:label>
			<form:textarea type="text" placeholder="Records in Career" name="record"
				path="record" />

			<!-- label and control for Password -->
			<form:label for="password" path="password">
				<b>Password</b>
			</form:label>
			<form:input type="image" name="image" path="image" />

			<!-- label and control for First Name -->
			<form:label for="style" path="style">
				<b>Style</b>
			</form:label>
			<form:input type="text" placeholder="Enter Fighting Style"
				name="style" path="style" />

			<!-- label and control for Last Name -->
			<form:label for="height" path="height">
				<b>Height</b>
			</form:label>
			<form:input type="text" placeholder="Enter Height" name="height"
				path="height" />

			<!-- label and control for Nick Name -->
			<form:label for="weight" path="weight">
				<b>Weight</b>
			</form:label>
			<form:input type="text" placeholder="Weight in lbs" name="weight"
				path="weight" />

			<!-- label and control for Gender -->
			<form:label for="about" path="about">
				<b>About Me</b>
			</form:label>
			<form:textarea name="about" path="about" />
			<form:button type="submit">Login</form:button>
		</div>


	</form:form>

</body>
</html><%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>