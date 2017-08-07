<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="sample.css" type="text/css">
<title>Assign Action</title>
<script type="text/javascript" src="assign.js"></script>
<style type="text/css">
</style>
</head>
<body>
      <c:import url="SessionServlet" />
      <div id="container">
<h1 style="text-align:center">Assign Action Items</h1>
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

            <div id="content-container2">
            <!-- <div id="content-left2">
            <img src="images/sbilogin.png">
            </div> -->
                  <div id="content2">
                  
                        <h2>Enter Details of all Members</h2>
                        
                        
      <form name="assign_action" method="post" id="theForm" action="ActionItemServlet">
                              <%
                                    int count = 0;
                              %>

                              <select  name="action_item">
                                    <option value="" selected>None</option>

                                    <c:forEach items="${EList}" var="e">
                                          <option value="${e.employeeId}">
                                                <c:out value="${e.employeeName}(${e.employeeId})" />
                                          </option>

                                    </c:forEach>


                              </select> <input type="button" value="Add New Row" onclick="addRow()">
                              <input type="submit" value="Submit" onclick=" return unique_values"><br>
                              <table id="append_action" cellpadding="5px">
                                    <tr>
                                          <th>Employee Name</th>
                                          <th>Mark Attendance</th>
                                          <th>Add Action Item</th>
                                          <th>Add Closure Date</th>
                                          
                                    </tr>
                                    <tr>
                                          <td><input type="hidden" name="employeeName" value="">
                                          </td>
                                           <td><input type="hidden" name="attendance" value="">
                                          </td>
                                          
                                          <td><input type="hidden" name="actionitem" value="">
                                          </td>
                                          <td><input type="hidden" name="closure" value="">
                                          </td>
                                          
                                    </tr>


                              </table>

                              <input type="hidden" name="count1" value=<%=count%>>



                        </form>
                        
                  </div>
                  <%-- <jsp:include page="/footer.jsp">
                        <jsp:param name="footer" value="footer" />
                  </jsp:include> --%>

            </div>
      </div>
</body>
</html>

