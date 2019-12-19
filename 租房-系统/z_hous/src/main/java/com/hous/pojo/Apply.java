package com.hous.pojo;

public class Apply extends ApplyKey {
    
    private String address;

    private Double area;

    private Double price;

    private String status;

    private Integer userlistId;
    
    private Userlist userlist;
    



	@Override
	public String toString() {
		return "Apply [address=" + address + ", area=" + area + ", price=" + price + ", status=" + status
				+ ", userlistId=" + userlistId + ", userlist=" + userlist + "]";
	}

	public Userlist getUserlist() {
		return userlist;
	}

	public void setUserlist(Userlist userlist) {
		this.userlist = userlist;
	}

	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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