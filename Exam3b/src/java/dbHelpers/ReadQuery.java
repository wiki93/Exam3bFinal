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

public class ReadQuery {

    private Connection conn;
    private ResultSet results;

    public ReadQuery() {

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

        String table = "";
        table += "<table>";

        try {
            
            table += "<tr>";
            table += "<th>";
            table += "CustomerID";
            table += "</th>";
            table += "<th>";
            table += "First Name";
            table += "</th>";
            table += "<th>";
            table += "Last Name";
            table += "</th>";
            table += "<th>";
            table += "Address 1";
            table += "</th>";
            table += "<th>";
            table += "Address 2";
            table += "</th>";
            table += "<th>";
            table += "City";
            table += "</th>";
            table += "<th>";
            table += "State";
            table += "</th>";
            table += "<th>";
            table += "Zip";
            table += "</th>";
            table += "<th>";
            table += "Email Address";
            table += "</th>";
            table += "</tr>";

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

                table += "<tr>";

                table += "<td>";
                table += movie.getCustomerID();
                table += "</td>";

                table += "<td>";
                table += movie.getFirstName();
                table += "</td>";

                table += "<td>";
                table += movie.getLastName();
                table += "</td>";

                table += "<td>";
                table += movie.getAddr1();
                table += "</td>";
                
                table += "<td>";
                table += movie.getAddr2();
                table += "</td>";
                
                table += "<td>";
                table += movie.getCity();
                table += "</td>";
                
                table += "<td>";
                table += movie.getState();
                table += "</td>";
                
                table += "<td>";
                table += movie.getZipCode();
                table += "</td>";
                
                table += "<td>";
                table += movie.getEmailAddr();
                table += "</td>";

                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        table += "</table>";
        return table;

    }

}
