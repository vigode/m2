<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page errorPage="WEB-INF/showErrorMessage.jsp" %>
<html>
  <head>
    <title> </title>
  </head>
  
  <body>
  
    <h1>Person Details</h1>

  <p>
  <%-- Use here JSP include directive to include "showImage.jsp" --%> 
  </p>
	
    <a href="controller?action=viewPersonsList">View Persons List</a> 
     <a href="controller?action=addPerson<%-- Set the value for 'action' parameter to 'viewCarList' --%>">Add Person</a>
     
  </body>
  
</html>