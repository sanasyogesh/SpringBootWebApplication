<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Status</title>
</head>
<body>

<h3>Registration Status</h3>

<table>
			<tr>
				<td>First Name</td>
				<td>${userDetails.firstName}</td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td>${userDetails.lastName}</td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td>${userDetails.gender}</td>
			</tr>
			
			<tr>
				<td>Hobbies</td>
				<td>${userDetails.hobbies[0]},${userDetails.hobbies[1]},${userDetails.hobbies[2]},${userDetails.hobbies[3]}
				</td>
				
			</tr>
			
			<tr>
				<td>Education</td>
				<td>${userDetails.education}</td>
			</tr>
					
</table>


</body>
</html>