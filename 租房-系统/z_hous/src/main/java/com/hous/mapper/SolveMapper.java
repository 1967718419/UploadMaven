package com.hous.mapper;

import com.hous.pojo.QueryVo;
import com.hous.pojo.Solve;
import com.hous.pojo.SolveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SolveMapper {
    int countByExample(SolveExample example);

    int deleteByExample(SolveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Solve record);

    int insertSelective(Solve record);

    List<Solve> selectByExampleWithBLOBs(SolveExample example);

    List<Solve> selectByExample(SolveExample example);

    Solve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExampleWithBLOBs(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExample(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByPrimaryKeySelective(Solve record);

    int updateByPrimaryKeyWithBLOBs(Solve record);

    int updateByPrimaryKey(Solve record);

	List<Solve> selectall(QueryVo vo);

	Integer selectcount(QueryVo vo);

	void deletesolve(Integer id);

	void insertsolve(Solve solve);
}