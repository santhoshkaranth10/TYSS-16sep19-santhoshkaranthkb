<%@page import="com.tyss.empspringmvcassessment.dto.RetailerBean"%>
<%@page import="com.tyss.empspringmvcassessment.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./logout">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		/*here we are getting the bean which contains id and the bean is present in  requestAttribute */
		Product product = (Product) request.getAttribute("name");
	%>
	
	<%
		if (product != null) {
	%>
	<table>
		<tr>
			<th>PId</th>
			<th>PNAME</th>
			<th>PRICE</th>
			
			</tr>

    <tr>
    <td><%=product.getPid()%></td>
    <td><%=product.getPname()%></td>
    <td><%=product.getPrice()%></td>
    
</tr>
</table>
    <% 
       } 
    %>
    <h2>${msg }</h2>
    </body>
    </html>
    