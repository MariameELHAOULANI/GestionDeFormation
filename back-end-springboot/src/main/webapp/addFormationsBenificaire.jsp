<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Add new Formation Benifice</h1>
		<div class="container">
			<form action="/addNewFormationsBenificaire" th:action="@{/addNewFormationsBenificaire}" th:object="${Formation}" method="post">
				<div class="form-group row">
				 	<label for="formformationIdationTitle" class="col-sm-2 col-form-label">formationId :</label> 
				 	 <div class="col-sm-10">
				 		<input type="text" class="form-control" placeholder="formationId" name="formationId" th:field="formationId" />
				 	</div>
				</div>
	        	<div class="form-group row">
	        		<label for="location" class="col-sm-2 col-form-label">location :</label>
	        		<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="location" name="location" th:field="location"/>
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="email" class="col-sm-2 col-form-label">email :</label>
	        		<div class="col-sm-10">
						<input type="email" class="form-control" placeholder="email" name="email" th:field="email"/>
					</div>
				</div>
	        	<div class="form-group row">
	        		<label for="telephone" class="col-sm-2 col-form-label">telephone :</label>
	        		<div class="col-sm-10">
						<input type="tel" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" title="phone xxx-xx-xxx"  class="form-control" placeholder="telephone" name="telephone" th:field="telephone" />
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Add</button>
			</form>
		</div>
</body>
</html>