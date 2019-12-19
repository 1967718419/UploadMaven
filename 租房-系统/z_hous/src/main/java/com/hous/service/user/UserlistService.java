package com.hous.service.user;

import java.util.List;

import com.hous.pojo.Userlist;

public interface UserlistService {
	Userlist findhasuserlist(Integer userId);

	List<Userlist> getUserzuList(Integer id);

	List<Userlist> getmyapply(Integer id);

	List<Userlist> getmyapplyout(Integer id);

	boolean checkuserlists(Integer id);

	Userlist checkuserlist(String idcard);

	void insertuserlist(Userlist userlist);

	Userlist finduserlistupdate(Userlist userlist);

	void updateuserlist(Userlist userlist);

	List<Userlist> findalluserlist();

	void deleteuserlist(Integer id);

	List<Userlist> getmycheckout(Integer id);

}
