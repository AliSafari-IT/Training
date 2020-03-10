<%-- 
    Document   : error
    Created on : Mar 9, 2020, 9:31:00 PM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Error</title>
        </head>
        <body>

        <jsp:scriptlet>
            String errMsg = request.getAttribute("errMsg").toString();
        </jsp:scriptlet>

        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
                <!--Grid column-->
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <h1>An error occurred!</h1>
                    <div>
                        <%=errMsg%>
                    </div>
                    <p class="text-center">  <a href="index.jsp" class="w-100">Back to Homepage</a></p>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
