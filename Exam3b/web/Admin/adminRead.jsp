<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@ include file="../includes/bootstrap.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Customer View</title>
    </head>
    <body>

        <div class="container">

            <%@ include file="../includes/adminHeader.jsp" %>

            <%@ include file="../includes/adminMenu.jsp" %>
            
            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <h3>Admin Read</h3>
                    <p>
                        <% String table2 = (String) request.getAttribute("table2");%>



                        <%= table2 %>
                    </p>
                </div>

            </div>

            <%@ include file="../includes/footer.jsp" %>

        </div>

    </body>
</html>
