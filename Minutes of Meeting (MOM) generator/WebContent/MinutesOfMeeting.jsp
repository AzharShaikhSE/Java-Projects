<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Create a Meeting</title>
<script type="text/javascript" src="create_mom.js">
	
</script>
<style type="text/css">
</style>
</head>
<body>
	<c:import url="SessionServlet" />
	<div id="container">

		<jsp:include page="/header.jsp">
			<jsp:param name="header" value="Employee" />
		</jsp:include>



		<div id="content-container">
		
			<div id="navigation">
				<ul>
					<li><a href="LogoutServlet1">Logout</a></li>
					<li><a href="DashBoardServlet">My Dashboard</a></li>
					<li><a href="NotificationServlet">Notify</a></li>
					<li><a href="#">Info</a></li>
				</ul>
			</div>
			<div id="content">
				<h2 align="center">Create Minutes Of Meeting</h2>
				<br /> <br /> <br />


				<form name="Create_mom" method="post" action="MomServlet"
					onsubmit="return final_validation()">

					<table>
						<tr>
							<td>Subject :</td>
							<td><input type="text" name="subject" value="" align="left">
							</td>
						<tr>
							<td>Purpose :</td>
							<td><input type="text" name="purpose" value="" align="left">
							</td>
						</tr>
						<!--  Date : <input type="date"
					name="date" value="" align="left"> <br /> <br /> 
					 -->
						<tr>
							<td>Date:</td>
							<td><input type="text" class="date" name="date" value="" />

							</td>
						</tr>
						<tr>
							<td>Start Time :</td>
							<td><input type="text" name="stime" value="" align="left">
							</td>
						</tr>


						<tr>
							<td>End Time :</td>
							<td><input type="text" name="etime" value="" align="left">
							</td>
						</tr>
						<tr>
							<td>Points Discussed:</td>
							<td><input type="text" name="points_discussed" value=""
								align="left">
							</td>
						</tr>

						<!-- <input type="submit" value="Add another point" onclick="add_new_point()"> -->

						<%-- <input type="text" class= "date" name = "date" value = "<fmt:formatDate value="${dateVar}" pattern="MM-dd-yyyy" />" /><br/> --%>
						<tr>
							<td>Decision Taken:</td>
							<td><textarea name="decisions" align="left"></textarea></td>
						</tr>





						<c:forEach var="num" begin="1" end="${param.participants}">
							<br>
							<select name="empid">
								<c:forEach items="${EList}" var="e">
									<option value="${e}">
										<c:out value="${e }" />
									</option>
								</c:forEach>

							</select>
							<br>
						</c:forEach>

					</table>
					<br> <br> <input type="submit" value="Assign Action Item">

				</form>




			</div>


			<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include>
		</div>
	</div>
</body>
</html>