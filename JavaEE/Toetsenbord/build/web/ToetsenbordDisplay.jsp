<%-- 
    Document   : ToetsenbordDisplay
    Created on : Mar 3, 2020, 7:46:09 PM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String s = request.getAttribute("klavier").toString(); %>
        <h1>Displays Keyboard Details</h1>
        <p>Keyboard: ${requestScope.klavier.merk}</p>
        <p><%=s.concat("!") %></p>
        
    </body>
</html>
