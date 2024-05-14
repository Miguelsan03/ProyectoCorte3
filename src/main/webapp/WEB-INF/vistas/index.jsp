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
	<a href="/nuevo" class="btn btn-succes">Agregar Nuevo</a>
		<table class="table">
		<thead>
		<tr>
		<th>ID</th>
		<th>NOMBRE</th>
		<th>ACCION</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="persona" items="${personas}">
		<tr>
				<td>${persona.id}</td>
				<td>${persona.nombre}</td>
				<td>${persona.correo}</td>
				<td>
				<a class="btn btn-warning">Editar</a>
				<a class="btn btn-danger">Eliminar</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
	</div>
</body>
</html>