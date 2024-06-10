<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class=" container-fluid bg-primary text-white ">
  <h1>Pizza Creed</h1>
  <p>spring mvc project</p>
</div>


<div class="container" >

	<h2 style="margin-top: 100px">Admin Login</h2>
	<form action="/pizzaCreed/admin/login" method="post">
		<div class=" mb-3 mt-3">
			<label for="username">Username:</label> 
			<input type="text"id="username" name="username" required class="form-control">
		</div>
		<div class=" mb-3" >
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" required class="form-control">
		</div>
		<div class=" mb-3 mt-3">
			<button class="btn btn-primary type="submit">Login</button>
		</div >
		<div>
			<span style="color: red">${error}</span>
		</div>
	</form>
	

</div>



</body>
</html>