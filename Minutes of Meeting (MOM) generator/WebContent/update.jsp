<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<link rel="stylesheet" href="sample.css" type="text/css">
<title>View Minutes Of Meeting</title>
<script type="text/javascript" src="view_mom.js">
</script>

</head>
<body>
<center>
			
				<img src="images/sbilogin.png" >
				<h1>Minutes Of Meeting</h1>
			<h2>View Minutes Of Meeting</h2>
			<br /> 
			 <form name="UpdateMOM" action="UpdateSearchServlet" method="post">


			Action Assigned To Me:	<select name="action_item" onchange="this.form.submit()">
				
<option value="">
					<c:forEach items="${actionList}" var="a">
						<option value="${a.description}">
							<c:out value="${a.description}" />
						</option>
					</c:forEach>
</select>
				
				
				
				
		
		<%-- <% request.getParameter("") %>  	 --%>
				
				 <!-- <br> <br /> <br /> <input id="forward_b" name="forward_b" type="submit" value="Update" onclick="UpdateSearchServlet" >
<input id="forward_b" name="forward_b" type="submit" value="ReadyForClosure" onclick="UpdateSearchServlet""> -->
				</form> 
			
	</center>			
</body>
</html>