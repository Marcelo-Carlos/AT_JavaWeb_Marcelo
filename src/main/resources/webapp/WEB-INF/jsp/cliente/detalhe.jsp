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
	
		<c:if test="${not empty msg}">
			<div class="alert alert-warning">
			  <strong>Algo deu errado. Tente novamente!</strong>${msg}
			</div>
		</c:if>
		
		<form action="/cliente/incluir" method="post">
		
		    <div class="form-group">		
			<label>Informe o seu nome:</label>
			<input type="text" class="form-control" name="nome">
			</div>		
		   	
			<button type="submit">Cadastrar</button>
		
		</form>	
		
		<c:if test="${not empty lista}">	
							
			<h2>Listagem de clientes</h2>			
			  <table class="table">
			    <thead>
			      <tr>
			        <th>Nome</th>	        
			        <th></th>
			      </tr>
			    </thead>
			    <tbody> 
			    			    
			    <c:forEach var="c" items="${lista}">     
			      <tr>
			        <td>${c.nome}</td>		       
			        <td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
			      
			    </tbody>			    
			  </table>
		</c:if> 
		<c:if test="${empty lista}">
			  	<h2>Nenhum cliente cadastrado!</h2>
		</c:if>
	</div>
	
</body>
</html>