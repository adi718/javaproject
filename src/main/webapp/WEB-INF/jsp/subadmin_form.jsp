<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg }
<form:form action="save" method="post" modelAttribute="bean">
UserName<br>
<form:input path="username"/><br>
Password<br>
<form:password path="password"/><br>
Email<br>
<form:input path="email"/><br>
Conatct No<br>
<form:input path="mobile"/><br><br>
<input type="submit" value="SaveAdmin">
</form:form>
</body>
</html>