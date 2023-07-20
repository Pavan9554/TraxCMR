<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing_Info</title>
</head>
<body>
			<h2>Billing Info</h2>

			First Name:${billing.firstName}<br/>
			Second Name:${billing.secondName}<br/>
			Email:${billing.email}<br/>
			Mobile:${billing.mobile}<br/>
			ProductName:${billing.productName}<br/>
            Amount:${billing.amount}<br/>
            
            <form action="GenerateBill" method="post">
			    <input type="Hidden" name="id" value="${lead.id}"/>
			    <input type="submit" value="GenerateBill"/>
			</form>
</body>
</html>