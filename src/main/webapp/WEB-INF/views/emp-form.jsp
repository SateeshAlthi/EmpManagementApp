<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="./processEmployee" method="post" modelAttribute="emp">
 Name:<f:input path="name"/></br>
 Address:<f:input path="address"/></br>
 <input type="submit" value="submit">
</f:form>
</body>
</html>