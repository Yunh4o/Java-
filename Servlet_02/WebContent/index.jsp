<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello jsp <br />
	<%
		for(int i = 0 ; i < 100 ; i ++){
			out.print(i);
		}
	%><%for(int i = 0 ; i < 100 ; i ++){%><%=i%><%} %>
</body>
</html>