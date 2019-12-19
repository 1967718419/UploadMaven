package com.hous.service.Houselist.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hous.mapper.HouselistMapper;
import com.hous.pojo.Houselist;
import com.hous.pojo.HouselistExample;
import com.hous.pojo.HouselistKey;
import com.hous.service.Houselist.HouselistService;

@Service
public class HouselistServiceimpl implements HouselistService{
	
	@Autowired
	private HouselistMapper houselistMapper;

	@Override
	public List<Houselist> selectAll() {
		// TODO Auto-generated method stub
		
		List<Houselist> houselist=houselistMapper.selectAll();
		return houselist;
	}

	@Override
	public List<Houselist> selectLandladyAll(String username) {
		// TODO Auto-generated method stub
		List<Houselist> houselist=houselistMapper.selectLandladyAll(username);
		return houselist;
	}

	@Override
	public List<Houselist> selects(String price, String area, String status, String address) {
		// TODO Auto-generated method stub
		if(price==null || price==""){
			if(area==null || area==""){
				List<Houselist> houselist1=houselistMapper.selects1(status,address);
				return houselist1;
			}
			String[] areas = area.split(",");
			String area1 = areas[0];
			String area2 = areas[1];
			List<Houselist> houselist2=houselistMapper.selects2(area1,area2,status,address);
			return houselist2;
		}else {
			if(area==null || area==""){
				String[] prices = price.split(",");
				String price1 = prices[0];
				String price2 = prices[1];
				List<Houselist> houselist3=houselistMapper.selects3(price1,price2,status,address);
				return houselist3;
			}
		}
		
		String[] prices = price.split(",");
		String price1 = prices[0];
		String price2 = prices[1];
		String[] areas = area.split(",");
		String area1 = areas[0];
		String area2 = areas[1];
		//System.out.println("price1="+price1+" price2="+price2+" area1="+area1+" area2="+area2+" status="+status+" address="+address);
		List<Houselist> houselist=houselistMapper.selects(price1,price2,area1,area2,status,address);
		return houselist;
	}
	
	//判断是houseid是否已存在
	@Override
	public Houselist findhouseid(String houseid) {
		// TODO Auto-generated method stub
		Houselist houselist=houselistMapper.findhouseid(houseid);
		return houselist;
	}
	//添加
	@Override
	public void inserthouse(Houselist houselist) {
		// TODO Auto-generated method stub
		houselistMapper.insert(houselist);
	}
	//删除
	@Override
	public void deletehouse(Integer id) {
		// TODO Auto-generated method stub
		HouselistExample example=new HouselistExample();
		example.createCriteria().andIdEqualTo(id);
		houselistMapper.deleteByExample(example);
	}
	//更新   根据id跳页面
	@Override
	public Houselist findid(Integer id) {
		// TODO Auto-generated method stub
		Houselist list=houselistMapper.findid(id);
		return list;
	}

	@Override
	public void updatehouse(Houselist houselist) {
		// TODO Auto-generated method stub
		houselistMapper.updatehouse(houselist);
	}

	@Override
	public Houselist findhouseidupdate(Houselist houselist) {
		// TODO Auto-generated method stub
		Houselist list=houselistMapper.findhouseidupdate(houselist);
		return list;
	}

	@Override
	public void deletehousebyhouseid(String houseId) {
		// TODO Auto-generated method stub
		houselistMapper.deletehousebyhouseid(houseId);
	}

	@Override
	public void updatehousestatus(Houselist houselist) {
		// TODO Auto-generated method stub
		houselistMapper.updatehousestatus(houselist);
		
	}
}
