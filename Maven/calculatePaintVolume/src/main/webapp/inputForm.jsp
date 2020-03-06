<%-- 
    Document   : inputForm
    Created on : Mar 5, 2020, 10:56:34 PM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Input Data</title>
        </head>
        <body>
            <div class="container">
                <div class="row">
                    <h1 class="text-warning card-title text-center">Estimating How Much Paint to Buy</h1>
                    <div>
                        <p class="Roboto">To estimate the amount of paint you need in order to cover the walls of a room, 
                            add together the length of all the walls and then multiply the number by the 
                            height of the room, from floor to ceiling. The number you get is the room’s 
                            square footage. Is that math class coming back to you now?
                        </p>
                        <h3>Give the dimensions of your room</h3>
                        <form action="./PaintServlet" method="post">
                            <div>
                                Wall length (m) <input type="text" name="length" id="wallLength">
                            </div>
                            <div>
                                Wall width (m) <input  type="text" name="width" id="wallWidth">
                            </div>
                            <div>
                                Wall height (m) <input  type="text" name="height" id="wallHeight">
                            </div>
                            <div>
                                Do you want to paint the ceiling too? <input type="checkbox" name="ceiling" value="yes"> Yes.
                            </div>
                            <div class="form-label-group">
                                Number of coats? 
                            <%
                                String str = " coat";
                                for (int i = 1; i <= 5; i++) {
                                    if (i > 1) {
                                        str = " coats";
                                    }
                            %> 
                            <br>
                            <input type="radio" name="coatsNr" value="<%=i%>">
                            <span><%=i+str%></span>
                                <%}%>
                        </div>  
                        <input type="submit" name="calculate" value="calculate" class="btn-google text-uppercase">
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    </body>
</html>
