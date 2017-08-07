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
	
		<center>
			
				<img src="images/sbilogin.png">
				
			


		
			<h2 align="center">View Minutes Of Meeting</h2>
			
			 <form name="update_created_mom" action="UpdateMomFindServlet" method="post">
MOM's Created By Me: <select name="meetings" onchange="this.form.submit()">
				
<option value="Select">

					<c:forEach items="${MeetingList}" var="m">
						<option value="${m.subject}:${m.meetingId}">
							<c:out value="${m.subject }: ${m.meetingId}" />
						</option>
					</c:forEach>



				</select><br/>
				<br/>
				
				
				
				 <c:forEach items="${MeetingDetails}" var="md">
				Meeting id : <input type="text" name="meeting_id" value="${md.meetingId}"
					align="left" readonly="readonly"><br />
				<br />
				 Subject : <input type="text" name="subject" value="${md.subject}"
					align="left" readonly="readonly"><br />
				<br />
				 Purpose : <input type="text" name="purpose" value="${md.purpose}"
					align="left" readonly="readonly"><br />
				<br />
				
				<br />
				  Date : <input type="text" name="date" value="${md.date}"
					align="left" readonly="readonly"><br />
				<br />
				 Decision taken : <input type="text" name="dtaken" value="${md.decisionTaken}"
					align="left" size=""><br />
				</c:forEach>
					
				 <br> <br /> <br />
				
<input id="forward_b" name="forward_b" type="submit" value="ViewAssignedDetails" onclick="UpdateMomFindServlet"">
				</form> 
			
				</center>
</body>
</html>