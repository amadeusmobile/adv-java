<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=20;
int b=30;%>

<h1>Expression Tag: The Sum of a and b = <%=(a+b) %></h1>
<h1>Scriptlet Tag: The Sum of a and b = <%out.print(a+b);%></h1>
<h1></h1>
</body>
</html>