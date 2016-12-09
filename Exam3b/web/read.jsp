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
        <title>View all Customers</title>
    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="col-xs-12">
                    <div class="page-header">
                        <div>
                            <h1>View all Customers</h1>
                        </div>
                    </div>
                </div>
            </div>


            <%@ include file="includes/menu.jsp" %>

            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <h3>Customers in the Database</h3>
                    <p>
                        <% String table = (String) request.getAttribute("table");%>

                    

                        <%= table%>
                        </p>
                </div>

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
