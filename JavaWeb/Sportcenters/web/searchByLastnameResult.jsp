<%-- 
    Document   : searchByLastnameResult
    Created on : Mar 10, 2020, 12:14:56 AM
    Author     : Ali
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Member Search Result</title>
        </head>
        <body>

            <div class="container">
                <div class="row d-flex justify-content-xl-center">
                    <!--Grid column-->
                <%
                    ArrayList<Members> members = (ArrayList<Members>) request.getAttribute("members");
                %>
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <h3>Member Search Result</h3>
                    <%if (members.size() > 0) {%>
                    <p><%=members.size()%> member(s) are found as follows: </p>
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Name</th>
                                <th scope="col">Hometown</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">E-Mail</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Members br : members) {
                                    int memberID = br.getId();
                                    String name = br.getDeelnemernaam();
                                    String township = br.getWoonplaats();
                                    String phoneNr = br.getTelefoon();
                                    String email = br.getEmail();
                            %>
                            <tr>
                                <td scope="row">
                                    <a href="./ManageServlet?memberID=<%=memberID%>" class="w-100">
                                        <%=name%>
                                    </a>
                                </td>
                                <td>
                                    <%= township%>
                                </td>
                                <td>
                                    <%= phoneNr%>
                                </td>
                                <td>
                                    <%= email%>
                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                    <% } else {%>
                    <div class="text-danger h5">Nobody matches this search item in the members list. </div>
                    <% }%>
                    <p class="text-center">  <a href="index.jsp" class="w-100">Back to Homepage</a></p>

                </div>

            </div>
        </div>

    </body>
</html>
