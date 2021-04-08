<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="/registrationAPI">
		
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td>
					<input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female
				</td>
			</tr>
			
			<tr>
				<td>Hobbies</td>
				<td>
					<input type="checkbox" name="hobbies" value="singing">Singing
					<input type="checkbox" name="hobbies" value="surfing">Surfing
					<input type="checkbox" name="hobbies" value="chatting">Chatting
					<input type="checkbox" name="hobbies" value="dancing">Dancing
				</td>
			</tr>
			
			<tr>
				<td>Education</td>
				<td><input type="text" name="education"></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="center"><input type="submit"/>
			</tr>
		
		</table>		
	</form>
</body>
</html>