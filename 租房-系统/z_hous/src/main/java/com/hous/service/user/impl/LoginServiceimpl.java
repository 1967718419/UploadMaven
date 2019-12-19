package com.hous.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hous.mapper.UserMapper;
import com.hous.pojo.User;
import com.hous.pojo.UserExample;
import com.hous.pojo.UserExample.Criteria;
import com.hous.service.user.LoginService;
import com.hous.util.EncryptUtil;

@Service
public class LoginServiceimpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User checkLogin(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		criteria.andTypeEqualTo(user.getType());
		List<User> userList =  userMapper.selectByExample(example);
		if(userList.size()>0) {
			return userList.get(0);
		}
		//User users=userMapper.selectByUser(user);
		return null;
		
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		user.setPassword(EncryptUtil.getInstance().MD5(user.getPassword()));
		User user1=userMapper.selectByUserName(user);
		return user1;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		int a = userMapper.insert(user);
		if(a==0){
			return false;
		}
		return true;
	}
	


}
