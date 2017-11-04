<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="brain" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<brain:head/>
</head>
<body>
<brain:date lang="es" country="ES"/>
<brain:date lang="hi" country="IN"/>
<brain:date lang="en" country="US"/>
<hr>
<brain:button style="blue" content="Login"></brain:button>
<brain:button style="red" content="Logout"></brain:button>
<% String noOfMonthVal = "1"; %>
<brain:calendar noofMonths="<%=noOfMonthVal %>"></brain:calendar>
</body>
</html>