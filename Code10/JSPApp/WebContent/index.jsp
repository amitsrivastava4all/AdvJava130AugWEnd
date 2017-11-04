<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" session="true" autoFlush="true" buffer="80kb"
    isThreadSafe="true" errorPage="custom.jsp" info="this is a demo page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="jquery-1.12.4.min.js"></script>	
<script>
$(document).ready(function(){
	$("h1").click(function(){
		$(this).hide(2000);
		})
})

</script>
</head>
<body>
<%@ include file="header.jsp" %>
<%! interface RR{
	void show();
	
} %>

<%!
 class RR1 implements RR {
		public void show(){
			
		}
}
%>
<%! private int counter; %>
<%
//int w = 1000/0;
RR obj = new RR(){ 
	public void show(){

	System.out.println("VALUE IS ");
}
};
obj.show();
int x = 100;
int y = 200;
int z = x + y;
//out.flush();
%>
<h1> Sum is <%=z %></h1>
<!-- THIS WEBSITE IS CREATED BY RAM -->
<h1>Current Date is <%-- <%=new java.util.Date() %> --%></h1>


</body>
</html>