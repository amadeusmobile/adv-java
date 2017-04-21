<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration page</h1>
	<br>
	<hr>
	<s:form action="register">
		<s:textfield label="Name" name="name" />
		<br>
		<s:textfield label="Email" name="email" />
		<br>
		<s:textarea label="Desc" name="description" />
		<br>
		<s:checkbox label="DVD Player" name="item" />
		<s:textfield label="price1" name="prices" />
		<s:textfield label="price2" name="prices" />
		<s:textfield label="price3" name="prices" />
		<s:submit value="Register"></s:submit>
	</s:form>
</body>
</html>