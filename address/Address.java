package com.address;

public class Address {

    private String fname;
    private String lname;
    private long phone;
    private String mail;
    private long Zip;
    private String state;

    public Address(String fname, String lname, long phone, String mail, long Zip, String state) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.mail = mail;
        this.Zip = Zip;
        this.state = state;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getZip() {
        return Zip;
    }

    public void setZip(long zip) {
        Zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}