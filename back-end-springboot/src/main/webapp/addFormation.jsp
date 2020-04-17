<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		<style>
		    .bs-example{
		        margin: 20px;        
		    }
		</style>
	</head>
	<body>
		<h1>Add new Formation</h1>
		<div class="container">
			<form action="/addNewFormation" th:action="@{/addNewFormation}" th:object="${Formation}" method="post">
				<div class="form-group row">
				 	<label for="formationTitle" class="col-sm-2 col-form-label">Formation Title :</label> 
				 	 <div class="col-sm-10">
				 		<input type="text" class="form-control" placeholder="FormationTitle" name="formationTitle" th:field="formationTitle" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="objectifs" class="col-sm-2 col-form-label">Objectifs :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Objectifs" name="objectifs" th:field="objectifs"/>
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="prerequis" class="col-sm-2 col-form-label">Prerequis :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Prerequis" name="preRequis" th:field="preRequis"/>
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="etabli" class="col-sm-2 col-form-label">Etablissement :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Etablissement" name="etabli" th:field="etabli" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="nombre" class="col-sm-2 col-form-label">Nombre de Place :</label>
	        		<div class="col-sm-10">
						<input type="number" min="0" step="1" class="form-control" placeholder="Nombre de Place" name="nombreMax" th:field="nombreMax"/>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Add</button>
			</form>
		</div>
	
	</body>
</html>