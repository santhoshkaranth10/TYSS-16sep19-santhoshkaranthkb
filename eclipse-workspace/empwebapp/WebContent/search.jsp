<%@page import="com.testyantra.empwebapp.dto.EmployeeInfo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- <%-- <jsp:useBean id="info" class="com.testyantra.empwebapp.dto.EmployeeInfo" scope="request"></jsp:useBean><!--this line will return an object unneccessarily so to avoid that we skip this line and create an object  --> --%> --%>
<%
   EmployeeInfo info  = (EmployeeInfo)request.getAttribute("info");
%>
<body>
<a href='./home'>Home</a>
<a href='./logout' style='float:right'>Logout</a>
<%if(info!=null){ %>
<fieldset>
<legend>Employee info</legend>
<table align="center">
<tr>
<th>id</th>
<th>Name</th>
<th>Email</th>
</tr>
<tr>
<td><%=info.getId() %></td>
<td><%=info.getName() %></td>
<td><%=info.getEmail() %></td>
</tr>
</table>
</fieldset>
<%}else{ %>
<h1>no data found</h1>
<%} %>
</body>
</html>