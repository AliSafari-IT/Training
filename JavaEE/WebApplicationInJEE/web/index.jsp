<%-- 
    Document   : index
    Created on : Mar 2, 2020, 10:52:25 PM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
        <title>Student Details</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="card card-signin my-5">
                        <div class="card-body">
                            <h1 class="h2 text-center">Student Details</h1>
                            <form class="form-signin" action="./StudentServlet" method="post">
                                <div class="form-label-group">
                                    <label for="studentId">Student ID</label>
                                    <input type="text" name="studentId" id="studentId" class="form-control" required autofocus>
                                </div>
                                <div class="form-label-group">
                                    <label for="studentName">Student Name</label>
                                    <input type="text" name="studentName" id="studentName" class="form-control" required autofocus>
                                </div>
                                <div class="form-label-group">
                                    <label for="studentAddress">Student Address</label>
                                    <input type="text" name="studentAddress" id="studentAddress" class="form-control" required autofocus>
                                    <input class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" name="submit" id="studentFormSubmit" class="form-control" required autofocus>
                                </div>
                                <hr class="my-4">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
