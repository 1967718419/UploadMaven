package com.hous.service.topaid;

import java.util.List;

import com.hous.pojo.Paid;
import com.hous.pojo.QueryVo;
import com.hous.pojo.Topaid;


public interface TopaidService {
	public void inserttopaid(Topaid topaid);
	public List<Topaid> findtopaid(QueryVo vo);
	public Topaid findbyid(Integer id);
	public void gotopay(Integer id,Paid paid);
}
