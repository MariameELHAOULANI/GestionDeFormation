<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h1>Add new Formation</h1>
		<div class="container">
			<form action="/addNewUser" th:action="@{/addNewUser}" th:object="${User}" method="post">
				<div class="form-group row">
				 	<label for="inputEmail" class="col-sm-2 col-form-label">User Name :</label> 
				 	 <div class="col-sm-10">
				 		<input type="text" class="form-control" placeholder="Formation Title" name="userName" th:field="userName" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="inputEmail" class="col-sm-2 col-form-label">Email :</label>
	        		<div class="col-sm-10">
						<input type="email" class="form-control" placeholder="Objectifs" name="email" th:field="email" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="inputEmail" class="col-sm-2 col-form-label">First Name :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Prerequis" name="firstName" th:field="fname" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="inputEmail" class="col-sm-2 col-form-label">Last Name :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Etablissement" name="lastName" th:field="lname" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="inputEmail" class="col-sm-2 col-form-label">Password :</label>
	        		<div class="col-sm-10">
						<input type="password" class="form-control" placeholder="Nombre de Place" name="password" th:field="password" />
					</div>
				</div>
				<div class="form-group row">
	        		<label for="inputEmail" class="col-sm-2 col-form-label">Are you a Tutor :</label>
	        		<div class="col-sm-10">
						<input type="radio" name="isFormateur" checked th:field="isFormateur" value="true">Yes</input>
						<input type="radio" name="isFormateur" th:field="isFormateur" value="false">No</input>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Login</button>
			</form>
		</div>
	</body>
</html>