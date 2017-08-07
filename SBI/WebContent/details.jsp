<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<img src="images/sbilogin.png">
<form name="UpdateMOM1" action="UpdateSearchServlet" method="post">
<br/>
					<c:forEach items="${ListDetails}" var="a"> 
					Action Id : <input type="text" name="action_id" value="${a.actionId}"
					align="left" readonly="readonly"><br />
				Action Name : <input type="text" name="action_name" value="${a.description}"
					align="left" readonly="readonly"><br />
				<br />
				 Assigned By : <input type="text" name="assigned_by" value="${a.organizer}"
					align="left" readonly="readonly"><br />
				<br />
				 Meeting Id : <input type="text" name="meeting_id" value="${a.meetingId}"
					align="left" readonly="readonly"><br />
				<br />
				
				<br />
				 Closure Date : <input type="text" name="closure_date" value="${a.closureDate}"
					align="left" readonly="readonly"><br />
				<br />
				<c:if test="${a.status==1}">
				 Status : <input type="text" name="closure_date" value="Assigned"
					align="left" readonly="readonly"><br />
					</c:if>
					<c:if test="${a.status==2}">
				 Status : <input type="text" name="closure_date" value="WIP"
					align="left" readonly="readonly"><br />
					</c:if>
					<c:if test="${a.status==3}">
				 Status : <input type="text" name="closure_date" value="Ready To Closure"
					align="left" readonly="readonly"><br />
					</c:if>
					<c:if test="${a.status==4}">
				 Status : <input type="text" name="closure_date" value="Closed"
					align="left" readonly="readonly"><br />
					</c:if>
					<c:if test="${a.status==5}">
				 Status : <input type="text" name="closure_date" value="Withdrawn"
					align="left" readonly="readonly"><br />
					</c:if>
				<br />
				</c:forEach>
				 
				
				<c:forEach items="${ListDetails}" var="s">	
		
			<c:set var="status" scope="session" value="${s.status}"/>
										
							<c:choose>
					
							    <c:when test="${fn:containsIgnoreCase(status, '1')}"><br/>
							    	Comments : <input type="text" id="comments" name="comments" ><br/>
									<input type="submit" name="forward_b" id="submit" value="Update"  /> 
											 
							    </c:when>
							    
							    
							    <c:when test="${fn:containsIgnoreCase(status, '2')}" >
									Comments:<input type="text" id="comments" name="comments"><br/>
									<input type="submit" name="forward_b" id="submit" value="Update"/>
									<input type="submit" name="forward_b" id="submit" value="ReadyForClosure"/>		
													      
							    </c:when>
							    
							    
							    <c:when test="${fn:containsIgnoreCase(status, '3')}" >
									<b>	Action Item Has been Sent for Approval</b> 
										
										</c:when>
							    
							    
							<c:otherwise>
									
							Action Item is ${s.status}
							</c:otherwise>						    
							    
							</c:choose>
		</c:forEach>
		</form>
</center>
</body>
</html>