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
	<h3>Your request hase been registered.</h3>
	<s:property value="name" />
	<br>
	<s:property value="email" />
	<br>
	<s:property value="description" />
	<br>
	<s:property value="country" />
	<h2>Items</h2>
	<%-- <s:iterator value="itemNames" var="x" >
	<s:property value="x"/> --%>
	<s:property value="prices[0]" />
	<s:property value="prices[1]" />
	<s:property value="prices[2]" />

	<br>
</body>
</html>