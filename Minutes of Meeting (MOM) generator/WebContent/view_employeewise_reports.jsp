<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Home Page</title>
<style type="text/css">
</style>
</head>
<body>
	<%-- <c:import url="SessionServlet" /> --%>
	<div id="container">
		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>


		<div id="content-container45">
		
			<div id="navigation">
				<ul>
					<li><a href="LogoutServlet1">Logout</a></li>
					<li><a href="DashBoardServlet">My Dashboard</a></li>
					<li><a href="NotificationServlet">Notification</a></li>
					<li><a href="#">Info</a></li>
				</ul>
			</div>
		
		<div id="content2">
		
		
		<form name="empwise_report" action="EmployeeReportsServlet" method="post">
				
					<select name="selectemp">
						<option value="" selected>None</option>

						<c:forEach items="${EList}" var="e">
							<option value="${e.employeeId}">
								<c:out value="${e.employeeName}(${e.employeeId})" />
							</option>

						</c:forEach>
						</select>
				<input type="submit" name="empName" value="Submit" onclick="EmployeeReportsServlet">
				 <table border="1" cellspacing="10" cellpadding="10"> 
				
					<tr>
							<th>Employee ID</th>
							<th>Employee Name</th>
							<th>Total number of MOMs created</th>
							<th>Meeting Attended</th>
							<th>Meeting Absent</th>
							<th>Percentage Absent</th>
							
							
					</tr>
										
						<tr>
							<td>${empwiseReport.getEmployeeId()}</td>						
							<td>${empwiseReport.getEmployeeName()}</td>
							<td>${empwiseReport.getTotalMomCreated()}</td>
							<td>${empwiseReport.getTotalMeetingAttended()}</td>
							<td>${empwiseReport.getTotalMeetingAbsent()}</td>
							<td>${empwiseReport.getPercentageAbsent()}</td>
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