package com.hous.mapper;

import com.hous.pojo.QueryVo;
import com.hous.pojo.Topaid;
import com.hous.pojo.TopaidExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TopaidMapper {
    int countByExample(TopaidExample example);

    int deleteByExample(TopaidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topaid record);

    int insertSelective(Topaid record);

    List<Topaid> selectByExample(TopaidExample example);

    Topaid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Topaid record, @Param("example") TopaidExample example);

    int updateByExample(@Param("record") Topaid record, @Param("example") TopaidExample example);

    int updateByPrimaryKeySelective(Topaid record);

    int updateByPrimaryKey(Topaid record);

	void inserttopaid(Topaid topaid);

	List<Topaid> findtopaid(QueryVo vo);

	Topaid findbyid(Integer id);

	void deletetopaid(Integer id);
}