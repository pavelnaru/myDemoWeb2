<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello world</title>
</head>
<body>
hello world
<br/>
this is a hello.jsp
<br/>
<%! String a = "PavelNaru";
	String b = "Thien Toan";
	int tripleSquare (int a){
		return a*a*a;
	}
%>
<%  
String name=request.getParameter("uname");  
out.print("welcome "+a + " , " + b);
%><br/>
<%  out.print(System.lineSeparator());%><br/>
<%  out.print("Triple square of 4 is "+ tripleSquare(4));%><br/>

 Current time: <%= Calendar.getInstance().getTime() %>
</body>
</html>