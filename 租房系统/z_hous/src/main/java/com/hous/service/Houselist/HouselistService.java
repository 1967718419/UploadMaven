package com.hous.service.Houselist;

import java.util.List;

import com.hous.pojo.Houselist;

public interface HouselistService {

	List<Houselist> selectAll();

	List<Houselist> selectLandladyAll(String username);

	List<Houselist> selects(String price, String area, String status, String address);

	Houselist findhouseid(String houseid);

	void inserthouse(Houselist houselist);

	void deletehouse(Integer id);

	Houselist findid(Integer id);

	void updatehouse(Houselist houselist);

	Houselist findhouseidupdate(Houselist houselist);

	void deletehousebyhouseid(String houseId);
	
	void updatehousestatus(Houselist houselist);

}
