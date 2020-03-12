<%-- 
    Document   : chooseSportCentersFromList
    Created on : Mar 12, 2020, 8:57:20 AM
    Author     : Ali
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Sportcentrum"%>
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
                <%
                    ArrayList<Sportcentrum> spList = (ArrayList<Sportcentrum>) request.getAttribute("spList");
                    ArrayList<Sportcentrum> spCombo = (ArrayList<Sportcentrum>) request.getAttribute("spCombo");
                %>
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <div>
                        <% if (spList != null) {%>
                        <p class="text-danger Roboto h3">Choosing from a list: List of Sport Centers</p>
                        <div>Click on each to see the details.</div>
                        <div class="text-center">
                            <%
                                for (Sportcentrum spc : spList) {%>
                            <a href="./Servlet4Lists?sportCenterID=<%=spc.getId()%>" class="col-md-5 my-2 mx-1"><%=spc.getCentrumnaam()%></a>

                            <%}%>
                        </div>
                        <%} else {%>
                        <p class="text-danger Roboto h3">Choosing from a Sport Center from Combo Box drop-down list</p>
                        <div>Choose a Sport Center from the Combo Box to see the details.</div>
                        <div class="text-center">
                            <form action="./ManageServlet" method="post">
                                <select name="sportcentrumid">
                                    <option value="0">Choose a center</option>
                                    <% for (Sportcentrum spc : spCombo) {%>
                                    <option value = "<%=spc.getId()%>"> <%=spc.getCentrumnaam()%> </option>
                                    <%}%>
                                </select>
                                <input type="submit" name="WhichSportcenter" value="Details">
                            </form>
                        </div>
                        <%}%>
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
