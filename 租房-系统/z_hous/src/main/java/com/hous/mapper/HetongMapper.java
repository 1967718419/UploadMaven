package com.hous.mapper;

import com.hous.pojo.Hetong;
import com.hous.pojo.HetongExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HetongMapper {
    int countByExample(HetongExample example);

    int deleteByExample(HetongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hetong record);

    int insertSelective(Hetong record);

    List<Hetong> selectByExample(HetongExample example);

    Hetong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByExample(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByPrimaryKeySelective(Hetong record);

    int updateByPrimaryKey(Hetong record);

	Hetong findhetong(String houseId);

	void deletehetong(String house_id);

	void inserthetong(Hetong hetong);
}