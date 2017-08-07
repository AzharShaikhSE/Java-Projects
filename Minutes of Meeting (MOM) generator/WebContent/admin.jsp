<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Admin Home Page</title>
<style type="text/css">
</style>
</head>
<body>
<!-- <c:import url="SessionServlet" /> -->
<div id="container">
<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>

	<div id="content-container">
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
			<div id="section-navigation">
				<ul>
				<li><a href="#">DashBoard</a></li>
				<li><a href="MinutesOfMeeting.jsp">Create MinutesOfMeeting</a></li>
				<li><a href="#">Update Status</a></li>
				<li><a href="view_mom.jsp">View MinutesOfMeeting</a></li>
			</ul>
			</div>
			</div>
			
			<div id="content">
			
			</div>
			
			
		
			
			<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include>
		</div>
			

</body>
</html>