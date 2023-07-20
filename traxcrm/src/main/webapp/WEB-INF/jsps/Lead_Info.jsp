<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead_Info</title>
</head>
<body>
			<h2>Lead Info</h2>

			First Name:${lead.firstName}<br/>
			Second Name:${lead.secondName}<br/>
			Email:${lead.email}<br/>
			Mobile:${lead.mobile}<br/>
			Lead Source:${lead.leadsource}<br/>
			Gender:${lead.gender}<br/>

			<form action="convertlead" method="post">
			    <input type="Hidden" name="id" value="${lead.id}"/>
			    <input type="submit" value="convert"/>
			</form> 
			<div>
				<form action="sendemail" method="post">
					<input type="hidden" name="email" value="${lead.email}"/>
					<input type="submit" value="Sendemail"/>
				</form>
			</div>	
</body>
</html>