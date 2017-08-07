<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<!--  <c:import url="SessionServlet" /> -->
	<div id="container">

		<jsp:include page="/header.jsp">
		<jsp:param name="header" value="Employee" />
		</jsp:include>
		<div id="content-container45">
		<h2 align="center">View Minutes Of Meeting</h2>
			<div id="navigation">
				<ul>
					<li><a href="LogoutServlet1">Logout</a></li>
					<li><a href="DashBoardServlet">My Dashboard</a></li>
					<li><a href="NotificationServlet">Notify</a></li>
					<li><a href="#">Info</a></li>
				</ul>
			</div>
			<div id="content2">
				<form name="ViewMOM" action="ViewMomServlet" method="post" onsubmit="return view_mom()" >
<br/><br/>
					<br /> <input type="radio" align="middle" name="radio"
						onclick="display_meetingtextbox()" value="mid" id="meetingradio" >MeetingId<br />
					<!-- <input  type="radio" align="middle" name="radio" onclick = "getAnswer('b')" value="b" >Status<br/> -->
					
					<input type="radio" align="middle" name="radio" 
						onclick="display_datetextbox()" value="date" id="dateradio">Date
						
						<!-- search by meetingid -->
						
						
						
			<input type="text" name="meetingsearch" placeholder="meetingid" id="meetingid" style="display:none">
					<br />
					
						
						
						<!-- search by date -->
				 <input type="date" name="datesearch"value"" placeholder="yyyy-mm-dd" id="dateformat" style="display:none"> 
						<input type="submit" value="submit" >
					<br />


<br/>
					<table border="1" cellspacing="10" cellpadding="10" >
						<tr>
							<th>Meeting id</th>
							<th>Subject</th>
							<th>Purpose</th>
							<th>Date</th>
							<th>Start time</th>
							<th>End Time</th>
							<th>Decision Taken</th>
							<th>Organizer</th>
						</tr>

						<c:forEach var="ml" items="${midList}">

							<tr>
								<td>${ml.meetingId}</td>
								<td>${ml.subject}</td>
								<td>${ml.purpose}</td>
								<td>${ml.date}</td>
								<td>${ml.startTime}</td>
								<td>${ml.endTime}</td>
								<th>${ml.decisionTaken}</th>
								<td>${ml.organizer}</td>

							</tr>

						</c:forEach>

						<c:forEach var="dl" items="${dateList}">

							<tr>


								<td><a
									href="${pageContext.request.contextPath}/action_itemdetails.jsp/actionId=${dl.meetingId}">${dl.meetingId}</a>
								</td>
								<td>${dl.subject}</td>
								<td>${dl.purpose}</td>
								<td>${dl.date}</td>
								<td>${dl.startTime}</td>
								<td>${dl.endTime}</td>
								<td>${dl.decisionTaken}</td>
								<td>${dl.organizer}</td>

							</tr>

						</c:forEach>
					</table>
<br/>
				</form>
				<form action="employee.jsp">
				<input type="submit" value="Back">
				</form>
			</div>
			
		</div>
	</div>

</body>
</html>