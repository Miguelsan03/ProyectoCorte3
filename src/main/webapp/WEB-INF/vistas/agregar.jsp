<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
	<form action="/agregar" method="POST" class="col-sm-5"></form>
		<form>
			<div class="card">
			<div class="card-header">
			<h4>Agregar Persona</h4>
			
			</div>
			<div class="card-body">
			<div class="form-group">
			<label>Nombre</label>
			<input type="text" name="nombre" class="form-control">
			</div>
			<div class="form-group">
			<label>Correo</label>
			<input type="text" name="correo" class="form-control">
			</div>
			<div class="form-group">
			<label>Password</label>
			<input type="text" name="password" class="form-control">
			</div>
			
			</div>
			<div class="card-footer">
			
			
			<input type="submit" value="Guardar" class="btn btn-info"/>
			<a href="/listar" class="btn btn-link">Regresar</a>
			</div>
			</div>
		</form>
		

	</div>
</body>
</html>