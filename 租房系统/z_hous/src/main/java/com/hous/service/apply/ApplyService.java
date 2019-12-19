package com.hous.service.apply;

import java.util.List;

import com.hous.pojo.Apply;
import com.hous.pojo.Houselist;


public interface ApplyService {
	
	public void insertapply(Apply apply);
	public List<Apply> findapplylist() throws Exception;
	Apply findbyhouse_id(String houseId);
	public void deletebyhouse_id(String houseId);
	public void refuseapply(Houselist houselist,String name);
	public List<Apply> findallapplyout();
}
