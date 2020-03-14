<%-- 
    Document   : editTask
    Created on : Mar 13, 2020, 11:52:37 PM
    Author     : Ali
--%>

<%@page import="fact.it.www.beans.SportTasks"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.html"></jsp:include>
        <title>Tasks Overview</title>

        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
            <%SportTasks task = (SportTasks) request.getAttribute("task");%>
            <div class="col-md-8">
                <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                <h5>Edit/Update Task Content</h5>
                <form action="./Servlet4Admin" method="post">
                    <div>
                        <input type="text" name="taskContent" value="<%=task.getOmschrijving()%>"
                               class="bg-warning Roboto w-100" placeholder="Add a task here">
                        <input type="hidden" name="taskID" value="<%=task.getId()%>">
                        <input type="submit" name="updateTaskButtonClicked">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
