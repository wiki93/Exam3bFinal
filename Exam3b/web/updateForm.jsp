

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width-device-width, initial-scale-1.0">

        <script src="http://code.jquery.com/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="custom.css">

        <title>Update Customer Information</title>
    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="col-xs-12">
                    <div class="page-header">
                        <div>
                            <h1>Update Customer Information</h1>
                            <br><br>

                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12">
                    <%@ include file="includes/menu.jsp" %>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <p>


                    <form name="updateForm" action="updateCustomers" method="get">
                        <table class="table-bordered">
                            <tr>

                                <td class = "right" style="background-color:lightgray;">
                                    Customer ID:  
                                </td>
                                <td class = "left"> <input type="text" name="customerID" value="<%= customer.getCustomerID()%>" size="50" style="background-color:lightgray;" required readonly/> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    First Name:  
                                </td>
                                <td class = "left"><input type="text" name="firstName" value="<%= customer.getFirstName()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Last Name:  
                                </td>
                                <td class = "left"><input type="text" name="lastName" value="<%= customer.getLastName()%>" size="50" required /> 
                                </td>
                            </tr>

                            <tr>

                                <td class = "right">
                                    Address Line 1:  
                                </td>
                                <td class = "left"><input type="text" name="addr1" value="<%= customer.getAddr1()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Address Line 2:  
                                </td>
                                <td class = "left"><input type="text" name="addr2" value="<%= customer.getAddr2()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    City:  
                                </td>
                                <td class = "left"><input type="text" name="city" value="<%= customer.getCity()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    State:  
                                </td>
                                <td class = "left"><input type="text" name="state" value="<%= customer.getState()%>" size="50" required /> 

                            </tr>
                            <tr>

                                <td class = "right">
                                    Zip Code:  
                                </td>
                                <td class = "left"><input type="text" name="zipCode" value="<%= customer.getZipCode()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Email Address:  
                                </td>
                                <td class = "left"><input type="text" name="emailAddr" value="<%= customer.getEmailAddr()%>" size="50" required /> 
                                </td>
                            </tr>                            

                        </table>

                        <br>
                        <input type="submit" value="Update" id="submit"/>
                        <br>

                    </form>

                    <a href="delete?supportID=<%= customer.getCustomerID()%>">
                        <input type="button" value="Delete" />
                    </a>

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
