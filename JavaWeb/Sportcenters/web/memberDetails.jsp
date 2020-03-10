<%-- 
    Document   : memberDetails
    Created on : Mar 10, 2020, 12:15:30 AM
    Author     : Ali
--%>

<%@page import="fact.it.www.beans.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Member Details</title>
        </head>
        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
            <%
                Members member = (Members) request.getAttribute("member");
            %>
            <div class="col-md-8">
                <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                <h3 class="text-primary">Member Details</h3>
                <table>
                    <table class="table">
                        <tr><th scope="col" class="bg-dark text-white text-right">Member ID</th><td class="bg-warning Roboto fontW400"> <%=member.getId()%> </td></tr>
                        <tr><th scope="col"  class="bg-dark text-white text-right">Full Name</th><td class="bg-warning Roboto fontW400"> <%=member.getVoornaam()%> <%=member.getDeelnemernaam()%> </td>
                                <% if (member.getGeslacht().equalsIgnoreCase("v")) {%>
                        <tr><th scope="col"  class="bg-dark text-white text-right">Gender and Birth Date</th><td class="bg-warning Roboto fontW400i"> Female, <%=member.getGeboortedatum()%> </td></tr>
                                <%} else {%>
                        <tr><th scope="col" class="bg-dark text-white text-right">Gender and Birth Date</th><td class="bg-warning Roboto fontW400i"> Male, <%=member.getGeboortedatum()%> </td></tr>
                                <%}%>
                        <tr><th scope="col" class="bg-dark text-white text-right">Street and House Nr</th><td class="bg-warning Roboto fontW400"> <%=member.getStraat()%>, <%=member.getHuisnummer()%> (<%=member.getBus()%>) </td></tr>
                        <tr><th scope="col" class="bg-dark text-white text-right">Postal code and Hometown</th><td class="bg-warning Roboto fontW400"> <%=member.getPostcode()%>, <%=member.getWoonplaats()%></td></tr>
                        <tr><th scope="col" class="bg-dark text-white text-right">Phone Nr / GSM Nr</th><td class="bg-warning Roboto fontW400"> <%=member.getTelefoon()%>  /  <%=member.getGsm()%></td></tr>
                        <tr><th scope="col" class="bg-dark text-white text-right ">E-Mail Address</th><td class="bg-warning Roboto fontW400"> <%=member.getEmail()%></td></tr>             
                    </table>
                    <div class="row">
                        <p class="col text-center btn">  <a href="index.jsp" class="w-100">Back to Homepage</a></p>
                        <p class="col text-center btn">  <a href="javascript:history.back()" class="w-100">Back to Search Result</a></p>                      
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
