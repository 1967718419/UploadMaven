package com.hous.mapper;

import com.hous.pojo.QueryVo;
import com.hous.pojo.Wrong;
import com.hous.pojo.WrongExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WrongMapper {
    int countByExample(WrongExample example);

    int deleteByExample(WrongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wrong record);

    int insertSelective(Wrong record);

    List<Wrong> selectByExampleWithBLOBs(WrongExample example);

    List<Wrong> selectByExample(WrongExample example);

    Wrong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByExampleWithBLOBs(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByExample(@Param("record") Wrong record, @Param("example") WrongExample example);

    int updateByPrimaryKeySelective(Wrong record);

    int updateByPrimaryKeyWithBLOBs(Wrong record);

    int updateByPrimaryKey(Wrong record);

	List<Wrong> findwrong(QueryVo vo);

	Wrong findbyid(Integer id);

	void insertwrong(Wrong wrong);

	void deletewrong(Integer id);
}