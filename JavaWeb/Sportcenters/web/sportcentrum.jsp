<%@page import="fact.it.www.beans.Sportcentrum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Sport Center Details</title>
        </head>
        <body>
        <%Sportcentrum sportcentrum = (Sportcentrum) request.getAttribute("sportcentrum");%>
        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
                <div>
                    <p class="display-1 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <div class="h3 text-center">Details for sport center: <%=sportcentrum.getCentrumnaam()%></div>
                    <div class="Roboto fontW200 text-center">
                        <table class="table hover">
                            <tr>
                                <th class="text-right">Sport Center</th>
                                <td class="text-left"><%=sportcentrum.getCentrumnaam()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Street, Nr.</th>
                                <td class="text-left"><%=sportcentrum.getStraat()%>, <%=sportcentrum.getHuisnummer()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Post Code, Township</th>
                                <td class="text-left"><%=sportcentrum.getPostcode()%>, <%=sportcentrum.getWoonplaats()%></td>
                            </tr>
                            <tr >
                                <th class="text-right">Phone Nr.</th>
                                <td class="text-left"><%=sportcentrum.getTelefoon()%></td>
                            </tr>
                        </table>
                    </div>    

                    <div class="row">
                        <p class="col text-center btn">  <a href="index.jsp" class="w-100">Back to Homepage</a></p>
                        <p class="col text-center btn">  <a href="javascript:history.back()" class="w-100">Back to Previous Page</a></p>                      
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
