<%@page import="demo.User"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	
	
		<c:out value="Hello JSTL" />
		<table border="1">
			<c:forEach items="${list}" var="user">
				<tr>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.city}" /></td>
					<td><c:out value="${user.email}" /></td>
				</tr>
			</c:forEach>
		</table>
	
</body>
</html>
