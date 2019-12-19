package com.hous.pojo;

import java.util.List;

public class Userlist extends UserlistKey {
    private String name;

    private String phone;

    private Integer userId;
    
    private List<Apply> apply;
    private List<Zulist> zulist;
    private List<Checkout> checkout;
    private List<Applyout> applyout;
    private User user;
    
    

    public List<Apply> getApply() {
		return apply;
	}

	public void setApply(List<Apply> apply) {
		this.apply = apply;
	}

	public List<Zulist> getZulist() {
		return zulist;
	}

	public void setZulist(List<Zulist> zulist) {
		this.zulist = zulist;
	}

	public List<Checkout> getCheckout() {
		return checkout;
	}

	public void setCheckout(List<Checkout> checkout) {
		this.checkout = checkout;
	}

	public List<Applyout> getApplyout() {
		return applyout;
	}

	public void setApplyout(List<Applyout> applyout) {
		this.applyout = applyout;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}