package com.hous.mapper;

import com.hous.pojo.Zulist;
import com.hous.pojo.ZulistExample;
import com.hous.pojo.ZulistKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ZulistMapper {
    int countByExample(ZulistExample example);

    int deleteByExample(ZulistExample example);

    int deleteByPrimaryKey(ZulistKey key);

    int insert(Zulist record);

    int insertSelective(Zulist record);

    List<Zulist> selectByExample(ZulistExample example);

    Zulist selectByPrimaryKey(ZulistKey key);

    int updateByExampleSelective(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByExample(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByPrimaryKeySelective(Zulist record);

    int updateByPrimaryKey(Zulist record);

	List<Zulist> findzuuserlist();

	Zulist findzulist(String house_id);

	void deletezulist(String house_id);

	void insertzulist(Zulist zulist);

	Zulist findzukezulist(Integer id);
}