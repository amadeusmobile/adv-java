<%@page import="demo.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList list = new ArrayList();
		list.add(new User("Arun", "Hyderabad", "arun@gmail.com"));
		list.add(new User("Ramesh", "Bangalore", "arun@gmail.com"));
		list.add(new User("Rita", "Chennai", "arun@gmail.com"));
		list.add(new User("Arjun", "Hyderabad", "arun@gmail.com"));
		list.add(new User("Abdul", "Chennai", "arun@gmail.com"));
		list.add(new User("Kiran", "Hyderabad", "arun@gmail.com"));
		list.add(new User("Chandra", "Chennai", "arun@gmail.com"));
		list.add(new User("Mukul", "Hyderabad", "arun@gmail.com"));
		list.add(new User("Scott", "Hyderabad", "arun@gmail.com"));
		request.setAttribute("list", list);
	%>

	<form action="myIndex.jsp">
		<input type="submit" value="GO">
	</form>
</body>
</html>