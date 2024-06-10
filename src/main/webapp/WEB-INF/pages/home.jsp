<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Pizza Products</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class=" container-fluid bg-primary text-white ">
  <h1>Pizza Creed</h1>
  <p>spring mvc project</p>
</div>
	<div class="container">
	
	<a href="./new" class="btn btn-link">Add pizza</a>|
	<a href="./editPizza" class="btn btn-link">Edit pizza</a>|
	<a href="./products" class="btn btn-link">View pizza</a>|
	<a href="./deletePizza" class="btn btn-link">delete pizza</a>
	

</div>
	<h1 align="center">Pizza Products</h1>
	<table border="1" class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>name</th>
				<th>Price</th>
				<th>size</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pizza" items="${products}">
				<tr>
					<td>${pizza.pid}</td>
					<td>${pizza.name}</td>
					<td>${pizza.price}</td>
					<td>${pizza.size}</td>
					
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>
