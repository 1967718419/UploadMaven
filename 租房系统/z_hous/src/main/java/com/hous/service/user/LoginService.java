package com.hous.service.user;

import java.util.List;

import com.hous.pojo.User;
import com.hous.pojo.Userlist;

public interface LoginService {

	User checkLogin(User user);

	User register(User user);

	boolean insertUser(User user);



	

}
