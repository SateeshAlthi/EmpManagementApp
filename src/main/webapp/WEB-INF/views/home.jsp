<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Home Page</h1>
<a href="./add"> Add Employee</a>
<table border=1>
  <tr>
  <th>Eno</th>
  <th>Name</th>
  <th>Address</th>
  </tr>
  <c:forEach var="e" items="${emps}">
  <tr>
  <td>${e.eno}</td>
  <td>${e.name}</td>
  <td>${e.address}</td>
  </tr>
 </c:forEach>
</table>
</body>
</html>