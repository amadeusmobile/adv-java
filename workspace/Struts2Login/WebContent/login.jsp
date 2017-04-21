<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp</title>
</head>
<sx:head parseContent="true" />
<body>
	<s:form action="login">
		<s:textfield label="User Name :" name="userName" />

		<br>
		<s:textfield label="Password :" name="password" />

		<br>
		<sx:autocompleter list="{'apple','banana','candy','dogs','aloo','bat','banerjee','cate','donkey'}"/>
		<s:submit value="Login Here" />

	</s:form>
</body>
</html>