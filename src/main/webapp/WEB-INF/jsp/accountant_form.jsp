 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="accountant_info_process" method="post" modelAttribute="bean">
UserName<br>
<form:input path="username"/><br>
Password<br>
<form:password path="password"/><br>
Email<br>
<form:input path="email"/><br>
Address<br>
<form:textarea path="address" row="40"/><br>
Conatct No<br>
<form:input path="mobile"/><br><br>
<input type="submit" value="SaveAccountant">
</form:form>
</body>
</html>