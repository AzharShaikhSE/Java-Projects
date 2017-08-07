<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">

<title>Login</title>
<script type="text/javascript" src="login.js"></script>
<style type="text/css">
</style>
</head>
<body>



      <div id="container">
      
      
            <jsp:include page="header.jsp">
            <jsp:param name="header" value="Employee" />
            </jsp:include>



            <!-- <div id="navigation">
                  <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Contact us</a></li>
                  </ul>
            </div> -->

            <div id="content-container">
            <!-- <div id="section-navigation"></div> -->
            <div id="content">
                              <form name="login" action="LoginServlet"
                              onsubmit="return validate()" method="post" class="login">
                              
                              
                              
                              Username<br>
                             
                              
                              <input name="userId" class="login-input"><br>
                              
                              Password<br>
                              
                              
                              <input type="password" name="password" class="login-input"><br>
                              
                              <input type="submit" value="Login" class="login-submit">
                        



                              </p>

                        </form>

                  </div>

</div>


                  


            
      </div>
      <jsp:include page="/footer.jsp">
                        <jsp:param name="footer" value="footer" />
                  </jsp:include>

</body>
</html>
