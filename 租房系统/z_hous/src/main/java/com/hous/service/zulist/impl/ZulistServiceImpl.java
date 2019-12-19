package com.hous.service.zulist.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hous.mapper.ZulistMapper;
import com.hous.pojo.Zulist;
import com.hous.pojo.ZulistExample;
import com.hous.service.zulist.ZulistService;


@Service
public class ZulistServiceImpl implements ZulistService {
	
	@Autowired
	private ZulistMapper zulistMapper;
	
	@Override
	public void insertzulist(Zulist zulist) {
		zulistMapper.insertzulist(zulist);
		
	}

	@Override
	public List<Zulist> findzuuserlist() throws Exception {
		
		List<Zulist> zulist=zulistMapper.findzuuserlist();
		
		return zulist;
	}

	@Override
	public Zulist findzulist(String houseId) {
		Zulist zulist=zulistMapper.findzulist(houseId);
		return zulist;
	}

	@Override
	public void deletezulist(String houseId) {
		//zulistMapper.deletezulist(house_id);
		zulistMapper.deletezulist(houseId);
		
	}

	@Override
	public List<Zulist> findzulistbyuid(Integer userlist_id) {
//		List<Zulist> zulist=zulistMapper.findzulistbyuid(userlist_id);
//		return zulist;
		return null;
	}


}
