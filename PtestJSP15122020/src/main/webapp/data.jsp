<%-- 
    Document   : data
    Created on : Dec 24, 2020, 11:35:18 PM
    Author     : pangp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>First Name :<%=request.getParameter("fname")%></h1>
        <h1>Last Name : <%=request.getParameter("lname")%></h1>
    </body>
</html>
