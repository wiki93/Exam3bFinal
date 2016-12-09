

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ include file="includes/bootstrap.jsp" %>

        <title>Show Your Support</title>
    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="col-xs-12">
                    <div class="page-header">
                        <div>
                            <h1>Add New Customer</h1>


                        </div>
                    </div>
                </div>
            </div>

            <%@ include file="includes/menu.jsp" %>

            <br>
            <div class="row">
                <div class="col-xs-12">
                    <!-- content that takes all 12 cols -->
                    <p>


                    <form name="addForm" action="addCustomers" method="get">
                        <table>

                            <tr>

                                <td class = "right">
                                    First Name:  
                                </td>
                                <td class = "left"><input type="text" name="firstName" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Last Name:  
                                </td>
                                <td class = "left"><input type="text" name="lastName" value="" size="50" required /> 
                                </td>
                            </tr>

                            <tr>

                                <td class = "right">
                                    Address Line 1:  
                                </td>
                                <td class = "left"><input type="text" name="addr1" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Address Line 2:  
                                </td>
                                <td class = "left"><input type="text" name="addr2" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    City:  
                                </td>
                                <td class = "left"><input type="text" name="city" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    State:  
                                </td>
                                <td class = "left"><select name="state">
                                        <option value="">  </option>
                                        <option value="AL">AL</option>
                                        <option value="AK">AK</option>
                                        <option value="AZ">AZ</option>
                                        <option value="AR">AR</option>
                                        <option value="CA">CA</option>
                                        <option value="CO">CO</option>
                                        <option value="CT">CT</option>
                                        <option value="DE">DE</option>
                                        <option value="FL">FL</option>
                                        <option value="GA">GA</option>
                                        <option value="HI">HI</option>
                                        <option value="ID">ID</option>
                                        <option value="IL">IL</option>
                                        <option value="IN">IN</option>
                                        <option value="IA">IA</option>
                                        <option value="KS">KS</option>
                                        <option value="KY">KY</option>
                                        <option value="LA">LA</option>
                                        <option value="ME">ME</option>
                                        <option value="MD">MD</option>
                                        <option value="MA">MA</option>
                                        <option value="MI">MI</option>
                                        <option value="MN">MN</option>
                                        <option value="MS">MS</option>
                                        <option value="MO">MO</option>
                                        <option value="MT">MT</option>
                                        <option value="NE">NE</option>
                                        <option value="NV">NV</option>
                                        <option value="NH">NH</option>
                                        <option value="NJ">NJ</option>
                                        <option value="NM">NM</option>
                                        <option value="NY">NY</option>
                                        <option value="NC">NC</option>
                                        <option value="ND">ND</option>
                                        <option value="OH">OH</option>
                                        <option value="OK">OK</option>
                                        <option value="OR">OR</option>
                                        <option value="PA">PA</option>
                                        <option value="RI">RI</option>
                                        <option value="SC">SC</option>
                                        <option value="SD">SD</option>
                                        <option value="TN">TN</option>
                                        <option value="TX">TX</option>
                                        <option value="UT">UT</option>
                                        <option value="VT">VT</option>
                                        <option value="VA">VA</option>
                                        <option value="WA">WA</option>
                                        <option value="WV">WV</option>
                                        <option value="WI">WI</option>
                                        <option value="WY">WY</option>
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Zip Code:  
                                </td>
                                <td class = "left"><input type="text" name="zipCode" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Email Address:  
                                </td>
                                <td class = "left"><input type="text" name="emailAddr" value="" size="50" required /> 
                                </td>
                            </tr>                            

                        </table>

                        <br><br>
                        <div class="span" style="padding-left:162px;">
                            <input type="submit" value="Submit" id="submit"/>
                        </div>
                        <br><br>

                    </form>
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
