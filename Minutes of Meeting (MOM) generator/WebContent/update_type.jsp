<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
<style type="text/css">
</style>
</head>


<body>
<center>
<div id="content-container46">
<h1 style="text-align:center">Minutes of Meetings</h1>
            <jsp:include page="/header.jsp">
                  <jsp:param name="header" value="Employee" />
            </jsp:include>
<img src="images/sbilogin.png">

<ul>			<a href="UpdateServlet">Update Assigned Action Status</a>
				
				<br/><br/>
				<a href="UpdateMomServlet">Update Create Minutes Of Meeting Status</a>
	
			</ul>
			</div>
			
			</center>
			
</body>
<jsp:include page="/footer.jsp">
				<jsp:param name="footer" value="footer" />
			</jsp:include>

</html>