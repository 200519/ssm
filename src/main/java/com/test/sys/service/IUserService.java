package com.test.sys.service;

import com.test.common.service.BaseService;
import com.test.sys.model.User;

public interface IUserService extends BaseService<IUserService,User>{
	User getUserByUserName(String loginName);	
}
