<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class=" container-fluid bg-primary text-white ">
  <h1>Pizza Creed</h1>
  <p>spring mvc project</p>
</div>

	<div align="center">
		<h2>New Pizza Product</h2>
		<form:form action="save" method="post" modelAttribute="product">
			<table border="0" cellpadding="5">

				<tr>
					<td>ID:</td>
					<td>${product.pid}<form:hidden path="pid" />
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" cssClass="form-control"  /></td>
				</tr>

				<tr>
					<td>Price:</td>
					<td><form:input path="price" cssClass="form-control"  /></td>
				</tr>
				<tr>
					<td>Size:</td>
					<td><form:input path="size" cssClass="form-control"  /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save" class="btn btn-primary"></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>
