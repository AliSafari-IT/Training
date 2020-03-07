<%-- 
    Document   : paintResult
    Created on : Mar 6, 2020, 1:01:45 PM
    Author     : Ali
--%>

<%@page import="fact.it.www.beans.RoomSize"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces ="true" %>
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
        <div class="container">
            <div class="row">
                <div class="row display-1 text-warning text-center">Paint Calculation Result</div>
                <div class="row Roboto ">
                    <p class="lead m-5 ">You are going to need 
                    <u class="text-danger fontW900">
                        <%if (request.getParameter("coatsNr") != null) {%>
                        <%=renovation.getLiterPaint(request.getParameter("coatsNr"))%> 
                        <%} else {%>
                        <%=renovation.getLiterPaint("1")%>
                            <%}%>
                    </u> liters of paint!
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="left" style="width: 75%"></div>
                <div style="margin-right: 10%">
                    <a href="inputForm.jsp" class="badge badge-pill badge-info">Homepage</a>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    </body>
</html>
