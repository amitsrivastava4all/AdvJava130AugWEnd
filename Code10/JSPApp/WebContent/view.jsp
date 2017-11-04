<%@page import="com.srivastava.apps.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)request.getAttribute("productlist");
if(productList!=null && productList.size()==0){
%>
<h1>No Record Found...</h1>
<%
}
else
if(productList!=null && productList.size()>0)
{
%>
<ul>
<%for(ProductDTO product: productList){ %>
<li><%=product.getId() %>  <%=product.getName() %> <%=product.getDesc() %> <%=product.getPrice() %> <img src='<%=product.getImagePath()%>'></li>
<%} %>
</ul>
<%
}
%>
</body>
</html>