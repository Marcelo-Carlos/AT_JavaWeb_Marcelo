<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>App materiais escolares</title>
</head>
<body>

	<div class="container">
		<h2>Cadastramento de Produtos</h2>
		<form action="/home">
				<button type="submit" class="btn btn-link">Home</button>
		
		</form>
		<form action="/produto/incluir" method="post">
		
				
		    <div class="form-group">		
			<label>Informe o produto:</label>			
			<input type="text" class="form-control" name="produto">
			</div>	
			
			<div class="form-group">		
			<label>Informe o cliente:</label>
				<select class="form-control" name="cliente.id">					
					<c:forEach var="c" items="${clientes}">  
						<option value="${c.id}">${c.nome}</option>
					</c:forEach>
				</select>
			</div>				
			
		   	
			<button type="submit">Cadastrar</button>
		
		</form>	
		
		<c:if test="${not empty lista}">	
							
			<h2>Listagem de produtos</h2>			
			  <table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Produto</th>
			        <th>Cliente</th>			        	        
			        <th></th>
			      </tr>
			    </thead>
			    <tbody> 
			    			    
			    <c:forEach var="p" items="${lista}">     
			      <tr>
			        <td>${p.produto}</td>	
			        <td>${p.cliente.nome}</td>			        	       
			        <td><a href="/produto/${p.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
			      
			    </tbody>			    
			  </table>
		</c:if> 
		<c:if test="${empty lista}">
			  	<h2>Nenhum produto cadastrado!</h2>
		</c:if>
	</div>
	
</body>
</html>