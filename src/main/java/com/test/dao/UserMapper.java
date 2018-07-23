package com.test.dao;

import org.apache.ibatis.annotations.Param;

import com.test.model.User;

public interface UserMapper {
	User getUserByUserName(@Param("username")String username);
}
