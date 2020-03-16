<%-- 
    Document   : index
    Created on : Mar 16, 2020, 8:13:16 PM
    Author     : Ali
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <title>Auto-Completion using AJAX</title>
        <script type="text/javascript" src="javascript.js"></script>
    </head>
    <body onload="init()">
        <div class="container">
            <div class="row d-flex justify-content-xl-center">
                <!--Grid column-->
                <div class="col-md-8">
                    <p class="display-4 Roboto fontW900 text-center text-white bg-dark">Auto-Completion using AJAX</p>
                    <p>This example shows how you can do real time auto-completion using Asynchronous
                        JavaScript and XML (Ajax) interactions.</p>

                    <p>In the form below enter a name. Possible names that will be completed are displayed
                        below the form. For example, try typing in "Bach," "Mozart," or "Stravinsky,"
                        then click on one of the selections to see composer details.</p>
                    <h2 id="overview">Overview of the Application</h2>
                    <p>Imagine a web page in which a user can search for information about musical composers. The
                        page includes a field where the user can enter the name of the composer. In the example application,
                        the entry field has an auto-complete feature. In other words, the user can type in part of
                        the composer name, and the web application attempts to complete the name by listing all composers
                        whose first or last name begins with the characters entered. The auto-complete feature saves
                        the user from having to remember the complete name of the composer and can provide a more
                        intuitive and direct path to the sought-after information.</p>
                    <div>
                        <img src="img/sample-app.png" alt="Sample application displayed in browser" class="margin-around" title="Sample application displayed in browser">
                    </div>
                    <p>Implementing auto-completion in a search field is something that can be performed using Ajax.
                        Ajax works by employing an <code>XMLHttpRequest</code> object to pass requests and responses
                        asynchronously between the client and server. The following diagram illustrates the process
                        flow of the communication that takes place between the client and server.</p>
                    <div id="flow-diagram" class="indent">
                        <img src="img/ajax-process-flow.png" alt="Ajax process flow diagram" class="margin-around b-all" title="Ajax process flow diagram">
                    </div>
                    <p>The process flow of the diagram can be described by the following steps:</p>
                    <ol>
                        <li>The user triggers an event, for example by releasing a key when typing in a name. This
                            results in a JavaScript call to a function that initializes an <code>XMLHttpRequest</code>
                            object.</li>

                        <li>The <code>XMLHttpRequest</code> object is configured with a request parameter that includes
                            the ID of the component that triggered the event, and any value that the user entered.
                            The <code>XMLHttpRequest</code> object then makes an asynchronous request to the web
                            server.</li>

                        <li>On the web server, an object such as a servlet or listener handles the request. Data
                            is retrieved from the data store, and a response is prepared containing the data in the
                            form of an XML document.</li>

                        <li>Finally, the <code>XMLHttpRequest</code> object receives the XML data using a callback
                            function, processes it, and updates the HTML DOM (Document Object Model) to display the
                            page containing the new data.</li>
                    </ol>
                    <p><a href="https://netbeans.org/kb/docs/web/ajax-quickstart.html">This tutorial</a> demonstrates how to construct the auto-complete scenario by following the
                        process flow indicated in the above diagram. You first create the client-side files for the
                        presentation and functionality needed to generate the <code>XMLHttpRequest</code> object.
                        Then, you set up the server-side by creating the data store and business logic using Java-based
                        technology. Finally, you return to the client-side and implement <code>callback()</code>,
                        and other JavaScript functionality to update the HTML DOM.</p>

                    <form name="autofillform" action="autocomplete">
                        <table border="0" cellpadding="5"> 
                            <tbody>
                                <tr>
                                    <td><strong>Composer Name:</strong></td>
                                    <td>
                                        <input type="text"
                                               size="40" 
                                               id="complete-field"
                                               onkeyup="doCompletion()">
                                    </td>
                                </tr>
                                <tr>
                                    <td id="auto-row" colspan="2">
                                        <table id="complete-table" class="popupBox" />
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        </div>
         <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
