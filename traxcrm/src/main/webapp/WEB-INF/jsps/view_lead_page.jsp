<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2>Lead | Create</h2>
<form action="savelead" method="post">
   <pre>
   FirstName<input type="text" name="firstName"/>
   SecondName<input type="text" name="secondName"/>
   Email<input type="text" name="email"/>
   Mobile<input type="text" name="mobile"/>
   LeadSource:<select name="leadsource">
			  <option value="radio">Radio</option>
			  <option value="tv">TV</option>
			  <option value="newspaper">Newspaper</option>
			  <option value="trademark">Trademark</option>
              </select>
   Gender:
   Male:<input type="radio"  name="gender" value="male">       
   Female:<input type="radio"  name="gender" value="female">             
   <input type="submit" value="save"/>
   </pre>
  </form>
</body>
</html>