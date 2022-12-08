<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Product Details</title>
</head>
<body>
	<h2>Insert Product Details</h2>
	<form action="savedata" >
		<table>
			<tr>
				<td>P.Name</td>
				<td><input type="text" name="p_name"/></td>
			</tr>
			<tr>
				<td>P.Quantity</td>
				<td><input type="text" name="p_quantity"/></td>
			</tr>
			<tr>
				<td>P.Price</td>
				<td><input type="text" name="p_price"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"/></td>
			</tr>
		</table>
	</form>
</body>
</html>