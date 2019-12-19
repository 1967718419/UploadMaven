package com.hous.service.applyout.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hous.mapper.ApplyoutMapper;
import com.hous.mapper.CheckoutMapper;
import com.hous.mapper.HetongMapper;
import com.hous.mapper.HouselistMapper;
import com.hous.mapper.ZulistMapper;
import com.hous.pojo.Applyout;
import com.hous.pojo.Checkout;
import com.hous.pojo.Zulist;
import com.hous.service.applyout.ApplyoutService;


@Service
@Transactional
public class ApplyoutServiceImpl implements ApplyoutService {
	
	@Autowired
	private ApplyoutMapper applyoutMapper;
	@Autowired
	private HouselistMapper houselistMapper;
	@Autowired
	private HetongMapper hetongMapper;
	@Autowired
	private CheckoutMapper checkoutMapper;
	@Autowired
	private ZulistMapper zulistMapper;
	@Override
	public void insertapplyout(Zulist zulist) {
		Applyout applyout=new Applyout();
		applyout.setHouseId(zulist.getHouseId());
		applyout.setAddress(zulist.getAddress());
		applyout.setStatus("申请中");
		applyout.setUserlistId(zulist.getUserlistId());
		//applyoutMapper.insertapplyout(applyout);
		
	}
	@Override
	public void updateapplyout(Applyout applyout) {
		
		applyoutMapper.updateapplyout(applyout);
	}
	@Override
	public void agreeapplyout(Integer aoid) {
		Applyout applyout=applyoutMapper.findbyid(aoid);
		houselistMapper.deletehousebyhouseid(applyout.getHouseId());
		hetongMapper.deletehetong(applyout.getHouseId());
		Checkout checkout=new Checkout();
		checkout.setHouseId(applyout.getHouseId());
		checkout.setAddress(applyout.getAddress());
		checkout.setStatus("已退租");
		checkout.setUserlistId(applyout.getUserlistId());
		checkoutMapper.insertcheckout(checkout);
		applyout.setStatus("已同意");
		applyoutMapper.updateapplyoutbyhouse(applyout);
		zulistMapper.deletezulist(applyout.getHouseId());
	}
	@Override
	public void deleteapplyout(Integer aoid) {
		
		applyoutMapper.deleteapplyout(aoid);
	}
	
	
}
