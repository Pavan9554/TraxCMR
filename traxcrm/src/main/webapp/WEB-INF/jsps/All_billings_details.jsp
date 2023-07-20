<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All | Billing</title>
</head>
<body>
<h2>All Searched Billings</h2>
<table>
     <tr>
         <th>First Name</th> 
         <th>Second Name</th> 
         <th>Email</th> 
         <th>Mobile</th> 
         <th>ProductName</th>
         <th>Amount</th>
       
     </tr>
   
    <c:forEach items="${billings}" var="billing">
     <tr>
          <td><a href="getBillingById?id=${billing.id}">${billing.firstName}</a></td>
          <td>${billing.secondName}</td>
          <td>${billing.email}</td>
          <td>${billing.mobile}</td>
          <td>${billing.productName}</td>
          <td>${billing.amount}</td>
         
     </tr>
     </c:forEach>
 </table>
 </body>
</html>