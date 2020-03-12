<%-- 
    Document   : index
    Created on : Mar 7, 2020, 11:47:33 PM
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
                    <form action="./ManageServlet" method="post">
                        <div>
                            <input type="submit" name="firstSportcenter" value="See the first sport center">
                        </div>                       
                        <div>
                            <input type="submit" name="firstCamp" value="See the first sport camp">
                        </div>
                    </form>
                    <div>
                        <p>Do the same using the links below:</p>
                        <p class="text-center">
                            <a href="./ManageServlet?clicked=firstSportcenter">See the first sport center</a>
                            <a href="./Servlet4Lists?clicked=firstCamp">See the first sport camp</a>
                        </p>
                    </div>

                    <div>
                        <pre class="text-danger Roboto h3">public interface <span class="strong">PreparedStatement</span>
extends <code>Statement</code>
                        </pre>
                        <div class="block">An object that represents a precompiled SQL statement.
                            <p>A SQL statement is precompiled and stored in a
                                <code>PreparedStatement</code> object. This object can then be used to
                                efficiently execute this statement multiple times.

                            </p><p><b>Note:</b> The setter methods (<code>setShort</code>, <code>setString</code>,
                                and so on) for setting IN parameter values
                                must specify types that are compatible with the defined SQL type of
                                the input parameter. For instance, if the IN parameter has SQL type
                                <code>INTEGER</code>, then the method <code>setInt</code> should be used.

                            </p>
                            <p>If arbitrary parameter type conversions are required, the method
                                <code>setObject</code> should be used with a target SQL type.
                            </p>
                            <p>
                                In the following example of setting a parameter, <code>con</code> represents
                                an active connection:
                            </p>
                            <pre>   PreparedStatement pstmt = con.prepareStatement("UPDATE EMPLOYEES
        SET SALARY = ? WHERE ID = ?");
        pstmt.setBigDecimal(1, 1538.00);
        pstmt.setInt(2, 110592);
                            </pre>
                        </div>
                    </div>
                    <div>
                        <form action="./ManageServlet" method="post">
                            <div>
                                <p>Which Sport center do you want to see the details?</p>
                                <input type="text" name="sportcentrumid" class="form-input" placeholder="Choose an id between 1 and 4.">
                                <input type="submit" name="WhichSportcenter" value="Details">
                            </div>                       
                        </form>
                    </div>
                    <p class="text-danger Roboto h3">Or choose a sport center from a list or drop-down/ComboBox</p>
                    <div class="row text-center Roboto">
                        <p class="mx-1"><a href="./ManageServlet?clicked=SportCentersList">Choose from a list</a></p>
                        <p class="mx-1"><a href="./ManageServlet?clicked=SportCentersComboBox">Choose from a Combo Box</a></p>
                    </div>
                    <div>
                        <p class="text-danger Roboto h3">like-operator</p>
                        <p>Suppose: the last name of the person contains the letters "van" or String partName = "van" </p>
                        <p>Then the SQL statement can be formulated like this:</p>
                        <pre>
                            <code class="small">                            
statement = connection.prepareStatement ("SELECT * FROM members WHERE lastname like ?");
statement.setString(1, "%" + partName + "%");
                            </code>
                        </pre>
                        <form action="./ManageServlet" method="post" autocomplete="on">                   
                            <div>
                                Search a member by family name: 
                                <input type="text" name="lastName">
                                <input type="submit" name="searchByLastname" value="Search">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</html>
