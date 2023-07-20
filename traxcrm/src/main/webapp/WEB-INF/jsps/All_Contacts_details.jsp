<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Sreached Contacts</h2>
<table>
     <tr>
         <th>First Name</th> 
         <th>Second Name</th> 
         <th>Email</th> 
         <th>Mobile</th> 
         <th>LeadSource</th>
         <th>Gender</th>
         <th>Billing</th>
        
     </tr>
   
    <c:forEach items="${contacts}" var="contact">
     <tr>
          <td><a href="getContactById?id=${contact.id}">${contact.firstName}</a></td>
          <td>${contact.secondName}</td>
          <td>${contact.email}</td>
          <td>${contact.mobile}</td>
          <td>${contact.leadsource}</td>
          <td>${contact.gender}</td>
          <td><a href="generateBill?id=${contact.id}">Billing</a></td>
     </tr>
     </c:forEach>
 </table>
</body>
</html>