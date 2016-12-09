

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ include file="includes/bootstrap.jsp" %>

        <title>Search Contact Information</title>
    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="col-xs-12">
                    <div class="page-header">
                        <div>
                            <h1>Search Customers</h1>
                        </div>
                    </div>
                </div>
            </div>

            <%@ include file="includes/menu.jsp" %>

            <div class="row">
                <div class="col-xs-12">
                    <form name ="searchForm" action="search" method="get">
                        <input type="text" name="searchVal" value="" />
                        <br><br>
                        <input type="submit" name="submit" value="Search" /><br><br>
                    </form>
                </div>
            </div>

            <%@ include file="includes/footer.jsp" %>
        </div>

    </body>
</html>
