<%-- 
    Document   : student
    Created on : Mar 2, 2020, 11:20:44 PM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Displays Student Details</title>
        </head>
        <body>
            <div class="container">
                <div class="row">
                    <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                        <div class="card card-signin my-5">
                            <div class="card-body">
                                <h1 class="text-center Roboto fontW900">Displays Student Details</h1>
                                <div class="card-title">
                                    <p>Student ID: ${requestScope.student.studentId}</p>
                                <p>Student Name: ${requestScope.student.studentName}</p>
                                <p>Student Address: ${requestScope.student.studentAddress}</p>
                            </div>
                        </div>
                        <jsp:include page="footer.html"></jsp:include>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
