package com.hous.mapper;

import com.hous.pojo.Userlist;
import com.hous.pojo.UserlistExample;
import com.hous.pojo.UserlistKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserlistMapper {
    int countByExample(UserlistExample example);

    int deleteByExample(UserlistExample example);

    int deleteByPrimaryKey(UserlistKey key);

    int insert(Userlist record);

    int insertSelective(Userlist record);

    List<Userlist> selectByExample(UserlistExample example);

    Userlist selectByPrimaryKey(UserlistKey key);

    int updateByExampleSelective(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByExample(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByPrimaryKeySelective(Userlist record);

    int updateByPrimaryKey(Userlist record);

	Userlist findhasuserlist(Integer userId);

	List<Userlist> getUserzuList(Integer id);

	List<Userlist> getmyapply(Integer id);

	List<Userlist> getmyapplyout(Integer id);

	Userlist checkuserlists(Integer id);

	Userlist checkuserlist(String idcard);

	void insertuserlist(Userlist userlist);

	Userlist finduserlistupdate(Userlist userlist);

	void updateuserlist(Userlist userlist);

	List<Userlist> findalluserlist();

	void deleteuserlist(Integer id);

	void deleteuser(Integer id);

	List<Userlist> getmycheckout(Integer id);
}