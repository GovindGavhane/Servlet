<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="person" method="post">
Name : <input type="text" name="name"><br>
Email : <input type="email" name="email"><br>
Phone : <input type="tel" name="phone"><br>
Age : <input type="number" name="age">
Gender :<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<br>
<input type="submit" value="Register">
</form>
</body>
</html>