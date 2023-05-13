<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Sneakers</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
<h2>Add Sneakers</h2>

<div class="container">
		<form action="createdSneaker.do" method="POST">
		    
		    <label for="brand">Brand: </label>
			<input type="text" name="brand" required/> 
			<br>
		    <label for="style">Style: </label>
			<input type="text" name="style" required/> 
			<br>
		    <label for="primaryColor">Primary Color: </label>
			<input type="text" name="primaryColor"required/> 
			<br>
		    <label for="secondaryColor">Primary Color: </label>
			<input type="text" name="secondaryColor"/> 
			<br>
		    <label for="size">Size: </label>
			<input type="text" name="size"required/> 
			<br>
		    <label for="resaleValue">Resale Value: </label>
			<input type="text" name="resaleValue"required/> 
			<br>
		    <label for="sneakerImage">Image URL(not required): </label>
			<input type="text" name="sneakerImage"/> 
			<br>
			<input type="submit" value="Submit Sneaker Details" />
</form>
</div>
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>