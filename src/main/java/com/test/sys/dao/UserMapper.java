package com.test.sys.dao;

import org.apache.ibatis.annotations.Param;

import com.test.common.dao.BaseDao;
import com.test.sys.model.User;

public interface UserMapper extends BaseDao<UserMapper,User> {
	User getUserByUserName(@Param("username")String username);
	
	void insert(User user);
}
