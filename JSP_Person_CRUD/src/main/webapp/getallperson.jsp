<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.List"%>
<%@ page import="com.jsp.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Person> persons = (List) request.getAttribute("personlist");
	%>
	<table border="2px">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>Id</th>
		</tr>

		<%
		for (Person person : persons) {
		%>
		<tr>
			<td><%=person.getName()%></td>
			<td><%=person.getAge()%></td>
			<td><%=person.getPhone()%></td>
			<td><%=person.getGender()%></td>
			<td><%=person.getId()%></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>