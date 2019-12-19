package com.hous.mapper;

import com.hous.pojo.Applyout;
import com.hous.pojo.ApplyoutExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ApplyoutMapper {
    int countByExample(ApplyoutExample example);

    int deleteByExample(ApplyoutExample example);

    int deleteByPrimaryKey(Integer aoid);

    int insert(Applyout record);

    int insertSelective(Applyout record);

    List<Applyout> selectByExample(ApplyoutExample example);

    Applyout selectByPrimaryKey(Integer aoid);

    int updateByExampleSelective(@Param("record") Applyout record, @Param("example") ApplyoutExample example);

    int updateByExample(@Param("record") Applyout record, @Param("example") ApplyoutExample example);

    int updateByPrimaryKeySelective(Applyout record);

    int updateByPrimaryKey(Applyout record);

	void updateapplyout(Applyout applyout);

	Applyout findbyid(Integer aoid);

	void updateapplyoutbyhouse(Applyout applyout);

	void deleteapplyout(Integer aoid);
}