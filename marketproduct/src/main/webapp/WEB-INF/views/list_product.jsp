<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Product</title>
</head>
<body>
	<h2>List Product</h2>
	<table border=1>
		<tr>
			<th>p_name</th>
			<th>p_price</th>
			<th>p_quantity</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach var="prods" items="${prod}">
			<tr>
				<td>${prods.p_name}</td>
				<td>${prods.p_price}</td>
				<td>${prods.p_quantity}</td>
				<td><a href="deletedata?id=${prods.id}">Delete</a></td>
				<td><a href="updatedata?id=${prods.id}">Update</a></td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>