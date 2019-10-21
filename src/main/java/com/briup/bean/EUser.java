package com.briup.bean;

import java.math.BigDecimal;
import java.util.Date;

public class EUser {
    private BigDecimal id;

    private String zip;

    private String password;

    private String address;

    private String phone;

    private Date dob;

    private String email;

    private String username;

    
    @Override
	public String toString() {
		return "EUser [id=" + id + ", zip=" + zip + ", password=" + password + ", address=" + address + ", phone="
				+ phone + ", dob=" + dob + ", email=" + email + ", username=" + username + "]";
	}

	public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}