<%-- 
    Document   : index
    Created on : Dec 8, 2016, 12:25:33 PM
    Author     : Dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@ include file="includes/bootstrap.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="col-xs-12">
                    <div class="page-header">
                        <div>
                            <h1>Welcome to Dylans Exam 3b</h1>
                        </div>
                    </div>
                </div>
            </div>


            <%@ include file="includes/menu.jsp" %>

            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <h3>Exam 3b</h3>
                    <p>
                        SDD was awesome Mike!
                    </p>
                </div>

            </div>

            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <%@ include file="includes/footer.jsp" %>
                </div>
            </div>


        </div>

    </body>
</html>
