<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Web Servlet 1</title>
</head>
<body>
<h2>Departments and employees</h2>
<c:forEach items = "${departments}" var="dept">
	<h3>${dept.getDeptName()}</h3>
	<ul>
		<c:forEach items="${dept.employees}" var = "emp">
			<li>
				${emp.employeeName} - ${emp.job}   
			</li>
		</c:forEach>
	</ul>
</c:forEach>
</body>
</html>