<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sneaker Details</title>
</head>
<body>
	<h2>Sneaker Details</h2>
	<c:choose>
		<c:when test="${!empty sneaker }">
		
			<h3>Sneaker ID: ${sneaker.id }</h3>
			<ul>
				<li>Brand: ${sneaker.brand }</li>
				<li>Style: ${sneaker.style }</li>
				<li>Primary Color: ${sneaker.primaryColor }</li>
				<li>Secondary Color: ${sneaker.secondaryColor }</li>
				<li>Size: ${sneaker.size }</li>
				<li>Resale Value: $${sneaker.resaleValue }</li>
				<li><img src="${sneaker.sneakerImage }" width="200"
					height="150" /></li>
			</ul>
			<form action="editSneaker.do" method=GET>
				<input type="submit" value="Edit Sneaker" /> <input type="hidden"
					name="sneakerId" value="${sneaker.id }" />
			</form>
			<form action="delete.do" method=POST>
				<input type="submit" value="DELETE Sneaker" /> <input type="hidden"
					name="sneakerId" value="${sneaker.id }" />
			</form>
		</c:when>
		<c:otherwise>
			<h2>No sneaker found....</h2>
		</c:otherwise>
	</c:choose>
	<a href="home.do" class="btn btn-secondary" role="button">Back to
		Home</a>
		<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>