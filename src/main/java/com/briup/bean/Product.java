package com.briup.bean;

import java.math.BigDecimal;

public class Product {
    private BigDecimal id;

    private String img;

    private BigDecimal clickrate;

    private BigDecimal remain;

    private String partpay;

    private BigDecimal pricereduce;

    private BigDecimal categorytwoId;

    private BigDecimal hot;

    private BigDecimal price;

    private String publish;

    private String parameter;

    private String name;

    private BigDecimal publishdate;

    private String quit;

    private String free;

    private String wraplist;

    private String introduction;

    private BigDecimal sellnum;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public BigDecimal getClickrate() {
        return clickrate;
    }

    public void setClickrate(BigDecimal clickrate) {
        this.clickrate = clickrate;
    }

    public BigDecimal getRemain() {
        return remain;
    }

    public void setRemain(BigDecimal remain) {
        this.remain = remain;
    }

    public String getPartpay() {
        return partpay;
    }

    public void setPartpay(String partpay) {
        this.partpay = partpay == null ? null : partpay.trim();
    }

    public BigDecimal getPricereduce() {
        return pricereduce;
    }

    public void setPricereduce(BigDecimal pricereduce) {
        this.pricereduce = pricereduce;
    }

    public BigDecimal getCategorytwoId() {
        return categorytwoId;
    }

    public void setCategorytwoId(BigDecimal categorytwoId) {
        this.categorytwoId = categorytwoId;
    }

    public BigDecimal getHot() {
        return hot;
    }

    public void setHot(BigDecimal hot) {
        this.hot = hot;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(BigDecimal publishdate) {
        this.publishdate = publishdate;
    }

    public String getQuit() {
        return quit;
    }

    public void setQuit(String quit) {
        this.quit = quit == null ? null : quit.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public String getWraplist() {
        return wraplist;
    }

    public void setWraplist(String wraplist) {
        this.wraplist = wraplist == null ? null : wraplist.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public BigDecimal getSellnum() {
        return sellnum;
    }

    public void setSellnum(BigDecimal sellnum) {
        this.sellnum = sellnum;
    }
}