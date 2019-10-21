package com.briup.bean;

import java.math.BigDecimal;

public class EOrder {
    private BigDecimal id;

    private String orderid;

    private String receivename;

    private BigDecimal dob;

    private String receivephone;

    private BigDecimal paystatus;

    private String receiveaddress;

    private BigDecimal sum;

    private BigDecimal customerId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public BigDecimal getDob() {
        return dob;
    }

    public void setDob(BigDecimal dob) {
        this.dob = dob;
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    public BigDecimal getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(BigDecimal paystatus) {
        this.paystatus = paystatus;
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }
}