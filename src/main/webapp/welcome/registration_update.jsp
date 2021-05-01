<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>


</head>
<body>
	<form action="/update">
		
			<table>
				<tr>
					<td><input type="hidden" name="id" value="${memberdata.id}"> </td>
				</tr>
			
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" value="${memberdata.firstName}"></td>
				</tr>			
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" value="${memberdata.lastName}"></td>
				</tr>			
				<tr>
					<td>Gender</td>
					<td>
						<input type="radio" name="gender" value="Male" <c:if test="${memberdata.gender=='Male'}">checked</c:if>>Male
						<input type="radio" name="gender" value="Female" <c:if test="${memberdata.gender=='Female'}">checked</c:if>>Female											
					</td>
				</tr>			
				<!-- <tr>
					<td>Hobbies</td>
					<td>
						<input type="checkbox" name="hobbies" value="Singing">Singing
						<input type="checkbox" name="hobbies" value="Surfing">Surfing
						<input type="checkbox" name="hobbies" value="Chatting">Chatting
						<input type="checkbox" name="hobbies" value="Dancing">Dancing
					</td>
				</tr> -->			
				<tr>
					<td>Education</td>
					<td><input type="text" name="education" value="${memberdata.education}"></td>
				</tr>			
				<tr>
					<td></td>
					<td align="center"><input type="submit" id="updateButton" value="Update"/>
				</tr>		
			</table>	
		
		
	</form>
</body>
</html>