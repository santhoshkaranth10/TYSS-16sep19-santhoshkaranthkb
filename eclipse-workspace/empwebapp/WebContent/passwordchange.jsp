<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean><!-- here we are not creating any object so we are using jspise baean -->
<body>


<fieldset align="center">

	<legend>Change Password</legend>
	<a href="./home" style="float: left;">Home</a>
<a href="./logout" style="float: right;">Logout</a>
<%=msg %>
<form action="./changepassword" method="post">

	<table>
	
			<tr>
				<td>New Possword</td>
				<td><input type="password" name="password">
			</tr>
				
			<tr>
				<td>confirm Possword</td>
				<td><input type="password" name="confirmpassword">
			</tr>
			<tr>
				<td></td>
				<td><input type="reset" value="reset">
				<td><input type="submit" value="confirm">
			</tr>
					
	
	</table>

	
</form>
</fieldset>
</body>
</html>