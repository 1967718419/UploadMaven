package com.hous.pojo;

public class Hetong {
    private Integer id;

    private String chuzu;

    private String chuzuIdcard;

    private String zuke;

    private String zukeIdcard;

    private String fromdate;

    private String todate;

    private Double price;

    private String address;

    private String houseId;

    private Integer payday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChuzu() {
        return chuzu;
    }

    public void setChuzu(String chuzu) {
        this.chuzu = chuzu == null ? null : chuzu.trim();
    }

    public String getChuzuIdcard() {
        return chuzuIdcard;
    }

    public void setChuzuIdcard(String chuzuIdcard) {
        this.chuzuIdcard = chuzuIdcard == null ? null : chuzuIdcard.trim();
    }

    public String getZuke() {
        return zuke;
    }

    public void setZuke(String zuke) {
        this.zuke = zuke == null ? null : zuke.trim();
    }

    public String getZukeIdcard() {
        return zukeIdcard;
    }

    public void setZukeIdcard(String zukeIdcard) {
        this.zukeIdcard = zukeIdcard == null ? null : zukeIdcard.trim();
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate == null ? null : fromdate.trim();
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate == null ? null : todate.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public Integer getPayday() {
        return payday;
    }

    public void setPayday(Integer payday) {
        this.payday = payday;
    }
}