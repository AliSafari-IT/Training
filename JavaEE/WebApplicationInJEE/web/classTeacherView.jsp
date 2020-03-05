<%-- 
    Document   : classTeacherView
    Created on : Mar 5, 2020, 3:07:46 PM
    Author     : Ali
--%>

<%@page import="fact.it.www.Example3.model.Docent"%>
<%@page import="fact.it.www.Example2.studentCoursePreference"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <title>Displays Class/Teacher Details</title>
        </head>
        <body>
            <div class="container">
                <div class="row">
                    <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                        <div class="card card-signin my-1">
                            <div class="card-body">
                                <h2 class="text-center Roboto fontW900">Class/Teacher Details</h2>
                                <div class="card-title">
                                <%
//                                    Student student = (Student) request.getAttribute("student");
                                    Docent classTeacherStudentPreference = (Docent) request.getAttribute("docent");
                                %>
                                <div class="bg-warning Roboto fontW200 small">
                                    <p>Beste student <%=classTeacherStudentPreference.getStudentName()%>,</p>
                                    <p>Je Java (group <%=classTeacherStudentPreference.getClassName()%>) docent is 
                                        <%=classTeacherStudentPreference.getDocentName()%></p>
                                    <p>Je voorlopige voorkeur is <%=classTeacherStudentPreference.getStudentPreference()%>.</p>
                                </div>
                            </div>
                        </div>
                        <jsp:include page="footerExample3.html"></jsp:include>
                    </div>
                </div>
            </div>
        </div>    </body>
</html>
