<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<style>
.error{
color:red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<%
String userid = request.getParameter("userid");
String password = request.getParameter("pwd");
if(userid!=null && password!=null){
	if(userid.trim().length()>0 && password.trim().length()>0){
		if(userid.equals(password)){
%>
<h1>Welcome <%=userid %></h1>
<% 			
		}
		else{
			%>
			<h1 class="error">Invalid Userid or Password!</h1>
		<% 	
		}
	}
	else{
		%>
	<h2>Field Can't Be Blank!...</h2>
	<% 
	}
	
}
%>
<form action="login.jsp" method="post">
<input type="text" name="userid" placeholder="Type Userid Here">
<br>
<input type="password" name="pwd" placeholder="Type Password Here">
<input type='submit' value='Login'>
</form>
</body>
</html>