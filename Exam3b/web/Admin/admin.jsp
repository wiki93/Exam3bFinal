<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@ include file="../includes/bootstrap.jsp" %>

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


            <div class="row">
                <div class="col-xs-12">
                    <div class="navbar-inverse">
                        <div class="container-fluid">
                            <ul class="nav nav-pills">
                                <li class="active"><a href="../index.jsp">Home</a></li>
                                <li><a href="../read">View all Customers</a></li>
                                <li><a href="../add">Add New Customer</a></li>
                                <li><a href="Cost.jsp">What Will it Cost Me?</a></li>
                                <li><a href="add.jsp">Show Your Support</a></li>
                            </ul>
                        </div> 
                    </div>
                </div>
            </div>

            <a href="../read">View all Customers</a>

            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <%@ include file="../includes/footer.jsp" %>
                </div>
            </div>


        </div>

    </body>
</html>
