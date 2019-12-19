package com.hous.mapper;

import com.hous.pojo.Houselist;
import com.hous.pojo.HouselistExample;
import com.hous.pojo.HouselistKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouselistMapper {
	List<Houselist> selectAll();
	
    int countByExample(HouselistExample example);

    int deleteByExample(HouselistExample example);

    int deleteByPrimaryKey(HouselistKey key);

    int insert(Houselist record);

    int insertSelective(Houselist record);

    List<Houselist> selectByExample(HouselistExample example);

    Houselist selectByPrimaryKey(HouselistKey key);

    int updateByExampleSelective(@Param("record") Houselist record, @Param("example") HouselistExample example);

    int updateByExample(@Param("record") Houselist record, @Param("example") HouselistExample example);

    int updateByPrimaryKeySelective(Houselist record);

    int updateByPrimaryKey(Houselist record);

	List<Houselist> selectLandladyAll(String username);
	
	List<Houselist> selects(@Param("price")String price,@Param("price2")String price2,@Param("area")String area,@Param("area2")String area2,@Param("status")String status,@Param("address")String address);
	
	List<Houselist> selects1(@Param("status")String status,@Param("address")String address);
	List<Houselist> selects2(@Param("area")String area,@Param("area2")String area2,@Param("status")String status,@Param("address")String address);
	List<Houselist> selects3(@Param("price")String price,@Param("price2")String price2,@Param("status")String status,@Param("address")String address);

	Houselist findhouseid(String houseid);

	void updatehouse(Houselist houselist);

	Houselist findhouseidupdate(Houselist houselist);

	Houselist findid(Integer id);

	void deletehousebyhouseid(String house_id);

	void updatehousestatus(Houselist houselist);

	void updatestatus(Houselist houselist);

}