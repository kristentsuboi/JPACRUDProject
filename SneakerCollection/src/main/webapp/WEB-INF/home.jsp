<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sneaker Collection</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
	<h1>Welcome to my Sneaker Collection</h1>

	<form action="getSneaker.do" method="GET">
		Search by Sneaker ID: <input class="form-control" type="text"
			name="sneakerId" /> <input class="col btn btn-primary" type="submit"
			value="Show Sneaker" />
	</form>
	<br>

	<form action="listAll.do" method=GET>
		<input type="submit" value="List All Sneakers" />
	</form>
<br>
	<form action="createSneaker.do" method=GET>
		<input type="submit" value="Add Sneakers" />
	</form>
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>