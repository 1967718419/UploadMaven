package com.hous.mapper;

import com.hous.pojo.Apply;
import com.hous.pojo.ApplyExample;
import com.hous.pojo.ApplyKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(ApplyKey key);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(ApplyKey key);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);

	Apply findbyhouse_id(String houseId);

	void deletebyhouse_id(String houseId);

	List<Apply> findapplylist();

	void updateapplystatus(Apply apply);

	List<Apply> findallapplyout();
}