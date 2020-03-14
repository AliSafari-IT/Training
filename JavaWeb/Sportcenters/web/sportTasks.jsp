<%-- 
    Document   : sportTasks
    Created on : Mar 13, 2020, 3:26:26 PM
    Author     : Ali
--%>

<%@page import="java.util.ArrayList"%>
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
                <%ArrayList<SportTasks> tasks = (ArrayList<SportTasks>) request.getAttribute("tasks"); %>
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                    <div class="text-center Roboto">
                        <h4 >Sport Tasks Overview</h4>
                        Number of Tasks: <%=tasks.size()%>
                        <table class="table hoverable">
                            <caption>                    
                                Sport Tasks Overview
                            </caption>
                            <%
                                for (SportTasks task : tasks) {%>
                            <tr>
                                <th class="text-white bg-dark" style="vertical-align: middle;"><%=task.getOmschrijving()%></th>
                                <td title="Edit Task" style="background-color: #f44336;"><a href="./Servlet4Admin?editTask=<%=task.getId()%>" class="w-100"><i class="fas fa-edit" style="font-size: 36px"></i></a></td>
                                <td title="Delete Task" style="background-color: #f44336;"><a href="./Servlet4Admin?deleteTask=<%=task.getId()%>" class="w-100"><i class="fas fa-trash-alt" style="font-size: 36px"></i></a></td>
                            </tr>
                            <%}%>
                        </table>
                        <div class="text-center">
                            <a href="./Servlet4Admin?addTask=true"  class="h5 bg-success">
                                Add New Task <i class="fas fa-tasks" style="font-size: 36px"></i>
                            </a>
                        </div>

                        <div class="row">
                            <p class="col text-center btn">  <a href="index.jsp" class="w-100">Back to Homepage</a></p>
                            <p class="col text-center btn">  <a href="javascript:history.back()" class="w-100">Back to Previous Page</a></p>                      
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
