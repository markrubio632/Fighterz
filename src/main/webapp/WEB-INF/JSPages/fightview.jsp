<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/WEB-INF/CSS/MySideBar.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" modelAttribute="fighter">

		<!-- side bar -->
		<div class="sidebar">
			<a class="active" href="settings.jsp">Settings</a> <a href="#profile">My
				Profile</a>
		</div>

		<!-- main container for information -->
		<div class="container" align="center">
			<caption>
				<h1>Fighter Basic Information</h1>
			</caption>
			<%-- <c:forEach var="fighter" items="${mainFighter}">
				<c:out value="${fighter.id}"></c:out>
				First Name: <c:out value="${fighter.fName}"></c:out><br>
				Nick Name: <c:out value="${fighter.nickName}"></c:out><br>
				Last Name: <c:out value="${fighter.lName}"></c:out><br>
			</c:forEach> --%>
			<h2>First Name: ${mainFighter.fName}</h2>
			<h2>Last Name: ${lName}</h2>
			<h2>NickName: ${nickName}</h2>
		</div>

	</form:form>

</body>
</html>