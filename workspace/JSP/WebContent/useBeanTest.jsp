<%@page import="java.util.Map"%>
<%@page import="com.demo.web.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="u" class="com.demo.web.User" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="useBeanTest.jsp" method="post">
		<table>
			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
<%
	Map paramMap = request.getParameterMap();
	out.print(paramMap);
%>
<jsp:setProperty property="*" name="u" />

<jsp:getProperty property="details" name="u" />
</html>