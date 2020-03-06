<%-- 
    Document   : paintResult
    Created on : Mar 6, 2020, 1:01:45 PM
    Author     : Ali
--%>

<%@page import="fact.it.www.beans.RoomSize"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>JSP Page</title>
        </head>
        <body>
        <%
            RoomSize renovation = (RoomSize) request.getAttribute("renovation");
        %>
        <h1><%=renovation.getLiterPaint(request.getParameter("coatsNr"))%></h1>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    </body>
</html>
