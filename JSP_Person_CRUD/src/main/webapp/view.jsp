<%@ page import="com.jsp.dto.Person" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Person person = (Person) request.getAttribute("person"); %>
<h1> Name : <%=person.getName() %></h1>
<h1> Age : <%=person.getAge() %></h1>
<h1> Email : <%=person.getEmail() %></h1>
<h1> Gender : <%=person.getGender()%></h1>
<h1> Phone : <%=person.getPhone() %></h1>
<h1> Id : <%= person.getId() %></h1>

</body>
</html>