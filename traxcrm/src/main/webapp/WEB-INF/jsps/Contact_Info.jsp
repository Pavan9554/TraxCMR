<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact_Info</title>
</head>
<body>
			<h2>Contact Info</h2>

			First Name:${contact.firstName}<br/>
			Second Name:${contact.secondName}<br/>
			Email:${contact.email}<br/>
			Mobile:${contact.mobile}<br/>
			Lead Source:${contact.leadsource}<br/>
			Gender:${contact.gender}<br/>

</body>
</html>