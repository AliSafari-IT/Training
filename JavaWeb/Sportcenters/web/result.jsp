<%-- 
    Document   : result
    Created on : Mar 14, 2020, 1:02:39 AM
    Author     : Ali
--%>

<%@page import="fact.it.www.beans.SportTasks"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Sport Centers</title>
        </head>

        <body>
            <div class="container">
                <div class="row d-flex justify-content-xl-center">
                    <!--Grid column-->
                <%String result = (String) request.getAttribute("result");%>
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <h5><%=result%></h5>
                    <div class="row">
                        <div class="col text-center btn">  
                            <a href="index.jsp" class="w-100 btn">Back to Homepage</a>
                        </div>
                        <div class="col text-center btn">
                            <form action="./Servlet4Admin" method="post">                   
                                <input class="text-uppercase fontW900" type="submit" name="administration" value="Back to Sport Tasks">                            
                            </form>
                        </div>              
                    </div>
                </div>
            </div>            
        </div>
        <script type="text/javascript">
            function goBack() {
                window.history.back();
            }
        </script>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    </body>
</html>
