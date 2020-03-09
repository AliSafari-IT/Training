<%@page import="fact.it.www.beans.SportCamp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Camp details</title>
        </head>
        <body>
        <%SportCamp kamp = (SportCamp) request.getAttribute("kamp");%>
        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
                <div>
                    <p class="display-1 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <div class="h3 text-center">
                        Details for sport camp <%=kamp.getKampnaam()%>
                    </div>
                    <div class="Roboto fontW200 text-center">
                        <table class="table hover">
                            <tr>
                                <th class="text-right">Sport Camp</th>
                                <td class="text-left"><%=kamp.getKampnaam()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Period</th>
                                <td class="text-left">from <%=kamp.getBegindatum()%> to <%=kamp.getEinddatum()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Min/Max Birth Year</th>
                                <td class="text-left">from <%=kamp.getMin_gebjaar()%> to <%=kamp.getMax_gebjaar()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Price (EUR)</th>
                                <td class="text-left"><%=kamp.getPrijs()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Number of Places</th>
                                <td class="text-left"><%=kamp.getAantal_plaatsen()%></td>
                            </tr>
                        </table>
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
