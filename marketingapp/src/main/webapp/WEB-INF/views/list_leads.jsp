<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>

	<table border="">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>		
		</tr>
			<c:forEach var="lead" items="${leads}">
				<tr>		
				<td>${lead.firstName}</td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.mobiles}</td>
				<td><a href="deletelead?id=${lead.id}">Delete</a></td>
				<td><a href="updatelead?id=${lead.id}">Update</a></td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>