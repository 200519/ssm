package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserMapper;
import com.test.model.User;
import com.test.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public User getUserByUserName(String loginName) {	
		return userMapper.getUserByUserName(loginName);
	}
	
	
}
