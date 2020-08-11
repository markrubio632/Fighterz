<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
	<form method="get">
		<div class="container">
			<label for="fName"><b>First Name</b></label> <input type="text"
				placeholder="Enter First Name" name="fName" required> <label
				for="lName"><b>Last Name</b></label> <input type="text"
				placeholder="Enter Last Name" name="lName" required> <label
				for="nickName"><b>Nickname</b></label> <input type="text"
				placeholder="Enter Nickname" name="nickName" required> <label
				for="gender"><b>Gender</b></label> <select name="gender" id="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>
				<option value="Other">Other</option>
				<option value="Prefer not to say">Prefer not to say</option>
			</select>
			<button type="submit">Login</button>
		</div>


	</form>

</body>
</html>