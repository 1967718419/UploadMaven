package com.hous.service.checkout.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.hous.mapper.CheckoutMapper;
import com.hous.pojo.Checkout;
import com.hous.service.checkout.CheckoutService;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	
	@Autowired
	private CheckoutMapper checkoutMapper;

	@Override
	public void insertcheckout(Checkout checkout) {
		checkoutMapper.insertcheckout(checkout);
		
	}

	@Override
	public List<Checkout> getallcheckout() {
		List<Checkout> checkout=checkoutMapper.getallcheckout();
		return checkout;
	}

	@Override
	public void deletecheckout(Integer cid) {
		
		checkoutMapper.deleteByPrimaryKey(cid);
	}


}
