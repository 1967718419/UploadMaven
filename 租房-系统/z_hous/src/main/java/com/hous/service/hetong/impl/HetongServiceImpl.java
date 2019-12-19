package com.hous.service.hetong.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hous.mapper.HetongMapper;
import com.hous.pojo.Hetong;
import com.hous.pojo.HetongExample;
import com.hous.service.hetong.HetongService;


@Service
public class HetongServiceImpl implements HetongService {
	@Autowired
	private HetongMapper hetongMapper;
	
	@Override
	public void inserthetong(Hetong hetong) {
		hetongMapper.inserthetong(hetong);
		
	}

	@Override
	public Hetong findhetong(String houseId) {
		Hetong hetong=hetongMapper.findhetong(houseId);
		return hetong;
	}

	@Override
	public void updatehetong(Hetong hetong) {
		
//		hetongMapper.updatehetong(hetong);
	}

	@Override
	public void deletehetong(String houseId) {
		// TODO Auto-generated method stub
		hetongMapper.deletehetong(houseId);
		
	}
	
}
