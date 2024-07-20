<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Save Product Data</h3>
	<form:form action="product" modelAttribute="product" method="POST">
	<table>
		<tr>
			<td>Product ID</td>
			<td><form:input path="productId"/></td>
		</tr>
		
		<tr>
			<td>Product Name</td>
			<td><form:input path="proudctName"/></td>
		</tr>
		
		<tr>
			<td>Product Price</td>
			<td><form:input path="productPrice"/></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="submit"/></td>
		</tr>
		
		
	</table>	
	</form:form>
	
</body>
</html>