package com.hous.pojo;

public class Zulist extends ZulistKey {
	
    private Double price;

    private String address;

    private Integer userlistId;

    private Integer contractId;
    
    private Userlist userlist;

	public Userlist getUserlist() {
		return userlist;
	}

	public void setUserlist(Userlist userlist) {
		this.userlist = userlist;
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

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}