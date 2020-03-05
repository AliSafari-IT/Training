<%-- 
    Document   : student
    Created on : Mar 2, 2020, 11:20:44 PM
    Author     : Ali
--%>

<%@page import="fact.it.www.Example2.studentCoursePreference"%>
<%@page import="fact.it.www.Example1.model.Student"%>
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
                        <div class="card card-signin my-1">
                            <div class="card-body">
                                <h1 class="text-center Roboto fontW900">Displays Student Details</h1>
                                <div class="card-title">
                                <%
//                                    Student student = (Student) request.getAttribute("student");
                                    studentCoursePreference coursePreference = (studentCoursePreference) request.getAttribute("coursePreference");
                                %>
                            <!--                                <p>Student ID: ${requestScope.student.studentId}</p>-->
                                <p>Student ID: <%=coursePreference.getStudentId()%></p>
                                <p>Student Name: <%=coursePreference.getStudentName()%></p>
                                <p>Student Address: <%=coursePreference.getStudentAddress()%></p>
                                <p>Student Course: <%=coursePreference.getStudentCourse()%></p>
                                <p>Student Preference: <%=coursePreference.getStudentPreference()%></p>
                            </div>
                        </div>
                        <jsp:include page="footer.html"></jsp:include>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
