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
public class ReadRecord {

    private Connection conn;
    private ResultSet results;
    private Customers customer = new Customers();
    private int customerID;

    public ReadRecord(int customerID) {

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");

        this.customerID = customerID;

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doRead() {

        try {
            String query = "SELECT * FROM customers WHERE customerID = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, customerID);
            this.results = ps.executeQuery();
            this.results.next();
            customer.setCustomerID(this.results.getInt("customerID"));
            customer.setFirstName(this.results.getString("firstName"));
            customer.setLastName(this.results.getString("lastName"));
            customer.setAddr1(this.results.getString("addr1"));
            customer.setAddr2(this.results.getString("addr2"));
            customer.setCity(this.results.getString("city"));
            customer.setState(this.results.getString("state"));
            customer.setZipCode(this.results.getString("zipCode"));
            customer.setEmailAddr(this.results.getString("emailAddr"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Customers getCustomer() {
        return this.customer;
    }
}
