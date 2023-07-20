<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h2>Billing | Create</h2>
<form action="saveBill" method="post">
   <pre>
   FirstName<input type="text" name="firstName" value="${contact.firstName}"/>
   SecondName<input type="text" name="secondName" value="${contact.secondName}"/>
   Email<input type="text" name="email" value="${contact.email}"/>
   Mobile<input type="text" name="mobile" value="${contact.mobile}"/>
   ProductName<input type="text" name="productName"/>
   Amount<input type="text" name="amount"/>
   <input type="submit" value="billing"/>
   </pre>
  </form>
</body>
</html>