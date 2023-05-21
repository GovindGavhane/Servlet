<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name = request.getParameter("name");
   int age = Integer.parseInt(request.getParameter("age"));
   long phone = Long.parseLong(request.getParameter("phone"));
   String gender = request.getAttribute("gender").toString();
%>
<h1>Name : <%= name%></h1>
<h1>Age : <%= age %></h1>
<h1>Phone : <%=phone %></h1>
<h1>Gender : <%= gender %></h1>
</body>
</html>