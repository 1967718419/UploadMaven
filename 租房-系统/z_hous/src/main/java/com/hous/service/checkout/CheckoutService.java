package com.hous.service.checkout;

import java.util.List;

import com.hous.pojo.Checkout;


public interface CheckoutService {
public void insertcheckout(Checkout checkout);
public List<Checkout> getallcheckout();
public void deletecheckout(Integer cid);
}
