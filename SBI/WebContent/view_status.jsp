<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<%-- <c:import url="SessionServlet" /> --%>
	<h2 align="center">View Action Items</h2>
	<div id="container">
		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>

		<div id="content-container45">

			<div id="navigation">
				<ul>
					<li><a href="LogoutServlet1">Logout</a>
					</li>
					<li><a href="DashBoardServlet">My Dashboard</a>
					</li>
					<li><a href="NotificationServlet">Notify</a>
					</li>
					<li><a href="#">Info</a>
					</li>
				</ul>
			</div>
			<div id="content2">
				
				<br /> <br /> <br />
				<form name="view_status" action="ViewMomServlet" method="post">

					<br /> <label>Select status</label> <select name="status_select">
						<option value="open" selected>Open</option>
						<option value="assigned">Assigned</option>
						<option value="work in progress">Work in progress</option>
						<option value="ready for closure">Ready for Closure</option>
						<option value="closed">Closed</option>
					</select> <input type="submit" value="view"> <br>
					
					
						
						
					<table border="1" cellspacing="10" cellpadding="10" width="100%">
						<tr>
							<td>Action Id</td>
							<td>Description</td>
							<td>ClosureDate</td>
							
							<td>Meeting Id</td>
							<!-- <td>Assigned To Id</td>  -->
							<td>Status</td>
						</tr>
						<c:forEach var="sl" items="${statusList}">
							<tr>

								<td>${sl.actionId}</td>
								<td>${sl.description}</td>
								<td>${sl.closureDate}</td>
								
								<td>${sl.meetingId}</td>
								<%-- <td>${sl.assignedToId}</td>  --%>
								<td>${sl.status}</td>

							</tr>

						</c:forEach>
					</table>


				</form>
				<form action="employee.jsp">
				<input type="submit" value="Back">
				</form>
			</div>
<center>
			<p>&copy Copyright State Bank of India 2014</p>
			</center>

			<%-- <jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include> --%>
		</div>

	</div>

</body>
</html>