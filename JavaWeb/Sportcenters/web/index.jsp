<%-- 
    Document   : index
    Created on : Mar 7, 2020, 11:47:33 PM
    Author     : Ali
--%>

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
                <div class="col-md-8">
                    <p class="display-1 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>

                    <form action="ManageServlet" method="post">
                        <div>
                            <input type="submit" name="firstSportcenter" value="See the first sport center">
                        </div>                       
                        <div>
                            <input type="submit" name="firstCamp" value="see the first sport camp">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</html>
