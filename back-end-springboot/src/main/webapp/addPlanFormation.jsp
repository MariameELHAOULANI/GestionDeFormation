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

		<h1>Add new Formation Plan</h1>	
		<div class="container">
			<form action="/addNewPlanFormation" th:action="@{/addNewPlanFormation}" th:object="${PlanFormation}" method="post">
				<div class="form-group row">
				 	<label for="formationId" class="col-sm-2 col-form-label">Formation Id:</label> 
				 	 <div class="col-sm-10">
				 		<input type="number" min="0" step="1" class="form-control" placeholder="Formation Id" name="formationId" th:field="formationId" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="taskName" class="col-sm-2 col-form-label">task Name :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="taskName" name="taskName" th:field="taskName" />
					</div>
				</div>
				<div class="form-group row">
	        		<label for="details" class="col-sm-2 col-form-label">Details :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Details" name="details" th:field="details" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="duration" class="col-sm-2 col-form-label">Necessary time :</label>
	        		<div class="col-sm-10">
						<input type="number" min="0" step="1"  class="form-control" placeholder="necessary time" name="duration" th:field="duration" />
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="price" class="col-sm-2 col-form-label">Price :</label>
	        		<div class="col-sm-10">
						<input type="number" step="any" class="form-control" placeholder="Price" name="prix" th:field="prix" />
					</div>
				</div>
	        	
				<button type="submit" class="btn btn-primary">Add</button>
			</form>
		</div>
	
	

</body>
</html>