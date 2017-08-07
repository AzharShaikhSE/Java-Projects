<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Notification</title>
<script type="text/javascript" src="go_to_notify.js" ></script>
</head>
<body>
<c:import url="SessionServlet" />
<center>
<img src="images/sbilogin.png" width="400px">
</center>
	<div id="container">
		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>

		<div id="content-container45">

			<div id="navigation">
				<ul>
					<li><a href="LogoutServlet1">Logout</a></li>
					<li><a href="DashBoardServlet">My Dashboard</a></li>
					<li><a href="NotificationServlet">Notify</a></li>
					<li><a href="#">Info</a></li>
				</ul>
			</div>
			<div id="content2">
				<form action="NotificationServlet" method='post'>
					
					<table border="1" cellspacing="5" width="100%" style="text-align:center; border-collapse:collapse;" >
					<tr>
								<th>ActionId</th>
								<th>Description</th>
								
								<th>Status</th>
								<th>ClosureDate</th>
								<th>Organizer</th>
					
					</tr>
						<c:forEach items="${notification}" var="n">
							<tr>
								<td><c:out value="${n.getActionId()}"/> </td>
								<td><c:out value="${n.getDescription()}" /></td>
								
								<td><c:out value="Assigned" /></td>
								<td><c:out value="${n.getClosureDate()}" /></td>
								<td><c:out value="${n.getOrganizer()}" /></td>

							</tr>
									</c:forEach>
					</table>
		
				</form>
				<form action="employee.jsp">
				<input type="submit" value="Back">
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include>
</body>
</html>