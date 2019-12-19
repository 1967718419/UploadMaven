package com.hous.service.apply.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hous.mapper.ApplyMapper;
import com.hous.mapper.HouselistMapper;
import com.hous.mapper.UserlistMapper;
import com.hous.pojo.Apply;
import com.hous.pojo.Houselist;
import com.hous.service.apply.ApplyService;


@Service
public class ApplyServiceImpl implements ApplyService {
	
	@Autowired
	private ApplyMapper applyMapper;
	@Autowired
	private HouselistMapper houselistMapper;
	@Autowired
	private UserlistMapper userlistMapper;
	
	@Override
	public void insertapply(Apply apply) {
		//applyMapper.insertapply(apply);
		
	}

	@Override
	public List<Apply> findapplylist() throws Exception{
		//String status = "申请中";
		List<Apply> apply=applyMapper.findapplylist();
		return  apply;
	}

	@Override
	public Apply findbyhouse_id(String houseId) {
		Apply apply=applyMapper.findbyhouse_id(houseId);
		return apply;
	}

	@Override
	public void deletebyhouse_id(String houseId) {
		applyMapper.deletebyhouse_id(houseId);
		
	}

	@Override
	public void refuseapply(Houselist houselist,String name) {
		houselistMapper.updatestatus(houselist);
		Apply apply = new Apply();
		apply.setStatus("已拒绝");
		apply.setHouseId(houselist.getHouseid());
		applyMapper.updateapplystatus(apply);
		
		/*Houselist house= houselistMapper.findhouseid(houselist.getHouseid());
		Userlist userlist = userlistMapper.findhasuserlistbyname(name);
		Apply apply = new Apply();
		apply.setAddress(house.getAddress());
		apply.setArea(house.getArea());
		apply.setHouse_id(house.getHouseid());
		apply.setPrice(house.getPrice());
		apply.setStatus(house.getStatus());
		apply.setUserlist_id(userlist.getId());
		applyMapper.insertapply(apply);*/
	}

	@Override
	public List<Apply> findallapplyout() {
		
		List<Apply> list = applyMapper.findallapplyout();
		return list;
	}

	

}
