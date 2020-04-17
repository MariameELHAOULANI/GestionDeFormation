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
		<h1>Add Job</h1>
		<div class="container">
			<form action="/addNewFormateurPrevJobs" th:action="@{/addNewFormateurPrevJobs}" th:object="${FormateurPrevJobs}" method="post">
				<div class="form-group row">
				 	<label for="formateurId" class="col-sm-2 col-form-label">formateurId:</label> 
				 	 <div class="col-sm-10">
				 		<input type="number" class="form-control" placeholder="formateurId" name="formateurId" th:field="formateurId" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="jobTitle" class="col-sm-2 col-form-label">jobTitle :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="jobTitle" name="jobTitle" th:field="jobTitle" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="jobDesc" class="col-sm-2 col-form-label">jobDesc :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="" name="jobDesc" th:field="jobDesc" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="company" class="col-sm-2 col-form-label">company :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="company" name="company" th:field="company" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="activities" class="col-sm-2 col-form-label">activities :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="activities" name="activities" th:field="activities" />
					</div>
				</div>
			    <div class="form-group row">
	        		<label for="startDate" class="col-sm-2 col-form-label">startDate :</label>
	        		<div class="col-sm-10">
						<input type="date" class="form-control" placeholder="startDate" name="startDate" th:field="startDate" />
					</div>
				</div>
		            <div class="form-group row">
	        		<label for="endDate" class="col-sm-2 col-form-label">endDate :</label>
	        		<div class="col-sm-10">
						<input type="date" class="form-control" placeholder="endDate" name="endDate" th:field="endDate" />
					</div>
				</div>
				
				<button type="submit" class="btn btn-primary">Add</button>
			</form>
		</div>
	</body>
</html>