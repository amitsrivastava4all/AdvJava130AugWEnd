<%@tag import="java.text.DateFormat"%>
<%@tag import="java.util.Locale"%>
<%@tag import="java.util.Date"%>
<%@attribute name="lang" type="java.lang.String" required="true" %>
<%@attribute name="country" type="java.lang.String" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%
Date date = new Date();
Locale locale = new Locale(lang,country);
DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
String formattedDate = df.format(date);

%>
<p>Date is <%=formattedDate%></p>