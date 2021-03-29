<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>AppTP3</title>
</head>
<body>

	<div class="container">
		
		<h3>${user.nome}</h3>
		<h4>${user.email}</h4>
		<h4><a href="${user.git}s">GIT</a></h4>
		
		<form action="/cliente" method="get">	    
			<button type="submit">Novo cliente</button>
		</form>	
		<form action="/produto" method="get">	    
			<button type="submit">Novo Produto</button>
		</form>
		<form action="/usuario" method="get">	    
			<button type="submit">Novo Usuário</button>
		</form>
	</div>	
	
</body>
</html>