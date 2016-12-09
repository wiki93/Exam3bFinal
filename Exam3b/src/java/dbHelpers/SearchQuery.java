/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author cassyfreedman
 */
public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery (){
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void doSearch (String name){
        try {
            String query = "SELECT * FROM customers WHERE UPPER(firstName) LIKE ? OR UPPER(lastName) LIKE ? ORDER BY customerID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + name.toUpperCase() + "%");
            ps.setString(2, "%" + name.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getHTMLtable() {

        String table = "";
        table += "<table>";

        try {

            table += "<tr>";
            table += "<th> Customer ID </th>";
            table += "<th> First Name </th>";
            table += "<th> Last Name </th>";
            table += "<th> Address Line 1 </th>";
            table += "<th> Address Line 2 </th>";
            table += "<th> City </th>";
            table += "<th> State </th>";
            table += "<th> Zip Code </th>";
            table += "<th> Email Address </th>";
            table += "</tr>";

            while (this.results.next()) {

                Customers support = new Customers();
                support.setCustomerID(this.results.getInt("customerID"));
                support.setFirstName(this.results.getString("firstName"));
                support.setLastName(this.results.getString("lastName"));
                support.setAddr1(this.results.getString("addr1"));
                support.setAddr2(this.results.getString("addr2"));
                support.setCity(this.results.getString("city"));
                support.setState(this.results.getString("state"));
                support.setZipCode(this.results.getString("zipCode"));
                support.setEmailAddr(this.results.getString("emailAddr"));


                table += "<tr>";
                table += "<td>";
                table += support.getCustomerID();
                table += "</td>";

                table += "<td>";
                table += support.getFirstName();
                table += "</td>";

                table += "<td>";
                table += support.getLastName();
                table += "</td>";

                
                table += "<td>";
                table += support.getAddr1();
                table += "</td>";
                
                table += "<td>";
                table += support.getAddr2();
                table += "</td>";

                table += "<td>";
                table += support.getCity();
                table += "</td>";

                table += "<td>";
                table += support.getState();
                table += "</td>";

                table += "<td>";
                table += support.getZipCode();
                table += "</td>";

                table += "<td>";
                table += support.getEmailAddr();
                table += "</td>";
                

                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        table += "</table>";

        return table;

    }
    
}
