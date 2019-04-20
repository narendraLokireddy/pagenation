<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
 </script>

</head>
<body style="margin: 100px">

	<input id="myInput" type="text" placeholder="Search..">




	<c:forEach var="i" begin="10" step="10" end="${totalrecords}">
		<a href="users?pageSize=${i}">
			<button>${i}</button>
		</a>
	</c:forEach>
	
	
	
	<c:if test="${not empty users }">
		<table border="1" width="50%">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>AGE</td>
			</tr>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
				</tr>
			</c:forEach>
		</table>
pagesize:<td>${pagesize}</td>  page Number:<td>${pagenumber+1}</td>









		<p>
			<c:forEach var="i" begin="0" end="${totalNumberOfPages-1}">
				<a href="users?pageNo=${i}&pageSize=${pageSize}"><button>${i+1}</button>
				</a>
			</c:forEach>

		</p>


	</c:if>




</body>
</html>