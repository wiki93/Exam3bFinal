package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class AdminReadQuery {

    private Connection conn;
    private ResultSet results;

    public AdminReadQuery() {

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doRead() {
        try {
            String query = "Select * from customers";

            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getHTMLTable() {

        String table2 = "";
        table2 += "<table>";

        try {
            
            table2 += "<tr>";
            table2 += "<th>";
            table2 += "CustomerID";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "First Name";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "Last Name";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "Address 1";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "Address 2";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "City";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "State";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "Zip";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "Email Address";
            table2 += "</th>";
            table2 += "<th>";
            table2 += "";
            table2 += "</th>";
            table2 += "</tr>";

            while (this.results.next()) {
                
                Customers movie = new Customers();
                movie.setCustomerID(this.results.getInt("customerID"));
                movie.setFirstName(this.results.getString("firstName"));
                movie.setLastName(this.results.getString("lastName"));
                movie.setAddr1(this.results.getString("addr1"));
                movie.setAddr2(this.results.getString("addr2"));
                movie.setCity(this.results.getString("city"));
                movie.setState(this.results.getString("state"));
                movie.setZipCode(this.results.getString("zipCode"));
                movie.setEmailAddr(this.results.getString("emailAddr"));

                table2 += "<tr>";

                table2 += "<td>";
                table2 += movie.getCustomerID();
                table2 += "</td>";

                table2 += "<td>";
                table2 += movie.getFirstName();
                table2 += "</td>";

                table2 += "<td>";
                table2 += movie.getLastName();
                table2 += "</td>";

                table2 += "<td>";
                table2 += movie.getAddr1();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += movie.getAddr2();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += movie.getCity();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += movie.getState();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += movie.getZipCode();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += movie.getEmailAddr();
                table2 += "</td>";
                
                table2 += "<td>";
                table2 += "<a href=update?customerID=" + movie.getCustomerID() + "> Update </a>" +"<a href=delete?customerID=" + movie.getCustomerID() + "> Delete </a>";
                table2 += "</td>";

                

                table2 += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        table2 += "</table>";
        return table2;

    }

}
