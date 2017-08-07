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
<!-- <script type="text/javascript">alert("hie"); </script> -->

<style type="text/css">
</style>
</head>
<body>
      <%--  <c:import url="SessionServlet" />  --%>
      <div id="container">
<h1 style="text-align:center">Minutes of Meetings</h1>
            <jsp:include page="/header.jsp">
                  <jsp:param name="header" value="Employee" />
            </jsp:include>

<div id="navigation">
                        <ul>
                              <li><a href="LogoutServlet1">Logout</a></li>
                              <li><a href="DashBoardServlet">My Dashboard</a></li>
                              <li><a href="NotificationServlet">Notify</a></li>
                              <li><a href="#">Info</a></li>
                        </ul>
                  </div>

            <div id="content-container1">
            <div id="content-left1>
          <!--   <img src="../images/sbilogo"> -->
            </div>
                  <div id="content1">
                        <h2 align="center">Create Minutes Of Meeting</h2>
                        


                        <!--  <form name="Create_mom" method="post" action="MomServlet"
                              onsubmit="return final_validation()">-->
                              
                                 
 <!-- onsubmit="validate_mom()" -->
                              <form action="MomServlet" method="post" name="Create_Mom" >

                              <table>
                        
                              
                              
                                    <tr>
                                          <td>Subject :</td>
                                          <td><input type="text" name="subject" id="subject" value="" align="left">
                                          </td>
                                    <tr>
                                          <td>Purpose :</td>
                                          <td><input type="text" name="purpose" id="purpose" value="" align="left">
                                          </td>
                                    </tr>
                                    <!--  Date : <input type="date"
                              name="date" value="" align="left"> <br /> <br /> 
                               -->
                                    <tr>
                                          <td>Date:</td>
                                          <td><input type="date" class="date" name="date" id="date" value="" placeholder="yyyy-mm-dd"/>

                                          </td>
                                    </tr>
                                    <tr>
                                          <td>Start Time :</td>
                                          <td><input type="time" name="stime" id="stime" value="" align="left" placeholder="hh-mm">
                                          </td>
                                    </tr>


                                    <tr>
                                          <td>End Time :</td>
                                          <td><input type="time" name="etime" id="etime" value="" align="left" placeholder="hh-mm" >
                                          </td>
                                    </tr>
                                    <tr>
                                          <td>Points Discussed:</td>
                                          <td><input type="text" name="points_discussed" id="point" value="" 
                                          align="left">
                                          </td>
                                    </tr>

                                    <!-- <input type="submit" value="Add another point" onclick="add_new_point()"> -->

                                    <%-- <input type="text" class= "date" name = "date" value = "<fmt:formatDate value="${dateVar}" pattern="MM-dd-yyyy" />" /><br/> --%>
                                    <tr>
                                          <td>Decision Taken:</td>
                                          <td><textarea name="decisions" id="decision"></textarea></td>
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
                              &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                              &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="submit" value="Assign Action Item" onclick=" return validate_mom()">

                        </form>
</div>
</div>
                        <%-- <jsp:include page="/footer.jsp">
                        <jsp:param name="footer" value="footer" />
                  </jsp:include> --%>
                  <div id="footer1">
<p style="text-align:center">Copyright © State Bank Of India, 2014</p>
</div>

                  </div>


                  
            
</body>
</html>
