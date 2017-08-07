<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is java
<form action="DropdownServlet.java" >

 <select name="dept"> 
  <%
List<String> EList=(List<String>)request.getAttribute("EList");
for(String err:EList)
{
%>
<br>

 <option value="${err }" > <%= err %></option>

<% } %>	 
 </select> 
</form>
</body>
</html>