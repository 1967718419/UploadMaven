package com.hous.service.paid;

import java.util.List;

import com.hous.pojo.Paid;
import com.hous.pojo.QueryVo;
import com.hous.pojo.Zulist;


public interface PaidService {
	public List<Paid> selectall(QueryVo vo);
	public Double selectsum(QueryVo vo);
	public void deletepaid(Integer id);
	public List<Zulist> findzuuserlist() throws Exception;
	public Zulist findzukezulist(Integer id);
	
}
