<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome ${fighter.nickName}</title>
</head>
<body>
	<div>
		<header>
			<h1>Welcome ${fighter.nickName}</h1>
		</header>
		<h2>Click<a href="/fightview">here</a> to rumble!</h2>
		
	</div>


</body>
</html>