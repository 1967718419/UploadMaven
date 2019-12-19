package com.hous.mapper;

import com.hous.pojo.Paid;
import com.hous.pojo.PaidExample;
import com.hous.pojo.QueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaidMapper {
    int countByExample(PaidExample example);

    int deleteByExample(PaidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Paid record);

    int insertSelective(Paid record);

    List<Paid> selectByExample(PaidExample example);

    Paid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Paid record, @Param("example") PaidExample example);

    int updateByExample(@Param("record") Paid record, @Param("example") PaidExample example);

    int updateByPrimaryKeySelective(Paid record);

    int updateByPrimaryKey(Paid record);

	List<Paid> selectall(QueryVo vo);

	Double selectsum(QueryVo vo);

	void deletepaid(Integer id);

	void insertpaid(Paid paid);
}