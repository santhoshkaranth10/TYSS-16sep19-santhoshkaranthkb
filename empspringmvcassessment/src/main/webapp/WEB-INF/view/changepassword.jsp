<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>change password</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Change password</td>
					<td><input type="password" name="changepassword"></td>
				</tr>
				<tr>
					<td>Retype Password:</td>
					<td><input type="password" name="retypepassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="changepassword"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register">Click here to go to home page</a>

</body>
</html>