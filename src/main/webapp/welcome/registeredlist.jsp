<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Members List</title>
</head>
<body>

	<div>
		${result};
	</div>
		
	<div>
		<a href="/registration">Register New User</a>
	</div>
	
	<div>
		<a href="/home">Home</a>
	</div>

	<table border="1">
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Hobbies</th>
		<th>Education</th>
		<th>Update</th>
		<th>Delete</th>

		<c:forEach items="${memberlist}" var="member">
			<tr>
				<td><c:out value="${member.id}" /></td>
				<td><c:out value="${member.firstName}" /></td>
				<td><c:out value="${member.lastName}" /></td>
				<td><c:out value="${member.gender}" /></td>
				<td>Not Available.</td>
				<%-- <td><c:out value="${member.hobbies}" /></td> --%>
				<td><c:out value="${member.education}" /></td>
				<td><a href="/delete/${member.id}">Delete</a></td>
				<td><a href="/fetchforupdate/${member.id}">Update</a></td>
			</tr>

		</c:forEach>


	</table>



</body>
</html>