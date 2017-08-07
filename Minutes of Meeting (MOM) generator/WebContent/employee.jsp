<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Home Page</title>
<style type="text/css">
</style>
</head>
<script>

function refresh( t ) {
	setTimeout("location.reload(true);", t);
}
</script>
<body onload="JavaScript:refresh;">
	 <c:import url="SessionServlet" /> 
	<div id="container">
		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>



		<div id="content-container45">
		<h2 align="center" font="Times New Roman">My Dashboard</h2>
	<b>Welcome ${employee.getEmployeeName()} </b>
			<div id="navigation">
			<div class="noti_bubble">2</div>
				<ul>
				<c:set var="notlist" value="${notification}"/>
					<li><a href="LogoutServlet1">Logout</a></li>
					<li><a href="DashBoardServlet">My Dashboard</a></li>
					<li><a href="NotificationServlet">Notify(${f:length(notlist)})</a></li>
					
				</ul>
			</div>

			<div id="section-navigation">
				<ul>
					
					<li><a href="minutes_of_meeting.jsp">Create MinutesOfMeeting</a>
					</li>
					<li><a href="update_type.jsp">Update Status</a>
					</li>
					<li><a href="view_mom.jsp">View MinutesOfMeeting</a>
					</li>
					<li><a href="view_status.jsp">View Action Items by Status</a>
					</li>
					<c:set var="role" scope="session" value="${employee.getRole()}"/>
					<c:if test="${role==1}">
					<li><a href="view_deptreports.jsp">View Reports Departmentwise Minutes created</a></li>
					<li><a href="EmployeeDropdownServlet">View Reports Employeewise Minutes created</a></li>
					</c:if> 
					

				</ul>
				<img src="images/sbilogin.png">
				
			</div>


			<div id="content">



				<form name="login" action="LogoutServlet1" method="post">
				<%-- <c:set var="notlist" value="${notification}"/>
				
						<p>Number of New Notifications : "${f:length(notlist)}"</p> --%>
		
					
					

					<table border="1" cellpadding="10" cellspacing="10" width="100%">

						<tr>
							<td>Number of MOMS created:</td>
							<td>${dashboard.meetingId}</td>
						</tr>
						<tr>
							<td colspan="2">Number of Action Item grouped under:</td>
						</tr>
						<tr>
							<td>Open:</td>
							<td>${dashboard.open}</td>
						</tr>
						<tr>
							<td>Assigned:</td>
							<td>${dashboard.assigned}</td>
						</tr>
						<tr>
							<td>Work in Progress:</td>
							<td>${dashboard.workInProgress}</td>
						</tr>
						<tr>
							<td>Ready For Closure:</td>
							<td>${dashboard.readyforClosure}</td>
						</tr>
						<tr>
							<td>Closed:</td>
							<td>${dashboard.closed}</td>
						</tr>

					</table>


				</form>


			</div>


		



		</div>

	</div>

	<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include>

</body>
</html>