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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (!password.equals("") && password != null 
				&& !username.equals("") && username != null) {

			if (username.equals(password)) {
	%>
	<jsp:forward page="success.jsp" />

	<%
		} else {
	%>
	<jsp:forward page="failure.jsp" />

	<%
		}
		}
	%>
	
	<h1>Please Login</h1>
</body>
</html>