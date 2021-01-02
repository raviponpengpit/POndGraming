<%-- 
    Document   : newjsp
    Created on : Dec 15, 2020, 9:41:56 AM
    Author     : pangp
--%>
<%@page import="java.util.Date"%>
<%@page import="com.mycompany.ptestjsp15122020.Utility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <form action="data.jsp" method="post">
                <div class="form-group">
                    <label for="fname">First Name:</label>
                    <input tpye="text" class="form-control" name="fname">
                    </div>
                <div class="form-group">
                    <label for = "Lastname">Last Name: </label>
                    <input type = "text" class="form-control" name="lname">
                </div>
                <button tpye="submit" class="btn btn-default">Submit</button>
            </form>
        </div>   
        <jsp:include page="menupage.html"/>        
        <h1>Hello World!</h1>
        <% out.println("<h2>POndZuzaa</h2>"); %>
        <%= Utility.convertStr("ggwp")%>
        
        
     <%--   <%! public String covertStr(String str){
            return str.toUpperCase();
            }
        
        %> 
     --%>
        
        <p><%= new java.util.Date() %></p>
        <jsp:include page = "footer.jsp"/>
    </body>
</html>
