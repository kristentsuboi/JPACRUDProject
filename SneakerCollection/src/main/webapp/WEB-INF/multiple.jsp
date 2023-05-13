<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Sneakers</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
	<h1>Show All Sneakers</h1>

	<c:forEach var="sneaker" items="${sneakerList}">
		<ul>
			<h3><a href="getSneaker.do?sneakerId=${sneaker.id }">Sneaker ID: ${sneaker.id }</a></h3>
			<li>Brand: ${sneaker.brand }</li>
			<li>Style: ${sneaker.style }</li>
			<li>Primary Color: ${sneaker.primaryColor }</li>
			<li>Secondary Color: ${sneaker.secondaryColor }</li>
			<li>Size: ${sneaker.size }</li>
			<li>Resale Value: $${sneaker.resaleValue }</li>
			<li><img src="${sneaker.sneakerImage }" width="200" height="150" /></li>
		</ul>
		<br>
	</c:forEach>

	<a href="home.do" class="btn btn-secondary" role="button">Back to
		Home</a>
		<jsp:include page="bootstrapFoot.jsp"/>

</body>
</html>