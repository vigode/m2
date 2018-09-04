<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="WEB-INF/showErrorMessage.jsp" %>

<html>
<head>
  <link rel="stylesheet" type="text/css" href="default.css">
</head>

<body>
  <p><a href="controller?action=viewpersonList">[Return to List]</a></p>
  
  
  
  <form method="post" action="controller">
  <input type="hidden" name="action" value="savePerson" />
  <input type="hidden" name="id" value="${person.id}<%-- Set this value to id property of car attribute --%>" />

  <table>
    <!-- input fields -->
    <tr>
      <td>Id<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="id"  value="${person.id}<%-- Set this value to make property of car attribute --%>" /></td>
    </tr>  
    <tr>  
      <td>Age</td>
      <td><input type="text" name="age" value="${person.age}<%-- Set this value to model property of car attribute --%>" /></td>
    </tr>
    <tr>
      <td class="name">Name </td>
      <td><input type="text" name="name" value="${person.name}<%-- Set this value to modelYear property of car attribute --%>" /></td>
    </tr>
    
    <!-- Save/Reset buttons -->
    <tr>
      <td colspan="2">
        <input type="submit" name="save" value="Save" /> 
        &nbsp;&nbsp;
        <input type="reset" name="reset" value="Reset" />
      </td>
    </tr>                
  </table>
  </form>
</body>
</html>
