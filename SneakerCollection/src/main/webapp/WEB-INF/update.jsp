<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updated Sneaker Entry</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
	<h2>Your Newly Updated Sneaker Details</h2>
	

			<%-- <h3>Sneaker ID: ${sneaker.id }</h3> --%>
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

	<a href="home.do" class="btn btn-secondary" role="button">Back to
		Home</a>
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>