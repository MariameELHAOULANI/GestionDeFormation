<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
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
		<h1>Add new Formateur</h1>
		<div class="container">
			<form action="/addNewFormateur" th:action="@{/addNewFormateur}" th:object="${Formateur}" method="post">
				<div class="form-group row">
				 	<label for="firstName" class="col-sm-2 col-form-label">firstName:</label> 
				 	 <div class="col-sm-10">
				 		<input type="text" class="form-control" placeholder="firstName" name="firstName" th:field="firstName" />
				 	</div>
				</div>
				<div class="form-group row">
				 	<label for="lastName" class="col-sm-2 col-form-label">lastName:</label> 
				 	 <div class="col-sm-10">
				 		<input type="text" class="form-control" placeholder="lastName" name="lastName" th:field="lastName" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="address" class="col-sm-2 col-form-label">address :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="address" name="address" th:field=address />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="dateOfBirth" class="col-sm-2 col-form-label">dateOfBirth :</label>
	        		<div class="col-sm-10">
						<input type="date" class="form-control" placeholder="dateOfBirth" name="dateOfBirth" th:field="dateOfBirth" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="nationality" class="col-sm-2 col-form-label">nationality :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="nationality" name="nationality" th:field="nationality" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="telephone" class="col-sm-2 col-form-label">telephone :</label>
	        		<div class="col-sm-10">
						<input type="tel" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" title="phone xxx-xx-xxx" placeholder="telephone" name="telephone" th:field="telephone" />
					</div>
				</div>
			    <div class="form-group row">
	        		<label for="email" class="col-sm-2 col-form-label">email :</label>
	        		<div class="col-sm-10">
						<input type="email" class="form-control" placeholder="email" name="email" th:field="email" />
					</div>
				</div>
		        <div class="form-group row">
	        		<label for="personalInfo" class="col-sm-2 col-form-label">personalInfo :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="personalInfo" name="personalInfo" th:field="personalInfo" />
					</div>
				</div>
				<div class="form-group row">
	        		<label for="acadimecInfo" class="col-sm-2 col-form-label">acadimecInfo :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="acadimecInfo" name="acadimecInfo" th:field="acadimecInfo" />
					</div>
				</div>
				
				<button type="submit" class="btn btn-primary">Add</button>
			</form>
		</div>
	</body>
</html>