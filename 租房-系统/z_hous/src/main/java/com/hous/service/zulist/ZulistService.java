package com.hous.service.zulist;

import java.util.List;

import com.hous.pojo.Zulist;



public interface ZulistService {
	public void insertzulist(Zulist zulist);
	public List<Zulist> findzuuserlist() throws Exception;
	public Zulist findzulist(String houseId);
	public void deletezulist(String houseId);
	public List<Zulist> findzulistbyuid(Integer userlist_id);
}
