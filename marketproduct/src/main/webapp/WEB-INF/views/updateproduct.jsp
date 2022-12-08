<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>Update Product</h2>
	<form action="updateOneData" >
		<table>
			<tr>
				<td><input type="hidden" name="id" value="${product.id}"/></td>
			</tr>
			<tr>
				<td>P.Name</td>
				<td><input type="text" name="p_name" value="${product.p_name}"/></td>
			</tr>
			<tr>
				<td>P.Quantity</td>
				<td><input type="text" name="p_quantity" value="${product.p_quantity}"/></td>
			</tr>
			<tr>
				<td>P.Price</td>
				<td><input type="text" name="p_price" value="${product.p_price}"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"/></td>
			</tr>
		</table>
	</form>
</body>
</html>