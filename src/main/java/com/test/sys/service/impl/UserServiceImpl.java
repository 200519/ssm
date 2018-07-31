package com.test.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.common.dao.impl.BaseDaoImpl;
import com.test.sys.dao.UserMapper;
import com.test.sys.model.User;
import com.test.sys.service.IUserService;

@Service("userService")
public class UserServiceImpl extends BaseDaoImpl<UserMapper,User> implements IUserService{
	
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
