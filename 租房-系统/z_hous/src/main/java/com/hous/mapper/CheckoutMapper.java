package com.hous.mapper;

import com.hous.pojo.Checkout;
import com.hous.pojo.CheckoutExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckoutMapper {
    int countByExample(CheckoutExample example);

    int deleteByExample(CheckoutExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Checkout record);

    int insertSelective(Checkout record);

    List<Checkout> selectByExample(CheckoutExample example);

    Checkout selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByExample(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByPrimaryKeySelective(Checkout record);

    int updateByPrimaryKey(Checkout record);

	void insertcheckout(Checkout checkout);

	List<Checkout> getallcheckout();
}