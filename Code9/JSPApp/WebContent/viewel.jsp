<%@page import="com.srivastava.apps.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Controller">
<input type="text" value="0.0" name="price" >
<button type='submit'>Search</button>
</form>
<c:if test="${productlist.size() eq 0}">
<h1>No Record Found...</h1>
</c:if>
<c:if test="${productlist.size() gt 0 }">
<c:forEach items="${productlist}" var="product" varStatus="counter">
<c:if test="${counter.count mod 2 eq 0 }">
<p style="color: red;"> ${counter.count} ${product.id} ${product.name} ${product.price} ${product.imagePath}
</p>
</c:if>
<c:if test="${counter.count mod 2 ne 0 }">
<p style="color: green;">${counter.count} ${product.id} ${product.name} ${product.price} ${product.imagePath}
</p>
</c:if>
<br>
</c:forEach>
</c:if>
</body>
</html>