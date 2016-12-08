package model;

public class Customers {

    private int customerID;
    private String firstName;
    private String lastName;
    private String addr1;
    private String addr2;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String email;

    public Customers() {
        this.customerID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addr1 = "";
        this.addr2 = "";
        this.address = "";
        this.city = "";
        this.state = "";
        this.zipCode = 0;
        this.email = "";
    }

    public Customers(int customerID, String firstName, String lastName, String addr1, String addr2, String address, String city, String state, int zipCode, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", addr1=" + addr1 + ", addr2=" + addr2 + ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", email=" + email + '}';
    }



}
