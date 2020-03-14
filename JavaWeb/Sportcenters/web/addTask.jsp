<%-- 
    Document   : addTask
    Created on : Mar 14, 2020, 3:44:18 AM
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
                        <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Flanders Sport Centers</p>
                        <h5>Add New Task</h5>
                        <form action="./Servlet4Admin" method="post">
                            <div>
                                <input type="text" name="taskContent" value=""
                                   class="bg-warning Roboto w-100" placeholder="Add a task here">
                            <input type="submit" name="addTaskButtonClicked">
                        </div>
                    </form>
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
