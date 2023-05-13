<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Sneaker</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
<h1>Edit Sneaker</h1>
<div class="container">
		<form action="updatedSneaker.do" method="POST">
		<label for="brand">Brand</label>
	    	<input type="text" name="brand" value="${sneaker.brand}"/>
	    	<br>
	    <label for="style">Style</label>
	    	<input type="text" name="style" value="${sneaker.style}"/>
	    	<br>
	    <label for="primaryColor">Primary Color</label>
	    	<input type="text" name="primaryColor" value="${sneaker.primaryColor}"/>
	    	<br>
	    <label for="secondaryColor">Secondary Color</label>
	    	<input type="text" name="secondaryColor" value="${sneaker.secondaryColor}"/>
	    	<br>
	    <label for="size">Size</label>
	    	<input type="text" name="size" value="${sneaker.size}"/>
	    	<br>
	    <label for="resaleValue">Resale Value</label>
	    	<input type="text" name="resaleValue" value="${sneaker.resaleValue}"/>
	    	<br>
	    <label for="description">Image</label>
	    	<input type="hidden" name="sneakerImage" value="${sneaker.sneakerImage}"/>
	    	<img src="${sneaker.sneakerImage }" width="200" height="150"/>
	    	<br>
	    <input type="submit" value="Send Updated Sneaker Details"/>
			<input type="hidden" name="sneakerId" value="${sneaker.id}"/>
	    	</form>
	    	
	    	
</div>
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>