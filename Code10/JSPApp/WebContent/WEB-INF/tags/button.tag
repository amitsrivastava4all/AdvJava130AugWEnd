<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="style" type="java.lang.String" required="true" %>
<%@attribute name="content" type="java.lang.String" required="true" %>
<%
String className = "";
if(style.equalsIgnoreCase("blue")){
	className = "btn btn-primary";
}
else
if(style.equalsIgnoreCase("red")){	
	className = "btn btn-danger";
}
%>
<button class="<%=className%>"><%=content %></button>