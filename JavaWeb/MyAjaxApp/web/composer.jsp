
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
            <link rel="stylesheet" type="text/css" href="stylesheet.css">
            <title>Auto-Completion using AJAX</title>
            <script type="text/javascript" src="javascript.js"></script>
        </head>
        <body>
            <div class="container">
                <div class="row d-flex justify-content-xl-center">
                    <!--Grid column-->
                    <div class="col-md-8">
                        <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Auto-Completion using AJAX</p>

                        <table class="table table-strip hoverable">
                            <tr>
                            <caption>Composer Information</caption>
                                <th colspan="2" class="larger">Composer Information</th>
                            </tr>
                            <tr>
                                <td>First Name: </td>
                                <td>${requestScope.composer.firstName}</td>
                        </tr>
                        <tr>
                            <td>Last Name: </td>
                            <td>${requestScope.composer.lastName}</td>
                        </tr>
                        <tr>
                            <td>ID: </td>
                            <td>${requestScope.composer.id}</td>
                        </tr>
                        <tr>
                            <td>Category: </td>
                            <td>${requestScope.composer.category}</td>
                        </tr>      
                    </table>

                    <p><a href="index.jsp" class="link">Go Back to Home Page</a>.</p>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>

