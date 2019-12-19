package com.hous.pojo;

public class Applyout {
    private Integer aoid;

    private String houseId;

    private String address;

    private String status;

    private Integer userlistId;

    public Integer getAoid() {
        return aoid;
    }

    public void setAoid(Integer aoid) {
        this.aoid = aoid;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }
}