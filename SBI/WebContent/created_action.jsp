<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>View Assigned Action Details</title>
</head>
<body>
<center>
<%-- 	<!--  <c:import url="SessionServlet" /> -->
	

		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>
		
 --%>
			
			
				<h2 align="center">Assigned Action details</h2>
				<img src="images/sbilogin.png">
				<!-- <form name="ViewMOM" action="ViewMomServlet" method="post"> -->

					<table border="1" cellspacing="8" cellpadding="8">
						<tr>
							<th>Action ID</th>
							<th>Description</th>
							<th>Assigned to</th>
							<th>Status</th>
							<th>Closure Date</th>
							<th>Actions</th>
							
						</tr>

						<c:forEach var="ad" items="${ActionDetails}">

							<tr>
								
								<td>${ad.actionId}</td>
								<td>${ad.description}</td>
								<td>${ad.assignedToName}</td>
								<td>${ad.status}</td>
								<td>${ad.closureDate}</td>
								<td>
								<form action="UpdateActionStatusServlet" method="post">
								<input type="hidden" name="action_id" value="${ad.actionId}">
								<input type="submit" name="forward_b" value="Widraw"> 
								<input type="submit" name="forward_b" value="Closure"> 
								<input type="submit" name="forward_b" value="Redo"> 
								
								
							</form>
							</td>
							</tr>
							

						</c:forEach>

						
					</table>

				<!-- </form> -->
			<%-- </div>
			<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include> 
		</div> --%>
	</center>

</body>
</html>
