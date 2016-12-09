
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("movie");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Customer</title>
        <%@ include file="includes/bootstrap.jsp" %>
    </head>
    <body>

        <div class="row">
            <div class="col-xs-12">
                <div class="page-header">
                    <div>
                        <h1>Update A Movie</h1>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <!-- content that takes all 12 cols -->
                <form name="updateForm" action="updateCustomers" method="get">

                    <label>Customer ID:</label>
                    <input type="text" name="customerID" value="<%= customer.getCustomerID()%>" readonly/>
                    <br>
                    <label>First Name:</label>
                    <input type="text" name="firstName" value="<%= customer.getFirstName()%>" />
                    <br>
                    <label>Last Name:</label>
                    <input type="text" name="lasdName" value="<%= customer.getLastName()%>" />
                    <br>
                    <label>Address Line 1:</label>
                    <input type="text" name="adrr1" value="<%= customer.getAddr1()%>" />
                    <br>
                    <label>Address Line 2:</label>
                    <input type="text" name="adrr2" value="<%= customer.getAddr2()%>" />
                    <br>
                    <label>City</label>
                    <input type="text" name="city" value="<%= customer.getCity()%>" />
                    <br>
                    <label>State:</label>
                    <input type="text" name="state" value="<%= customer.getState()%>" />
                    <br>
                    <label>Zip Code:</label>
                    <input type="text" name="zipCode" value="<%= customer.getZipCode()%>" />
                    <br>
                    <br>
                    <input type="reset" name="reset" value="Clear" />
                    <input type="submit" name="submit" value="Update" />

                </form>
            </div>
        </div>


        <div class="row">
            <div class="col-xs-12">
                <!-- content that takes all 12 cols -->
                <%@ include file="includes/footer.jsp" %>

            </div>
        </div>



    </body>
</html>
