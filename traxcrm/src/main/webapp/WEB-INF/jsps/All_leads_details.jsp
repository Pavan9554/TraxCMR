<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All | Leads</title>
</head>
<body>
<h2>All Searched Leads</h2>
<table>
     <tr>
         <th>First Name</th> 
         <th>Second Name</th> 
         <th>Email</th> 
         <th>Mobile</th> 
         <th>LeadSource</th>
         <th>Gender</th>
     
     </tr>
   
    <c:forEach items="${leads}" var="lead">
     <tr>
          <td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
          <td>${lead.secondName}</td>
          <td>${lead.email}</td>
          <td>${lead.mobile}</td>
          <td>${lead.leadsource}</td>
          <td>${lead.gender}</td>
         
     </tr>
     </c:forEach>
 </table>
 </body>
</html>