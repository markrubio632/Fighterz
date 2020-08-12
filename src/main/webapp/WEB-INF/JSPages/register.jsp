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
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="fighter">
		<div class="container">
			<form:label for="fName" path="fName">
				<b>First Name</b>
			</form:label>
			<form:input type="text" placeholder="Enter First Name" name="fName"
				path="fName" />
			<form:label for="lName" path="lName">
				<b>Last Name</b>
			</form:label>
			<form:input type="text" placeholder="Enter Last Name" name="lName"
				path="lName" />
			<form:label for="nickName" path="nickName">
				<b>Nickname</b>
			</form:label>
			<form:input type="text" placeholder="Enter Nickname" name="nickName"
				path="nickName" />
			<form:label for="gender" path="gender">
				<b>Gender</b>
			</form:label>
			<form:select name="gender" id="gender" path="gender">
				<form:option value="0">Please choose a Gender</form:option>
				<form:option value="1">Male</form:option>
				<form:option value="2">Female</form:option>
				<form:option value="3">Other</form:option>
				<form:option value="4">Prefer not to say</form:option>
			</form:select>
			<form:button type="submit">Login</form:button>
		</div>


	</form:form>

</body>
</html>